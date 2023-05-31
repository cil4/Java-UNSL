package ejercicio4;

public class Persona {

	private String nombre;
	private int edad;
	private float altura;
	
	
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
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void printInfo() {
		System.out.println("El nombre de la persona es " + nombre);
		System.out.println("Su edad es " + edad + " años");
		System.out.println("Su altura en metros es "+ altura);
	}
}
