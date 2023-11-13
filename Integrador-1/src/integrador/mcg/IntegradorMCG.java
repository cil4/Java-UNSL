package integrador.mcg;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Scanner;

public class IntegradorMCG {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        GestionInstitucional gestion = new GestionInstitucional();
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("...... MENÚ DE OPCIONES .......");
            System.out.println(" 1. Agregar persona");
            System.out.println(" 2. Eliminar persona");
            System.out.println(" 3. Mostrar todas las personas");
            System.out.println(" 4. Mostrar todos los estudiantes");
            System.out.println(" 5. Mostrar todos los profesores");
            System.out.println(" 6. Mostrar todos los empleados administrativos");
            System.out.println(" 7. Mostrar un estudiante");
            System.out.println(" 8. Modificar un estudiante");
            System.out.println(" 9. Modificar profesor");
            System.out.println(" 10. Modificar administrativo");
            System.out.println(" 11. Eliminar un estudiante");
            System.out.println(" 12. Modificar sueldo de profesores");
            System.out.println(" 13. Guardar Datos");
            System.out.println(" 14. Mostrar Datos");

            System.out.println(" 15. Salir del programa");
            System.out.println(" Ingrese opcion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println(" ---------CARGAR PERSONA--------");
                    System.out.println(" [1] Cargar Estudiante ");
                    System.out.println(" [2] Cargar Profesor ");
                    System.out.println(" [3] Cargar Empleado Administrativo ");

                    System.out.println(" Ingrese opción");
                    int opPersona = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese DNI");
                    long dni = sc.nextLong();
                    sc.nextLine();

                    System.out.println("Ingrese nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese edad");
                    int edad = sc.nextInt();
                    System.out.println("Ingrese género: 'F' , 'M' o 'X'");
                    char genero = sc.next().charAt(0);
                    
                switch (opPersona) {
                    case 1:
                        //ESTUDIANTE
                        System.out.println("Ingrese número de registro del estudiante");
                        long registro = sc.nextLong();
                        sc.nextLine();
                        System.out.println("Ingrese modalidad -tipee la opción elegida en letra mayúscula - :\n"
                                + " [A] -Pasteleria\n"
                                + " [B] -Psicologia \n"
                                + " [C] -Tecnología e Informática \n"
                                + " [D] -Maestro Mayor de Obra\n"
                                + "     -Otra modalidad. (Escribalo directamente)\n");
                       
                        String modalidad = sc.nextLine();
                       if(modalidad.equals("A")){
                           modalidad="Pasteleria";
                       } if(modalidad.equals("B")){
                           modalidad="Psicologia";
                       } if(modalidad.equals("C")){
                           modalidad="Tecnología e Informática";
                       } if(modalidad.equals("D")){
                           modalidad="Maestro Mayor de Obra";
                       }
                        Estudiante alumno = new Estudiante(nombre, edad, genero, dni, registro, modalidad);
                        if (gestion.ExisteDni(alumno)) {
                            System.out.println("Error. Ya existe registro con ese DNI");
                        } else {
                            //Se inserta estudiante
                            gestion.agregarEstudiante(alumno);
                        }
                        break;
                    case 2:
                        //PROFESOR
                        System.out.println("Ingrese número de empleado docente");
                        long nro_empl = sc.nextLong();
                        sc.nextLine();
                        System.out.println("Ingrese especialidad -tipee la opción elegida en letra mayúscula -:\n"
                                + "[A] -Programación \n"
                                + "[B] -Base de Datos \n"
                                + "[C] -Robótica \n"
                                + "[D] -Electrónica");
                        String especialidad = sc.nextLine();
                        if(especialidad.equals("A")){
                            especialidad="Programación";
                        } if(especialidad.equals("B")){
                            especialidad="Base de Datos";
                        } if(especialidad.equals("C")){
                            especialidad="Robótica";
                        } if(especialidad.equals("D")){
                            especialidad="Electrónica";
                        }
                        System.out.println("Ingrese salario del docente");
                        double salario = sc.nextDouble();
                        System.out.println("Ingrese antigüedad del docente");
                        short antig = sc.nextShort();
                        Profesor docente = new Profesor(nombre, edad, genero, dni, nro_empl, especialidad, salario, antig);
                        if (gestion.ExisteDni(docente)) {
                            System.out.println("Error. Ya existe registro con ese DNI");
                        } else {
                            //Se inserta profesor
                            gestion.agregarProfesor(docente);
                        }
                        break;
                    case 3:
                        //EMPLEADO ADMINISTRATIVO
                        System.out.println("Ingrese número de empleado administrativo");
                        long nro_Adm = sc.nextLong();
                        System.out.println("Ingrese categoría -tipee la opción elegida en letra mayúscula -:\n"
                                + " -A \n"
                                + " -B \n"
                                + " -C \n"
                                + " -D");
                        char cargo = sc.next().charAt(0);
                        Administrativo admin = new Administrativo(nombre, edad, genero, dni,
                                nro_Adm, cargo);
                        if (gestion.ExisteDni(admin)) {
                            System.out.println("Error. Ya existe registro con ese DNI");
                        } else {
                            //Se inserta empleado administrativo
                            gestion.agregarAdministrativo(admin);
                        }
                        break;
                    default:
                        System.out.println("Opción inválida. Ingrese nuevamente.");
                        break;
                }
                    break;


                case 2:
                    System.out.println(" ---------ELIMINAR PERSONA--------");

                    System.out.println(" [1] Eliminar Profesor ");
                    System.out.println(" [2] Eliminar Empleado Administrativo ");
                    System.out.println(" Ingrese opción");
                    int opElim = sc.nextInt();

                    if (opElim == 1) {
                        System.out.println("Ingrese DNI del docente");
                        long dni_eli = sc.nextLong();

                        gestion.eliminarProfesor(dni_eli);
                    } else if (opElim == 2) {
                        System.out.println("Ingrese DNI del empleado administrativo");
                        long dni_adm = sc.nextLong();

                        gestion.eliminarAdministrativo(dni_adm);
                    }
                    break;

                case 3:
                    System.out.println("-------MOSTRAR TODAS LAS PERSONAS------");

                    gestion.mostrarPersonas();

                    break;
                case 4:
                    System.out.println("-------MOSTRAR TODOS LOS ESTUDIANTES------");

                    gestion.mostrarEstudiantes();
                    break;
                case 5:
                    System.out.println("-------MOSTRAR TODOS LOS PROFESORES------");

                    gestion.mostrarProfesores();
                    break;
                case 6:
                    System.out.println("-------MOSTRAR TODOS LOS EMPLEADOS ADMINISTRATIVOS------");

                    gestion.mostrarAdministrativo();
                    break;
                case 7:
                    System.out.println("-------MOSTRAR UN ESTUDIANTE------");

                    System.out.println("Ingrese DNI");
                    long dni_estud = sc.nextLong();

                    gestion.mostrarUnEstudiante(dni_estud);
                    break;
                case 8:
                    System.out.println("-------MODIFICAR UN ESTUDIANTE------");

                    System.out.println("Ingrese DNI del estudiante");
                    long dni_modif = sc.nextLong();
                    sc.nextLine();

                    System.out.println("Modifique nombre del estudiante");
                    String modif_nombre = sc.nextLine();
                    System.out.println("Modifique edad del estudiante");
                    int modif_edad = sc.nextInt();

                    System.out.println("Modifique género del estudiante");
                    char modif_genero = sc.next().charAt(0);

                    System.out.println("Modifique número de registro del estudiante");
                    long modif_reg = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Modifique modalidad -tipee la opción elegida en letra mayúscula -:\n"
                            + " [A]-Pasteleria\n"
                            + " [B]-Psicologia \n"
                            + " [C]-Tecnología e Informática \n"
                            + " [D]-Maestro Mayor de Obra\n"
                            + "     -Otra modalidad. (Escribalo directamente)");
                    String modif_mod = sc.nextLine();
                    if(modif_mod.equals("A")){
                           modif_mod="Pasteleria";
                       } if(modif_mod.equals("B")){
                           modif_mod="Psicologia";
                       } if(modif_mod.equals("C")){
                           modif_mod="Tecnología e Informática";
                       } if(modif_mod.equals("D")){
                           modif_mod="Maestro Mayor de Obra";
                       }
                    //se modifica estudiante
                    gestion.modificarEstudiante(dni_modif, modif_nombre,
                            modif_edad, modif_genero,
                            modif_reg, modif_mod);

