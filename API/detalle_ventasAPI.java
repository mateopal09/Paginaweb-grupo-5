package Proyecto.ciclo3.ciclo3.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List ;

import Proyecto.ciclo3.ciclo3.DAO.detalle_ventasDAO;
import Proyecto.ciclo3.ciclo3.model.detalle_ventas;

@RestController
@RequestMapping ("detalle_ventas")
public class detalle_ventasAPI {
	
	@Autowired
	private detalle_ventasDAO detalle_ventasDA;
	
	@PostMapping ("/guardar")
	public void guardar (@RequestAttribute detalle_ventas detalle_ventas) {
		detalle_ventasDA.save(detalle_ventas);
		
		
	}
	
	@GetMapping ("/listar")
	public List <detalle_ventas> listar(){
		return detalle_ventasDA.findAll();
	}
	
	@DeleteMapping ("/Eliminar/{id}")
	public void eliminar (@PathVariable("id") Integer id) {
		detalle_ventasDA.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar (@RequestBody detalle_ventas usuarios) {
		detalle_ventasDA.save(usuarios);
	}
		
	
	
	
}




