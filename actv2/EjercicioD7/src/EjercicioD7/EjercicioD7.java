package EjercicioD7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EjercicioD7 {

	public static void main(String[] args) {
        List<String> jugadoresFutbolA = new ArrayList<>();
        
		Set<String> jugadoresFutbolB = new HashSet<>();

		
		//MENU
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
		int opcion;
			while(!salir) {
				System.out.println("Menú\n1. Opción [1]: Ingresar jugadores a la lista 'jugadoresFutbolA' \n2. Opción [2]: Realizar consulta en la lista 'jugadoresFutbolA' \n3. Opción [3]: Ingresar jugadores a la lista 'jugadoresFutbolB' \n4. Opción [4]: Eliminar de la lista jugadoresFutbolA los jugadores que se encuentran en la lista de 'jugadoresFutbolB'\n5. Opción [5]: Eliminar jugador de la lista 'jugadoresFutbolA'\n6. Opción [6]: Salir\nPor favor ingrese una opción: ");
	
		           opcion = sn.nextInt();
		           
		           switch(opcion){
		           
		               case 1:
		                   System.out.println("Has seleccionado la opción 1: Ingresar jugadores a la lista 'jugadoresFutbolA'");
		                   
		                   Scanner insert = new Scanner(System.in);
		                   
		                   char a;
			              		do {
			              			System.out.println("Ingrese jugador a la lista 'jugadoresFutbolA'");
			              			
			              			String jugador = insert.nextLine();
			              			
			              			 jugadoresFutbolA.add(jugador);
			              			
			              			 System.out.println("¿Quiere ingresar otro jugador? En caso afirmativo presione  Y , de lo contrario N ");
			              	       
			              			 a = insert.nextLine().charAt(0);
			              	        
			                      } while(a=='Y' || a=='y');
		           		
		           		//mostrar orden lifo
			              System.out.println("La lista de 'jugadoresFutbolA' está compuesta por : " + jugadoresFutbolA);
			              
		                   break;
		                   
		               case 2:
		                   System.out.println("Has seleccionado la opción 2: Realizar consulta en la lista 'jugadoresFutbolA'");
		                   
		                   Scanner c = new Scanner(System.in);
		                   
		           			char d;
		           			
				           		do {
				           			System.out.println("Ingrese jugador");
				           			
				           			String jugador = c.nextLine();
				           			 
				           			boolean existe = jugadoresFutbolA.contains(jugador);
				           			
				           			if(existe==true) {
				           				
				           				System.out.println(existe + ". El jugador ingresado existe en la lista de 'jugadoresFutbolA'");
				           				
				           			}else {
				           				
				           				System.out.println(existe + ". El jugador ingresado no existe en la lista de 'jugadoresFutbolA'");
				           			}
				           			
				           			
				           			System.out.println("¿Quiere realizar otra consulta? En caso afirmativo presione  Y , de lo contrario N ");
				           	        
				           	       
				           	        d = c.nextLine().charAt(0);
				           	        
				                   } while(d=='Y' || d=='y');
		           		
		                   break;
		                case 3:
		                   System.out.println("Has seleccionado la opción 3: Ingresar jugadores a la lista 'jugadoresFutbolB'");
		                   
		                   Scanner sc = new Scanner(System.in);
		           		
		           			String usuario = "";
		           		
				           		for(int i=0; i<2; i++) {
				           			
				           			System.out.println("Ingrese jugador");
				           			
				           			usuario = sc.nextLine();
				           			
				           			jugadoresFutbolB.add(usuario);
				
				           		}
				           	System.out.println("La lista de 'jugadoresFutbolB' está compuesta por : " +jugadoresFutbolB);
		
		                   break;
		                case 4:
		                    System.out.println("Has seleccionado la opción 4: Eliminar de la lista 'jugadoresFutbolA' los jugadores que se encuentran en la lista de 'jugadoresFutbolB'");
			                    for(String jugador:jugadoresFutbolA) {
			            			
			            			if(jugadoresFutbolB.contains(jugador)) {
			            				
			            				
			            				System.out.println("Existe coincidencia entre listas para: " + jugador);
			            			}else {
			            				
			            				System.out.println("No existe coincidencia entre listas para: " + jugador);
			            			}
		            		
		            		};
		            		jugadoresFutbolA.removeIf(n->(jugadoresFutbolB.contains(n)&&jugadoresFutbolA.contains(n)));
		            		
		            		System.out.println("La lista de 'jugadoresFutbolA' es: " + jugadoresFutbolA);
		            		
		                    break;
		                case 5:
		                    System.out.println("Has seleccionado la opción 5: Eliminar jugador de la lista 'jugadoresFutbolA'");
		                    
		                    Scanner datos = new Scanner(System.in);
		                    
		            		String nombre;
		            		
		            		System.out.println("Ingrese jugador");
		            		
		            		nombre=datos.nextLine();
		            		
			            		while(nombre!="") {
			            			
			            			
			            			if(jugadoresFutbolA.contains(nombre)) {
			            						jugadoresFutbolA.remove(nombre);
			            				System.out.println(nombre +" ha sido eliminado");
			
			            			}else {
			            				System.out.println("Ese jugador no se encuentra en la lista");
			            			}
			            			System.out.println("Ingrese otro jugador. Si desea salir presione ENTER");
			            			nombre=datos.nextLine();
			            		}
		            		
		            		System.out.println("La lista de 'jugadoresFutbolA' es: " + jugadoresFutbolA);
		
		                    break;
		               
		                case 6:
		                    System.out.println("Has seleccionado la opción 6: Salir");
		
		                   salir=true;
		                   
		                   break;
		                   
		                default:
	                   System.out.println("Solo números entre 1 y 6");
           }
		}
		
		
		

	}

}
