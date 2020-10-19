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
import api.ventascatalogo.entidades.Pedido;
import api.ventascatalogo.repositorios.PedidoRepositorio;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	@Autowired
	PedidoRepositorio pedido;
	
	@GetMapping("/all")
	public List<Pedido> getPedido(){
		return (List<Pedido>) pedido.findAll();
	}
	
	@PostMapping("/add")
	public String addPedido(@RequestBody Pedido newPedido) {
		pedido.save(newPedido);
		return "Datos guardados correctamente";
	}
	
	@GetMapping("/{id}")
	public Pedido getPedidoById(@PathVariable int id) {
		return pedido.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
	}
	
	@DeleteMapping("/{id}")
	public String deletePedidoId(@PathVariable int id) {
		pedido.deleteById(id);
		return "Eliminado";
	}
	
	@PostMapping("/{id}")
	public Pedido updatePedido(@PathVariable int id, @RequestBody Pedido newPedido) {
		Pedido p = pedido.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encontraron registros"));
		
		p.setIdConsumidor(newPedido.getIdConsumidor());
		p.setIdPedidoListadoDescripcion(newPedido.getIdPedidoListadoDescripcion());
		p.setIdTipoRecepcion(newPedido.getIdTipoRecepcion());
		p.setComision(newPedido.getComision());
		p.setCostoTotal(newPedido.getCostoTotal());
		
		pedido.save(p);
		return p;
	}
}