                    break;
                case 9:
                    System.out.println(" ---------MODIFICAR PROFESOR--------");

                    System.out.println("Ingrese DNI del docente");
                    long dni_prof_modif = sc.nextLong();
                    sc.nextLine();

                    System.out.println("Modifique nombre del docente");
                    String modif_nombre_prof = sc.nextLine();
                    System.out.println("Modifique edad del docente");
                    int modif_edad_prof = sc.nextInt();

                    System.out.println("Modifique género del docente");
                    char modif_genero_prof = sc.next().charAt(0);

                    System.out.println("Modifique número de empleado docente");
                    long modif_reg_prof = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Modifique especialidad -tipee la opción elegida en letra mayúscula -:\n"
                            + "[A] -Programacion \n"
                            + "[B] -Base de Datos \n"
                            + "[C] -Robotica \n"
                            + "[D] -Electronica");
                    String espec_mod = sc.nextLine();
                    if(espec_mod.equals("A")){
                            espec_mod="Programación";
                        } if(espec_mod.equals("B")){
                            espec_mod="Base de Datos";
                        } if(espec_mod.equals("C")){
                            espec_mod="Robótica";
                        } if(espec_mod.equals("D")){
                            espec_mod="Electrónica";
                        }
                    System.out.println("Modifique salario del docente");
                    double modif_salario = sc.nextDouble();
                    System.out.println("Modifique antiguedad del docente");
                    short modif_ant = sc.nextShort();
                    //se modifica profesor
                    gestion.modificarProfesor(dni_prof_modif, modif_nombre_prof,
                            modif_edad_prof, modif_genero_prof,
                            modif_reg_prof, espec_mod, modif_salario, modif_ant);
                    break;
                case 10:
                    System.out.println(" ---------MODIFICAR ADMINISTRATIVO--------");

                    System.out.println("Ingrese DNI del empleado administrativo");
                    long dni_adm_m = sc.nextLong();
                    sc.nextLine();

                    System.out.println("Modifique nombre del empleado administrativo");
                    String modif_nombre_ad = sc.nextLine();
                    System.out.println("Modifique edad del empleado administrativo");
                    int modif_edad_ad = sc.nextInt();

                    System.out.println("Modifique género del empleado administrativo");
                    char modif_genero_ad = sc.next().charAt(0);

                    System.out.println("Modifique número de empleado administrativo");
                    long modif_reg_ad = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Modifique categoría -tipee la opción elegida en letra mayúscula -:\n"
                            + " -A \n"
                            + " -B \n"
                            + " -C \n"
                            + " -D");
                    char cargo_mod = sc.next().charAt(0);
                    //se modifica empleado administrativo
                    gestion.modificarAdministrativo(dni_adm_m, modif_nombre_ad,
                            modif_edad_ad, modif_genero_ad,
                            modif_reg_ad, cargo_mod);
                    break;

                case 11:
                    System.out.println("-------ELIMINAR UN ESTUDIANTE------");
                    System.out.println("Ingrese DNI");
                    long dni_elim = sc.nextLong();

                    gestion.eliminarEstudiante(dni_elim);

                    break;
                case 12:
                    System.out.println("-------MODIFICAR SUELDO DE PROFESORES------");

                    gestion.modificarSueldoProfesores();
                    break;
                case 13:
                    System.out.println("-------GUARDAR DATOS------");
                    gestion.guardarDatos();

                    break;
                case 14:
                    System.out.println("-------MOSTRAR DATOS------");
                    gestion.leerDatos();

                    break;
                case 15:
                    System.out.println("Saliendo del programa.....");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese nuevamente.");
            }
        } while (op != 15);

    }

}
