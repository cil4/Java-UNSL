package ejercicio9;

public class Automovil extends Vehiculo{

	private float cilindrada;
	
	

	//print
	public  void PrintInfo() {
	
		
		System.out.println("La marca es " + marca);
		System.out.println("El modelo es "+ modelo);
		System.out.println("El año es " + anio_fabricacion);
		System.out.println("La cilindrada es " + cilindrada);
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public Automovil(String ma, String mo, int anio, float ci) {
		// TODO Auto-generated constructor stub
		marca = ma;
		modelo = mo;
		anio_fabricacion = anio;
		cilindrada = ci;
	}
}
