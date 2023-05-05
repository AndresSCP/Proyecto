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

    @Autowired
    private JdbcTemplate jdbcTemplate;
   
    @PostMapping("/login")
    public String login(@ModelAttribute("usuario") Usuarios usuario, Model model, HttpSession session) {

    	String sql = "SELECT idUsuario, enabled, role FROM Usuarios WHERE username = ? AND password = ?";
        List<Map<String, Object>> usuarios = jdbcTemplate.queryForList(sql, usuario.getUsername(), usuario.getPassword());
        if (!usuarios.isEmpty()) {
            Integer idUsuario = (Integer) usuarios.get(0).get("idUsuario"); // Obtener el id del usuario
            int enabled = (int) usuarios.get(0).get("enabled"); // Obtener el estado del usuario
            String role = (String) usuarios.get(0).get("role"); // Obtener el tipo de rol del usuario
            if (enabled == 1) {
            	session.setAttribute("usuario", usuario.getUsername());
            	session.setAttribute("idUsuario", idUsuario);
            	session.setAttribute("role", role);
                return "redirect:/main"; 
            } else {
                model.addAttribute("error", "El usuario está desactivado. Contacte al administrador.");
                return "home";
            }
        } else {

            model.addAttribute("error", "Usuario o contraseña inválidos");
            return "login";
        }
    }
}
