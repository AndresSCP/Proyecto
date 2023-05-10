package cl.bootcamp.maven.proyectoPersonal.models.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import cl.bootcamp.maven.proyectoPersonal.models.Usuarios;

@Repository
public interface UsuariosDAO {
	  public Usuarios findById(int id);
	  public List<Usuarios> findAll();
	  public void save(Usuarios usuario);
	  public void update(Usuarios usuario);
	  public void delete(int id);
	  public void activar(int id);
	}
