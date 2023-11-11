package EjercicioB2;

public class Circulo extends Figura{

	public static final double PI=3.14159265358979323846;
	private double radio;
	private double diametro;
	private double areaCirc;
	
	public Circulo(double diametro){
		this.diametro = diametro;
	}

	

	public double getAreaCirc() {
		return areaCirc;
	}

	public void setAreaCirc(double areaCirc) {
		this.areaCirc = areaCirc;
	}
	public double getDiametro() {
		return diametro;
	}



	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	@Override
	public void calcularArea() {
		radio = diametro /2;
		setAreaCirc(PI * radio * radio);
	}
	public void PrintInfo() {
		System.out.println("El área de un círculo de " + diametro + "cm de diametro es de " + Math.round(areaCirc) + " cm²");

	}




}
