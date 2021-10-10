package Proyecto.ciclo3.ciclo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clientes {
	
	@Id
	private long cedula_cliente;
	private String nombre_cliente;
	private String email_clienteo;
	private String usuario;
	private String password;
	
	public long getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getEmail_clienteo() {
		return email_clienteo;
	}
	public void setEmail_clienteo(String email_clienteo) {
		this.email_clienteo = email_clienteo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
