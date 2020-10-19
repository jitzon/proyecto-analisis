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

import api.ventascatalogo.entidades.PedidoListadoDescripcion;
import api.ventascatalogo.repositorios.PedidoListadoDescripcionRepositorio;

@RestController
@RequestMapping("/pedido-listado-descripcion")
public class PedidoListadoDescripcionController {
	@Autowired
	PedidoListadoDescripcionRepositorio pldes;
	
	@GetMapping("/all")
	public List<PedidoListadoDescripcion> getLDescripcion(){
		return (List<PedidoListadoDescripcion>) pldes.findAll();
	}
	
	@PostMapping("/add")
	public String addDescripcion(@RequestBody PedidoListadoDescripcion newDescripcion) {
		pldes.save(newDescripcion);
		return "Datos guardado correctamente";
	}
	
	@GetMapping
	public PedidoListadoDescripcion getDescripcionById(@PathVariable int id) {
		return pldes.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
	}
	
	@DeleteMapping
	public String deleteDescripcionId(@PathVariable int id) {
		pldes.deleteById(id);
		return "Eliminado";
	}
	
	@PostMapping("/{id}")
	public PedidoListadoDescripcion updateDescripcion(@PathVariable int id, @RequestBody PedidoListadoDescripcion newDescripcion) {
		PedidoListadoDescripcion pl = pldes.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
		
		pl.setIdProducto(newDescripcion.getIdProducto());
		pl.setIdConsumidor(newDescripcion.getIdConsumidor());
		
		pldes.save(pl);
		return pl;
	}
}
