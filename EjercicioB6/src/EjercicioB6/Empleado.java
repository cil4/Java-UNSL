package EjercicioB6;

public class Empleado {

	private String nombre;
	private int edad;
	private float salario;
	
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
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public Empleado(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Empleado(String nombre, int edad, float salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public void imprimirDatos() {
		if(salario <=0) {
		System.out.println("*** El nombre del empleado es " + nombre);
		System.out.println("   - La edad del empleado es de " + edad + " años");
		} else {
			System.out.println("*** El nombre del empleado es " + nombre);
			System.out.println("   - La edad del empleado es de " + edad + " años");
			System.out.println("   - El salario del empleado  es de $ " + salario);

		}
	}
}
