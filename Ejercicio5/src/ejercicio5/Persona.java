package ejercicio5;

public class Persona {

	private String nombre;
	private int edad;
	private String direccion;
	
	
	public Persona(String n, int e, String d) {
		this.setNombre(n);
		this.setEdad(e);
		this.setDireccion(d);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void printInfo() {
		System.out.println("El nombre es " + nombre);
		System.out.println("La edad es " + edad);
		System.out.println("La dirección es " + direccion);
	}
	
	
}
