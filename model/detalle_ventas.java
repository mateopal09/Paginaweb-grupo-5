package Proyecto.ciclo3.ciclo3.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class detalle_ventas {
	
	@Id
	private long codigo_detalle_ventas;
	private String cantidad_producto;
	private String codigo_producto;
	private String codigo_venta;
	private String valor_total;
	private String valor_venta;
	private String valor_iva;
	
	public long getCodigo_detalle_ventas() {
		return codigo_detalle_ventas;
	}
	public void setCodigo_detalle_ventas(long codigo_detalle_ventas) {
		this.codigo_detalle_ventas = codigo_detalle_ventas;
	}
	public String getCantidad_producto() {
		return cantidad_producto;
	}
	public void setCantidad_producto(String cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	public String getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(String codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public String getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(String codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public String getValor_total() {
		return valor_total;
	}
	public void setValor_total(String valor_total) {
		this.valor_total = valor_total;
	}
	public String getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(String valor_venta) {
		this.valor_venta = valor_venta;
	}
	public String getValor_iva() {
		return valor_iva;
	}
	public void setValor_iva(String valor_iva) {
		this.valor_iva = valor_iva;
	}
	
	

}
