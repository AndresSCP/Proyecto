package cl.bootcamp.maven.proyectoPersonal.controller;

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
	public ModelAndView mostrarPerfil(HttpSession session) {
		// id del usuario actual desde la sesión
		Integer idUsuario = (Integer) session.getAttribute("idUsuario");
				
		// realizar una consulta a la base de datos para obtener los datos del cliente
		Cliente cliente = clienteDao.obtenerClientePorId(idUsuario);

		// pasar los datos del cliente al modelo de vista
		ModelAndView modelAndView = new ModelAndView("perfil");
		modelAndView.addObject("cliente", cliente);

		// devolver la vista con los datos del cliente
		return modelAndView;

	}

}