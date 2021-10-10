package Proyecto.ciclo3.ciclo3.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List ;

import Proyecto.ciclo3.ciclo3.DAO. proveedoresDAO;
import Proyecto.ciclo3.ciclo3.model. proveedores;

@RestController
@RequestMapping (" proveedores")
public class proveedoresAPI {
	@Autowired
	private proveedoresDAO proveedoresDA;
	
	@PostMapping ("/guardar")
	public void guardar (@RequestAttribute proveedores proveedores) {
		proveedoresDA.save(proveedores);
		
		
	}
	
	@GetMapping ("/listar")
	public List <proveedores> listar(){
		return proveedoresDA.findAll();
	}
	
	@DeleteMapping ("/Eliminar/{id}")
	public void eliminar (@PathVariable("id") Integer id) {
		proveedoresDA.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar (@RequestBody proveedores usuarios) {
		proveedoresDA.save(usuarios);
	}
		
	
	
	
}



