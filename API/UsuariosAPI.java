package Proyecto.ciclo3.ciclo3.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List ;

import Proyecto.ciclo3.ciclo3.DAO.usuarioDAO;
import Proyecto.ciclo3.ciclo3.model.USUARIOS;

@RestController
@RequestMapping ("usuarios")
public class UsuariosAPI {
	
	@Autowired
	private usuarioDAO usuariosDA;
	
	@PostMapping ("/guardar")
	public void guardar (@RequestAttribute USUARIOS usuarios) {
		usuariosDA.save(usuarios);
		
		
	}
	
	@GetMapping ("/listar")
	public List <USUARIOS> listar(){
		return usuariosDA.findAll();
	}
	
	@DeleteMapping ("/Eliminar/{id}")
	public void eliminar (@PathVariable("id") Integer id) {
		usuariosDA.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar (@RequestBody USUARIOS usuarios) {
		usuariosDA.save(usuarios);
	}
		
	
	
	
}
