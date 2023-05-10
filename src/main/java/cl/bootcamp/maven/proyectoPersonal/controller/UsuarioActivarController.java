package cl.bootcamp.maven.proyectoPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.bootcamp.maven.proyectoPersonal.models.dao.UsuariosDAO;

@Controller
public class UsuarioActivarController {

    @Autowired
    private UsuariosDAO usuarioDAO;

    @RequestMapping(value = "/activar", method = RequestMethod.POST)
    public String activarUsuario(@RequestParam("idUsuario") int idUsuario) {
        usuarioDAO.activar(idUsuario);
        return "redirect:/administrativo";
    }
}