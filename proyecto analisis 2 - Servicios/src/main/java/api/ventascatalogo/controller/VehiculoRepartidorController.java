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

import api.ventascatalogo.entidades.VehiculoRepartidor;
import api.ventascatalogo.repositorios.VehiculoRepartidorRepositorio;

@RestController
@RequestMapping("/vehiculo-repartidor")
public class VehiculoRepartidorController {
	@Autowired
	VehiculoRepartidorRepositorio vrep;
	
	@GetMapping("/all")
	public List<VehiculoRepartidor> getVRepartidor(){
		return (List<VehiculoRepartidor>) vrep.findAll();
	}
	
	@PostMapping("/add")
	public String addVRepartidor(@RequestBody VehiculoRepartidor newRepartidor) {
		vrep.save(newRepartidor);
		return "Dato guardado correctamente";
	}
	
	@GetMapping("/{id}")
	public VehiculoRepartidor getRepartidorById(@PathVariable int id) {
		return vrep.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
	}
	
	@DeleteMapping("/{id}")
	public String deleteVRepartidorId(@PathVariable int id) {
		vrep.deleteById(id);
		return "Eliminado";
	}
	
	@PostMapping("/{id}")
	public VehiculoRepartidor updateVRepartidor(@PathVariable int id, @RequestBody VehiculoRepartidor newRepartidor) {
		VehiculoRepartidor vr = vrep.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
		
		vr.setIdRepartidor(newRepartidor.getIdRepartidor());
		vr.setTipoVehiculo(newRepartidor.getTipoVehiculo());
		vr.setPlaca(newRepartidor.getPlaca());
		
		vrep.save(vr);
		return vr;
	}
}
