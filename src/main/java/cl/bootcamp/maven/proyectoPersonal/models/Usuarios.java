package cl.bootcamp.maven.proyectoPersonal.models;

public class Usuarios {
	
	private int idUsuario;
	private String nombreUsuario;
	private String password;
	private int tipoUsuario;
	
	
	public Usuarios(int idUsuario, String nombreUsuario, String password, int tipoUsuario) {

		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.tipoUsuario = tipoUsuario;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


}
