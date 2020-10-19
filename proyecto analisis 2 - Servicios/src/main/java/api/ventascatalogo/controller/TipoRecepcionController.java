package api.ventascatalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.ventascatalogo.entidades.TipoRecepcion;
import api.ventascatalogo.repositorios.TipoRecepcionRepositorio;

@RestController
@RequestMapping("/tipo-recepcion")
public class TipoRecepcionController {
	@Autowired
	TipoRecepcionRepositorio trecep;
	
	@GetMapping("/all")
	public List<TipoRecepcion> getRecepcion(){
		return (List<TipoRecepcion>) trecep.findAll();
	}
	
	@PostMapping("/add")
	public String addRecep(@RequestBody TipoRecepcion newTRecepcion) {
		trecep.save(newTRecepcion);
		return "Dato guardado correctamente";
	}
	
	@GetMapping("/{id}")
	public TipoRecepcion getTRecepById(@PathVariable int id) {
		return trecep.findById(id).orElseThrow(()->new IllegalArgumentException("No se encontraron registros"));
	}
	
	@DeleteMapping("/{id}")
	public String deleteRecep(@PathVariable int id) {
		trecep.deleteById(id);
		return "Elimnado";
	}
	
	@PutMapping("/{id}")
	public TipoRecepcion updateRecep(@PathVariable int id, @RequestBody TipoRecepcion newTRecepcion) {
		TipoRecepcion tr = trecep.findById(id).orElseThrow(()->new IllegalArgumentException("No se encontraron registros"));
		
		tr.setDescripcion(newTRecepcion.getDescripcion());
		
		trecep.save(tr);
		return tr;
	}
}
