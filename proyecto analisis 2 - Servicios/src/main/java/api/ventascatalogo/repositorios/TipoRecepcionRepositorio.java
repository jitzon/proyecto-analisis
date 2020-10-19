package api.ventascatalogo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import api.ventascatalogo.entidades.TipoRecepcion;

@Repository
public interface TipoRecepcionRepositorio extends CrudRepository<TipoRecepcion, Integer>{

}
