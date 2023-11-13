
package modelo;


public class Profesor {
    /*: Nombre de usuario, contraseña, nombre, apellido, CUIL, 
teléfono de contacto, email, profesor de planta o profesor suplente, materias que dicta y curso*/
    private Long cuil;
    private String nombre;
    private String apellido;
    private String tel;
    private String email;
    private String foto;
    private String cargo;
    private String p_key;

    public Profesor(Long cuil, String nombre, String apellido, String tel, String email, String foto, String cargo, String p_key) {
        this.cuil = cuil;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel = tel;
        this.email = email;
        this.foto = foto;
        this.cargo = cargo;
        this.p_key = p_key;
    }

    public Long getCuil() {
        return cuil;
    }

    public void setCuil(Long cuil) {
        this.cuil = cuil;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getP_key() {
        return p_key;
    }

    public void setP_key(String p_key) {
        this.p_key = p_key;
    }

    @Override
    public String toString() {
        return "Profesor{" + "cuil=" + cuil + ", nombre=" + nombre + ", apellido=" + apellido + ", tel=" + tel + ", email=" + email + ", foto=" + foto + ", cargo=" + cargo + ", p_key=" + p_key + '}';
    }

    
    
    

}
