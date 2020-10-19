package api.ventascatalogo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import api.ventascatalogo.entidades.Repartidor;

@Repository
public interface RepartidorRepositorio extends CrudRepository<Repartidor, Integer>{

}
