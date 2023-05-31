package Ejercicio10;



public class Reptil extends Animal{

	public enum Tipo{venenoso, no_venenoso} ;
	
	private Tipo tipo;

	public Reptil(String nombre, int edad, Tipo tipo) {
		// TODO Auto-generated constructor stub
		
		this.nombre = nombre;
		this.edad = edad;
		this.tipo= tipo;
	}


	public  void PrintInfo() {
	
		
		System.out.println("* El reptil se llama " + nombre);
		System.out.println(" - Su edad en años es de "+ edad);
		System.out.println(" - Es un tipo de animal:  " + tipo);
	}
}
