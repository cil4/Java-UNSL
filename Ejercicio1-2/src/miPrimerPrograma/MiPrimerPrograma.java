package miPrimerPrograma;

import java.util.Scanner;

public class MiPrimerPrograma {

	public static void main(String[] args) {
		
		/*int numero = 5;
		
		 System.out.println("Hola Mundo");
		
		System.out.println("Nuestra primera clase");
		
		System.out.println("Este es el número " + numero); */
		
		String nombre;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");

		
		nombre = leer.next();
		
		System.out.println("Hola " + nombre + " ¿Cómo estás?");
		
		

	}
}
