package Proyecto.ciclo3.ciclo3.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import Proyecto.ciclo3.ciclo3.DAO.ClientesDAO;
import Proyecto.ciclo3.ciclo3.model.Clientes;

@RestController
@RequestMapping("clientes")
public class clientesAPI {

	@Autowired
	private ClientesDAO ClientesDA;

	@PostMapping("/guardar")
	public void guardar(@RequestAttribute Clientes clientes) {
		ClientesDA.save(clientes);

	}

	@GetMapping("/listar")
	public List<Clientes> listar() {
		return ClientesDA.findAll();
	}

	@DeleteMapping("/Eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		ClientesDA.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Clientes clientes) {
		ClientesDA.save(clientes);
	}

}
