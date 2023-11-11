package EjercicioC6;





public class Producto {

	private String nombre_producto;
	private float precio_unitario;
	private int unidades_producto;
	
	
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public float getPrecio_unitario() {
		return precio_unitario;
	}
	public void setPrecio_unitario(float precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	public int getUnidades_producto() {
		return unidades_producto;
	}
	public void setUnidades_producto(int unidades_producto) {
		this.unidades_producto = unidades_producto;
	}
	public Producto(String nombre_producto, float precio_unitario, int unidades_producto) {
		super();
		this.nombre_producto= nombre_producto;
		this.precio_unitario = precio_unitario;
		this.unidades_producto = unidades_producto;
	}
	
	
	@Override
	public String toString() {
		return "Producto [nombre_producto=" + nombre_producto + ", precio_unitario=" + precio_unitario
				+ ", unidades_producto=" + unidades_producto + "]";
	}
	


	
	
	
	
}
