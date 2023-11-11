package EjercicioC3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjercicioC3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista= new ArrayList();
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un número");

		
		int input = leer.nextInt();
		while(input !=0) {
			lista.add(input);
			System.out.println("Ingrese otro número, de lo contrario si desea terminar el proceso escriba 0");
			input = leer.nextInt();
		}
		System.out.println("\n");

		Scanner posicion = new Scanner(System.in);
		System.out.println("Indique la posición del elemento que desea visualizar");
		int elemento = posicion.nextInt();
		
		System.out.println("\n");

		System.out.println("El elemento de posición " + elemento + " es el número: " + lista.get(elemento));
		System.out.println("\n");
		
      
		System.out.println("Éstos son todos los elementos de la lista " + lista);
        
        
	}

}
