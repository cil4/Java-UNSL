
package EjercicioB3;

public class Empleado {

	
	private String nombre;
	private float salario;
	private int edad;
	
	



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void Mostrar() {
		System.out.println("El nombre es " + this.nombre);
		System.out.println("El salario es " + this.salario);
		System.out.println("La edad es " + this.edad );

		

	}
}
