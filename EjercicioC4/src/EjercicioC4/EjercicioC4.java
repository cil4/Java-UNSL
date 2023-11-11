package EjercicioC4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjercicioC4 {

	public static void main(String[] args) {
		
		ArrayList<String> lista= new ArrayList();
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		
		String input = leer.nextLine();
		while(input != "") {
			lista.add(input);
			System.out.println("Ingrese otra palabra, de lo contrario si desea terminar el proceso apriete ENTER");
			input = leer.nextLine();
		}
		System.out.println(lista);
		
		//validando vocal
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese una vocal en minúscula");
		while (!sc.hasNext("[aeiou]")) {
		    System.out.println("¡Eso no es una vocal!");
		    sc.next();
		}
		String vocal = sc.next();
		System.out.println("Gracias. Su vocal es '" + vocal + "'");
		
		
		
		
		//eliminando elementos que contengan dicha vocal
		Iterator<String> iter = lista.iterator();
		while(iter.hasNext()) {
			String elemento = iter.next();
				if(elemento.contains(vocal))
					iter.remove();
						
			
			
			
		}
		
		//imprimiendo lista en su formato final
		System.out.println("Su lista es " + lista);
	}
	

}
