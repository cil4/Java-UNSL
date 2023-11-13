package EjercicioB5;

public class Ejercicio5 {

	public static void main(String[] args) {
		

		Vehiculo Uno = new Auto("Fiat", "Uno", 1997, 1370);
		Uno.PrintInfo();
		Uno.acelerar(25);
		Uno.frenar(15);
		Uno.velocidadActual();
		Uno.PrintInfo();
	
		System.out.println("\n");
		
		
		
		Vehiculo Kripton = new Moto("Honda","Wave", 2011, 110);
		Kripton.PrintInfo();
		Kripton.acelerar(40);
		
		Kripton.frenar(20);
		Kripton.velocidadActual();
		Kripton.PrintInfo();

	}

}
