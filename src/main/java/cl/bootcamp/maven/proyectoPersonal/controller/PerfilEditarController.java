package cl.bootcamp.maven.proyectoPersonal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import cl.bootcamp.maven.proyectoPersonal.models.Cliente;
import cl.bootcamp.maven.proyectoPersonal.models.dao.ClienteDAO;

@Controller
public class PerfilEditarController {
	
	@Autowired
	private ClienteDAO clienteDao;
	
	@PostMapping("/editarCliente")
	public String editarCliente(@ModelAttribute Cliente cliente, Model model, HttpSession session) {
	    // Obtener el id del cliente actual desde la sesión
	    int idCliente = (int) session.getAttribute("idUsuario");
	    // Establecer el id del usuario como el id del cliente actual
	    cliente.setIdUsuario(idCliente);
	    // Actualizar el cliente en la base de datos
	    clienteDao.actualizarCliente(cliente);
	    // Agregar un mensaje de éxito en el modelo
	    model.addAttribute("mensaje", "Perfil actualizado con éxito");
	    // Devolver la vista de perfil
	    return "perfil";
	}

}
