package api.ventascatalogo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import api.ventascatalogo.entidades.Productos;

@Repository
public interface ProductosRepositorio extends CrudRepository<Productos, Integer>{

}
