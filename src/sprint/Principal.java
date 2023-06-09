package sprint;

//agregar el JavaDoc


import sprint.entity.Usuario;

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
        int res=0;
        int op = 0;

        //VARIABLES PROFESIONAL
        String titulo = "";
        String fechaIngreso = "";
        //VARIABLES ADMINISTRADORES
        String area="";
        String experienciaPrevia="";


        System.out.println("Bienvenido, ¿en que perfil desea trabajar?");

        do {

            System.out.println("------Perfiles------");
            System.out.println("1 > Usuario");
            System.out.println("2 > Cliente");
            System.out.println("3 > Profesional");
            System.out.println("4 > Administrativo");
            System.out.println("5 > Capacitaciones");
            System.out.println("6 > Accidente");
            System.out.println("7 > Visita en Terreno");
            System.out.println("8 > Revision");

            System.out.println();
            op = sc.nextInt();

            sc.nextLine(); //nextLine lo agregue para que no salte siguiente linea


            do {
                if (op > 8) {
                    System.out.println();
                    System.out.println("Opcion ingresada incorrecta, por favor ingrese una opcion valida");
                    op = sc.nextInt();
                }
                switch (op) {

                    case 1:
                        do{
                            System.out.println("------Usuario------");

                            // validaciones usuario
                            System.out.println("favor ingrese un nombre entre 3 y 20 caracteres.");
                            nombreUser = sc.nextLine();

                            while (nombreUser.length() < 3 || nombreUser.length() > 20) {
                                System.out.println("debe ser mayor a 3 y menor a 20");
                                nombreUser = sc.nextLine();
                            }

                            System.out.println("Favor ingrese su fecha de nacimiento en el sig formato DD/MM/AAAA");
                            fechaNacimientoUser = sc.nextLine();
                            while (fechaNacimientoUser.isEmpty() || fechaNacimientoUser == null) {
                                System.out.println("Favor ingrese una fecha valida con el siguiente formato DD/MM/AAAA");
                                fechaNacimientoUser = sc.nextLine();
                            }

                            System.out.println("Favor ingrese su RUN, el cual debe ir sin punto, ni guion, ni digito verificador");
                            runUser = sc.nextInt();
                            while (runUser > 99999999) {
                                System.out.println("Favor ingrese un run valido, sin puntos ni guion ni digito verificador");
                                runUser = sc.nextInt();
                            }

                            System.out.println("¿Desea Registrar otro usuario?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            res=sc.nextInt();

                            while (res > 2){
                                System.out.println("Por favor ingresar una opcion valida");
                                res=sc.nextInt();
                            }

                        } while (res == 1);

                        break;
                    case 2:

                        System.out.println("------Perfil Cliente------");
                        //validaciones cliente
                        System.out.println("favor ingrese un nombre entre 3 y 20 caracteres.");
                        nombreUser = sc.nextLine();

                        while (nombreUser.length() < 3 || nombreUser.length() > 20) {
                            System.out.println("debe ser mayor a 3 y menor a 20");
                            nombreUser = sc.nextLine();
                        }
                        System.out.println("Favor ingrese su fecha de nacimiento en el sig formato DD/MM/AAAA");
                        fechaNacimientoUser = sc.nextLine();

                        while (fechaNacimientoUser.isEmpty() || fechaNacimientoUser == null) {
                            System.out.println("Favor ingrese una fecha valida con el siguiente formato DD/MM/AAAA");
                            fechaNacimientoUser = sc.nextLine();
                        }
                        System.out.println("Favor ingrese su RUN, el cual debe ir sin punto, ni guion, ni digito verificador");
                        runUser = sc.nextInt();
                        while (runUser > 99999999 || runUser < 1111111) {
                            System.out.println("Favor ingrese un run valido, sin puntos ni guion ni digito verificador");
                            runUser = sc.nextInt();
                        }
                        //validaciones empresa
                        System.out.println("Favor ingrese el nombre de la empresa");
                        nombreEmpresa = sc.nextLine();
                        while (nombreEmpresa.length() < 5 || nombreEmpresa.length() > 30) {
                            System.out.println("favor ingrese un un nombre valido de mas de 5 caracteres y menos de 20.");
                            nombreEmpresa = sc.nextLine();
                        }
                        System.out.println("Favor ingrese el giro de la empresa");
                        giroEmpresa = sc.nextLine();
                        while (giroEmpresa.length() < 5 || giroEmpresa.length() > 30) {
                            System.out.println("favor ingrese un giro valido de entre 5 y 30 caracteres.");
                            giroEmpresa = sc.nextLine();
                        }
                        System.out.println("Favor ingrese el RUT de la empresa, sin puntos, sin guion y sin digito verificador.");
                        rut = sc.nextInt();
                        while (rut > 99999999 || rut < 11111111) {
                            System.out.println("Favor ingrese un rut valido, sin puntos, ni guion");
                            rut = sc.nextInt();
                        }
                        System.out.println("Favor ingrese un numero de tlf del representante de la empresa");
                        tlfRepresentante = sc.nextLine();
                        while (tlfRepresentante.isEmpty() || tlfRepresentante != null) {
                            System.out.println("Favor ingrese un telefono valido");
                            tlfRepresentante = sc.nextLine();
                        }

                        System.out.println("Favor ingrese la direccion de la empresa");
                        direccionEmpresa = sc.nextLine();
                        while (direccionEmpresa.length() < 5 || direccionEmpresa.length() > 70) {
                            System.out.println("favor ingrese un un nombre valido de mas de 5 caracteres y menos de 70.");
                            direccionEmpresa = sc.nextLine();
                        }
                        System.out.println("Favor ingrese la comuna en la que se encuentra la empresa");
                        comunaEmpresa = sc.nextLine();
                        while (comunaEmpresa.length() < 5 || comunaEmpresa.length() > 50) {
                            System.out.println("favor ingrese un un nombre valido de mas de 5 caracteres y menos de 50.");
                            comunaEmpresa = sc.nextLine();
                        }
                        // apellido 1 y 2 faltan

                        break;
                    case 3:

                        Contenedor contenedorP = new Contenedor();
                        do {

                            Scanner scP = new Scanner(System.in);
                            System.out.println("------Perfil Profesional------");

                            System.out.println("Ingrese su nombre");
                            nombreUser = scP.nextLine();
                            while (nombreUser.length() < 3 || nombreUser.length() > 20) {
                                System.out.println("debe ser mayor a 3 y menor a 20");
                                nombreUser = sc.nextLine();
                            }

                            System.out.println("Ingrese su Apellido 1");
                            apellido1User = scP.nextLine();

                            System.out.println("Ingrese su Apellido 2");
                            apellido2User = scP.nextLine();

                            System.out.println("Ingrese su Fecha de nacimiento");
                            fechaNacimientoUser = scP.nextLine();

                            System.out.println("Ingrese su Run");
                            runUser = scP.nextInt();
                            while (runUser > 99999999 || runUser < 1111111) {
                                System.out.println("Favor ingrese un run valido, sin puntos ni guion ni digito verificador");
                                runUser = sc.nextInt();
                            }

                            System.out.println("Ingrese su Titulo");
                            titulo = scP.next();
                            while (titulo.length() < 3 || titulo.length() > 50) {
                                System.out.println("debe ser mayor a 3 y menor a 20");
                                titulo = sc.nextLine();
                            }
                            System.out.println("Ingrese su Fecha de Ingreso");//Falta la validacion y que lo entrege en formato DD/MM/AAAA
                            fechaIngreso = scP.next();
                            //Instanciando una clase y pasando parametros
                            Profesional profesional = new Profesional(nombreUser, apellido1User, apellido2User, fechaNacimientoUser, runUser, titulo, fechaIngreso);
                            //almacenando profecional
                            contenedorP.almacenarProfesional(profesional);

                            System.out.println("¿Desea Registrar otro Profesional?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            res=sc.nextInt();

                            while (res>2){
                                System.out.println("Por favor ingresar una opcion valida");
                                res=sc.nextInt();
                            }

                        }while (res==1);
                        //Mostando la lista del profrecional
                        contenedorP.mostrarProfesional();


                        break;
                    case 4:
                        Contenedor contenedorA = new Contenedor();
                        do {
                            Scanner scA = new Scanner(System.in);
                            System.out.println("------Perfil Administrativo------");

                            System.out.println("Ingrese su nombre");
                            nombreUser = scA.nextLine();
                            while (nombreUser.length() < 3 || nombreUser.length() > 20) {
                                System.out.println("debe ser mayor a 3 y menor a 20");
                                nombreUser = sc.nextLine();
                            }

                            System.out.println("Ingrese su Apellido 1");
                            apellido1User = scA.nextLine();

                            System.out.println("Ingrese su Apellido 2");
                            apellido2User = scA.nextLine();

                            System.out.println("Ingrese su Fecha de nacimiento");
                            fechaNacimientoUser = scA.nextLine();

                            System.out.println("Ingrese su Run");
                            runUser = scA.nextInt();
                            while (runUser > 99999999 || runUser < 1111111) {
                                System.out.println("Favor ingrese un run valido, sin puntos ni guion ni digito verificador");
                                runUser = sc.nextInt();
                            }

                            System.out.println("Ingrese su area");
                            area = scA.next();
                            while (area.length() < 3 || area.length() > 20) {
                                System.out.println("debe ser mayor a 3 y menor a 20");
                                area = sc.nextLine();
                            }

                            System.out.println("Ingrese su Experiencia Previa");
                            experienciaPrevia=scA.next();
                            while (experienciaPrevia.length() > 100) {
                                System.out.println("Por favor, ingrese menos de 100 caracteres");
                                experienciaPrevia = sc.nextLine();
                            }

                            //Instansanciando clases y añadiendo y mostrando datos de la clase Administrativo
                            Administrativo administrativo = new Administrativo(nombreUser,apellido1User,apellido2User,fechaNacimientoUser,runUser,area,experienciaPrevia);
                            contenedorA.almacenarAdministrativo(administrativo);

                            System.out.println("¿Desea Registrar otro Profesional?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            res=sc.nextInt();

                            while (res>2){
                                System.out.println("Por favor ingresar una opcion valida");
                                res=sc.nextInt();
                            }

                        }while (res==1);
                        contenedorA.mostrarAdministrativo();

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

            } while (op > 8);


            //Validaciones sergio
            //Objeto VisitaTerreno

            VisitaEnTerreno visita = new VisitaEnTerreno();


            //llamar rut otra clase?

            //Objeto Capacitacion
            //Capacitacion capaci = new Capacitacion();

            System.out.println("¿Desea Registrar un perfiles?");
            System.out.println("1. Si");
            System.out.println("2. No");
            res=sc.nextInt();
            while (res>2){
                System.out.println("Por favor ingresar una opcion valida");
                res=sc.nextInt();
            }
        }while (res==1);

    }
}