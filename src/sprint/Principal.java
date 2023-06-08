package sprint;


import sprint.entity.*;

import java.util.Date;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //VARIABLES Usuarios
        String nombreUser = "";
        String apellido1User = "";
        String apellido2User = "";

        String fechaNacimientoUser = "";
        int runUser = 0;

        System.out.println("favor ingrese un nombre entre 3 y 20 caracteres.");
        nombreUser = sc.nextLine();

        Usuario usuario1 = new Usuario(nombreUser, apellido1User, apellido2User, fechaNacimientoUser, runUser);


        //VARIABLES cliente


        String nombreEmpresa = "";
        String giroEmpresa = "";
        int rut = 0;
        String tlfRepresentante = "";
        String direccionEmpresa = "";
        String comunaEmpresa = "";
        Cliente cliente1 = new Cliente(nombreUser, apellido1User, apellido2User, fechaNacimientoUser, runUser, nombreEmpresa, giroEmpresa, rut, tlfRepresentante, direccionEmpresa, comunaEmpresa);


        //Accidentes


        //VARIABLES

        int op = 0;

        //VARIABLES PROFESIONAL
        String titulo = "";
        String fechaIngreso = "";


        System.out.println("Bienvenido, ¿en que perfil desea trabajar?");


        System.out.println("------Perfiles------");
        System.out.println("1 > Usuario");
        System.out.println("2 > Cliente");
        System.out.println("3 > Profesional");
        System.out.println("4 > Administrativo");
        System.out.println("5 > Capasitaciones");
        System.out.println("6 > Accidente");
        System.out.println("7 > Visita en Terreno");
        System.out.println("8 > Revision");

        System.out.println();
        op = sc.nextInt();
        sc.nextLine(); //nextLine lo agregue para que no salte siguiente linea

        do {
            if (op > 3) {
                System.out.println();
                System.out.println("Opcion ingresada incorrecta, por favor ingrese una opcion valida");
                op = sc.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println("------Usuario------");


                    break;
                case 2:
                    System.out.println("------Perfil Cliente------");

                    break;
                case 3:
                    Scanner scP = new Scanner(System.in);
                    System.out.println("------Perfil Profesional------");
                    System.out.println("Ingrese su nombre");
                    nombreUser = scP.nextLine();


                    System.out.println("Ingrese su Apellido 1");
                    apellido1User = scP.nextLine();

                    System.out.println("Ingrese su Apellido 2");
                    apellido2User = scP.nextLine();

                    System.out.println("Ingrese su Fecha de nasimiento");
                    fechaNacimientoUser = scP.nextLine();

                    System.out.println("Ingrese su Run");
                    runUser = scP.nextInt();

                    System.out.println("Ingrese su Titulo");
                    titulo = scP.next();

                    System.out.println("Ingrese su Fecha de Ingreso");
                    fechaIngreso = scP.nextLine();

                    Profesional profesional = new Profesional(nombreUser, apellido1User, apellido2User, fechaNacimientoUser, runUser, titulo, fechaIngreso);
                    System.out.println(profesional.toString());

                    Contenedor contenedor = new Contenedor();
                    contenedor.almacenarProfesional(profesional);

                    contenedor.mostrarProfesional();

                    break;
                case 4:
                    System.out.println("------Perfil Administrativo------");
                    break;
                case 5:
                    System.out.println("------Perfil Capacitaciones------");

                    VisitaEnTerreno visita = new VisitaEnTerreno();


                    //llamar rut otra clase?

                    //Objeto Capacitacion
                    Capacitacion capaci = new Capacitacion();

                    sc.nextLine();
                    System.out.println("Ingrese rut empresa");
                    capaci.setRutEmpresa(sc.nextLine());
                    System.out.println(capaci.getRutEmpresa());

                    System.out.println("Ingrese ID capacitacion (solo numeros enteros)");
                    capaci.setId(sc.nextInt());
                    System.out.println(capaci.getId()); sc.nextLine();

                    System.out.println("Ingrese dia de capacitacion");
                    capaci.setDia(sc.nextLine());
                    System.out.println(capaci.getDia());

                    System.out.println("Ingrese hora de capacitacion (ej: 20:00)");
                    capaci.setHora(sc.nextLine());
                    System.out.println(capaci.getLugar());

                    System.out.println("Ingrese lugar de capactitacion");
                    capaci.setLugar(sc.nextLine());
                    System.out.println(capaci.getLugar());

                    System.out.println("Ingrese duracion en horas(numero entero)de capacitacion");
                    capaci.setHora(sc.nextLine());
                    System.out.println(capaci.getHora() + "horas");

                    System.out.println("Ingrese cantidad de asistente a la capacitacion");
                    capaci.setCantidadAsistente(sc.nextInt());
                    System.out.println(capaci.getCantidadAsistente() + "Asistentes");


                    break;
                case 6:
                    System.out.println("------Perfil Accidente------");
                    break;
                case 7:
                    System.out.println("------Perfil Visita en Terreno------");
                    break;
                case 8:
                    System.out.println("------Perfil Revision------");
                    break;
            }

        } while (op > 3);


        //Validaciones sergio
        //Objeto VisitaTerreno

        VisitaEnTerreno visita = new VisitaEnTerreno();


        //llamar rut otra clase?

        //Objeto Capacitacion
        //Capacitacion capaci = new Capacitacion();




    }
}