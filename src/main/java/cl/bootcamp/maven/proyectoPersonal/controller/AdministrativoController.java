package cl.bootcamp.maven.proyectoPersonal.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AdministrativoController {
    
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public AdministrativoController (DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @RequestMapping(value="/administrativo")
    public ModelAndView mostrarAdministrativo(HttpServletResponse response, HttpSession session) throws IOException {
    	
    	String role = (String) session.getAttribute("role");
    	
    	 if (role == null || !role.equals("administrativo")) {
             // Si el usuario no tiene el rol de administrativo, redirigir a una página de error o denegado
    		 response.sendRedirect("/proyectoPersonal/components/error403");
             return null;
         } 
        
        String sqlUsuarios = "select * from usuarios;";
        
        String sqlActivos = "SELECT enabled, COUNT(*) AS cantidad FROM Usuarios GROUP BY enabled";
        
        String sqlCantidadMensajes = "SELECT COUNT(*) AS total_mensajes FROM Mensaje;";
        
        String sqlMensajeUsuarios = "SELECT u.idUsuario, u.username, COUNT(*) as cantidad "
        		+ "FROM Mensaje m "
        		+ "JOIN Usuarios u ON m.idUsuario = u.idUsuario "
        		+ "GROUP BY m.idUsuario";
              
        String sqlCliente = "SELECT c.nombreCliente, c.apellidoCliente, c.genero, c.emailCliente, u.username, c.idUsuario "
                + "FROM Cliente c "
                + "INNER JOIN Usuarios u ON c.idUsuario = u.idUsuario";
        
        String sqlAdministrativo = "SELECT a.nombreAdmin, a.emailAdmin, u.username, a.idUsuario "
                + "FROM Administrativo a "
                + "INNER JOIN Usuarios u ON a.idUsuario = u.idUsuario";
        
        String sqlMensaje = "SELECT m.idMensaje, m.lugar, m.mensaje, m.referencia, m.fechaCreacion, u.username, u.idUsuario "
                + "FROM Mensaje m "
                + "INNER JOIN Usuarios u ON m.idUsuario = u.idUsuario "
                + "ORDER BY u.idUsuario";
        
        String sqlSelectUsuariosMensaje = "SELECT Usuarios.username, Cliente.nombreCliente, Cliente.apellidoCliente, Mensaje.* " +
                "FROM Usuarios " +
                "JOIN Cliente ON Usuarios.idUsuario = Cliente.idUsuario " +
                "JOIN Mensaje ON Usuarios.idUsuario = Mensaje.idUsuario " +
                "WHERE Usuarios.username = ?";
        
        List<Map<String, Object>> listaUsuarios = jdbcTemplate.queryForList(sqlUsuarios);
        List<Map<String, Object>> listaActivos = jdbcTemplate.queryForList(sqlActivos);
        List<Map<String, Object>> listaCantidadMensajes = jdbcTemplate.queryForList(sqlCantidadMensajes);
        List<Map<String, Object>> listaMensajesUsuarios = jdbcTemplate.queryForList(sqlMensajeUsuarios);
        List<Map<String, Object>> listaCliente = jdbcTemplate.queryForList(sqlCliente);
        List<Map<String, Object>> listaAdministrativo = jdbcTemplate.queryForList(sqlAdministrativo);
        List<Map<String, Object>> listaMensajes = jdbcTemplate.queryForList(sqlMensaje);
        List<Map<String, Object>> listaSeleccionMensajes = jdbcTemplate.queryForList(sqlSelectUsuariosMensaje);
        
        ModelAndView modelAndView = new ModelAndView("administrativo");
        modelAndView.addObject("usuarios", listaUsuarios);
        modelAndView.addObject("activos", listaActivos);
        modelAndView.addObject("cantidadMensajes", listaCantidadMensajes);
        modelAndView.addObject("mensajesUsuarios",listaMensajesUsuarios);
        modelAndView.addObject("cliente", listaCliente);
        modelAndView.addObject("administrativo", listaAdministrativo);
        modelAndView.addObject("mensaje", listaMensajes);
        modelAndView.addObject("mensajeSelect", listaSeleccionMensajes);
        
        return modelAndView;     
    }
    
}


