package cl.bootcamp.maven.proyectoPersonal.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccesoDenegadoController {

    @GetMapping(value="/components/error403")
    public ModelAndView mostrarFormularioRegistro(HttpServletResponse response) throws IOException {
        return new ModelAndView("components/error403");
    }
    
}