package ejercicio3;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		
		float altura;
		float base;
		float area;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese la altura");
		
		altura = leer.nextFloat();
		
		System.out.println("Ingrese la base");
		
		base = leer.nextFloat();
		area= (altura*base)/2;
		
		
		System.out.println("El área es: " + area);
	}
}
