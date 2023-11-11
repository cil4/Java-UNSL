package EjercicioE5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;






public class EjercicioE5 {

	public static void main(String[] args) {
		
	
            EscrituraArchi archivo_producto = new EscrituraArchi();
		archivo_producto.escribir();
		
		
	}

}

class EscrituraArchi{
	public void escribir() {
		try {
                        	        File archivo1= new File ("producto.txt");

			FileWriter escritura = new FileWriter(archivo1,true);
			List<Producto> lista= new ArrayList<Producto>();

			Scanner sc = new Scanner(System.in);

			char c;
				
				do {
			
						
						System.out.println("Ingrese nombre del producto");

						String Nombre_producto = sc.next();
						
						
						System.out.println("Ingrese precio del producto");
						
						float Precio_unitario = sc.nextFloat();
							
						
						System.out.println("Ingrese unidades del producto");
						
						int Unidades = sc.nextInt();
							
						
						Producto cliente =new Producto(Nombre_producto, Precio_unitario, Unidades);
						
							
						lista.add(cliente);
							
						System.out.println("¿Quiere agregar más productos ? En caso afirmativo presione  Y , de lo contrario N ");
						        
					            
				        c = sc.next().charAt(0);
				            
				        } while(c=='Y' || c=='y');
				   Collections.sort(lista, new Comparator<Producto>() {
			           

						@Override
						public int compare(Producto o1, Producto o2) {
							
							return o1.getUnidades() - o2.getUnidades();
						}

			        }.reversed());
			        for (Producto l:lista) {
						escritura.write("*** Nombre del producto: " +l.getNombre_producto()+ " , " +
					"unidades ingresadas: " + l.getUnidades() + "\n");
					}
				
				escritura.close();
				//para visualizar en consola
				 for (Producto l:lista) {
						System.out.println("*** Nombre del producto: " +l.getNombre_producto()+ " , " +
					"unidades ingresadas: " + l.getUnidades());
					}


		} catch(IOException ex){
			System.out.println("Error ... No se pudo escribir en el archivo.");
		}
		
	}
}
