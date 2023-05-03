package cl.bootcamp.maven.proyectoPersonal.models.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import cl.bootcamp.maven.proyectoPersonal.models.Mensaje;

@Repository
public class MensajeDAOImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void agregarMensaje(Mensaje mensaje) {
        String sql = "INSERT INTO Mensaje (lugar, mensaje, referencia, fechaCreacion, idUsuario) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, mensaje.getLugar(), mensaje.getMensaje(), mensaje.getReferencia(),
                mensaje.getFechaCreacion(), mensaje.getIdUsuario());
    }

    public Mensaje buscarMensajePorId(String idMensaje) {
        String sql = "SELECT * FROM Mensaje WHERE idMensaje = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] { idMensaje },
                new BeanPropertyRowMapper<>(Mensaje.class));
    }

    public List<Mensaje> buscarMensajes() {
        String sql = "SELECT * FROM Mensaje";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Mensaje.class));
    }

    public void actualizarMensaje(Mensaje mensaje) {
        String sql = "UPDATE Mensaje SET lugar = ?, mensaje = ?, referencia = ?, fechaCreacion = ? WHERE idMensaje = ?";
        jdbcTemplate.update(sql, mensaje.getLugar(), mensaje.getMensaje(), mensaje.getReferencia(),
                mensaje.getFechaCreacion(), mensaje.getIdMensaje());
    }

    public void eliminarMensaje(String idMensaje) {
        String sql = "DELETE FROM Mensaje WHERE idMensaje = ?";
        jdbcTemplate.update(sql, idMensaje);
    }

}