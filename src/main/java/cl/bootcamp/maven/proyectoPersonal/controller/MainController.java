package cl.bootcamp.maven.proyectoPersonal.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public MainController (DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@GetMapping("/main")
	public ModelAndView mostrarMensajes(HttpServletResponse response, HttpSession session) throws IOException {
		
	    String sql = "SELECT m.idMensaje, m.lugar, m.mensaje, m.referencia, m.fechaCreacion, u.username "
	            + "FROM Mensaje m "
	            + "INNER JOIN Usuarios u ON m.idUsuario = u.idUsuario";

	    List<Map<String, Object>> listaMensajes = jdbcTemplate.queryForList(sql);

	    ModelAndView modelAndView = new ModelAndView("main");
	    modelAndView.addObject("mensajes", listaMensajes);

	    // Verificar si el atributo "usuario" existe en la sesión
	    if (session.getAttribute("usuario") != null) {
	        // La sesión está iniciada
	        return modelAndView;
	    } else {
	        // La sesión no está iniciada
	        return new ModelAndView("redirect:/login"); // Redirigir a la página de inicio de sesión
	    }
	}
}