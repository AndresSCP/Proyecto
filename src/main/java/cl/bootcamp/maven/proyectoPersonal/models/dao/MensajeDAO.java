package cl.bootcamp.maven.proyectoPersonal.models.dao;

import java.util.List;
import cl.bootcamp.maven.proyectoPersonal.models.Mensaje;
import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;

public interface MensajeDAO {
    Mensaje findById(int id);
    void save(Mensaje mensaje);
    void update(Mensaje mensaje);
    void delete(int id);
    List<Mensaje> findByUsuario(Usuarios usuario);

}