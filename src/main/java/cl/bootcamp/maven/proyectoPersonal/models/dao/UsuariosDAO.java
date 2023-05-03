package cl.bootcamp.maven.proyectoPersonal.models.dao;

import java.util.List;
import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;

public interface UsuariosDAO {

    public void agregar(Usuarios usuario);
  
    public void actualizar(Usuarios usuario);   
    public void eliminar(int idUsuario);  
    public Usuarios buscarPorId(int idUsuario);  
    public List<Usuarios> listar();
}