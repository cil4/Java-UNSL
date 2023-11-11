package Utilidades;

public class Operaciones {

	public int Suma(int n1, int n2) {
		int resultado = n1 + n2;
		System.out.println("El resultado de la suma es " + resultado);
		return resultado;
		
	}
	
	public int Resta(int n1, int n2) {
		int resultado = n1 - n2;
		System.out.println("El resultado de la resta es " + resultado);
		return resultado;
		
	}
	
	public int Multiplicacion(int n1, int n2) {
		int resultado = n1 * n2;
		System.out.println("El resultado de la multiplicación es " + resultado);
		return resultado;
		
	}
	
	public int Division(int n1, int n2) {
		int resultado = n1 / n2;
		System.out.println("El resultado de la división es " + resultado);
		return resultado;
		
	}
}
