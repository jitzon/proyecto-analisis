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
import api.ventascatalogo.entidades.Repartidor;
import api.ventascatalogo.repositorios.RepartidorRepositorio;

@RestController
@RequestMapping("/repartidor")
public class RepartidorController {
	@Autowired
	RepartidorRepositorio repartidor;
	
	@GetMapping("/all")
	public List<Repartidor> getRepartidor(){
		return (List<Repartidor>) repartidor.findAll();
	}
	
	@PostMapping("/add")
	public String addRepartidor(@RequestBody Repartidor newRep) {
		repartidor.save(newRep);
		return "Datos guardados correctamente";
	}
	
	@GetMapping("/{id}")
	public Repartidor getRepartidorById(@PathVariable int id) {
		return repartidor.findById(id).orElseThrow(()->new IllegalArgumentException("No se encontraron registros"));
	}
	
	@DeleteMapping("/{id}")
	public String deleteRepartidor(@PathVariable int id) {
		repartidor.deleteById(id);
		return "Eliminado";
	}
	
	@PostMapping("/{id}")
	public Repartidor updateProductos(@PathVariable int id, @RequestBody Repartidor newRep) {
		Repartidor p = repartidor.findById(id).orElseThrow(()->new IllegalArgumentException("No se encontraron registros"));
		
		p.setNombreCompleto(newRep.getNombreCompleto());
		p.setDpi(newRep.getDpi());
		p.setDireccion(newRep.getDireccion());
		p.setCelular(newRep.getCelular());
		p.setIdVehiculo(newRep.getIdVehiculo());
		p.setNoLicencia(newRep.getNoLicencia());
		p.setPassword(newRep.getPassword());
		p.setCorreo(newRep.getCorreo());
		
		repartidor.save(p);
		return p;
	}
}
