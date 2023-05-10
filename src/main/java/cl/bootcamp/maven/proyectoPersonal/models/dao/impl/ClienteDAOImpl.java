package cl.bootcamp.maven.proyectoPersonal.models.dao.impl;

import java.sql.PreparedStatement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import cl.bootcamp.maven.proyectoPersonal.models.Cliente;
import cl.bootcamp.maven.proyectoPersonal.models.dao.ClienteDAO;
import cl.bootcamp.maven.proyectoPersonal.mappers.ClienteRowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

@Repository
public class ClienteDAOImpl implements ClienteDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void agregarCliente(Cliente cliente) {
        String sqlUsuarios = "INSERT INTO Usuarios (username, password, role) VALUES (?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sqlUsuarios, new String[] {"idUsuario"});
            ps.setString(1, cliente.getUsername());
            ps.setString(2, cliente.getPassword());
            ps.setString(3, cliente.getRol());
            return ps;
        }, keyHolder);

        int idUsuario = keyHolder.getKey().intValue();

        String sqlCliente = "INSERT INTO Cliente (idUsuario, nombreCliente, apellidoCliente, genero, emailCliente) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sqlCliente, idUsuario, cliente.getNombreCliente(), cliente.getApellidoCliente(), cliente.getGenero(), cliente.getEmailCliente());
    }

	
    @Override
    public void actualizarCliente(Cliente cliente) {
        // Actualiza el campo 'username' en la tabla Usuarios
        String sql = "UPDATE Usuarios SET username=? WHERE idUsuario=?";
        jdbcTemplate.update(sql, cliente.getUsername(), cliente.getIdUsuario());

        // Actualiza los campos 'nombreCliente', 'apellidoCliente', 'genero' y 'emailCliente' en la tabla Cliente
        sql = "UPDATE Cliente SET nombreCliente=?, apellidoCliente=?, genero=?, emailCliente=? WHERE idUsuario=?";
        jdbcTemplate.update(sql, cliente.getNombreCliente(), cliente.getApellidoCliente(), cliente.getGenero(), cliente.getEmailCliente(), cliente.getIdUsuario());
    }
	
    
    @Override
    public void eliminarCliente(int id) {
        String sql = "DELETE FROM Cliente WHERE idUsuario=?";
        jdbcTemplate.update(sql, id);

        sql = "DELETE FROM Usuarios WHERE idUsuario=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Cliente obtenerClientePorId(int id) {
        String sql = "SELECT * FROM Usuarios JOIN Cliente ON Usuarios.idUsuario = Cliente.idUsuario WHERE Usuarios.idUsuario=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new ClienteRowMapper());
    }

    @Override
    public List<Cliente> obtenerTodosLosClientes() {
        String sql = "SELECT * FROM Usuarios JOIN Cliente ON Usuarios.idUsuario = Cliente.idUsuario";
        return jdbcTemplate.query(sql, new ClienteRowMapper());
    }
}
