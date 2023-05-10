package cl.bootcamp.maven.proyectoPersonal.controller;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
  
  @Autowired
  private DataSource dataSource;
 
  private JdbcTemplate jdbcTemplate;
  
  @PostConstruct
  private void postConstruct() {
      this.jdbcTemplate = new JdbcTemplate(dataSource);
  }
 
  @PostMapping("/registroCliente")
  public String agregarClienteSubmit(@ModelAttribute Cliente cliente, Model model) {
    cliente.setRol("cliente");
    String sql = "SELECT COUNT(*) FROM Usuarios u JOIN Cliente c ON u.idUsuario = c.idUsuario WHERE u.username = ? OR c.emailCliente = ?";
    int count = jdbcTemplate.queryForObject(sql, Integer.class, cliente.getUsername(), cliente.getEmailCliente());
    if (count > 0) {
      model.addAttribute("mensajeError", "El usuario ya existe en la base de datos");
      return "/registro";
    }
    clienteDAO.agregarCliente(cliente);
    model.addAttribute("mensaje", "Cliente agregado exitosamente");
    return "/registro";
  }


}