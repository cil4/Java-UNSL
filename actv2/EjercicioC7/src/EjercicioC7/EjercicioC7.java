package EjercicioC7;

import java.util.ArrayList;
import java.util.List;

public class EjercicioC7 {

	public static void main(String[] args) {
		
		List<String> jugadoresFutbolA = new ArrayList<>();
		
		//Insertar en el conjunto los jugadores del equipo de la Argentina
		
		jugadoresFutbolA.add("Leandro Paredes");
		jugadoresFutbolA.add("Lionel Messi");
		jugadoresFutbolA.add("Lisandro Martinez");
		jugadoresFutbolA.add("Cuti Romero");
		
		
		//Mostrar por pantalla sus nombres
		
		System.out.println("  - Los integrantes del conjunto 'jugadoresFutbolA' son: ");
		for (String cadaelemento : jugadoresFutbolA) {  
			 System.out.println("   * " +cadaelemento); 
		} 
		System.out.println("\n");
		
		boolean existe = jugadoresFutbolA.contains("Neymar");
		System.out.println("  - ¿El jugador 'Neymar' existe en dicho conjunto? : " + existe);
		
		
		List<String> jugadoresFutbolB = new ArrayList<>();
		
		//Crear otro conjunto jugadoresFutbolB con los jugadores “Dibu”, “Lautaro”, “Ángel”
		
		jugadoresFutbolB.add("Dibu");
		jugadoresFutbolB.add("Lautaro");
		jugadoresFutbolB.add("Ángel");
	
		System.out.println("\n");

		//Consultar si todos los elementos de jugadoresFutbolB existen en jugadoresFutbolA
		
        boolean contiene = jugadoresFutbolA.containsAll(jugadoresFutbolB);
        System.out.println("  - ¿Todos los elementos del conjunto 'jugadoresFutbolB' existen en 'jugadoresFutbolA'? : " +contiene);
        System.out.println("\n");
        
        //Realizar la unión de los conjuntos jugadoresFutbolA y jugadoresFutbolB
        
        jugadoresFutbolA.addAll(jugadoresFutbolB);
       
        //Eliminar todos los jugadores del conjunto jugadoresFutbolB y mostrar el número de jugadores que tiene el conjunto jugadoresFutbolB.

        jugadoresFutbolB.removeAll(jugadoresFutbolB);
		
        System.out.println("  - Número de jugadores del conjunto 'jugadoresFutbolB' : " +jugadoresFutbolB.size());

		System.out.println("\n");

        System.out.println("  - Los integrantes del conjunto 'jugadoresFutbolA' son: ");
        for (String cadaelemento : jugadoresFutbolA) {  
			 System.out.println("   * " +cadaelemento); 
		} 

	}

}
