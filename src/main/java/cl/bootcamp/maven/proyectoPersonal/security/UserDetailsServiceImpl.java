package cl.bootcamp.maven.proyectoPersonal.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String sql = "SELECT username, password, enabled FROM Usuarios WHERE username = ?";
        List<UserDetails> users = jdbcTemplate.query(sql, new Object[]{username}, (rs, rowNum) ->
                User.withUsername(rs.getString("username"))
                        .password(rs.getString("password"))
                        .roles(rs.getString("role"))
                        .disabled(!rs.getBoolean("enabled"))
                        .build());
        if (users.isEmpty()) {
            throw new UsernameNotFoundException("User not found");
        }
        return users.get(0);
    }
}