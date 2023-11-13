
package modelo;


public class Usuario {
    private String nombre_usuario;
    private String password;
    private String rol;

    public Usuario(String nombre_usuario, String password, String rol) {
        this.nombre_usuario = nombre_usuario;
        this.password = password;
        this.rol = rol;
    }

  
    
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre_usuario=" + nombre_usuario + ", password=" + password + ", rol=" + rol + '}';
    }

 
    
    
}
