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
		jdbcTemplate.update(sql, usuario.getNombreUsuario(), usuario.getPassword(), usuario.getTipoUsuario());
	}

	@Override
	public void actualizar(Usuarios usuario) {
		String sql = "UPDATE Usuarios SET nombreUsuario = ?, password = ?, tipoUsuario = ? WHERE idUsuario = ?";
		jdbcTemplate.update(sql, usuario.getNombreUsuario(), usuario.getPassword(), usuario.getTipoUsuario(),
				usuario.getIdUsuario());
	}

	@Override
	public void eliminar(int idUsuario) {
		String sql = "DELETE FROM Usuarios WHERE idUsuario = ?";
		jdbcTemplate.update(sql, idUsuario);
	}

	@Override
	public Usuarios buscarPorId(int idUsuario) {
		String sql = "SELECT * FROM Usuarios WHERE idUsuario = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { idUsuario }, new UsuariosRowMapper());
	}

	@Override
	public List<Usuarios> listar() {
		String sql = "SELECT * FROM Usuarios";
		return jdbcTemplate.query(sql, new UsuariosRowMapper());
	}

	private static final class UsuariosRowMapper implements RowMapper<Usuarios> {
		public Usuarios mapRow(ResultSet rs, int rowNum) throws SQLException {
			Usuarios usuario = new Usuarios(rowNum, null, null, rowNum);
			usuario.setIdUsuario(rs.getInt("idUsuario"));
			usuario.setNombreUsuario(rs.getString("nombreUsuario"));
			usuario.setPassword(rs.getString("password"));
			usuario.setTipoUsuario(rs.getInt("tipoUsuario"));
			return usuario;
		}
	}
}
