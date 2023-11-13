
package modelo;



public class Estudiante {
    /*Nombre de usuario, contraseña, nombre, apellido, DNI, teléfono 
de contacto, email, foto, curso (solo hay una división por curso), nombre y apellido del tutor */
   private int dni;
    private String nombre;
    private String apellido;
    
    private String telefono;
    private String email;
    private String foto;
    private String curso;
    private String tutor_nombre;
    private String tutor_apell;
    private String key;

    public Estudiante(int dni, String nombre, String apellido, String telefono, String email, String foto, String curso, String tutor_nombre, String tutor_apell, String key) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.foto = foto;
        this.curso = curso;
        this.tutor_nombre = tutor_nombre;
        this.tutor_apell = tutor_apell;
        this.key = key;
    }

    public Estudiante() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTutor_nombre() {
        return tutor_nombre;
    }

    public void setTutor_nombre(String tutor_nombre) {
        this.tutor_nombre = tutor_nombre;
    }

    public String getTutor_apell() {
        return tutor_apell;
    }

    public void setTutor_apell(String tutor_apell) {
        this.tutor_apell = tutor_apell;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email + ", foto=" + foto + ", curso=" + curso + ", tutor_nombre=" + tutor_nombre + ", tutor_apell=" + tutor_apell + ", key=" + key + '}';
    }


    
}
