package EjercicioE5;

public class Producto {

	private String Nombre_producto;
	private float Precio_unitario;
	private int Unidades;
	public String getNombre_producto() {
		return Nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		Nombre_producto = nombre_producto;
	}
	public float getPrecio_unitario() {
		return Precio_unitario;
	}
	public void setPrecio_unitario(float precio_unitario) {
		Precio_unitario = precio_unitario;
	}
	public int getUnidades() {
		return Unidades;
	}
	public void setUnidades(int unidades) {
		Unidades = unidades;
	}
	public Producto(String nombre_producto, float precio_unitario, int unidades) {
		super();
		Nombre_producto = nombre_producto;
		Precio_unitario = precio_unitario;
		Unidades = unidades;
	}
	@Override
	public String toString() {
		return "Producto [Nombre_producto=" + Nombre_producto + ", Precio_unitario=" + Precio_unitario + ", Unidades="
				+ Unidades + "]";
	}
	
}
