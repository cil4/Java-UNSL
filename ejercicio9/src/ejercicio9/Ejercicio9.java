package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Vehiculo v = new Automovil("Fiat", "Uno", 1997, 1.5f); todavia no porque es polimorfismo y se da despues
		
		Automovil v1 = new Automovil ("Ford", "Fiesta", 2000, 1.0f);
		
		Motocicleta ran = new Motocicleta("Yamaha", "Ranger", 2010, 0.8f);
		
		//v.PrintInfo();
		v1.PrintInfo();
		ran.PrintInfo();
	}
	
	
}
