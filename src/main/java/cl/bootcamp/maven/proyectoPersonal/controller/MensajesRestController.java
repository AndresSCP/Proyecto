/**
 * @author Andres Contreras
 * @version 1.0
 * Controlador que permite el uso de api rest para mostrar mensajes por usuario.
 */

package cl.bootcamp.maven.proyectoPersonal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import cl.bootcamp.maven.proyectoPersonal.models.dao.*;
import cl.bootcamp.maven.proyectoPersonal.models.Mensaje;
import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;
import cl.bootcamp.maven.proyectoPersonal.models.dao.UsuariosDAO;
import java.util.HashMap;



@RestController
@RequestMapping("/api")
public class MensajesRestController {

    private final MensajeDAO mensajesDAO;
    private final UsuariosDAO usuariosDAO;

    public MensajesRestController(MensajeDAO mensajesDAO, UsuariosDAO usuariosDAO) {
        this.mensajesDAO = mensajesDAO;
        this.usuariosDAO = usuariosDAO;
    }

    @GetMapping("/mensajes/{userId}")
    @ResponseBody
    public Map<String, Object> findByUsuario(@PathVariable int userId) {
        Usuarios usuario = usuariosDAO.findById(userId);
        List<Mensaje> mensajes = mensajesDAO.findByUsuario(usuario);

        Map<String, Object> response = new HashMap<>();
        response.put("usuario", usuario);
        response.put("mensajes", mensajes);

        return response;
    }
}