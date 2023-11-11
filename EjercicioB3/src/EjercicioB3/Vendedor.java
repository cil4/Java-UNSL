package EjercicioB3;

public class Vendedor extends Empleado{

	private float comision =0.1f;
	private float ventas;
	
	public float getComision() {
		return comision;
	}

	public void setComision(float comision) {
		this.comision = comision;
	}
	
	public float getVentas() {
		return ventas;
	}

	public void setVentas(float ventas) {
		this.ventas = ventas;
	}
	
	public Vendedor(String nombre, int edad, float salario_base, float bono, float ventas) {
		super(nombre, edad, salario_base, bono);
		this.ventas = ventas;
	}
	
	
	@Override
	public float calcularSueldo() {
	setSueldo((this.getSalario_Base()+ this.getBono()+ ventas*0.1f));
	return getSueldo();	
		 
		
	}
	
	@Override
	public void PrintInfo() {
		
		if(getSueldo()<=0) {
			System.out.println("*** El nombre del vendedor es " + getNombre());
			System.out.println("   - La edad del vendedor es de " + getEdad() + " años");
			System.out.println("   - El salario base del vendedor " + getNombre()+ " es de $ " + getSalario_Base());
			System.out.println("   - El bono obtenido es de $ " + getBono() );
		} else {
			System.out.println("*** El nombre del vendedor es " + getNombre());
			System.out.println("   - La edad del vendedor es de " + getEdad() + " años");
			System.out.println("   - El salario base del vendedor " + getNombre()+ " es de $ " + getSalario_Base());
			System.out.println("   - El bono obtenido es de $ " + getBono() );
			System.out.println("   - El sueldo bruto del vendedor incluida la comisión del 10%  es de $ " + getSueldo());
	}
	}

	
	

}
