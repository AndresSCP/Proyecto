package cl.bootcamp.maven.proyectoPersonal.controller;

import java.io.IOException;
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
	public ModelAndView test(HttpServletResponse response, HttpSession session) throws IOException{
	    String sqlMensaje = "SELECT c.idUsuario, c.username, m.lugar, m.mensaje, m.referencia, m.fechaCreacion "
	            + "FROM Cliente c "
	            + "INNER JOIN Mensaje m ON c.idUsuario = m.idUsuario;";  
	    List<Map<String, Object>> listaMensajes = jdbcTemplate.queryForList(sqlMensaje);

	    ModelAndView modelAndView = new ModelAndView("main");
	    modelAndView.addObject("mensaje", listaMensajes);

	    // Verificar si el atributo "usuario" existe en la sesión
	    if (session.getAttribute("usuario") != null) {
	        // La sesión está iniciada
	        return modelAndView;
	    } else {
	        // La sesión no está iniciada
	        return new ModelAndView("redirect:/"); // Redirigir a la página de inicio de sesión
	    }
	}
}