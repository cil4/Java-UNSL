package Ejercicio10;

public class Mamifero extends Animal {

	
	public enum Tipo{herbivoro, no_herbivoro} ;
	
	private Tipo tipo;
	
	
	
	public Mamifero(String nombre, int edad, Tipo tipo) {
		// TODO Auto-generated constructor stub
		
		this.nombre = nombre;
		this.edad = edad;
		this.tipo= tipo;
	}


	public  void PrintInfo() {
	
		
		System.out.println("* El mamífero se llama " + nombre);
		System.out.println(" - Su edad en años es de "+ edad);
		System.out.println(" - Es un tipo de animal:  " + tipo);
	}
}
