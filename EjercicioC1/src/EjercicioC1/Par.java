package EjercicioC1;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escriba el número ...");
		
		int numero = leer.nextInt();
		
		if(numero%2==0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}

}
