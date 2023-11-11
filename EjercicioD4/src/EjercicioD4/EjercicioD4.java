package EjercicioD4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioD4 {

	public static void main(String[] args) {
		
		Set<String> frutasA= new HashSet<>();
		Set<String> frutasB= new HashSet<>();
		Set<String> union= new HashSet<>();
		Set<String> diferencia= new HashSet<>();
		Set<String> interseccion= new HashSet<>();

		Scanner leer =  new Scanner(System.in);
		
		String fruta;
		for(int i=0; i<3;i++) {
			System.out.println("Ingrese fruta");
			fruta=leer.next();
			frutasA.add(fruta);
		}
		for(int i=0; i<3;i++) {
			System.out.println("Ingrese fruta");
			fruta=leer.next();
			frutasB.add(fruta);
		}
		System.out.println("Conjunto de frutasA" + frutasA);
		System.out.println("Conjunto de frutasB" + frutasB);

		
		union.addAll(frutasA);
		union.addAll(frutasB);
		System.out.println("La union es : " + union);
		
		for(String fruit:frutasA) {
			if((frutasA.contains(fruit)&& !frutasB.contains(fruit))||(!frutasA.contains(fruit)&& frutasB.contains(fruit))) {
				diferencia.add(fruit);
			}
		}
		for(String fruit:frutasB) {
			if((frutasB.contains(fruit)&& !frutasA.contains(fruit))||(!frutasB.contains(fruit)&& frutasA.contains(fruit))) {
				diferencia.add(fruit);
			}}
		System.out.println("La diferencia es "+ diferencia);
		
		for(String frutaa:frutasA) {
			if(frutasA.contains(frutaa)&&frutasB.contains(frutaa)) {
				interseccion.add(frutaa);
			}
		}
		System.out.println("La interseccion es : "+ interseccion);
	}

}
