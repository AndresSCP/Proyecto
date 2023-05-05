package cl.bootcamp.maven.proyectoPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cl.bootcamp.maven.proyectoPersonal.models.Cliente;
import cl.bootcamp.maven.proyectoPersonal.models.dao.ClienteDAO;

@Controller
public class RegistroCrearController {

  @Autowired
  private ClienteDAO clienteDAO;

  @PostMapping("/registroCliente")
  public String agregarClienteSubmit(@ModelAttribute Cliente cliente, Model model) {
    cliente.setRol("cliente");
    clienteDAO.agregarCliente(cliente);
    model.addAttribute("mensaje", "Cliente agregado exitosamente");
    return "/registro";
  }

}