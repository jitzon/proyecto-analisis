package api.ventascatalogo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import api.ventascatalogo.entidades.VehiculoRepartidor;

@Repository
public interface VehiculoRepartidorRepositorio extends CrudRepository<VehiculoRepartidor, Integer>{

}
