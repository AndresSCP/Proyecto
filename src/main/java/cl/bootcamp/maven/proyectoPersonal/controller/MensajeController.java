package cl.bootcamp.maven.proyectoPersonal.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import cl.bootcamp.maven.proyectoPersonal.models.Mensaje;
import cl.bootcamp.maven.proyectoPersonal.models.dao.impl.MensajeDAOImpl;

@Controller
public class MensajeController {

    @Autowired
    private MensajeDAOImpl mensajeDAO;
    
    // Este método debe llamarse cuando el usuario inicie sesión
    public void guardarIdUsuarioEnSesion(HttpSession session, Integer idUsuario) {
        session.setAttribute("idUsuario", idUsuario);
    }

    @PostMapping("/mensaje")
    public String agregarMensaje(@ModelAttribute Mensaje mensaje, HttpSession session) {
        // Obtiene el ID de usuario de la sesión actual y lo establece en el mensaje
        Integer idUsuario = (Integer) session.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/login"; // Si el usuario no ha iniciado sesión, redirigir al formulario de inicio de sesión
        }
        mensaje.setIdUsuario(idUsuario);

        // Obtiene la fecha y hora actual y la establece en el mensaje
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        mensaje.setFechaCreacion(Timestamp.valueOf(formattedDateTime));

        mensajeDAO.agregarMensaje(mensaje);
        return "redirect:/main";
    }
}