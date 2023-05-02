package cl.bootcamp.maven.proyectoPersonal.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
//import cl.bootcamp.maven.proyectoPersonal.models.ConexionBD;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AdministrativoController {
	
//	@RequestMapping(value="/administrativo")
//	public ModelAndView test(HttpServletResponse response) throws IOException{
//		return new ModelAndView("administrativo");
//	}
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AdministrativoController (DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@RequestMapping(value="/administrativo")
	public ModelAndView mostrarAdministrativo(HttpServletResponse response) throws IOException {
	    String sqlUsuarios = "select * from usuarios;";
	    String sqlCliente = "select * from cliente;";
	    String sqlAdministrativo = "select * from administrativo;";
	    String sqlMensaje = "SELECT c.idUsuario, c.username, m.lugar, m.mensaje, m.referencia, m.fechaCreacion "
	    		+ "FROM Cliente c "
	    		+ "INNER JOIN Mensaje m ON c.idUsuario = m.idUsuario;";
	    
	    List<Map<String, Object>> listaUsuarios = jdbcTemplate.queryForList(sqlUsuarios);
	    List<Map<String, Object>> listaCliente = jdbcTemplate.queryForList(sqlCliente);
	    List<Map<String, Object>> listaAdministrativo = jdbcTemplate.queryForList(sqlAdministrativo);
	    List<Map<String, Object>> listaMensajes = jdbcTemplate.queryForList(sqlMensaje);
	    
	    ModelAndView modelAndView = new ModelAndView("administrativo");
	    modelAndView.addObject("usuarios", listaUsuarios);
	    modelAndView.addObject("cliente", listaCliente);
	    modelAndView.addObject("administrativo", listaAdministrativo);
	    modelAndView.addObject("mensaje", listaMensajes);
	    
	    return modelAndView;     
	}
	
}


