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
import api.ventascatalogo.entidades.Productos;
import api.ventascatalogo.repositorios.ProductosRepositorio;

@RestController
@RequestMapping("/productos")
public class ProductosController {
	@Autowired
	 ProductosRepositorio productos;
	
	@GetMapping("/all")
	public List<Productos> getProductos(){
		return (List<Productos>) productos.findAll();
	}
	
	@PostMapping("/add")
	public String addProductos(@RequestBody Productos newProductos) {
		productos.save(newProductos);
		return "Datos guardados correctamente";
	}
	
	@GetMapping("/{id}")
	public Productos getProductosById(@PathVariable int id) {
		return productos.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
	}
	
	@DeleteMapping("/{id}")
	public String deleteProductos(@PathVariable int id) {
		productos.deleteById(id);
		return "Eliminado";
	}
	
	@PostMapping("/{id}")
	public Productos updateProductos(@PathVariable int id, @RequestBody Productos newProductos) {
		Productos p = productos.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
		
		p.setDescripcion(newProductos.getDescripcion());
		p.setIdVendedor(newProductos.getIdVendedor());
		p.setIdTiendadireccion(newProductos.getIdTiendadireccion());
		
		productos.save(p);
		return p;
	}
}
