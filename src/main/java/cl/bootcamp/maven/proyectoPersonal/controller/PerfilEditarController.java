/**
 * @author Andres Contreras
 * @version 1.0
 * Controlador que permite el cambio de los datos de un usuario tipo cliente mediante formulario.
 */
package cl.bootcamp.maven.proyectoPersonal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.maven.proyectoPersonal.models.Cliente;
import cl.bootcamp.maven.proyectoPersonal.models.dao.ClienteDAO;

@Controller
public class PerfilEditarController {

	@Autowired
	private ClienteDAO clienteDao;

	@RequestMapping(value = "/editarCliente", method = RequestMethod.POST)
	public ModelAndView editarCliente(@RequestParam Integer idUsuario,
	                                   @RequestParam String nombre,
	                                   @RequestParam String apellido,
	                                   @RequestParam String nickname,
	                                   @RequestParam String email,
	                                   @RequestParam String genero,
	                                   HttpSession session) {
	    // Verificar que el usuario está iniciado sesión y es un cliente

	    // Crear un objeto Cliente con los datos del formulario
	    Cliente cliente = new Cliente();
	    cliente.setIdUsuario(idUsuario);
	    cliente.setNombreCliente(nombre);
	    cliente.setApellidoCliente(apellido);
	    cliente.setUsername(nickname);
	    cliente.setEmailCliente(email);
	    cliente.setGenero(genero);

	    // Actualizar el cliente en la base de datos
	    clienteDao.actualizarCliente(cliente);

	    // Redirigir al perfil del cliente actualizado
	    return new ModelAndView("redirect:/perfil");
	}
}