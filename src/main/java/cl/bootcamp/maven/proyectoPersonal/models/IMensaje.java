package cl.bootcamp.maven.proyectoPersonal.models;

import java.util.List;

public interface IMensaje {
	
    void asignarMensaje(Mensaje mensaje);
    
    List<Mensaje> obtenerMensajes();
}
	

