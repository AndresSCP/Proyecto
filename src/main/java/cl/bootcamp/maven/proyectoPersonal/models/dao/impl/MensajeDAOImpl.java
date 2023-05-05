package cl.bootcamp.maven.proyectoPersonal.models.dao.impl;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import cl.bootcamp.maven.proyectoPersonal.models.Mensaje;
import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;
import cl.bootcamp.maven.proyectoPersonal.models.dao.MensajeDAO;
import cl.bootcamp.maven.proyectoPersonal.mappers.MensajeRowMapper;

@Repository
public class MensajeDAOImpl implements MensajeDAO {

	private JdbcTemplate jdbcTemplate;
	
    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public Mensaje findById(int id) {
        String sql = "SELECT * FROM mensaje WHERE idMensaje = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new MensajeRowMapper());
    }

    @Override
    public void save(Mensaje mensaje) {
        String sql = "INSERT INTO mensaje (lugar, mensaje, referencia, fechaCreacion, idUsuario) VALUES (?, ?, ?, NOW(), ?)";
        jdbcTemplate.update(sql, mensaje.getLugar(), mensaje.getMensaje(), mensaje.getReferencia(), mensaje.getUsuario().getIdUsuario());
    }

    @Override
    public void update(Mensaje mensaje) {
        String sql = "UPDATE mensaje SET lugar=?, mensaje=?, referencia=?, fechaCreacion=?, idUsuario=? WHERE idMensaje=?";
        jdbcTemplate.update(sql, mensaje.getLugar(), mensaje.getMensaje(), mensaje.getReferencia(),
                mensaje.getFechaCreacion(), mensaje.getUsuario().getIdUsuario(), mensaje.getIdMensaje());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM mensaje WHERE idMensaje=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public List<Mensaje> findByUsuario(Usuarios usuario) {
        String sql = "SELECT * FROM mensaje WHERE id_usuario = ?";
        return jdbcTemplate.query(sql, new Object[]{usuario.getIdUsuario()}, new MensajeRowMapper());
    }

}
