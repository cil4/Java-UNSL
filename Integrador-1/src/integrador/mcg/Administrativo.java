
package integrador.mcg;


public class Administrativo extends Persona{
    
    private long nro_emple_Ad; 
    private char cargo;

    public long getNro_emple_Ad() {
        return nro_emple_Ad;
    }

    public void setNro_emple_Ad(long nro_emple_Ad) {
        this.nro_emple_Ad = nro_emple_Ad;
    }

    public char getCargo() {
        return cargo;
    }

    public void setCargo(char cargo) {
        this.cargo = cargo;
    }
    
    public Administrativo(String nombre, int edad, char genero, long dni,long nro_emple_Ad,char cargo) {
        super(nombre, edad, genero, dni);
        this.nro_emple_Ad=nro_emple_Ad;
        this.cargo=cargo;
    }

    @Override
    public void Mostrar() {
        super.Mostrar(); 
        System.out.println("--- Su número de empleado administrativo es N° " + nro_emple_Ad+
                " y su categoría: " + cargo);
    }
    
    
    
}
