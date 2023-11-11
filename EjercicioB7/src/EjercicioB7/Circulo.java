package EjercicioB7;

public class Circulo extends FiguraGeometrica{

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
	public float CalcularArea() {
		radio = diametro /2;
		area = PI* radio * radio;
		System.out.println("El área de un circulo de " + diametro + " cm de diametro es de: " + Math.round(area) + "cm²");

		return area;
	}
	@Override
	public float CalcularPerimetro() {
		perimetro = PI * diametro;
		System.out.println("El perímetro de un circulo de " + diametro + " cm de diametro es de: " + Math.round(perimetro) + " cm");

		return perimetro;
	}
	
	
}
