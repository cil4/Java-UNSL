package EjercicioB4;

public class Rectangulo extends Figura{

	private float base;
	private float altura;
	
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public Rectangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	@Override
	public float calcularArea() {
		return area = base * altura;
	}
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void PrintInfo() {
		System.out.println("El área de un rectángulo de base " + base + " cm y altura de "+ altura +" cm es de: " + area + "cm²");

	}
	
	
}
