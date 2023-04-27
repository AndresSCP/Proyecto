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

//    @Autowired
//    private ClienteDAO clienteDAO;

    @GetMapping(value="/registro")
    public ModelAndView mostrarFormularioRegistro(HttpServletResponse response) throws IOException {
        return new ModelAndView("registro");
    }
}
////    @RequestMapping(value="/registroFormulario", method= RequestMethod.POST)
////    
////    public ModelAndView agregarCliente(@RequestParam("idUsuario") int idUsuario,
////                                         @RequestParam("nombreUsuario") String nombreUsuario,
////                                         @RequestParam("password") String password,
////                                         @RequestParam("tipoUsuario") int tipoUsuario,
////                                         @RequestParam("nombreCliente") String nombreCliente,
////                                         @RequestParam("apellidoCliente") String apellidoCliente,
////                                         @RequestParam("genero") String genero,
////                                         @RequestParam("emailCliente") String emailCliente,
////                                         HttpServletResponse response) throws IOException {
////
////        // Crear un objeto Cliente con los datos del formulario
////        Cliente cliente = new Cliente(idUsuario, nombreUsuario, password, tipoUsuario, nombreCliente, apellidoCliente, genero, emailCliente);
////
////        // Llamar al método createCliente en el ClienteDAO para insertar el nuevo cliente en la base de datos
////        clienteDAO.agregarCliente(cliente);
////
////        // Redireccionar a la página de registro exitoso
////        return new ModelAndView("home");
////    }
//}