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

    @BeforeClass
    public static void setUp() throws SQLException {
        // Configura la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/proyectobdTEST"; // Cambia la URL de la base de datos según tu configuración
        String username = "root"; // Cambia el nombre de usuario según tu configuración
        String password = "12345"; // Cambia la contraseña según tu configuración

        // Abre la conexión
        connection = DriverManager.getConnection(url, username, password);
    }

    @AfterClass
    public static void tearDown() throws SQLException {
        // Cierra la conexión
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    @Test
    public void testConnection() throws SQLException {
        // Verifica que la conexión a la base de datos esté abierta y no sea nula
        assertNotNull(connection);
        assertFalse(connection.isClosed());
    }
}
