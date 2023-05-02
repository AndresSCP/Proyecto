package cl.bootcamp.maven.proyectoPersonal.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuarios{

		private String nombreCliente;
		private String apellidoCliente;
		private String genero;
		private String emailCliente;
		private List<Mensaje> mensajes;
	
	    // Constructor
		public Cliente() {
			super();
		}
		
	    public Cliente(int idUsuario, String username, String password, String rol, String nombreCliente,
	            String apellidoCliente, String genero, String emailCliente) {
	        super(idUsuario, username, password, rol);
	        this.nombreCliente = nombreCliente;
	        this.apellidoCliente = apellidoCliente;
	        this.genero = genero;
	        this.emailCliente = emailCliente;
	        this.mensajes = new ArrayList<>();
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
		
	    public List<Mensaje> getMensajes() {
	        return mensajes;
	    }

	    public void agregarMensaje(Mensaje mensaje) {
	        mensajes.add(mensaje);
	    }

	    public void eliminarMensaje(Mensaje mensaje) {
	        mensajes.remove(mensaje);
	    }
				
}
