package EjercicioB2;

public class Rectangulo extends Figura{
	
	private double base;
	private double altura;
	private double areaRect;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAreaRect() {
		return areaRect;
	}

	public void setAreaRect(double areaRect) {
		this.areaRect = areaRect;
	}
	
	public Rectangulo(double base, double altura) {
		
		// TODO Auto-generated constructor stub
		this.setBase(base);
		this.setAltura(altura);
	}

	
	@Override
	public void calcularArea() {
		setAreaRect( base *altura);
		System.out.println("El área de un rectángulo de base " + base  + "cm y altura " + altura + "cm es de " + Math.round(areaRect) + " cm²");
	}

	

	

}
