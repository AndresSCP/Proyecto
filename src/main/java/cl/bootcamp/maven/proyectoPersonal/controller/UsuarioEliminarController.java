/**
 * @author Andres Contreras
 * @version 1.0
 * Controlador que utiliza el metodo eliminar usuario que cambio el estado de un usuarios de acitvo a inactivo.
 */
package cl.bootcamp.maven.proyectoPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import cl.bootcamp.maven.proyectoPersonal.models.dao.UsuariosDAO;

@Controller
public class UsuarioEliminarController {

    @Autowired
    private UsuariosDAO usuarioDAO;

    @RequestMapping(value = "/desactivar", method = RequestMethod.POST)
    public String eliminarUsuario(@RequestParam("idUsuario") int idUsuario) {
    	usuarioDAO.delete(idUsuario);
        return "redirect:/administrativo";
    }
}