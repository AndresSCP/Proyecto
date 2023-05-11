/**
 * @author Andres Contreras
 * @Version 1.0
 */
package cl.bootcamp.maven.proyectoPersonal.models;

import java.time.LocalDateTime;

public class Mensaje {
    
    private int idMensaje;
    private String lugar;
    private String mensaje;
    private String referencia;
    private LocalDateTime fechaCreacion;
    private Usuarios usuario;
    
    // constructores
    public Mensaje() {}
    
    public Mensaje(int idMensaje, String lugar, String mensaje, String referencia, LocalDateTime fechaCreacion, Usuarios usuario) {
        this.idMensaje = idMensaje;
        this.lugar = lugar;
        this.mensaje = mensaje;
        this.referencia = referencia;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
    }
    
    // getters y setters
    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

	@Override
	public String toString() {
		return "Mensaje [idMensaje=" + idMensaje + ", lugar=" + lugar + ", mensaje=" + mensaje + ", referencia="
				+ referencia + ", fechaCreacion=" + fechaCreacion + ", usuario=" + usuario + "]";
	}
    
    
}

	

	
	
	


