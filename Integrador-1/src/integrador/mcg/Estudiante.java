
package integrador.mcg;


public class Estudiante extends Persona {
    
    private  long nro_reg; 
    private String modalidad;

    public long getNro_reg() {
        return nro_reg;
    }

    public void setNro_reg(long nro_reg) {
        this.nro_reg = nro_reg;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    
    public Estudiante(String nombre, int edad, char genero, long dni, long nro_reg, String modalidad) {
        super(nombre, edad, genero, dni);
        this.nro_reg=nro_reg;
        this.modalidad=modalidad;
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        System.out.println("--- Su número de registro es: N° "+ nro_reg + " , modalidad elegida: "+  modalidad);
                
                
                
                
    }
    
}
