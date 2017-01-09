package saar_mercado;

public class Producto {
	public static int idStaticProducto = 0;
	public int idProducto;
	public String nombre;
	public double precioFinal;
	public double precioCosto;
	
	public Producto (String nombre, double precioFinal, double precioCosto) {
		this.nombre = nombre;
		this.precioFinal = precioFinal;
		this.precioCosto = 0;
	}
	
	public static int generarIdProducto() {
		idStaticProducto ++;
		return idStaticProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	public double getPrecioCosto() {
		return precioCosto;
	}

	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}

	public int getIdProducto() {
		return idProducto;
	}
	
	
}
