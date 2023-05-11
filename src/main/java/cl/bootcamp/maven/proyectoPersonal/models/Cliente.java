/**
 * @author Andres Contreras
 * @Version 1.0
 */

package cl.bootcamp.maven.proyectoPersonal.models;

/**
 * Esta clase representa a un cliente. Hereda de la clase Usuarios y agrega
 * propiedades adicionales como nombreCliente, apellidoCliente, genero y emailCliente.
 */
public class Cliente extends Usuarios {
    private String nombreCliente;
    private String apellidoCliente;
    private String genero;
    private String emailCliente;
    
    /**
     * Constructor vacío de la clase Cliente.
     */
    public Cliente() {
        super();
    }
        
    /**
     * Constructor de la clase Cliente que inicializa todas las propiedades.
     */
    public Cliente(int idUsuario, String username, String password, String rol,
                   String nombreCliente, String apellidoCliente, String genero, String emailCliente) {
        super(idUsuario, username, password, rol);
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.genero = genero;
        this.emailCliente = emailCliente;
    }
    
    /**
     * Metodos Getter y Setter de cliente.
     */
    
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
    
    /**
     * Override del método toString() para imprimir los datos del cliente.
     * 
     * @return Una representación en forma de cadena de texto de los datos del cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", apellidoCliente='" + apellidoCliente + '\'' +
                ", genero='" + genero + '\'' +
                ", emailCliente='" + emailCliente + '\'' +
                '}';
    }
}