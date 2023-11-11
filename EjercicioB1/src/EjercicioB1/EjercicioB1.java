package EjercicioB1;

//import java.util.Scanner;

public class EjercicioB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operaciones ope1 = new Operaciones();
		OperacionesFloat ope2 = new OperacionesFloat();
		int n1 = 4;
		int n2 = 6;
		int n3 = 8;
		int n4 = 10;
		
		float m1 = 1.5f;
		float m2 = 4.6f;
		float m3 = 3.8f;
		float m4 = 9.2f;
		
		
		/*Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero ");
		
		n1 = leer.nextInt();
		
		System.out.println("Ingrese el siguiente numero");
		
		n2 = leer.nextInt(); */
		
		System.out.println("El resultado de la suma entre los numeros "+ n1 + " y " + n2 + " es = " + ope1.suma(n1, n2));
		System.out.println("El resultado de la suma entre los numeros " + n1 + " ," + n2 + " y " + n3 + " es = " + ope1.suma(n1, n2,n3));
		System.out.println("El resultado de la suma entre los numeros  " + n1 + " ," + n2 + ", " + n3 + " y " + n4 + " es = " + ope1.suma(n1, n2,n3,n4));
		
		
		System.out.println("El resultado de la suma entre los numeros " + m1 + " y " + m2 + " es = " + ope2.suma(m1, m2));
		System.out.println("El resultado de la suma entre los numeros " + m1 + " ," + m2 + " y " + m3 + " es = " + ope2.suma(m1, m2,m3));
		System.out.println("El resultado de la suma entre los numeros "  + m1 + " ," + m2 + ", " + m3 + " y " + m4 + " es = "+ ope2.suma(m1, m2,m3,m4));






	}

}
