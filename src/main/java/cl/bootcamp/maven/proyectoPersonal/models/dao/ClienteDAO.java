package cl.bootcamp.maven.proyectoPersonal.models.dao;

import java.util.List;
import cl.bootcamp.maven.proyectoPersonal.models.Cliente;

public interface ClienteDAO {
  // Métodos CRUD
  public void agregarCliente(Cliente cliente);
  public void actualizarCliente(Cliente cliente);
  public void eliminarCliente(int id);
  public Cliente obtenerClientePorId(int id);
  public List<Cliente> obtenerTodosLosClientes();
}