package api.ventascatalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import api.ventascatalogo.entidades.Vendedor;
import api.ventascatalogo.repositorios.VendedorRepositorio;

@Repository
@RequestMapping("/vendedor")
public class VendedorController {
	@Autowired
	VendedorRepositorio vend;
	
	@GetMapping("/all")
	public List<Vendedor> getVendedor(){
		return (List<Vendedor>) vend.findAll();
	}
	
	@PostMapping("/add")
	public String addVendedor(@RequestBody Vendedor newVendedor) {
		vend.save(newVendedor);
		return "Datos guardados correctamente";
	}
	
	@GetMapping("/{id}")
	public Vendedor getVendedorById(@PathVariable int id) {
		return vend.findById(id).orElseThrow(()->new IllegalArgumentException("No se encontraron registros"));
	}
	
	@DeleteMapping("/{id}")
	public String deleteVendedorId(@PathVariable int id) {
		vend.deleteById(id);
		return "Eliminado";
	}
	
	@PostMapping("/{id}")
	public Vendedor updateVendedor(@PathVariable int id, @RequestBody Vendedor newVendedor) {
		Vendedor v = vend.findById(id).orElseThrow(()->new IllegalArgumentException("No se encontraron registros"));
		
		v.setNombreCompleto(newVendedor.getNombreCompleto());
		v.setDpi(newVendedor.getDpi());
		v.setDireccion(newVendedor.getDireccion());
		v.setNit(newVendedor.getNit());
		v.setPassword(newVendedor.getPassword());
		v.setCorreo(newVendedor.getCorreo());
		
		vend.save(v);
		return v;
	}
}
