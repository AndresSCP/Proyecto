package cl.bootcamp.maven.proyectoPersonal.mappers;

import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosRowMapper implements RowMapper<Usuarios> {

    @Override
    public Usuarios mapRow(ResultSet resultSet, int i) throws SQLException {
        Usuarios usuario = new Usuarios();
        usuario.setIdUsuario(resultSet.getInt("idUsuario"));
        usuario.setUsername(resultSet.getString("username"));
        usuario.setPassword(resultSet.getString("password"));
        usuario.setRol(resultSet.getString("role"));
        return usuario;
    }
}