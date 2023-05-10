package cl.bootcamp.maven.proyectoPersonal.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import cl.bootcamp.maven.proyectoPersonal.models.*;
import cl.bootcamp.maven.proyectoPersonal.models.dao.*;


@Controller
public class PerfilController {

    @Autowired
    private ClienteDAO clienteDao;

    @RequestMapping(value = "/perfil")
    public ModelAndView mostrarPerfil(HttpServletResponse response, HttpSession session) throws IOException {
        String role = (String) session.getAttribute("role");
        
        if (role == null || !role.equals("cliente")) {
            response.sendRedirect("/proyectoPersonal/components/error403");
            return null;
        }

        // id del usuario actual desde la sesión
        Integer idUsuario = (Integer) session.getAttribute("idUsuario");
        
        Cliente cliente = clienteDao.obtenerClientePorId(idUsuario);

        ModelAndView modelAndView = new ModelAndView("perfil");
        modelAndView.addObject("cliente", cliente);

        return modelAndView;
    }

}