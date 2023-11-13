package ConexionBD;

import ventanas.HomeEstudiante;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

import modelo.Estudiante;
import modelo.Materia;
import modelo.Profesor;
import modelo.Usuario;
import ventanas.HomeEstudLogin;
import ventanas.HomeProfesor;

public class BD {

    Connection c = null;
    PreparedStatement ps = null;
    ResultSet result;
    Statement t;
    Icon icon = new ImageIcon(getClass().getResource("/Resources/error.png"));
    Icon ok = new ImageIcon(getClass().getResource("/Resources/ok2.png"));

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/institucion",
                    "root", "");

            //JOptionPane.showMessageDialog(null, "BD : Conexión exitosa");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en driver", "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en login", "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
        }
        return c;
    }

    public ResultSet iniciarSesion(String user, String pass) {
        Map<String, String> data = new HashMap<>();
        data.put("Key", pass);
        try {
            ps = c.prepareStatement("select U_Key,U_Tipo from usuario where U_Nbre=?");
            ps.setString(1, user);

            result = ps.executeQuery();
            while (result.next()) {
                String p = result.getString("U_Key");
                String r = result.getString("U_Tipo");
                if ((pass.equals(p)) && r.equals("estudiante")) {
                    JOptionPane.showMessageDialog(null, "inicio como estudiante");
                   
                   HomeEstudLogin he = new HomeEstudLogin(data);
                   
                   he.setVisible(true);
                   
                   
                    
                } else if ((pass.equals(p)) && r.equals("profesor")) {
                    JOptionPane.showMessageDialog(null, "inicio como profesor");
                    HomeProfesor hp = new HomeProfesor(data);
                    hp.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "BD : incorrecto",
                            "Error",
                            JOptionPane.ERROR_MESSAGE, icon);
                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en login",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
        }
        return result;
    }

    public void CrearUsuario(Usuario usuario) {
        try {
            String sql = "insert into usuario (U_Nbre, U_Key, U_Tipo) values (?,?,?)";
            try (PreparedStatement pst = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

                pst.setString(1, usuario.getNombre_usuario());
                pst.setString(2, usuario.getPassword());
                pst.setString(3, usuario.getRol());

                pst.execute();

               // JOptionPane.showMessageDialog(null, "BD : Usuario creado correctamente",
                 //       "¡Éxito!", JOptionPane.INFORMATION_MESSAGE, ok);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en creación de usuario",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);

        }
    }

    public ResultSet ConsultaUsuarioEstudiantes() {
        try {
            ps = c.prepareStatement("select * from usuario where U_Tipo='estudiante'");
            result = ps.executeQuery();
            while (result.next()) {
                int cu = result.getInt(1);
                String nu = result.getString(2);
                String pa = result.getString(3);
                String rol = result.getString(4);

                System.out.println("El id de usuario es " + cu);
                System.out.println("El nombre de usuario es " + nu);
                System.out.println("La contraseña del usuario es " + pa);
                System.out.println("El rol del usuario es " + rol);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en consulta en Usuario",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
        }
        return result;
    }

    public ResultSet ConsultaEstud(String pass) {
        try {
            ps = c.prepareStatement("select U_Nbre,"
                    + "usuario.U_Key, E_DNI,E_Nbre,E_Apell,"
                    + "E_Tel,E_Email,E_Foto,E_Curso,"
                    + "E_NbreTutor,E_ApellTutor "
                    + "from estudiante"
                    + " inner join usuario on usuario.U_Key=estudiante.U_Key"
                    + " where U_Tipo=?  and usuario.U_Key=?");

            ps.setString(1, "estudiante");
                        ps.setString(2, pass);
            result = ps.executeQuery();
             
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en consulta en Estudiante",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
            System.out.println(ex);
            
        } 
        return result;
    }
  public ResultSet ConsultaProf(String pass) {
        try {
            ps = c.prepareStatement(" select U_Nbre,usuario.U_Key,profesor.P_CUIL,"
                    + "P_Nbre,P_Apell,P_Tel,P_Email,P_Foto,P_Cond,"
                    + " M_Nbre,M_Curso from profesor "
                    + "inner join usuario on usuario.U_Key=profesor.U_Key"
                    + " inner join prof_materia on profesor.P_CUIL=prof_materia.P_CUIL "
                    + "inner join materia on prof_materia.M_Id= materia.M_Id "
                    + "where U_Tipo=2 and usuario.U_Key=?");

            
                        ps.setString(1, pass);
            result = ps.executeQuery();
             
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en consulta en Profesor",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
            System.out.println(ex);
            
        } 
        return result;
    }
    public int ActualizaNick(String nick, String pass) {
        int i = 0;
        try {
            ps = c.prepareStatement("update usuario set U_Nbre=? where U_Key=?");
            ps.setString(1, nick);
            ps.setString(2, pass);
            i = ps.executeUpdate();
           // JOptionPane.showMessageDialog(null, "BD : Usuario actualizado correctamente",
             //       "¡Éxito!", JOptionPane.INFORMATION_MESSAGE, ok);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en actualización de Usuario",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
        }
        return i;
    }

    public void CrearEstudiante(Estudiante est) {
        try {
            ps = c.prepareStatement("INSERT INTO estudiante("
                    + "E_DNI, E_Nbre,E_Apell,E_Tel,E_Email,"
                    + "E_Foto,E_Curso,E_NbreTutor,"
                    + "E_ApellTutor,U_Key)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, est.getDni());
            ps.setString(2, est.getNombre());
            ps.setString(3, est.getApellido());
            ps.setString(4, est.getTelefono());
            ps.setString(5, est.getEmail());
            ps.setString(6, est.getFoto());
            ps.setString(7, est.getCurso());
            ps.setString(8, est.getTutor_nombre());
            ps.setString(9, est.getTutor_apell());
            ps.setString(10, est.getKey());

            ps.execute();
           // JOptionPane.showMessageDialog(null, "BD : Estudiante creado correctamente",
             //       "¡Éxito!", JOptionPane.INFORMATION_MESSAGE, ok);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en creación de estudiante",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);

        }
    }

    public void CrearProfesor(Profesor prof) {
        try {
            ps = c.prepareStatement("INSERT INTO profesor("
                    + "P_CUIL, P_Nbre,P_Apell,P_Tel,"
                    + "P_Email,P_Foto,P_Cond,U_Key)"
                    + "VALUES(?,?,?,?,?,?,?,?)");
            ps.setLong(1, prof.getCuil());
            ps.setString(2, prof.getNombre());
            ps.setString(3, prof.getApellido());
            ps.setString(4, prof.getTel());
            ps.setString(5, prof.getEmail());
            ps.setString(6, prof.getFoto());
            ps.setString(7, prof.getCargo());
            ps.setString(8, prof.getP_key());

            ps.execute();
           // JOptionPane.showMessageDialog(null, "BD : Profesor creado correctamente",
             //       "¡Éxito!", JOptionPane.INFORMATION_MESSAGE, ok);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en creación de profesor",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);

        }
    }

    public ResultSet ConsultaUsuarios() {
        try {
            t = c.createStatement();
            result = t.executeQuery("select * from usuario");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en consulta en Usuario",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
        }
        return result;
    }

    //modificar 
    public int ActualizaEstudiante(String pass,String email, String telef) {
       
        int i = 0;
        try {
            ps = c.prepareStatement("update estudiante set E_Email=?, E_Tel=? where U_Key=?");
            ps.setString(1, email);
            ps.setString(2, telef);
            ps.setString(3, pass);
            i = ps.executeUpdate();
           // JOptionPane.showMessageDialog(null, "BD : Estudiante actualizado correctamente",
             //       "¡Éxito!", JOptionPane.INFORMATION_MESSAGE, ok);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en actualización de Estudiante",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
        }
        return i;
    }

    public int ActualizaProfesor(String email, String telef, String pass) {
        int i = 0;
        try {
            ps = c.prepareStatement("update profesor set P_Email=?, P_Tel=? where U_Key=?");
            ps.setString(1, email);
            ps.setString(2, telef);
            ps.setString(3, pass);
            i = ps.executeUpdate();
          //  JOptionPane.showMessageDialog(null, "BD : Profesor actualizado correctamente",
            //        "¡Éxito!", JOptionPane.INFORMATION_MESSAGE, ok);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en actualización de Profesor",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
        }
        
        return i;
    }
    
    public void crearMateria(Materia mat){
        try{
            String sql= "INSERT into materia (M_Nbre, M_Curso) VALUES(?,?)";
              try (PreparedStatement pst = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            pst.setString(1, mat.getMateria_Nbre());
            pst.setInt(2, mat.getCurso());
            pst.execute();
             try (ResultSet rst = pst.getGeneratedKeys()) {
                    while (rst.next()) {
                        mat.setMateria_id(rst.getInt(1));
                    }
                }
                 //JOptionPane.showMessageDialog(null, "BD : Materia creada correctamente",
                   // "¡Éxito!", JOptionPane.INFORMATION_MESSAGE, ok);
        }} catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "BD : Error en creación de materia",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);

        }
    }
    
    public void crearProfMateria(Materia mat, Profesor prof){
        try{
            ps= c.prepareStatement("INSERT into prof_materia VALUES(?,?)");
           ps.setInt(1, mat.getMateria_id());
            ps.setLong(2, prof.getCuil());
            ps.execute();
            
              //   JOptionPane.showMessageDialog(null, "BD : Profesor materia creada correctamente",
                //    "¡Éxito!", JOptionPane.INFORMATION_MESSAGE, ok);
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "BD : Error en creación de profesor materia",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);

        }
    }
    
      public ResultSet ConsultaProf1(Long cuil) {
        try {
            ps = c.prepareStatement("SELECT M_Nbre, M_Curso "
                    + "from materia, prof_materia,profesor "
                    + "where profesor.P_CUIL=prof_materia.P_CUIL and "
                    + "prof_materia.M_Id= materia.M_Id and "
                    + "profesor.P_CUIL=?");

            
                        ps.setLong(1, cuil);
            result = ps.executeQuery();
             
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en consulta:1 en Profesor",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
            System.out.println(ex);
            
        } 
        return result;
    }
            
      public ResultSet ConsultaProf2(int curso) {
        try {
            ps = c.prepareStatement("SELECT distinct E_Nbre,E_Apell, M_Curso "
                    + "from estudiante "
                    + "inner join materia on materia.M_Curso= estudiante.E_Curso "
                    + "where M_Curso=?");

            
                        ps.setInt(1, curso);
            result = ps.executeQuery();
             
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en consulta:2 en Profesor",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
            System.out.println(ex);
            
        } 
        return result;
    }
       public ResultSet ConsultaProf3(int curso) {
        try {
            ps = c.prepareStatement("SELECT M_Nbre,P_Nbre,P_Apell, "
                    + "M_Curso from prof_materia,profesor,materia "
                    + "where profesor.P_CUIL=prof_materia.P_CUIL "
                    + "and prof_materia.M_Id= materia.M_Id "
                    + "and M_Curso=?");

            
                        ps.setInt(1, curso);
            result = ps.executeQuery();
             
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en consulta:3 en Profesor",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
            System.out.println(ex);
            
        } 
        return result;
    }

      
      public ResultSet ConsultaProf4(Long cuil) {
        try {
            ps = c.prepareStatement("select E_Nbre, E_Apell, M_Curso, M_Nbre,"
                    + " E_NbreTutor, E_ApellTutor "
                    + "from  estudiante, profesor,materia, prof_materia "
                    + "where profesor.P_CUIL=prof_materia.P_CUIL and "
                    + "prof_materia.M_Id= materia.M_Id and"
                    + " estudiante.E_Curso=materia.M_Curso "
                    + "and profesor.P_CUIL=?");

            
                        ps.setLong(1, cuil);
            result = ps.executeQuery();
             
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en consulta:4 en Profesor",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
            System.out.println(ex);
            
        } 
        return result;
    }
      
      public ResultSet ConsultaAlumno1(int dni){
          try{
              ps= c.prepareStatement("SELECT M_Nbre,M_Curso "
                      + "from materia, estudiante "
                      + "where estudiante.E_Curso= materia.M_Curso "
                      + "and E_DNI=?");
              ps.setInt(1, dni);
              result= ps.executeQuery();
              
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en consulta:1 en Estudiante",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
            System.out.println(ex);
            
        } 
        return result;
      }
      public ResultSet ConsultaAlumno2(int dni){
          try{
              ps= c.prepareStatement("select P_Nbre, P_Apell,M_Nbre,M_Curso "
                      + "from materia,estudiante, profesor, prof_materia "
                      + "where estudiante.E_Curso=materia.M_Curso "
                      + "and profesor.P_CUIL=prof_materia.P_CUIL "
                      + "and materia.M_Id=prof_materia.M_Id "
                      + "and E_DNI=?");
              ps.setInt(1, dni);
              result= ps.executeQuery();
              
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en consulta:2 en Estudiante",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
            System.out.println(ex);
            
        } 
        return result;
      }   
         public ResultSet ConsultaAlumno3(int curso){
          try{
              ps= c.prepareStatement("SELECT E_Nbre, E_Apell, E_Curso "
                      + "from estudiante where  E_Curso=?");
              ps.setInt(1, curso);
              result= ps.executeQuery();
              
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD : Error en consulta:3 en Estudiante",
                    "Error",
                    JOptionPane.ERROR_MESSAGE, icon);
            System.out.println(ex);
            
        } 
        return result;
      }
}
