package cl.bootcamp.maven.proyectoPersonal.models;

public class Cliente extends Usuarios{

		private String nombreCliente;
		private String apellidoCliente;
		private String genero;
		private String emailCliente;
	
		public Cliente(int idUsuario, String nombreUsuario, String password, int tipoUsuario, String nombreCliente, String apellidoCliente,
				String genero, String emailCliente) {
			super(idUsuario, nombreUsuario, password, tipoUsuario);
			this.nombreCliente = nombreCliente;
			this.apellidoCliente = apellidoCliente;
			this.genero = genero;
			this.emailCliente = emailCliente;
		}

		public String getNombreCliente() {
			return nombreCliente;
		}

		public void setNombreCliente(String nombreCliente) {
			this.nombreCliente = nombreCliente;
		}

		public String getApellidoCliente() {
			return apellidoCliente;
		}

		public void setApellidoCliente(String apellidoCliente) {
			this.apellidoCliente = apellidoCliente;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getEmailCliente() {
			return emailCliente;
		}

		public void setEmailCliente(String emailCliente) {
			this.emailCliente = emailCliente;
		}

		
}
