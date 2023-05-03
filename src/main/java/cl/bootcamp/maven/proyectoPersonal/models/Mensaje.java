package cl.bootcamp.maven.proyectoPersonal.models;

import java.sql.Timestamp;

public class Mensaje {
	
	private String idMensaje;
	private String lugar;
	private String mensaje;
	private String referencia;
	private Timestamp fechaCreacion;
	private Integer idUsuario;

		
	public Mensaje() {};
	
	public Mensaje(String idMensaje, String lugar, String mensaje, String referencia, Timestamp fechaCreacion,Integer idUsuario) {
		super();
		this.idMensaje = idMensaje;
		this.lugar = lugar;
		this.mensaje = mensaje;
		this.referencia = referencia;
		this.fechaCreacion = fechaCreacion;
		this.idUsuario = idUsuario;
	}

	public String getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(String idMensaje) {
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

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	

}

	

	
	
	


