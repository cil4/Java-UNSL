package EjercicioC6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EjercicioC6 {

	public static void main(String[] args) throws IOException{
		
		

		
		List<Producto> lista= new ArrayList<Producto>();
		
		Scanner sc = new Scanner(System.in);

		char c;
			
			do {
		
					
					System.out.println("Ingrese nombre del producto");

					String nombre_producto = sc.next();
					
					
					System.out.println("Ingrese precio del producto");
					
					float precio_unitario = sc.nextFloat();
						
					
					System.out.println("Ingrese unidades del producto");
					
					int unidades_producto = sc.nextInt();
						
					
					Producto cliente =new Producto(nombre_producto, precio_unitario, unidades_producto);
					
						
					lista.add(cliente);
						
					System.out.println("¿Quiere agregar más productos ? En caso afirmativo presione  Y , de lo contrario N ");
					        
				            
			        c = sc.next().charAt(0);
			            
			        } while(c=='Y' || c=='y');
		
				
			
			
			
				
		///////////////////////////////////////7
		
	
		/*for(Producto p:lista) {
			System.out.println("Nombre del producto: "+ p.getNombre_producto()+" , precio $ " + p.getPrecio_unitario()
			+ " , unidades ingresadas: " + p.getUnidades_producto());
		}
		System.out.println(Arrays.toString(lista.toArray())); */
		
		
	/*	for (Producto l:lista) {
			System.out.println("nombre producto " +l.getNombre_producto()+ " " +
		"Unidades disponibles" + l.getUnidades_producto());
		}
		
		Collections.sort(lista, Producto.empUnidComparator);

		*/
				// ordenar la lista según el orden personalizado definido por Comparator
		        Collections.sort(lista, new Comparator<Producto>() {
		           

					@Override
					public int compare(Producto o1, Producto o2) {
						
						return o1.getUnidades_producto() - o2.getUnidades_producto();
					}

		        }.reversed());
		        for (Producto l:lista) {
					System.out.println("*** Nombre del producto: " +l.getNombre_producto()+ " , " +
				"unidades ingresadas: " + l.getUnidades_producto());
				}

	
	sc.close();
	}}

