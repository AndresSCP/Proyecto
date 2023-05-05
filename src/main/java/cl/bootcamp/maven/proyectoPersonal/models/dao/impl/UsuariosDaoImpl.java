package cl.bootcamp.maven.proyectoPersonal.models.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;
import cl.bootcamp.maven.proyectoPersonal.models.dao.UsuariosDAO;
import cl.bootcamp.maven.proyectoPersonal.mappers.UsuariosRowMapper;

@Repository
public class UsuariosDaoImpl implements UsuariosDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public UsuariosDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Usuarios> findAll() {
		String sql = "SELECT * FROM Usuarios";
		List<Usuarios> usuarios = jdbcTemplate.query(sql, new UsuariosRowMapper());
		return usuarios;
	}

    @Override
    public Usuarios findById(int id) {
        String query = "SELECT * FROM Usuarios WHERE idUsuario = ?";
        Object[] args = {id};
        Usuarios usuario = jdbcTemplate.queryForObject(query, args, new UsuariosRowMapper());
        return usuario;
    }

    public void save(Usuarios usuario) {
        String query = "INSERT INTO Usuarios(username, password, role) VALUES (?, ?, ?)";
        Object[] args = {usuario.getUsername(), usuario.getPassword(), usuario.getRol()};
        jdbcTemplate.update(query, args);
    }

    @Override
    public void update(Usuarios usuario) {
        String query = "UPDATE Usuarios SET username = ?, password = ?, role = ? WHERE idUsuario = ?";
        Object[] args = {usuario.getUsername(), usuario.getPassword(), usuario.getRol(), usuario.getIdUsuario()};
        jdbcTemplate.update(query, args);
    }

    @Override
    public void delete(int id) {
        String query = "UPDATE Usuarios SET enabled = 0 WHERE idUsuario = ?";
        Object[] args = {id};
        jdbcTemplate.update(query, args);
    }
}