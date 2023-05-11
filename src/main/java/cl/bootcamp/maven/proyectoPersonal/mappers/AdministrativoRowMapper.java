package cl.bootcamp.maven.proyectoPersonal.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.bootcamp.maven.proyectoPersonal.models.Administrativo;

public class AdministrativoRowMapper implements RowMapper<Administrativo> {
    @Override
    public Administrativo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Administrativo admin = new Administrativo();
        admin.setIdUsuario(rs.getInt("idUsuario"));
        admin.setNombreAdmin(rs.getString("nombreAdmin"));
        admin.setEmailAdmin(rs.getString("emailAdmin"));
        return admin;
    }
}
