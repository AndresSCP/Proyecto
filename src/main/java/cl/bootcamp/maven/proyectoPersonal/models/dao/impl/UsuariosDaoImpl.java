package cl.bootcamp.maven.proyectoPersonal.models.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;
import cl.bootcamp.maven.proyectoPersonal.models.dao.UsuariosDAO;

public class UsuariosDaoImpl implements UsuariosDAO {

	private JdbcTemplate jdbcTemplate;

	public UsuariosDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void agregar(Usuarios usuario) {
		String sql = "INSERT INTO Usuarios (nombreUsuario, password, tipoUsuario) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, usuario.getUsername(), usuario.getPassword(), usuario.getRol());
	}

	@Override
	public void actualizar(Usuarios usuario) {
		String sql = "UPDATE Usuarios SET nombreUsuario = ?, password = ?, tipoUsuario = ? WHERE idUsuario = ?";
		jdbcTemplate.update(sql, usuario.getUsername(), usuario.getPassword(), usuario.getRol(),
				usuario.getIdUsuario());
	}

	@Override
	public void eliminar(int idUsuario) {
		String sql = "DELETE FROM Usuarios WHERE idUsuario = ?";
		jdbcTemplate.update(sql, idUsuario);
	}

	@Override
	public Usuarios buscarPorId(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuarios> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
