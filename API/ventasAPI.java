package Proyecto.ciclo3.ciclo3.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List ;

import Proyecto.ciclo3.ciclo3.DAO.ventasDAO;
import Proyecto.ciclo3.ciclo3.model.Ventas;

@RestController
@RequestMapping ("ventas")
public class ventasAPI {
	@Autowired
	private ventasDAO ventasDA;
	
	@PostMapping ("/guardar")
	public void guardar (@RequestAttribute Ventas ventas) {
		ventasDA.save(ventas);
		
		
	}
	
	@GetMapping ("/listar")
	public List <Ventas> listar(){
		return ventasDA.findAll();
	}
	
	@DeleteMapping ("/Eliminar/{id}")
	public void eliminar (@PathVariable("id") Integer id) {
		ventasDA.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar (@RequestBody Ventas ventas) {
		ventasDA.save(ventas);
	}
		
	
	
	
}



