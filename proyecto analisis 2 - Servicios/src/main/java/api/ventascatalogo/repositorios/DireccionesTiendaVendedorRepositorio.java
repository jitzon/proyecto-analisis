package api.ventascatalogo.repositorios;

import org.springframework.stereotype.Repository;
import api.ventascatalogo.entidades.DireccionesTiendaVendedor;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface DireccionesTiendaVendedorRepositorio extends CrudRepository<DireccionesTiendaVendedor, Integer>{

}
