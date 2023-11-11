package EjercicioB3;

public class EjercicioB3 {

	public static void main(String[] args) {
		
		
		
		Empleado e2 = new Empleado("Pedro Juez", 39, 30000, 1300);
		e2.calcularSueldo();
		e2.PrintInfo();

		Vendedor e = new Vendedor("Juan Perez", 54, 60000, 10000, 55000);
		e.calcularSueldo();
		e.PrintInfo();
		

		
		
	}

}
