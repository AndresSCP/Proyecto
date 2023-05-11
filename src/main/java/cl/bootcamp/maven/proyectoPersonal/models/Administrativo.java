/**
 * @author Andres Contreras
 * @Version 1.0
 * La clase Administrativo representa un usuario administrativo en el sistema.
 * Esta clase extiende la clase Usuarios.
 *  */
package cl.bootcamp.maven.proyectoPersonal.models;

public class Administrativo extends Usuarios{
	
	private String nombreAdmin;
	private String emailAdmin;
	
	/**
	 * Constructores de la clase Administrativo
	 */
	public Administrativo() {
		super();
	}	
	
	public Administrativo(int idUsuario, String username, String password, String nombreAdmin,String emailAdmin) {
		super(idUsuario, username, password, "administrativo");
		this.nombreAdmin = nombreAdmin;
		this.emailAdmin = emailAdmin;
	}

	/**
	 * Metodos Getter y Setter.
	 */
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

	/**
	 * Devuelve una representación de cadena del objeto Administrativo.
	 *
	 * @return una cadena que representa el objeto Administrativo.
	 */
	@Override
	public String toString() {
		return "Administrativo [nombreAdmin=" + nombreAdmin + ", emailAdmin=" + emailAdmin + "]";
	}
}