package api.ventascatalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.ventascatalogo.entidades.DireccionesTiendaVendedor;
import api.ventascatalogo.repositorios.DireccionesTiendaVendedorRepositorio;

@RestController
@RequestMapping("/direcciones-tienda-vendedor")
public class DireccionesTiendaVendedorController {
	@Autowired
	DireccionesTiendaVendedorRepositorio dtvrep;
	
	@GetMapping("/all")
	public List<DireccionesTiendaVendedor> getDirecciones(){
		return (List<DireccionesTiendaVendedor>) dtvrep.findAll();
	}
	
	@PostMapping("/add")
	public String addDireccionesTiendaVendedor(@RequestBody DireccionesTiendaVendedor newDireccionesTiendaVendedor) {
		dtvrep.save(newDireccionesTiendaVendedor);
		
		return "Guardado correctamente";
	}
	
	@GetMapping("/{id}")
	public DireccionesTiendaVendedor getDireccionesTiendaVendedorById(@PathVariable int id) {
		return dtvrep.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
	}
	
	@DeleteMapping("/{id}")
	public String deleteDirId(@PathVariable int id) {
		dtvrep.deleteById(id);
		
		return "Eliminado";
	}
	
	@PostMapping("/{id}")
	public DireccionesTiendaVendedor updateDir(@PathVariable int id, @RequestBody DireccionesTiendaVendedor newDireccionesTiendaVendedor) {
		DireccionesTiendaVendedor d = dtvrep.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
		
		d.setIdVendedor(newDireccionesTiendaVendedor.getIdVendedor());
		d.setIdDireccionTienda(newDireccionesTiendaVendedor.getIdDireccionTienda());
		d.setTelefono(newDireccionesTiendaVendedor.getTelefono());
		
		dtvrep.save(d);
		
		return d;
	}
}
