package cl.bootcamp.maven.proyectoPersonal.models.dao;

import java.util.List;

import cl.bootcamp.maven.proyectoPersonal.models.Cliente;

public interface ClienteDAO {
    
	void agregarCliente(Cliente cliente); // Crea un nuevo cliente
	void actualizarCliente(Cliente cliente); // Actualiza un cliente
    void eliminarCliente(int idUsuario); // Elimina un cliente
    Cliente obtenerClientePorId(int idUsuario); // Obtiene un cliente por su ID
    public List<Cliente> obtenerTodosLosClientes();// Obtiene la lista de todos los clientes
}