package Proyecto.ciclo3.ciclo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class proveedores {
	
	
	@Id
	private long nit_proveedor;
	private String ciudad_proveedor;
	private String dirrecion_proveedor;
	private String nombre_proveedor;
	private String telefono_proveedor;
	public long getNit_proveedor() {
		return nit_proveedor;
	}
	public void setNit_proveedor(long nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}
	public String getCiudad_proveedor() {
		return ciudad_proveedor;
	}
	public void setCiudad_proveedor(String ciudad_proveedor) {
		this.ciudad_proveedor = ciudad_proveedor;
	}
	public String getDirrecion_proveedor() {
		return dirrecion_proveedor;
	}
	public void setDirrecion_proveedor(String dirrecion_proveedor) {
		this.dirrecion_proveedor = dirrecion_proveedor;
	}
	public String getNombre_proveedor() {
		return nombre_proveedor;
	}
	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}
	public String getTelefono_proveedor() {
		return telefono_proveedor;
	}
	public void setTelefono_proveedor(String telefono_proveedor) {
		this.telefono_proveedor = telefono_proveedor;
	}
	
	
	
	

}
