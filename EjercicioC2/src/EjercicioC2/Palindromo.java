package EjercicioC2;


import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		

		Scanner l = new Scanner(System.in);
		System.out.println("Ingrese texto ...");
		
		
		String texto =l.nextLine();
		
		
		
		texto = texto.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		
		// Invertir la cadena de caracteres, y si es igual que la original entonces
		// son palíndromos
		String inversa = new StringBuilder(texto).reverse().toString();
		
		if(inversa.equals(texto)) {
			System.out.println("es palíndromo");
		}else{
			System.out.println("no es palíndromo");
		};
	}

}
