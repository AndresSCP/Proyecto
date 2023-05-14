
/**
 * @author Andres Contreras
 * @Version 1.0
 * La clase ConexionBDTest se utiliza para realizar pruebas de conexión a una base de datos MySQL.
 * Antes de realizar las pruebas, se debe configurar la conexión a la base de datos en el método setUp()
 * mediante la especificación de la URL, nombre de usuario y contraseña. Luego, la conexión se abre y se guarda
 * en una variable de clase para que pueda ser utilizada en los métodos de prueba.
 * Después de la ejecución de las pruebas, se cierra la conexión en el método tearDown() si no se ha cerrado previamente.
 * Se ha incluido un método de prueba testConnection() que verifica que la conexión a la base de datos esté abierta y no sea nula.
 * Esta clase utiliza la biblioteca JUnit para la implementación de pruebas unitarias.
*/

package cl.bootcamp.maven.proyectoPersonal.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConexionBDTest {

    private static Connection connection;

    /**
     * Configura la conexión a la base de datos y la abre.
     * 
     * @throws SQLException si ocurre algún error al abrir la conexión.
     */
    @BeforeClass
    public static void setUp() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/proyectobdTEST";
        String username = "root"; // Cambia el nombre de usuario según tu configuración
        String password = "12345"; // Cambia la contraseña según tu configuración

        connection = DriverManager.getConnection(url, username, password);
    }

    /**
     * Cierra la conexión a la base de datos si no se ha cerrado previamente.
     * 
     * @throws SQLException si ocurre algún error al cerrar la conexión.
     */
    @AfterClass
    public static void tearDown() throws SQLException {
        // Cierra la conexión
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    /**
     * Verifica que la conexión a la base de datos esté abierta y no sea nula.
     * 
     * @throws SQLException si ocurre algún error al verificar la conexión.
     */
    @Test
    public void testConnection() throws SQLException {
        // Verifica que la conexión a la base de datos esté abierta y no sea nula
        assertNotNull(connection);
        assertFalse(connection.isClosed());
    }
}
