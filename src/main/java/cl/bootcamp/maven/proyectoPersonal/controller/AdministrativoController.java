package cl.bootcamp.maven.proyectoPersonal.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import cl.bootcamp.maven.proyectoPersonal.models.ConexionBD;
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
	
	public AdministrativoController (){
		
		ConexionBD con = new ConexionBD();
		this.jdbcTemplate = new JdbcTemplate(con.Conexion());
	
	}
	
	@RequestMapping(value="/administrativo")
	public ModelAndView test(HttpServletResponse response) throws IOException{
	    String sql = "select * from usuarios;";
	    List ListUsuarios = this.jdbcTemplate.queryForList(sql);
	    ModelAndView modelAndView = new ModelAndView("administrativo");
	    modelAndView.addObject("usuarios", ListUsuarios);
	    return modelAndView;    
	}
	
	
}


