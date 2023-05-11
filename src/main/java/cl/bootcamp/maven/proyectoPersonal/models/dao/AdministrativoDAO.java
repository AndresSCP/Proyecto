package cl.bootcamp.maven.proyectoPersonal.models.dao;

import java.util.List;
import cl.bootcamp.maven.proyectoPersonal.models.Administrativo;

public interface AdministrativoDAO {
    public void agregarAdministrativo(Administrativo admin);
    public void actualizarAdministrativo(Administrativo admin);
    public void eliminarAdministrativo(int id);
    public Administrativo obtenerAdministrativoPorId(int id);
    public List<Administrativo> obtenerTodosLosAdministrativos();
    
}