package Calculadora;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora calc = new Calculadora();
		
		float n1;
		float n2;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero ");
		
		n1 = leer.nextFloat();
		
		System.out.println("Ingrese el siguiente numero");
		
		n2 = leer.nextFloat();
		
		System.out.println("El resultado de la suma entre los numeros ingresados es " + calc.suma(n1, n2));
		System.out.println("El resultado de la resta entre los numeros ingresados es " + calc.resta(n1, n2));
		System.out.println("El resultado de la multiplicacion entre los numeros ingresados es " + calc.multiplicacion(n1, n2));
		System.out.println("El resultado de la division entre los numeros ingresados es " + calc.division(n1, n2));


	}

}
