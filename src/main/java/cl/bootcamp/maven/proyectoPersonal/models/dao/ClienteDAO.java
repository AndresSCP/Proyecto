package cl.bootcamp.maven.proyectoPersonal.models.dao;

import cl.bootcamp.maven.proyectoPersonal.models.Cliente;

public interface ClienteDAO {
    
    void crearCliente(Cliente cliente); // Crea un nuevo cliente
    Cliente obtenerClienteById(int idCliente); // Obtiene un cliente por su ID
    void actualizarCliente(Cliente cliente); // Actualiza un cliente
    void eliminarCliente(Cliente cliente); // Elimina un cliente

}