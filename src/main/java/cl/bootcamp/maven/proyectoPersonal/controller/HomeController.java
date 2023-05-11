/**
 * @author Andres Contreras
 * @version 1.0
 * 
 * Controlador que muestra la vista del login/home del sitio.
 */
package cl.bootcamp.maven.proyectoPersonal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showLoginForm(Model model) {
        model.addAttribute("usuario", new Usuarios());
        return "login";
    }
    
}
