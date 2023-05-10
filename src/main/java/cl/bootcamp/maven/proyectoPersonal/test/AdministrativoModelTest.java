package cl.bootcamp.maven.proyectoPersonal.test;

import org.junit.jupiter.api.Test;
import cl.bootcamp.maven.proyectoPersonal.models.*;
import static org.junit.jupiter.api.Assertions.*;

class AdministrativoTest {
	
	@Test
	void testGettersAndSetters() {
		Administrativo admin = new Administrativo(1, "admin", "password", "Nombre Admin", "email@admin.com");
		assertEquals(1, admin.getIdUsuario());
		assertEquals("admin", admin.getUsername());
		assertEquals("password", admin.getPassword());
		assertEquals("Nombre Admin", admin.getNombreAdmin());
		assertEquals("email@admin.com", admin.getEmailAdmin());
		
		admin.setNombreAdmin("Nuevo Nombre");
		assertEquals("Nuevo Nombre", admin.getNombreAdmin());
		
		admin.setEmailAdmin("nuevo@email.com");
		assertEquals("nuevo@email.com", admin.getEmailAdmin());
	}

}