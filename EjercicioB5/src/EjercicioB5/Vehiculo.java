package EjercicioB5;

public class Vehiculo {

	private String marca;
	private String modelo;
	private int anio_fabricacion;
	private int velocidad;
	private int velocidad_maxima;

	
	//getters & setters 
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
	
	public int getVelocidad_maxima() {
		return velocidad_maxima;
	}
	public void setVelocidad_maxima(int velocidad_maxima) {
		this.velocidad_maxima = velocidad_maxima;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	//constructor
	public Vehiculo() {
		this.velocidad = 0;
		this.setVelocidad_maxima(130);
	}
	//metodos
	
	public int velocidadActual() {
		return velocidad;
	}
	
	public void acelerar(int cantidad) {
		
	}
	
	public void frenar(int cantidad) {
		
	}
	public void PrintInfo() {
	
		
		System.out.println(" **** La marca del vehiculo es " + marca);
		System.out.println("       - El modelo se llama  "+ modelo);
		System.out.println("       - El año de fabricación fue:  " + anio_fabricacion);
	}
	
	
}
