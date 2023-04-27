package cl.bootcamp.maven.proyectoPersonal.models;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ConexionBD {
	
	public DriverManagerDataSource Conexion() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/proyectobd");
		dataSource.setUsername("root");
		dataSource.setPassword("12345");
		return dataSource;
	}

}
