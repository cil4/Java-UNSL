package EjercicioB3;

public class Empleado {

	private String nombre;
	private int edad;
	private float salario_base;
	private float bono;
	private float sueldo;
	
	//GETTERS & SETTERS
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getSalario_Base() {
		return salario_base;
	}
	public void setSalario_Base(float salario_base) {
		this.salario_base = salario_base;
	}
	public float getBono() {
		return bono;
	}
	public void setBono(float bono) {
		this.bono = bono;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	} 
	
	// CONSTRUCTOR
	public Empleado(String nombre, int edad, float salario_base, float bono) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario_base = salario_base;
		this.bono = bono;
	}
	
	//METODOS
	
	public float calcularSueldo() {
		  sueldo =salario_base + bono;

		return sueldo;
		
	}
	
	public void PrintInfo() {
		
		if (sueldo<=0){
			System.out.println("*** El nombre del empleado es " + nombre);
			System.out.println("   - La edad del empleado es de " + edad + " años");
			System.out.println("   - El salario base del empleado " + nombre+ " es de $ " + salario_base);
			System.out.println("   - El bono obtenido es de $ " + bono );
		
		}else {
			System.out.println("*** El nombre del empleado es " + nombre);
			System.out.println("   - La edad del empleado es de " + edad + " años");
			System.out.println("   - El salario base del empleado " + nombre+ " es de $ " + salario_base);
			System.out.println("   - El bono obtenido es de $ " + bono );
			System.out.println("   - Su sueldo bruto es de $ " + sueldo);
		}
	}
	
}
