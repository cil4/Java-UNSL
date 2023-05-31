package Ejercicio10;


public class Ave extends Animal{

	public enum Tipo{vuela, no_vuela};
	
	private Tipo tipo;
	
	public Ave(String nombre, int edad, Tipo tipo) {
		// TODO Auto-generated constructor stub
		
		this.nombre = nombre;
		this.edad = edad;
		this.tipo= tipo;
	}


	public  void PrintInfo() {
	
		
		System.out.println("* El ave se llama " + nombre);
		System.out.println(" - Su edad en años es de "+ edad);
		System.out.println(" - Este tipo de animal:  " + tipo);
	}

}
