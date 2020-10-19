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

import api.ventascatalogo.entidades.EstadoPedido;
import api.ventascatalogo.repositorios.EstadoPedidoRepositorio;

@RestController
@RequestMapping("/estado-pedido")
public class EstadoPedidoController {
	@Autowired
	EstadoPedidoRepositorio epedido;
	
	@GetMapping("/all")
	public List<EstadoPedido> getEPedido(){
		return (List<EstadoPedido>) epedido.findAll();
	}
	
	@PostMapping("/add")
	public String addEPedido(@RequestBody EstadoPedido newEPedido) {
		epedido.save(newEPedido);
		return "Guardado correctamente";
	}
	
	@GetMapping("/{id}")
	public EstadoPedido getPedidoById(@PathVariable int id) {
		return epedido.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
	}
	
	@DeleteMapping("/{id}")
	public String deleteEstadoId(@PathVariable int id) {
		epedido.deleteById(id);
		return "Eliminado";
	}
	
	@PostMapping("/{id}")
	public EstadoPedido updatePedido(@PathVariable int id, @RequestBody EstadoPedido newEPedido) {
		EstadoPedido ep = epedido.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
		
		ep.setDescripcion(newEPedido.getDescripcion());
		
		epedido.save(ep);
		return ep;
	}
}
