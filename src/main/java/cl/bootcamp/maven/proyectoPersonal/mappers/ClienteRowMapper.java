package cl.bootcamp.maven.proyectoPersonal.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import cl.bootcamp.maven.proyectoPersonal.models.Cliente;

public class ClienteRowMapper implements RowMapper<Cliente> {

	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setIdUsuario(rs.getInt("idUsuario"));
		cliente.setUsername(rs.getString("username"));
		cliente.setPassword(rs.getString("password"));
		cliente.setRol(rs.getString("role"));
		cliente.setNombreCliente(rs.getString("nombreCliente"));
		cliente.setApellidoCliente(rs.getString("apellidoCliente"));
		cliente.setGenero(rs.getString("genero"));
		cliente.setEmailCliente(rs.getString("emailCliente"));
		return cliente;
	}
}