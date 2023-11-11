package EjercicioB4;

public class EjercicioB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado cuac = new Cuadrado(4);
		cuac.calcularArea();
		cuac.PrintInfo();
		
		
		Rectangulo rec = new Rectangulo(2,4);
		rec.calcularArea();
		rec.PrintInfo();
		
		
		Circulo cir = new Circulo(20);
		cir.calcularArea();
		cir.PrintInfo();
	}

}
