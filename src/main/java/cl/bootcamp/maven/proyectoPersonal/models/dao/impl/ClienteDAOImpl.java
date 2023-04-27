//package cl.bootcamp.maven.proyectoPersonal.models.dao.impl;
//
//import cl.bootcamp.maven.proyectoPersonal.models.dao.ClienteDAO;
//import cl.bootcamp.maven.proyectoPersonal.models.Cliente;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//import java.util.List;
//
//@Repository
//public class ClienteDAOImpl implements ClienteDAO {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public void agregarCliente(Cliente cliente) {
//        String sql = "INSERT INTO clientes (idUsuario, nombreUsuario, password, tipoUsuario, nombreCliente, apellidoCliente, genero, emailCliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//        jdbcTemplate.update(sql, cliente.getIdUsuario(), cliente.getNombreUsuario(), cliente.getPassword(),
//                cliente.getTipoUsuario(), cliente.getNombreCliente(), cliente.getApellidoCliente(),
//                cliente.getGenero(), cliente.getEmailCliente());
//    }
//
//    @Override
//    public void actualizarCliente(Cliente cliente) {
//        String sql = "UPDATE clientes SET nombreUsuario=?, password=?, tipoUsuario=?, nombreCliente=?, apellidoCliente=?, genero=?, emailCliente=? WHERE idUsuario=?";
//        jdbcTemplate.update(sql, cliente.getNombreUsuario(), cliente.getPassword(), cliente.getTipoUsuario(),
//                cliente.getNombreCliente(), cliente.getApellidoCliente(), cliente.getGenero(),
//                cliente.getEmailCliente(), cliente.getIdUsuario());
//    }
//
//    @Override
//    public void eliminarCliente(int idUsuario) {
//        String sql = "DELETE FROM clientes WHERE idUsuario=?";
//        jdbcTemplate.update(sql, idUsuario);
//    }
//
//    @Override
//    public Cliente obtenerClientePorId(int idUsuario) {
//        String sql = "SELECT * FROM clientes WHERE idUsuario=?";
//        return jdbcTemplate.queryForObject(sql, new Object[] { idUsuario }, (rs, rowNum) -> {
//            return new Cliente(rs.getInt("idUsuario"), rs.getString("nombreUsuario"), rs.getString("password"),
//                    rs.getInt("tipoUsuario"), rs.getString("nombreCliente"), rs.getString("apellidoCliente"),
//                    rs.getString("genero"), rs.getString("emailCliente"));
//        });
//    }
//
//    @Override
//    public List<Cliente> obtenerTodosLosClientes() {
//        String sql = "SELECT * FROM clientes";
//        return jdbcTemplate.query(sql, (rs, rowNum) -> {
//            return new Cliente(rs.getInt("idUsuario"), rs.getString("nombreUsuario"), rs.getString("password"),
//                    rs.getInt("tipoUsuario"), rs.getString("nombreCliente"), rs.getString("apellidoCliente"),
//                    rs.getString("genero"), rs.getString("emailCliente"));
//        });
//    }
//}
