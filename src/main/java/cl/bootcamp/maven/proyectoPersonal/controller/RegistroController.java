package cl.bootcamp.maven.proyectoPersonal.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistroController {

	@RequestMapping(value="/registro")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("registro");
	}
}