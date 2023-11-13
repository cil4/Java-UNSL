package ejercicio9;

public class Motocicleta extends Vehiculo{

	private float cilindrada;
	
	//getters & setters
	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	//constructor
	public Motocicleta(String ma, String mo, int anio, float ci) {
		
		super(ma, mo, anio);
		cilindrada = ci;
	}
	//metodo print
	@Override
	public void PrintInfo() {
		super.PrintInfo();

		System.out.println("    - La cilindrada es " + cilindrada + "cc");

	}
}
