package EjercicioB3;

public class Encargado extends Empleado{

	
	private String departamento;
	
	

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	public void Mostrar() {
		super.Mostrar();
		System.out.println("El departamento es " + this.departamento);
	}
}
