package api.ventascatalogo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import api.ventascatalogo.entidades.Vendedor;

@Repository
public interface VendedorRepositorio extends CrudRepository<Vendedor, Integer>{

}
