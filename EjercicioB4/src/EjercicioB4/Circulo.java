package EjercicioB4;

public class Circulo extends Figura{

	final float PI = 3.14f;
	private float diametro;
	private float radio;

	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(float diametro) {
		this.diametro = diametro;
	} 
	

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	public Circulo(float diametro) {
		this.diametro = diametro;
	}

	@Override
	public float calcularArea() {
		radio = diametro/2;
		return area = PI *radio * radio;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintInfo() {
		System.out.println("El área de un circulo de " + diametro + " cm de diametro es de: " + area + "cm²");

	}
	
}
