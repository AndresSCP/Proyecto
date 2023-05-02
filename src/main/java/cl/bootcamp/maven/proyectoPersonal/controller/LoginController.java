package cl.bootcamp.maven.proyectoPersonal.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;

@Controller
public class LoginController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
   
    @PostMapping("/login")
    public String login(@ModelAttribute("usuario") Usuarios usuario, Model model) {
        // Validar el usuario y contraseña en la base de datos utilizando JdbcTemplate
        String sql = "SELECT * FROM Usuarios WHERE username = ? AND password = ?";
        List<Map<String, Object>> usuarios = jdbcTemplate.queryForList(sql, usuario.getUsername(), usuario.getPassword());
        if (!usuarios.isEmpty()) {
            // El usuario y la contraseña son válidos
            return "redirect:/main"; // redirigir a la página de inicio del usuario
        } else {
            // El usuario y/o la contraseña son inválidos
            model.addAttribute("error", "Usuario o contraseña inválidos");
            return "home"; // volver a la página de inicio de sesión con un mensaje de error
        }
    }

}
