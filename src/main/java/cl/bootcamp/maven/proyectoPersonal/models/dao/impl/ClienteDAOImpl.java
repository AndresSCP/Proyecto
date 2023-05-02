package cl.bootcamp.maven.proyectoPersonal.models.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import cl.bootcamp.maven.proyectoPersonal.models.Cliente;
import cl.bootcamp.maven.proyectoPersonal.models.dao.ClienteDAO;

@Repository
public class ClienteDAOImpl implements ClienteDAO {
  // La clase JdbcTemplate nos permite interactuar con la base de datos
    private final JdbcTemplate jdbcTemplate;
    private final DataSource dataSource;

    @Autowired
    public ClienteDAOImpl(JdbcTemplate jdbcTemplate, DataSource dataSource) {
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }
// Implementación de los métodos CRUD
  
    @Override
    public void agregarCliente(Cliente cliente) {
        // Insertar registro en la tabla usuarios
        String sql = "INSERT INTO Usuarios (username, password, rol) VALUES (?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getUsername());
            ps.setString(2, cliente.getPassword());
            ps.setString(3, cliente.getRol());
            return ps;
        }, keyHolder);

        // Obtener el ID del usuario recién creado
        int idUsuario = keyHolder.getKey().intValue();

        // Insertar registro en la tabla cliente con el ID de usuario generado
        String sql2 = "INSERT INTO Cliente (idUsuario, nombreCliente, apellidoCliente, genero, emailCliente, username, password, rol) "
                    + "SELECT ?, ?, ?, ?, ?, username, password, rol FROM Usuarios WHERE idUsuario = ?";
        jdbcTemplate.update(sql2, idUsuario, cliente.getNombreCliente(), cliente.getApellidoCliente(),
                cliente.getGenero(), cliente.getEmailCliente(), idUsuario);
    }
  
  @Override
  public void actualizarCliente(Cliente cliente) {
    String sql = "UPDATE Cliente SET username = ?, password = ?, rol = ?, nombreCliente = ?, apellidoCliente = ?, genero = ?, emailCliente = ? WHERE idUsuario = ?";
    jdbcTemplate.update(sql, cliente.getUsername(), cliente.getPassword(), cliente.getRol(), cliente.getNombreCliente(), cliente.getApellidoCliente(), cliente.getGenero(), cliente.getEmailCliente(), cliente.getIdUsuario());
    String sql2 = "UPDATE Usuarios SET username = ?, password = ?, rol = ? WHERE idUsuario = ?";
    jdbcTemplate.update(sql2, cliente.getUsername(), cliente.getPassword(), cliente.getRol(), cliente.getIdUsuario());
  }

  @Override
  public void eliminarCliente(int id) {
    String sql = "DELETE FROM Cliente WHERE idUsuario = ?";
    jdbcTemplate.update(sql, id);
    String sql2 = "DELETE FROM Usuarios WHERE idUsuario = ?";
    jdbcTemplate.update(sql2, id);
  }

  @Override
  public Cliente obtenerClientePorId(int id) {
    String sql = "SELECT * FROM Cliente WHERE idUsuario = ?";
    return jdbcTemplate.queryForObject(sql, new Object[]{id}, new ClienteRowMapper());
  }

  @Override
  public List<Cliente> obtenerTodosLosClientes() {
    String sql = "SELECT * FROM Cliente";
    return jdbcTemplate.query(sql, new ClienteRowMapper());
  }

  // RowMapper para mapear los resultados de la consulta SQL a objetos Cliente
  private static class ClienteRowMapper implements RowMapper<Cliente> {
    @Override
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
      Cliente cliente = new Cliente();
      cliente.setIdUsuario(rs.getInt("idUsuario"));
      cliente.setUsername(rs.getString("username"));
      cliente.setPassword(rs.getString("password"));
      cliente.setRol(rs.getString("rol"));
      cliente.setNombreCliente(rs.getString("nombreCliente"));
      cliente.setApellidoCliente(rs.getString("apellidoCliente"));
      cliente.setGenero(rs.getString("genero"));
      cliente.setEmailCliente(rs.getString("emailCliente"));
      return cliente;
    }
  }
}
