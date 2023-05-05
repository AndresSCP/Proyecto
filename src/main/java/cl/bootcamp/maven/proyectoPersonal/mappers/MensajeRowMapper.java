package cl.bootcamp.maven.proyectoPersonal.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import cl.bootcamp.maven.proyectoPersonal.models.Mensaje;
import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;

public class MensajeRowMapper implements RowMapper<Mensaje> {

    @Override
    public Mensaje mapRow(ResultSet rs, int rowNum) throws SQLException {
        Mensaje mensaje = new Mensaje();
        mensaje.setIdMensaje(rs.getInt("idMensaje"));
        mensaje.setLugar(rs.getString("lugar"));
        mensaje.setMensaje(rs.getString("mensaje"));
        mensaje.setReferencia(rs.getString("referencia"));
        mensaje.setFechaCreacion(rs.getTimestamp("fechaCreacion").toLocalDateTime());
        
        Usuarios usuario = new Usuarios();
        usuario.setUsername(rs.getString("username"));
        mensaje.setUsuario(usuario);
        
        return mensaje;
    }
}