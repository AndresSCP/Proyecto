//package cl.bootcamp.maven.proyectoPersonal.mappers;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import org.springframework.jdbc.core.RowMapper;
//import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;
//
//public class UsuariosMapper implements RowMapper<Usuarios> {
//    public Usuarios mapRow(ResultSet rs, int rowNum) throws SQLException {
//        Usuarios usuario = new Usuarios();
//        usuario.setIdUsuario(rs.getInt("idUsuario"));
//        usuario.setUsername(rs.getString("username"));
//        usuario.setPassword(rs.getString("password"));
//        usuario.setTipoUsuario(rs.getInt("tipoUsuario"));
//        return usuario;
//    }
//}