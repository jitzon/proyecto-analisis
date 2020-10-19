package api.ventascatalogo.controller;

import api.ventascatalogo.entidades.Consumidor;
import api.ventascatalogo.repositorios.ConsumidorRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/consumidor")
public class ConsumidorController {
	
	@Autowired
	ConsumidorRepositorio consumidor;
	
	@GetMapping("/all")
	public List<Consumidor> getConsumidor(){
		return (List<Consumidor>) consumidor.findAll();
	}
	
	@PostMapping("/add")
	public String addConsumidor(@RequestBody Consumidor newConsumidor) {
		consumidor.save(newConsumidor);
		
		return "Dato guardado correctamente";
	}
	
	@GetMapping("/{id}")
	public Consumidor getConsumidorById(@PathVariable int id) {
		return consumidor.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
	}
	
	@DeleteMapping("/{id}")
	public String deleteConsumidorId(@PathVariable int id) {
		consumidor.deleteById(id);
		return "Elimnado";
	}
	
	@PostMapping("/{id}")
	public Consumidor updateConsumidor(@PathVariable int id, @RequestBody Consumidor newConsumidor) {
		Consumidor c = consumidor.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
		
		c.setNombre(newConsumidor.getNombre());
		c.setApellido(newConsumidor.getApellido());
		c.setTelefono(newConsumidor.getTelefono());
		c.setDireccionEntrega(newConsumidor.getDireccionEntrega());
		c.setNit(newConsumidor.getNit());
		c.setPassword(newConsumidor.getPassword());
		c.setCorreo(newConsumidor.getCorreo());
		
		consumidor.save(c);
		
		return c;
	}
}
