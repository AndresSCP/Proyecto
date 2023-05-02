package cl.bootcamp.maven.proyectoPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import cl.bootcamp.maven.proyectoPersonal.models.Cliente;
import cl.bootcamp.maven.proyectoPersonal.models.dao.*;

@Controller
public class RegistroCrearController {

  // Inyectamos el DAO para poder utilizarlo en los métodos del controlador
  @Autowired
  private ClienteDAO clienteDAO;

  // Manejador de la solicitud POST para agregar un nuevo cliente
  @PostMapping("/registroCliente")
  public String agregarClienteSubmit(@ModelAttribute Cliente cliente, Model model) {
    cliente.setRol("Cliente"); // Modificación para establecer el rol de cliente
    clienteDAO.agregarCliente(cliente);
    model.addAttribute("mensaje", "Cliente agregado exitosamente");
    return "/registro";
  }

}
