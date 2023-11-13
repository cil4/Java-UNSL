
package modelo;


public class Materia {
    private int materia_id;
 private String materia_Nbre;
         private int curso;

    public Materia(String materia_Nbre, int curso) {
        this.materia_Nbre = materia_Nbre;
        this.curso = curso;
    }

    public String getMateria_Nbre() {
        return materia_Nbre;
    }

    public void setMateria_Nbre(String materia_Nbre) {
        this.materia_Nbre = materia_Nbre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getMateria_id() {
        return materia_id;
    }

    public void setMateria_id(int materia_id) {
        this.materia_id = materia_id;
    }
         
         
         
}
