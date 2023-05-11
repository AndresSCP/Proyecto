/**
 * @author Andres Contreras
 * @version 1.0
 * 
 * Controlador que muestra el formulario de registro de clientes.
 */
package cl.bootcamp.maven.proyectoPersonal.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import cl.bootcamp.maven.proyectoPersonal.models.dao.ClienteDAO;
import cl.bootcamp.maven.proyectoPersonal.models.Cliente;

@Controller
public class RegistroController {

    @GetMapping(value="/registro")
    public ModelAndView mostrarFormularioRegistro(HttpServletResponse response) throws IOException {
        return new ModelAndView("registro");
    }
}
