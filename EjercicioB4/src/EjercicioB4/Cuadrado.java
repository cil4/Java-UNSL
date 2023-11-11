package EjercicioB4;

public class Cuadrado extends Figura{

	private float lado;
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	public Cuadrado(float lado) {
		this.lado = lado;
	}
	
	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return area = lado *lado;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintInfo() {
		System.out.println("El área de un cuadrado de " + lado + " cm es de: " + area + "cm²");
	}

	

	
}
