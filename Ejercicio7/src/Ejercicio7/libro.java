package Ejercicio7;

public class libro {

	private String titulo;
	private String autor;
	private float precio;
	
	
	// GETTERS & SETTERS
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	

		//METODOS
	
	public float Descuento(float d) {
		
		return precio = Math.round(precio - (precio * d));
		
	}
	
	public void PrintInfo() {
		System.out.println("El libro seleccionado es: " + titulo +
				". El autor se llama " + autor + " y su precio es de $ " + precio);
	}

}
