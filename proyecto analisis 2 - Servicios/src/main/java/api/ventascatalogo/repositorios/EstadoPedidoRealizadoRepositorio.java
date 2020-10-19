package api.ventascatalogo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import api.ventascatalogo.entidades.EstadoPedidoRealizado;

@Repository
public interface EstadoPedidoRealizadoRepositorio extends CrudRepository<EstadoPedidoRealizado, Integer>{

}
