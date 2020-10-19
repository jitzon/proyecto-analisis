package api.ventascatalogo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import api.ventascatalogo.entidades.Pedido;

@Repository
public interface PedidoRepositorio extends CrudRepository<Pedido, Integer>{

}
