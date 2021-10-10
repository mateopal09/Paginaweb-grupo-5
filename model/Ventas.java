package Proyecto.ciclo3.ciclo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ventas {
	@Id
	private long codigo_ventas;
	private String iva_venta;
	private String total_venta;
	private String valor_venta;
	private String cedula_usuario;
	private String cedula_cliente;
	
	
	public long getCodigo_ventas() {
		return codigo_ventas;
	}
	public void setCodigo_ventas(long codigo_ventas) {
		this.codigo_ventas = codigo_ventas;
	}
	public String getIva_venta() {
		return iva_venta;
	}
	public void setIva_venta(String iva_venta) {
		this.iva_venta = iva_venta;
	}
	public String getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(String total_venta) {
		this.total_venta = total_venta;
	}
	public String getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(String valor_venta) {
		this.valor_venta = valor_venta;
	}
	public String getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(String cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(String cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	

}
