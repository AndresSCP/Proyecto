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
	    String sqlUsuarios = "select * from usuarios;";
	    String sqlCliente = "select * from cliente;";
	    String sqlAdministrativo = "select * from administrativo;";
	    List ListaUsuarios = this.jdbcTemplate.queryForList(sqlUsuarios);
	    List ListaCliente = this.jdbcTemplate.queryForList(sqlCliente);
	    List ListaAdministrativo = this.jdbcTemplate.queryForList(sqlAdministrativo);
	    ModelAndView modelAndView = new ModelAndView("administrativo");
	    modelAndView.addObject("usuarios", ListaUsuarios);
	    modelAndView.addObject("cliente", ListaCliente);
	    modelAndView.addObject("administrativo", ListaAdministrativo);
	    return modelAndView;    
	}
	
}


