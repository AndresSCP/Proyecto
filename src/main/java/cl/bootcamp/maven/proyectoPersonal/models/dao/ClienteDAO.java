/**
@autor Andres Contreras
@version 1.0
La interfaz ClienteDAO define el contrato para implementar operaciones CRUD en objetos Cliente.
*/

package cl.bootcamp.maven.proyectoPersonal.models.dao;

import java.util.List;
import cl.bootcamp.maven.proyectoPersonal.models.Cliente;

public interface ClienteDAO {
  // Métodos CRUD
  public void agregarCliente(Cliente cliente); //agrega un nuevo Cliente al almacén de datos.
  public void actualizarCliente(Cliente cliente); //actualiza un Cliente existente en el almacén de datos.
  public void eliminarCliente(int id); //elimina un Cliente del almacén de datos.
  public Cliente obtenerClientePorId(int id); //recupera un Cliente del almacén de datos por su identificador.
  public List<Cliente> obtenerTodosLosClientes(); //recupera todos los Clientes del almacén de datos.
}