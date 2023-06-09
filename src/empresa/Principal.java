package empresa;

import empresa.entity.*;
import empresa.services.Contenedor;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Contenedor cont = new Contenedor();
        Administrativo user1 = new Administrativo("Cintia", "Muñoz", "Valdés", "19/09/1957", 22000000, "sidu", "5 años");

        //cont.almacenarAdministrativo(new Administrativo("Cintiaaaaaaa", "Muñoz", "Valdés", LocalDate.of(2000, 05, 19), 22000000, "sidu", "5 años") );

        //System.out.println(user1.mostrarEdad());


        //System.out.println(user1.toString());
        user1.analizarUsuario();

        cont.almacenarAdministrativo(user1);//Agregar a la lista


        cont.listarUsuariosPorTipo(user1);

        Capacitacion capa = new Capacitacion();

        capa.setIdentificador(1);
        capa.setDia("Lunes");
        capa.setRutCliente(345345555);
        capa.setLugar("Talcahuano");
        capa.setDuracion("duracion de 12 a 4");
        capa.setCantidadDeAsistentes(10);
        capa.setHora("10:45");

        System.out.println(capa.toString());

        Accidente acc = new Accidente();
        acc.setDiaAcc("10/07/2022");
        /*Scanner sc = new Scanner(System.in);

        int run;
        System.out.println("Ingrese run");
        run = sc.nextInt();

        cont.eliminarUsuario(run);
        System.out.println();

        cont.listarUsuarios();*/

        int opcion = 0;
        while (opcion != 9) {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese el RUN del representante de la empresa (Ejemplo: 12345678-9):");
                    System.out.println("*Este campo es obligatorio");
                    String runCliente = sc.nextLine();
                    while ( !runCliente.matches("[0-9]{7,8}-[0-9kK]")) {
                        System.out.println("RUN incorrecto. Por favor, ingrese un RUN válido (Ejemplo:12345678-9), sin espacios y que no sea mayor a 99999999");
                        runCliente = sc.nextLine();
                    }

                    System.out.println("Ingrese el nombre del representante de la empresa:");
                    System.out.println("*Este campo es obligatorio");
                    String nombreCliente = sc.nextLine();
                    while (nombreCliente.isEmpty() || !nombreCliente.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ]{3,20}")) {
                        System.out.println("Nombre incorrecto. Por favor, ingrese un nombre con mínimo 3 y máximo 20 caracteres. Este campo no puede quedar vacío");
                        nombreCliente= sc.nextLine();
                    }

                    System.out.print("Ingrese el primer apellido del representante de la empresa: ");
                    System.out.println("*Este campo es obligatorio");
                    String apellido1 = sc.nextLine();
                    while (apellido1.isEmpty() || !apellido1.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ]{3,20}")) {
                        System.out.println("Apellido ingresado de forma incorrecta. Por favor, ingrese un apellido válido y no deje este campo vacío");
                        apellido1 = sc.nextLine();
                    }

                    System.out.print("Ingrese el segundo apellido del representante de la empresa: ");
                    System.out.println("*Este campo es obligatorio");
                    String apellido2 = sc.nextLine();
                    while (apellido2.isEmpty() || !apellido2.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ]{3,20}")) {
                        System.out.println("Apellido ingresado de forma incorrecta. Por favor, ingrese un apellido válido y no deje este campo vacío");
                        apellido2 = sc.nextLine();
                    }


                    System.out.println("Ingrese fecha de nacimiento considerando el siguiente formato -> dd/mm/aaaa:");
                    System.out.println("*Este campo es obligatorio");
                    String fechaDeNacimientoCliente = sc.nextLine();
                    while (!fechaDeNacimientoCliente.matches("^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                        System.out.println("Fecha de nacimiento inválida. Por favor, ingrese una fecha válida con el formato dd/mm/aaaa y no deje este campo vacío");
                        fechaDeNacimientoCliente = sc.nextLine();
                    }


                    System.out.print("Ingrese la Razón Social (nombre) de la empresa: ");
                    System.out.println("*Este campo es obligatorio");
                    String razonSocial = sc.nextLine();
                    while (razonSocial.isEmpty() || !razonSocial.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ]{3,20}")) {
                        System.out.println("Razón social. Por favor, ingrese un apellido válido:");
                        razonSocial = sc.nextLine();
                    }

                    System.out.print("Ingrese el giro de la empresa: ");
                    System.out.println("*Este campo es obligatorio");
                    String giroEmpresa = sc.nextLine();
                    while (giroEmpresa.isEmpty() || !giroEmpresa.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ]{3,20}")) {
                        System.out.println("Por favor, ingrese giro válido, máximo 20 caracteres y no deje este campo vacío:");
                        giroEmpresa = sc.nextLine();
                    }

                    while (true) {
                        System.out.print("Ingrese el número de teléfono del representante (formato +569XXXXXXXX): ");
                        System.out.println("*Este campo es obligatorio");
                        String telefonoRepresentante = sc.nextLine();

                        // Validar el número de teléfono con una expresión regular
                        if (telefonoRepresentante.matches("\\+56\\d{9}")) {
                            break;  // Salir del bucle si es válido
                        } else {
                            System.out.println("Número de teléfono ingresado de forma incorrecta. Por favor, ingrese un número de teléfono válido en el formato +569XXXXXXXX.");
                        }
                    }

                    System.out.print("Dirección  de la empresa: ");
                    System.out.println("*Este campo es obligatorio");
                    String direccion = sc.nextLine();
                    while (direccion.isEmpty() || !direccion.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ]{3,20}")) {
                        System.out.println("Por favor, ingrese una dirección válida y no deje este campo vacío:");
                        direccion = sc.nextLine();
                    }

                    System.out.print("Comuna  de la empresa: ");
                    System.out.println("*Este campo es obligatorio");
                    String comuna = sc.nextLine();
                    while (comuna.isEmpty() || !comuna.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ]{3,20}")) {
                        System.out.println("Por favor, ingrese una comuna válida y no deje este campo vacío:");
                        comuna = sc.nextLine();
                    }


                    cont.almacenarCliente(new Cliente());
                    break;
                case 2:
                    System.out.println("Ingrese el RUN del profesional:");
                    int runProfesional = sc.nextInt();
                    System.out.println("Ingrese el nombre del profesional:");
                    String nombreProfesional = sc.next();
                    System.out.println("Ingrese el fecha de Nacimiento:");
                    String fechaDeNacimientoProfesional = sc.next();
                    System.out.println("Ingrese apellido1 del profesional:");
                    String apellido1Profesional = sc.next();
                    System.out.println("Ingrese apellido2 del profesional:");
                    String apellido2Profesional = sc.next();
                    System.out.println("Ingrese titulo del Profesional:");
                    String tituloProfesional = sc.next();
                    System.out.println("Ingrese fecha de ingreso:");
                    String fechaIngreso = sc.next();


                    cont.almacenarProfesional(new Profesional(nombreProfesional, apellido1Profesional, apellido2Profesional, tituloProfesional,runProfesional,fechaIngreso,fechaDeNacimientoProfesional));
                    break;
                case 3:
                    System.out.println("Ingrese el RUN del administrativo:");
                    String runAdministrativo = sc.nextLine();
                    while ( !runAdministrativo.matches("[0-9]{7,8}-[0-9kK]")) {
                        System.out.println("RUN inválido. Por favor, ingrese un RUN válido:");
                        runAdministrativo = sc.nextLine();
                    }

                    System.out.println("Ingrese el nombre del administrativo:");
                    String nombreAdministrativo = sc.nextLine();
                    while (nombreAdministrativo.isEmpty() || nombreAdministrativo.length() < 3 || nombreAdministrativo.length() > 20 || !nombreAdministrativo.matches("[a-zA-Z]+")) {
                        System.out.println("Nombre inválido. Por favor, ingrese un nombre válido:");
                        nombreAdministrativo = sc.nextLine();
                    }


                    System.out.println("Ingrese el apellido1 del administrativo:");
                    String apellido1Administrativo = sc.nextLine();
                    while(apellido1Administrativo.isEmpty() || apellido1Administrativo.length() < 3 || apellido1Administrativo.length() > 20 ||!apellido1Administrativo.matches("[a-zA-Z]+")) {
                        System.out.println("Apellido1 inválido. Por favor, ingrese un apellido1 válido:");
                        apellido1Administrativo = sc.nextLine();
                    }


                    System.out.println("Ingrese apellido2 del administrativo:");
                    String apellido2Administrativo = sc.nextLine();
                    while(apellido2Administrativo.isEmpty() || apellido2Administrativo.length() < 3 || apellido2Administrativo.length() > 20 ||!apellido2Administrativo.matches("[a-zA-Z]+")) {
                        System.out.println("Apellido2 inválido. Por favor, ingrese un apellido2 válido:");
                        apellido2Administrativo = sc.nextLine();
                    }


                    System.out.println("Ingrese fecha de nacimiento (dd/mm/aaaa):");
                    String fechaDeNacimientoAdministrativo = sc.nextLine();
                    while (!fechaDeNacimientoAdministrativo.matches("^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                        System.out.println("Fecha de nacimiento inválida. Por favor, ingrese una fecha válida en el formato dd/mm/aaaa:");
                        fechaDeNacimientoAdministrativo = sc.nextLine();
                    }

                    System.out.println("Ingrese experiencia del administrativo:");
                    String experienciaAdministrativo = sc.nextLine();
                    while (experienciaAdministrativo.isEmpty() || experienciaAdministrativo.length() > 70 || !experienciaAdministrativo.matches("^[a-zA-Z0-9 ]*$")) {
                        System.out.println("Experiencia inválida. Por favor, ingrese una experiencia válida:");
                        experienciaAdministrativo = sc.nextLine();
                    }


                    System.out.println("Ingrese área del administrativo:");
                    String areaAdministrativo = sc.nextLine();
                    while (!areaAdministrativo.matches("^[a-zA-Z ]+$")) {
                        System.out.println("Área inválida. Por favor, ingrese un área válida:");
                        areaAdministrativo = sc.nextLine();
                    }



                    //cont.almacenarAdministrativo(new Administrativo());


                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la capacitación:");
                    String nombreCapacitacion = sc.next();
                    System.out.println("Ingrese el RUN del cliente asociado:");
                    String clienteAsociado = sc.next();
                    //cont.almacenarCapacitacion(new Capacitacion(nombreCapacitacion, clienteAsociado));
                    break;
                case 5:
                    System.out.println("Ingrese el RUN del usuario a eliminar:");
                    int runEliminar = sc.nextInt();
                    cont.eliminarUsuario(runEliminar);
                    break;
                case 6:
                    cont.listarUsuarios();
                    break;
                case 7:
                    System.out.println("Ingrese el tipo de usuario a listar (cliente, profesional o administrativo):");
                    String tipoUsuario = sc.nextLine();
                    /*    IAsesoria usuarioTipo;
                    if (tipoUsuario.equals("cliente")) {
                        usuarioTipo = new Cliente();
                    } else if (tipoUsuario.equals("profesional")) {
                        usuarioTipo = new Profesional();
                    } else if (tipoUsuario.equals("administrativo")) {
                        usuarioTipo = new Administrativo();
                    } else {
                        System.out.println("Tipo de usuario inválido.");
                        return;
                    }

                    cont.listarUsuariosPorTipo(usuarioTipo); */
                    break;
                case 8:
                    cont.listarCapacitaciones();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
            System.out.println();
        }
    }


    private static void mostrarMenu() {


        System.out.println("----- MENÚ -----");
        System.out.println("1. Agregar cliente");
        System.out.println("2. Agregar profesional");
        System.out.println("3. Agregar administrativo");
        System.out.println("4. Agregar capacitación");
        System.out.println("5. Eliminar usuario");
        System.out.println("6. Listar usuarios");
        System.out.println("7. Listar usuarios por tipo");
        System.out.println("8. Listar capacitaciones");
        System.out.println("9. Salir");
        System.out.println("Ingrese una opción: ");
    }
}




