package Proyecto.ciclo3.ciclo3.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List ;

import Proyecto.ciclo3.ciclo3.DAO.productosDAO;
import Proyecto.ciclo3.ciclo3.model.productos;

@RestController
@RequestMapping ("productos")
public class productosAPI {
	
	@Autowired
	private productosDAO  productosDA;
	
	@PostMapping ("/guardar")
	public void guardar (@RequestAttribute  productos  productos) {
		 productosDA.save( productos);
		
		
	}
	
	@GetMapping ("/listar")
	public List < productos> listar(){
		return  productosDA.findAll();
	}
	
	@DeleteMapping ("/Eliminar/{id}")
	public void eliminar (@PathVariable("id") Integer id) {
		 productosDA.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar (@RequestBody productos usuarios) {
		 productosDA.save(usuarios);
	}
		
	
	
	

}


