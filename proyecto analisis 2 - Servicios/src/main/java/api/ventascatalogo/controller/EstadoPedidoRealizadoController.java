package api.ventascatalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.ventascatalogo.entidades.EstadoPedidoRealizado;
import api.ventascatalogo.repositorios.EstadoPedidoRealizadoRepositorio;
import java.util.List;

@RestController
@RequestMapping("/estado-pedido-realizado")
public class EstadoPedidoRealizadoController {
	
	@Autowired
	EstadoPedidoRealizadoRepositorio erealizado;
	
	@GetMapping("/all")
	public List<EstadoPedidoRealizado> getETRealizado(){
		return (List<EstadoPedidoRealizado>) erealizado.findAll();
	}
	
	@PostMapping("/add")
	public String addTRealizado(@RequestBody EstadoPedidoRealizado newEstado) {
		erealizado.save(newEstado);
		
		return "Guardado correctamente";
	}
	
	@GetMapping("/{id}")
	public EstadoPedidoRealizado getEstadoPRealizadoById(@PathVariable int id) {
		return erealizado.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encuentran registros"));
	}
	
	@DeleteMapping("/{id}")
	public String deleteEstadoPRealizadoId(@PathVariable int id) {
		erealizado.deleteById(id);
		return "Eliminado";
	}
	
	@PostMapping("/{id}")
	public EstadoPedidoRealizado updateTRealizado(@PathVariable int id, @RequestBody EstadoPedidoRealizado newEstado) {
		EstadoPedidoRealizado e = erealizado.findById(id).orElseThrow(()-> new IllegalArgumentException("No se encuentran registros"));
		
		e.setIdPedido(newEstado.getIdPedido());
		e.setIdEstadoPedido(newEstado.getIdEstadoPedido());
		e.setIdRepartidor(newEstado.getIdRepartidor());
		
		erealizado.save(e);
		return e;
	}
}
