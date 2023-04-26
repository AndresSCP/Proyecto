package cl.bootcamp.maven.proyectoPersonal.models;

public class Mensaje {
	
	private String idMensaje;
	private String lugar;
	private String mensaje;
	private String referencia;	

		
	public Mensaje() {};
	
	public Mensaje(String idMensaje, String lugar, String mensaje, String referencia) {
		super();
		this.idMensaje = idMensaje;
		this.lugar = lugar;
		this.mensaje = mensaje;
		this.referencia = referencia;
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
	



	}

	

	
	
	


