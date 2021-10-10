package Proyecto.ciclo3.ciclo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class productos {
	
	@Id
	private long codigo_producto;
	private String iva_compra;
	private String nit_proveedor;
	private String nombre_producto;
	private String precio_compra;
	private String precio_venta;
	
	
	public long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public String getIva_compra() {
		return iva_compra;
	}
	public void setIva_compra(String iva_compra) {
		this.iva_compra = iva_compra;
	}
	public String getNit_proveedor() {
		return nit_proveedor;
	}
	public void setNit_proveedor(String nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public String getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(String precio_compra) {
		this.precio_compra = precio_compra;
	}
	public String getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(String precio_venta) {
		this.precio_venta = precio_venta;
	}
	

}
