package EjercicioB2;

public class EjercicioB2 {

	public static void main(String[] args) {

		Circulo circ = new Circulo(20);
		circ.calcularArea();
		circ.PrintInfo();
		
		Rectangulo rec = new Rectangulo(3,6);
		rec.calcularArea();
	}

}
