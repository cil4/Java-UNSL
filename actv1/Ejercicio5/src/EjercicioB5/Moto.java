package EjercicioB5;

public class Moto extends Vehiculo{

	private float cilindrada;
	
	//getters & setters
	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}
	//constructor
	public Moto(String ma, String mo, int anio, float ci) {
		setMarca(ma);
		setModelo(mo);
		setAnio_fabricacion(anio);
		cilindrada = ci;
	}
	
	//metodos
	
	
	
	@Override
	public void acelerar(int cantidad) {
		if(cantidad>= 0 & (cantidad <=getVelocidad_maxima())) {
			setVelocidad(getVelocidad() + cantidad);
			}	
		}
	@Override
	public void frenar(int cantidad) {
		if(cantidad <=0) {
			setVelocidad(0);
			System.out.println("Error. No se puede realizar esta acción porque no tiene la velocidad suficiente");

		}else {
			setVelocidad(getVelocidad() - cantidad);
		}
	}
	@Override
	public int velocidadActual() {
		System.out.println("// - La velocidad actual es " + getVelocidad() + "km/h");

		return getVelocidad();
	}
	@Override
	public void PrintInfo() {
	
		
		super.PrintInfo();
		System.out.println("       - La cilindrada es " + cilindrada + " cc");
		System.out.println("       - La velocidad  es " + getVelocidad() + " km/h");
		System.out.println("\n");

	}
	
}
