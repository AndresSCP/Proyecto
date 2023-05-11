/**
 * @author Andres Contreras
 * @version 1.0
 * Controlador que guarda mensajes por usuario en sesion utilizndo el metodo findById y Save.
 */
package cl.bootcamp.maven.proyectoPersonal.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import cl.bootcamp.maven.proyectoPersonal.models.Mensaje;
import cl.bootcamp.maven.proyectoPersonal.models.dao.impl.MensajeDAOImpl;
import cl.bootcamp.maven.proyectoPersonal.models.dao.impl.UsuariosDaoImpl;

@Controller
public class MensajeController {

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private MensajeDAOImpl mensajeDAO;

    @Autowired
    private UsuariosDaoImpl usuarioDAO;

    // Este método debe llamarse cuando el usuario inicie sesión
    public void guardarIdUsuarioEnSesion(HttpSession session, Integer idUsuario) {
        session.setAttribute("idUsuario", idUsuario);
    }

    @PostMapping("/mensaje")
    public String guardarMensaje(@ModelAttribute("mensaje") Mensaje mensaje) {
        int idUsuarioEnSesion = (int) httpSession.getAttribute("idUsuario");
        mensaje.setUsuario(usuarioDAO.findById(idUsuarioEnSesion));
        mensajeDAO.save(mensaje);
        return "redirect:/main";
    }
}
