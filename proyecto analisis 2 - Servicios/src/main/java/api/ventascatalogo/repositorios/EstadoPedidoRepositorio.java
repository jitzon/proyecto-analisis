package api.ventascatalogo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import api.ventascatalogo.entidades.EstadoPedido;

@Repository
public interface EstadoPedidoRepositorio extends CrudRepository<EstadoPedido, Integer>{

}
