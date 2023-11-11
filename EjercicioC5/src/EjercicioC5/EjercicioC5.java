package EjercicioC5;

import java.util.*;
import java.util.Map.Entry;


public class EjercicioC5 {

	public static void main(String[] args) {
		/*HashMap<String, Integer> lista= new HashMap<>();
		
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = input.nextInt();
         System.out.print("Ingrese nombre ");
            String num = input.next();
          

            /*while(edad  !=0) {
             
            lista.put(num,edad);
            System.out.println("Para salir presione 0");
			edad= input.nextInt();
            

        }//
            for (int i=0; i<num.length(); i++) {
            	char charAt = num.charAt(i);
            	if(!lista.containsKey(String.valueOf(charAt))) {
            		lista.put(String.valueOf(charAt),1);
            	}else {
            		lista.put(String.valueOf(charAt), lista.get(String.valueOf(charAt))+1);
            	}
            }
            
            
        System.out.println("Número de apariciones:");
      //  for(Map.Entry List:lista.entrySet())
            System.out.println("La letra " +List.getKey()+ " se repite " +List.getValue() + " veces"); 
        
        
        

	
	
		 
		  Iterator iter = lista.entrySet().iterator();
		  while(iter.hasNext()) {

			  Map.Entry par = (Map.Entry)iter.next();
			  
	            System.out.println("La letra " + par.getKey()+ " se repite  " +par.getValue()+ " veces");
	            iter.remove();
}*/
		
		Scanner leer = new Scanner(System.in);
		Map<Character, Integer> mapa = new HashMap<>();
		String cadena;
		System.out.println("Ingrese cadena de caracteres");
		
		cadena= leer.nextLine();
		
		cadena = cadena.toLowerCase();
		
		
		/*for (int i =0; i<cadena.length();i++) {
			char  caracter = cadena.charAt(i);
			int contador =0;
			
			for (int j=0; j<cadena.length();j++) {
				char tmp= cadena.charAt(j);
				if(tmp==caracter)
					contador++;
			}*/
		for (int i=0; i<cadena.length(); i++) {
        	char charAt = cadena.charAt(i);
    		//Se busca si la letra,si no existe se agrega  un '1'

        	if(!mapa.containsKey(charAt)) {
        		mapa.put(charAt,1);
        	}else {
        		// si la letra existe se obtiene el contador de esta letra y se le agrega 1, lo que se hace es 'remplazar' la letra por la misma letra, pero con su valor incrementado, 
        		mapa.put(charAt, mapa.get(charAt)+1);
        	}
        }
			//mapa.put(caracter, contador);
		//}
		for(Map.Entry<Character, Integer> entry: mapa.entrySet()) {
			System.out.println("Para el caracter " + entry.getKey() + "  " + entry.getValue());
		}
		
	}
}
		

