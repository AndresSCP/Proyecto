package cl.bootcamp.maven.proyectoPersonal.models;

public class Administrativo extends Usuarios{
	
	private String nombreAdmin;
	private String emailAdmin;
	
	public Administrativo(int idUsuario, String nombreUsuario, String password, int tipoUsuario, String nombreAdmin,String emailAdmin) {
		super(idUsuario, nombreUsuario, password, tipoUsuario);
		this.nombreAdmin = nombreAdmin;
		this.emailAdmin = emailAdmin;
	}

	public String getNombreAdmin() {
		return nombreAdmin;
	}

	public void setNombreAdmin(String nombreAdmin) {
		this.nombreAdmin = nombreAdmin;
	}

	public String getEmailAdmin() {
		return emailAdmin;
	}

	public void setEmailAdmin(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}
	
	
}
