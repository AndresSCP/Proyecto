/**
 * @author Andres Contreras
 * @Version 1.0
 */
package cl.bootcamp.maven.proyectoPersonal.models;

public class Administrativo extends Usuarios{
	
	private String nombreAdmin;
	private String emailAdmin;
	
	public Administrativo() {
		super();
	}	
	
	public Administrativo(int idUsuario, String username, String password, String nombreAdmin,String emailAdmin) {
		super(idUsuario, username, password, "administrativo");
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

	@Override
	public String toString() {
		return "Administrativo [nombreAdmin=" + nombreAdmin + ", emailAdmin=" + emailAdmin + "]";
	}
	
	
	
}
