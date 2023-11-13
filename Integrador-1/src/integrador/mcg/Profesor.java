
package integrador.mcg;


public class Profesor extends Persona{
    
    private long nro_empl_doc; 
    private String especialidad; 
    private double salario;
    private short antiguedad;

    public long getNro_empl_doc() {
        return nro_empl_doc;
    }

    public void setNro_empl_doc(long nro_empl_doc) {
        this.nro_empl_doc = nro_empl_doc;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public short getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(short antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Profesor(String nombre, int edad, char genero, long dni, long nro_empl_doc,String especialidad,
            double salario,short antiguedad) {
        super(nombre, edad, genero, dni);
        this.nro_empl_doc=nro_empl_doc;
        this.especialidad=especialidad;
        this.salario=salario;
        this.antiguedad=antiguedad;
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        System.out.println("--- Su número de empleado docente es N° "+ nro_empl_doc +
                " , especialidad: " + especialidad + ". Su salario es de $ " + salario +
                " y su antigüedad de "+ antiguedad +" años.");
                
                
                
                
                
                
                
    }
    
    
}
