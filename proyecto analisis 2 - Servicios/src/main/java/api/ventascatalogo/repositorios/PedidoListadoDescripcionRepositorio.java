package api.ventascatalogo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import api.ventascatalogo.entidades.PedidoListadoDescripcion;

@Repository
public interface PedidoListadoDescripcionRepositorio extends CrudRepository<PedidoListadoDescripcion, Integer>{

}
