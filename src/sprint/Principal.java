package sprint;

//agregar el JavaDoc


import sprint.entity.Usuario;

import sprint.entity.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VisitaEnTerreno visitaTe = new VisitaEnTerreno();
        Contenedor contenedor = new Contenedor();

        //VARIABLES Usuarios
        String nombreUser = "";
        String apellido1User = "";
        String apellido2User = "";

        String fechaNacimientoUser = "";
        int runUser = 0;

        //VARIABLES cliente
        String nombreEmpresa = "";
        String giroEmpresa = "";
        int rut = 0;
        String tlfRepresentante = "";
        String direccionEmpresa = "";
        String comunaEmpresa = "";
        Cliente cliente = new Cliente(nombreUser,apellido1User,apellido2User,fechaNacimientoUser,runUser,nombreEmpresa,giroEmpresa,rut,tlfRepresentante,direccionEmpresa,comunaEmpresa);


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
            System.out.println("1 > Cliente");
            System.out.println("2 > Profesional");
            System.out.println("3 > Administrativo");
            System.out.println("4 > Capacitación");
            System.out.println("5 > Listar Usuarios");
            System.out.println("6 > Listar Usuario por tipo");
            System.out.println("7 > Eliminar Usuario");
            System.out.println("8 > Salir");


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
                        System.out.println("------Perfil Cliente------");
                        System.out.println("favor ingrese un nombre entre 3 y 20 caracteres.");
                        nombreUser = sc.nextLine();

                        while (nombreUser.length() < 3 || nombreUser.length() > 20) {
                            System.out.println("debe ser mayor a 3 y menor a 20");
                            nombreUser = sc.nextLine();
                        }

                        System.out.println("Ingrese su Apellido 1");
                        apellido1User = sc.nextLine();

                        System.out.println("Ingrese su Apellido 2");
                        apellido2User = sc.nextLine();

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

                        contenedor.almacenarUsuarios(cliente);
                        contenedor.alamacenaCliente(cliente);


                        break;
                    case 2:
                        do {
                            System.out.println("------Perfil Profesional------");

                            System.out.println("Ingrese su nombre");
                            nombreUser = sc.nextLine();
                            while (nombreUser.length() < 3 || nombreUser.length() > 20) {
                                System.out.println("debe ser mayor a 3 caracteres y menor a 20 caracteres");
                                nombreUser = sc.nextLine();
                            }

                            System.out.println("Ingrese su Apellido 1");
                            apellido1User = sc.nextLine();
                            while (apellido1User.length() < 3 || apellido1User.length() > 20) {
                                System.out.println("debe ser mayor a 3 caracteres y menor a 20 caracteres");
                                apellido1User = sc.nextLine();
                            }

                            System.out.println("Ingrese su Apellido 2");
                            apellido2User = sc.nextLine();
                            while (apellido2User.length() < 3 || apellido2User.length() > 20) {
                                System.out.println("debe ser mayor a 3 caracteres y menor a 20 caracteres");
                                apellido2User = sc.nextLine();
                            }

                            System.out.println("Ingrese su Fecha de nacimiento");
                            fechaNacimientoUser = sc.nextLine();

                            System.out.println("Ingrese su Run");
                            runUser = sc.nextInt();
                            while (runUser > 99999999 || runUser < 1111111) {
                                System.out.println("Favor ingrese un run valido, sin puntos ni guion ni digito verificador");
                                runUser = sc.nextInt();
                            }

                            System.out.println("Ingrese su Titulo");
                            titulo = sc.next();
                            while (titulo.length() < 3 || titulo.length() > 50) {
                                System.out.println("debe ser mayor a 3 caracteres y menor a 20 caracteres");
                                titulo = sc.nextLine();
                            }
                            System.out.println("Ingrese su Fecha de Ingreso");//Falta la validacion y que lo entrege en formato DD/MM/AAAA
                            fechaIngreso = sc.next();

                            //Instanciando una clase y pasando parametros
                            Profesional profesional = new Profesional(nombreUser, apellido1User, apellido2User, fechaNacimientoUser, runUser, titulo, fechaIngreso);
                            //almacenando profecional
                            contenedor.almacenarProfesional(profesional);

                            System.out.println("¿Desea Registrar otro Profesional?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            res=sc.nextInt();

                            while (res>2){
                                System.out.println("Por favor ingresar una opcion valida");
                                res=sc.nextInt();
                            }
                        }while (res==1);
                        break;
                    case 3:
                        do {
                            System.out.println("------Perfil Administrativo------");

                            System.out.println("Ingrese su nombre");
                            nombreUser = sc.nextLine();
                            while (nombreUser.length() < 3 || nombreUser.length() > 20) {
                                System.out.println("debe ser mayor a 3 caracteres y menor a 20 caracteres");
                                nombreUser = sc.nextLine();
                            }

                            System.out.println("Ingrese su Apellido 1");
                            apellido1User = sc.nextLine();
                            while (apellido1User.length() < 3 || apellido1User.length() > 20) {
                                System.out.println("debe ser mayor a 3 caracteres y menor a 20 caracteres");
                                apellido1User = sc.nextLine();
                            }

                            System.out.println("Ingrese su Apellido 2");
                            apellido2User = sc.nextLine();
                            while (apellido2User.length() < 3 || apellido2User.length() > 20) {
                                System.out.println("debe ser mayor a 3 caracteres y menor a 20 caracteres");
                                apellido2User = sc.nextLine();
                            }

                            System.out.println("Ingrese su Fecha de nacimiento");
                            fechaNacimientoUser = sc.nextLine();
                            while (fechaNacimientoUser.length() < 3 || fechaNacimientoUser.length() > 20) {
                                System.out.println("debe ser mayor a 3 caracteres y menor a 20 caracteres");
                                fechaNacimientoUser = sc.nextLine();
                            }

                            System.out.println("Ingrese su Run");
                            runUser = sc.nextInt();
                            while (runUser > 99999999 || runUser < 1111111) {
                                System.out.println("Favor ingrese un run valido, sin puntos ni guion ni digito verificador");
                                runUser = sc.nextInt();
                            }

                            System.out.println("Ingrese su area");
                            area = sc.next();
                            while (area.length() < 3 || area.length() > 20) {
                                System.out.println("debe ser mayor a 3 caracteres y menor a 20 caracteres");
                                area = sc.nextLine();
                            }

                            System.out.println("Ingrese su Experiencia Previa");
                            experienciaPrevia=sc.next();
                            while (experienciaPrevia.length() > 100) {
                                System.out.println("Por favor, ingrese menos de 100 caracteres");
                                experienciaPrevia = sc.nextLine();
                            }

                            //Instansanciando clases y añadiendo y mostrando datos de la clase Administrativo
                            Administrativo administrativo = new Administrativo(nombreUser,apellido1User,apellido2User,fechaNacimientoUser,runUser,area,experienciaPrevia);
                            contenedor.almacenarAdministrativo(administrativo);

                            System.out.println("¿Desea Registrar otro Profesional?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            res=sc.nextInt();

                            while (res>2){
                                System.out.println("Por favor ingresar una opcion valida");
                                res=sc.nextInt();
                            }

                        }while (res==1);
                        break;
                    case 4:
                        System.out.println("------Capacitación------");

                        Capacitacion capaci = new Capacitacion();
                        //------------------------------------------------------------------ LISTO

                        System.out.println("Su rut de empresa: " + cliente.getRut());
                        //------------------------------------------------------------------ LISTO

                        System.out.println("Ingrese ID capacitacion (solo numeros enteros de 0 a 9999 ): ");
                        capaci.setId(sc.nextInt());

                        //------------------------------------------------------------------


                        while (capaci.getId() < 0) {
                            System.out.println("Ingrese un numero entero igual o mayor a 0");

                            capaci.setId(sc.nextInt());
                            System.out.println("Su cantidad es: " + capaci.getId()); //cambiar de posicion

                        }
                        System.out.println(capaci.getId()); sc.nextLine();


                        //------------------------------------------------------------------ LISTO--
                        boolean diaValido = false;
                        while (!diaValido) {
                            System.out.println("Ingrese día de capacitación");
                            capaci.setDia(sc.nextLine());

                            //if (capaci.getDia().equalsIgnoreCase("lunes") || capaci.getDia().equalsIgnoreCase("martes"))
                            if (capaci.getDia().equalsIgnoreCase("lunes") || capaci.getDia().equalsIgnoreCase("martes") ||
                                    capaci.getDia().equalsIgnoreCase("miercoles") ||capaci.getDia().equalsIgnoreCase("jueves") ||
                                    capaci.getDia().equalsIgnoreCase("viernes") ||capaci.getDia().equalsIgnoreCase("sabado") ||
                                    capaci.getDia().equalsIgnoreCase("domingo")) {
                                //capaci.setDia(sc.nextLine());
                                //sc.nextLine();
                                diaValido = true;
                                System.out.println("Su dia de capacitacion es: " + capaci.getDia());


                            } else {
                                System.out.println("Ingrese un dia de lunes a domingo");
                            }
                        }

                       //------------------------------------------------------------------ LISTO
                        System.out.println("Ingrese hora de capacitacion (ej: 20:00 | HH:MM)");
                        String horaMinutos = sc.next();
                        capaci.setHora(horaMinutos);

                        String[] HoraMinArray = horaMinutos.split(":");

                        //parseInt == chequea el primer argumento str y devuelve int en la ubicacion pedida
                        int valorHora = Integer.parseInt(HoraMinArray[0]); //Es la hora
                        int valorMinuto = Integer.parseInt(HoraMinArray[1]); // Son los minutos


                        System.out.println("Su hora de capactitacion es: " + capaci.getHora());
                        System.out.println("Aca arriba debe salir el llmado");

                        //------------------------------------------------------------------LISTO
                        System.out.println("Ingrese lugar de capacitacion");
                        capaci.setLugar(sc.nextLine());
                        //Lugar: obligatorio, mínimo 10 caracteres, máximo 50

                        while (capaci.getLugar().length() < 10 || capaci.getLugar().length() > 50) {
                            System.out.println("Ingrese minimo 10 y maximo 10 caracteres ");
                            capaci.setLugar(sc.nextLine());
                        }

                        System.out.println("Su lugar es: " + capaci.getLugar());

                        //------------------------------------------------------------------ LISTO
                        System.out.println("Ingrese duracion en horas(numero entero)de capacitacion");
                        capaci.setHora(sc.nextLine());

                        while (capaci.getLugar().length() < 1 || capaci.getLugar().length() > 70) {
                            System.out.println("Ingrese minimo 10 y maximo 10 caracteres ");
                            capaci.setHora(sc.nextLine());
                        }
                        System.out.println(capaci.getHora() + "horas");

                        //------------------------------------------------------------------ LISTO
                        System.out.println("Ingrese cantidad de asistente a la capacitacion");
                        capaci.setCantidadAsistente(sc.nextInt());

                        while (capaci.getCantidadAsistente() < 0 || capaci.getCantidadAsistente() > 70) {
                            System.out.println("Ingrese una cantidad entre 0 y 100 asistenes ");
                            capaci.getCantidadAsistente();
                        }
                        System.out.println("La cantidad de asistentes es: " + capaci.getCantidadAsistente());
                        //------------------------------------------------------------------


                        break;
                    case 5:
                        System.out.println("------Listar Usuarios------");

                        break;
                    case 6:
                        System.out.println("------Listar Usuario por tipo------");
                        System.out.println("------tipo de Usuario------");
                        System.out.println("1 > Cliente");
                        System.out.println("2 > Profesional");
                        System.out.println("3 > Administrativo");
                        op=sc.nextInt();

                        switch (op){
                            case 1:
                                System.out.println("------Cliente------");

                                break;
                            case 2:
                                System.out.println("------Profesional------");
                                contenedor.mostrarProfesional();
                                break;
                            case 3:
                                System.out.println("------Administrativo------");
                                contenedor.mostrarAdministrativo();
                                break;
                        }


                        break;
                    case 7:
                        System.out.println("------Eliminar Usuario------");

                        break;
                    case 8:
                        System.out.println("------Salir------");

                        break;
                }

            } while (op > 8);


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