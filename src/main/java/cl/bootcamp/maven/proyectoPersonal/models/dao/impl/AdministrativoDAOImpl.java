package cl.bootcamp.maven.proyectoPersonal.models.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.bootcamp.maven.proyectoPersonal.models.Administrativo;
import cl.bootcamp.maven.proyectoPersonal.models.dao.AdministrativoDAO;
import cl.bootcamp.maven.proyectoPersonal.mappers.AdministrativoRowMapper;

public class AdministrativoDAOImpl implements AdministrativoDAO{
	
	 private final JdbcTemplate jdbcTemplate;

	    public AdministrativoDAOImpl(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;}

	    @Override
	    public void agregarAdministrativo(Administrativo admin) {
	        String sql = "INSERT INTO Administrativo (idUsuario, nombreAdmin, emailAdmin) VALUES (?, ?, ?)";
	        jdbcTemplate.update(sql, admin.getIdUsuario(), admin.getNombreAdmin(), admin.getEmailAdmin());
	    }

	    @Override
	    public void actualizarAdministrativo(Administrativo admin) {
	        String sql = "UPDATE Administrativo SET nombreAdmin = ?, emailAdmin = ? WHERE idUsuario = ?";
	        jdbcTemplate.update(sql, admin.getNombreAdmin(), admin.getEmailAdmin(), admin.getIdUsuario());
	    }

	    @Override
	    public void eliminarAdministrativo(int id) {
	        String sql = "DELETE FROM Administrativo WHERE idUsuario = ?";
	        jdbcTemplate.update(sql, id);
	    }

	    @Override
	    public Administrativo obtenerAdministrativoPorId(int id) {
	        String sql = "SELECT u.idUsuario, u.username, u.password, u.enabled, u.role, a.nombreAdmin, a.emailAdmin " +
	                "FROM Usuarios u " +
	                "JOIN Administrativo a ON u.idUsuario = a.idUsuario " +
	                "WHERE u.idUsuario = ?";
	        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new AdministrativoRowMapper());
	    }

	    @Override
	    public List<Administrativo> obtenerTodosLosAdministrativos() {
	        String sql = "SELECT u.idUsuario, u.username, u.password, u.enabled, u.role, a.nombreAdmin, a.emailAdmin " +
	                "FROM Usuarios u " +
	                "JOIN Administrativo a ON u.idUsuario = a.idUsuario " +
	                "WHERE u.role = 'administrativo'";
	        return jdbcTemplate.query(sql, new AdministrativoRowMapper());
	    }

}
