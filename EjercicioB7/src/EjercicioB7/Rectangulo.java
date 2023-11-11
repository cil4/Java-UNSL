package EjercicioB7;

public class Rectangulo extends FiguraGeometrica{

	private float base;
	private float altura;
	
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	
	public Rectangulo(float base, float altura) {
		this.base= base;
		this.altura = altura;
	}
	@Override
	public float CalcularArea() {
		area = base * altura;
		System.out.println("El área del rectangulo de " + base + "cm de base y " + altura + "cm de altura es de " + Math.round(area) + "cm²");

		return area;
	}
	@Override
	public float CalcularPerimetro() {
		perimetro = base + base + altura + altura;
		System.out.println("El perímetro del rectangulo de " + base + "cm de base y " + altura + "cm de altura es de " + Math.round(perimetro) + "cm");

		return perimetro;
	}
	
	
	
	
}
