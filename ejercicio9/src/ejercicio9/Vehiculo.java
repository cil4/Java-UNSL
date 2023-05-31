package ejercicio9;

public class Vehiculo {

	protected String marca;
	protected String modelo;
	protected int anio_fabricacion;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio_fabricacion() {
		return anio_fabricacion;
	}
	public void setAnio_fabricacion(int anio_fabricacion) {
		this.anio_fabricacion = anio_fabricacion;
	}
	public void PrintInfo() {
	
		
		System.out.println("La marca es " + marca);
		System.out.println("El modelo es "+ modelo);
		System.out.println("El año es " + anio_fabricacion);
	}

	
	
}
