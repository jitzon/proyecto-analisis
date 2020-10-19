package api.ventascatalogo.repositorios;

import org.springframework.stereotype.Repository;
import api.ventascatalogo.entidades.Consumidor;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ConsumidorRepositorio extends CrudRepository<Consumidor, Integer>{
	
}
