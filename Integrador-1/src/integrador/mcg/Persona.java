
package integrador.mcg;


public abstract class Persona implements Mostrable{
    private String nombre;
    private int edad; 
    private char genero;
    private long dni;

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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Persona(String nombre, int edad, char genero, long dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.dni = dni;
    }

    @Override
    public void Mostrar() {
        System.out.println("***** El nombre es " + nombre + ", edad " +edad +" años, género: " + genero
				+", DNI N° " + dni+".");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", dni=" + dni + '}';
    }
     
    
}
