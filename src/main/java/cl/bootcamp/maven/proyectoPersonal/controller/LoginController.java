/**
 * @author Andres Contreras
 * @version 1.0
 * 
 * Este controlador maneja el inicio de sesión de un usuario y redirige al usuario a diferentes páginas según su estado y rol.
 */
package cl.bootcamp.maven.proyectoPersonal.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;

@Controller
public class LoginController {

  /**
   * Inyección de dependencia de la clase JdbcTemplate.
   */
  @Autowired
  private JdbcTemplate jdbcTemplate;

  /**
   * Método que maneja la solicitud POST para la página de inicio de sesión.
   */
  @PostMapping("/login")
  public String login(@ModelAttribute("usuario") Usuarios usuario, Model model, HttpSession session) {

    // Consulta en la base de datos si el usuario y la contraseña son válidos.
    String sql = "SELECT idUsuario, enabled, role FROM Usuarios WHERE username = ? AND password = ?";
    List<Map<String, Object>> usuarios = jdbcTemplate.queryForList(sql, usuario.getUsername(), usuario.getPassword());

    if (!usuarios.isEmpty()) {
      // Obtiene el id, el estado y el rol del usuario de la lista de usuarios.
      int idUsuario = (int) usuarios.get(0).get("idUsuario");
      int enabled = (int) usuarios.get(0).get("enabled");
      String role = (String) usuarios.get(0).get("role");

      // Si el usuario está habilitado, almacena la información del usuario en la sesión y lo redirige  main.
      if (enabled == 1) {
        session.setAttribute("usuario", usuario.getUsername());
        session.setAttribute("idUsuario", idUsuario);
        session.setAttribute("role", role);

        return "redirect:/main";
        
      } else {
        // Si el usuario está desactivado, muestra un mensaje de error y redirige a la página de inicio.
        model.addAttribute("error", "El usuario está desactivado. Contacte al administrador.");
        return "home";
      }
    } else {
      // Si el usuario o la contraseña son inválidos, mostrar un mensaje de error y redirige a la página de inicio.
      model.addAttribute("error", "Usuario o contraseña inválidos");
      return "login";
    }
  }
}
