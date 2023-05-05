package cl.bootcamp.maven.proyectoPersonal.models;

public class Usuarios {
	  private int idUsuario;
	  private String username;
	  private String password;
	  private String rol;

	  public Usuarios() {}

	  public Usuarios(int idUsuario, String username, String password, String rol) {
	    this.idUsuario = idUsuario;
	    this.username = username;
	    this.password = password;
	    this.rol = rol;
	  }

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", username=" + username + ", password=" + password + ", rol=" + rol
				+ "]";
	}
		  
}
	