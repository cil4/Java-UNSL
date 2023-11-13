package integrador.mcg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GestionInstitucional {

    ArrayList<Persona> lista = new ArrayList<>();

    public boolean ExisteDni(Persona per) {
        boolean existe = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDni() == per.getDni()) {
                existe = true;
                break;
            }
        }

        return existe;
    }
    // Agregar estudiante

    public void agregarEstudiante(Estudiante alumno) {

        lista.add(alumno);
        System.out.println("Estudiante se cargó de manera exitosa");
        alumno.Mostrar();

    }
    // Agregar profesor

    public void agregarProfesor(Profesor docente) {
        lista.add(docente);
        System.out.println("Docente se cargó de manera exitosa");
        docente.Mostrar();
    }

    // Agregar empleado administrativo
    public void agregarAdministrativo(Administrativo adm) {

        lista.add(adm);
        System.out.println("Empleado Administrativo se cargó de manera exitosa");

        adm.Mostrar();
    }

    // Mostrar todas las personas
    public void mostrarPersonas() {
        for (Persona persona : lista) {
            persona.Mostrar();
        }
    }
    // Mostrar estudiantes

    public void mostrarEstudiantes() {
        for (Persona persona : lista) {
            if (persona instanceof Estudiante) {
                persona.Mostrar();
            }
        }
    }
    // Mostrar un estudiante 

    public void mostrarUnEstudiante(long dni_estud) {

        for (Persona persona : lista) {
            if (persona instanceof Estudiante) {
                if (persona.getDni() == dni_estud) {
                    persona.Mostrar();

                } else {
                    System.out.println("El DNI ingresado no se corresponde con un estudiante de la Institución");

                }
            }

        }
    }
    // Mostrar profesores

    public void mostrarProfesores() {
        for (Persona persona : lista) {
            if (persona instanceof Profesor) {
                persona.Mostrar();
            }
        }
    }
    // Mostrar empleados administrativos

    public void mostrarAdministrativo() {
        for (Persona persona : lista) {
            if (persona instanceof Administrativo) {
                persona.Mostrar();
            }
        }
    }
    // Modificar estudiante

    public void modificarEstudiante(long dni_modif, String modif_nombre, 
            int modif_edad, char modif_genero, long modif_reg, String modif_mod) {
        for (Persona persona : lista) {
            if (persona instanceof Estudiante) {

                if (!(persona.getDni() == dni_modif)) {
                    System.out.println("El DNI ingresado no se corresponde con un estudiante de la Institución");
                } else {
                    persona.setNombre(modif_nombre);

                    persona.setEdad(modif_edad);
                    persona.setGenero(modif_genero);
                    persona.setDni(dni_modif);
                    ((Estudiante) persona).setNro_reg(modif_reg);
                    ((Estudiante) persona).setModalidad(modif_mod);
                    System.out.println("Estudiante ha sido modificado");

                }
            }
        }
    }
    // Eliminar estudiante

    public void eliminarEstudiante(long dni_elim) {

        boolean alumno_eliminado = lista.removeIf((p) -> (p instanceof Estudiante && p.getDni() == dni_elim));
        if (alumno_eliminado) {
            System.out.println("Estudiante ha sido eliminado");
        } else {
            System.out.println("Estudiante no pudo ser eliminado");
        }

    }
    // Modificar personas: profesor, administrativo

    public void modificarProfesor(long dni_prof_modif, String modif_nombre, int modif_edad, char modif_genero,
            long modif_reg, String espec_mod, double modif_salario, short modif_ant) {
        for (Persona persona : lista) {
            if (persona instanceof Profesor) {

                if (!(persona.getDni() == dni_prof_modif)) {

                    System.out.println("El DNI ingresado no se corresponde con un docente de la Institución");
                } else {
                    persona.setNombre(modif_nombre);
                    persona.setEdad(modif_edad);
                    persona.setGenero(modif_genero);
                    persona.setDni(dni_prof_modif);
                    ((Profesor) persona).setNro_empl_doc(modif_reg);
                    ((Profesor) persona).setEspecialidad(espec_mod);
                    ((Profesor) persona).setSalario(modif_salario);
                    ((Profesor) persona).setAntiguedad(modif_ant);
                    System.out.println("Profesor ha sido modificado");
                }

            }
        }
    }

    public void modificarAdministrativo(long dni_adm_m, String modif_nombre, int modif_edad, char modif_genero, long modif_reg, char cargo_mod) {
        for (Persona persona : lista) {
            if (persona instanceof Administrativo) {

                if (!(persona.getDni() == dni_adm_m)) {
                    System.out.println("El DNI ingresado no se corresponde con un empleado de la Institución");
                } else {
                    persona.setNombre(modif_nombre);
                    persona.setEdad(modif_edad);
                    persona.setGenero(modif_genero);
                    persona.setDni(dni_adm_m);
                    ((Administrativo) persona).setNro_emple_Ad(modif_reg);
                    ((Administrativo) persona).setCargo(cargo_mod);
                    System.out.println("Empleado administrativo ha sido modificado");

                }
            }
        }
    }
    // Eliminar profesor, administrativo

    public void eliminarProfesor(long dni_eli) {
        boolean profesor_eliminado = lista.removeIf((p) -> (p instanceof Profesor && p.getDni() == dni_eli));
        if (profesor_eliminado) {
            System.out.println("Profesor ha sido eliminado");
        } else {
            System.out.println("Profesor no pudo ser eliminado");
        }
    }

    public void eliminarAdministrativo(long dni_adm) {
        boolean adm_eliminado = lista.removeIf((a) -> (a instanceof Administrativo && a.getDni() == dni_adm));
        if (adm_eliminado) {
            System.out.println("Empleado Administrativo ha sido eliminado");
        } else {
            System.out.println("Empleado Administrativo no pudo ser eliminado");
        }
    }

    // Modificar sueldo de profesores
    public void modificarSueldoProfesores() {
        for (Persona pers : lista) {
            if (pers instanceof Profesor) {
                Profesor prof = (Profesor) pers;
                if (prof.getAntiguedad() >= 12) {
                    double salario = prof.getSalario();
                    prof.setSalario(salario + (salario * 0.315));
                    System.out.println("Los aumentos correspondientes han sido realizados");
                    pers.Mostrar();  
                }

            }
        }
    }
    // Guardar datos

    public void guardarDatos() throws IOException {

        PrintWriter out = null;
        try {
            File archivo1 = new File("backupInstitucion.txt");

            // abre el fichero de texto
            out = new PrintWriter(new FileWriter(archivo1));
            // escribe el listado alumno por alumno
            out.printf("Mostrando datos de la Institución Educativa%n%n");
            for (Persona pers : lista) {

                if (pers instanceof Profesor) {
                    if ("Programación".equals(((Profesor) pers).getEspecialidad())) {
                        out.printf("NOMBRE:%s DNI:%s ESPECIALIDAD:%s  N°EMPLEADO DOCENTE: %d%n%n",
                                pers.getNombre(),
                                pers.getDni(), ((Profesor) pers).getEspecialidad(), ((Profesor) pers).getNro_empl_doc());

                    }
                }
                if (pers instanceof Estudiante) {
                    if ("Tecnología e Informática".equals(((Estudiante) pers).getModalidad())) {
                        out.printf("NOMBRE:%s DNI:%s MODALIDAD:%s N°REGISTRO ESTUDIANTIL:%d%n%n",
                                pers.getNombre(),
                                pers.getDni(),
                                ((Estudiante) pers).getModalidad(),
                                ((Estudiante) pers).getNro_reg());
                    }
                }
                if (pers instanceof Administrativo) {

                    if (((Administrativo) pers).getCargo() == 'A' || ((Administrativo) pers).getCargo() == 'D') {
                        out.printf("NOMBRE:%s DNI:%s CATEGORIA:%c N°EMPLEADO ADMINISTRATIVO:%d%n%n",
                                pers.getNombre(),
                                pers.getDni(),
                                ((Administrativo) pers).getCargo(),
                                ((Administrativo) pers).getNro_emple_Ad());
                    }
                }

            }
            System.out.println("Se ha realizado exitosamente la operación");

        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
    
    // Leer datos

    public void leerDatos() {
        try {
            FileReader entrada = new FileReader("backupInstitucion.txt");
            BufferedReader mibuffer = new BufferedReader(entrada);
            String linea = "";
            while (linea != null) {
                linea = mibuffer.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }
            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo a leer");
        }
    }
}
