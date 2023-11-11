package EjemploHashMap;

import java.util.HashMap;

public class EjemploHashMap {

	public static void main(String[] args) {
		// crear hashmap

		HashMap<String, Integer> emp = new HashMap<>();
		
		//agregar pares
		emp.put("oscar", 123);
		emp.put("mia", 400);
		emp.put("juan", 672);
		emp.put("cicek", 123);
		
		
		System.out.println(emp);
		emp.put("cicek", 129);
		
		
		System.out.println(emp);
		System.out.println("............values");
		for(Integer valor : emp.values()) {
			System.out.println(valor + " ");
	}
	
		System.out.println("............key");
		for(String clave : emp.keySet()) {
		System.out.println(clave + " ");
		
}
		
		//buscar un objeto
		System.out.println(emp.get("mia"));

		if(emp.containsKey("oscar"))
			System.out.println("Si está contenido");
		else
			System.out.println("No está contenido");
		
		
		System.out.println(emp.getOrDefault("mia", 000000));
		
		
		System.out.println(emp.size());
		
		emp.remove("oscar");
		System.out.println(emp);
}}
