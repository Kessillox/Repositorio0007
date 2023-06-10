import sprintmarines.entity.*;
import sprintmarines.iservices.IAsesoria;
import sprintmarines.services.Contenedor;

import java.util.Scanner;

import static sprintmarines.validaciones.Validaciones.*;


/**
 * Esta es la clase Main donde se crea una instancia de la clase Contenedor
 * Se crea un menú con 9 opciones para que interactúe el usuario, incluyendo
 * una opción para salir del programa, finalizando el mismo.
 *
 * @author Leadro Villalba
 * @author Luis Zambrano
 * @author Gustavo Vargas
 * @author Cristian Trureo
 * @version 1.2
 */

public class Main {

    public static Usuario almacenarUsuario(Scanner entrada) {
        String nombreUsuario;
        String apellido1Usuario;
        String apellido2Usuario;
        String fechaDeNacimientoUsuario;
        int runUsuario;

        do {
            System.out.println("Ingresa el nombre: (mínimo 3 caracteres y máximo 50)");
            nombreUsuario = entrada.nextLine();
        } while (esSoloLetras(nombreUsuario) || validarLargoString(nombreUsuario, 2, 30, "Nombre de usuario"));

        do {
            System.out.println("Ingresa el primer apellido:");
            apellido1Usuario = entrada.nextLine();
        } while (esSoloLetras(apellido1Usuario) || validarLargoString(apellido1Usuario, 2, 30, "Primer apellido"));

        do {
            System.out.println("Ingresa el segundo apellido:");
            apellido2Usuario = entrada.nextLine();
        } while (esSoloLetras(apellido2Usuario) || validarLargoString(apellido2Usuario, 2, 30, "Segundo apellido"));

        do {
            System.out.println("Ingresa la fecha de nacimiento:");
            fechaDeNacimientoUsuario = entrada.nextLine();
        } while (!validarFecha(fechaDeNacimientoUsuario));

        do {
            System.out.println("Ingresa el RUN sin punto ni guion");

            while (!entrada.hasNextInt()) {
                System.out.println("RUT Cliente ingresado incorrectamente. Por favor, ingrese solo números.");
                entrada.next(); // Leer y descartar el token no válido
            }
            runUsuario = entrada.nextInt();
            entrada.nextLine(); // Consumir el carácter de nueva línea pendiente
        } while (!validarRunUser(runUsuario));

        return new Usuario(nombreUsuario, apellido1Usuario, apellido2Usuario, fechaDeNacimientoUsuario, runUsuario);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String tituloMenu = "";
        int opcion = 0;

        // Variables de Usuario
        String nombreUsuario = "";
        String apellido1Usuario = "";
        String apellido2Usuario = "";
        String fechaDeNacimientoUsuario = "";
        Integer runUsuario = 0;

        // Variables de Cliente
        String nombreEmpresa;
        String giroEmpresa;
        int rut;
        String telefonoRepresentante;
        String direccionEmpresa;
        String comunaEmpresa;

        //Variables de Profesional
        String titulo;
        String fechaDeIngreso;

        //Variables de Administrativo
        String area;
        String experienciaPrevia;

        // Variables de Accidente
        int idAccidente = 0;
        String dia, hora, lugar, origen, consecuencias;

        // Variables de Capacitación
        Integer idCapacitacion = 0;
        Integer rutEmpresaCapacitacion = 0;
        String diaCapacitacion = "";
        String horaCapacitacion = "";
        String lugarCapacitacion = "";
        Integer duracionCapacitacion = 0;
        Integer cantidadAsistentesCapacitacion = 0;

        // CONTENEDOR
        Contenedor contenedor = new Contenedor();

        // USUARIOS DE PRUEBA
        Cliente cliente1 = new Cliente("Pelayo", "Fernandez", "Torrealba", "12/12/1990", 11111111, "Fundimax", "Fundidora", 99999999, "9845615498", "Lejos 124", "Los Alpes");
        Cliente cliente2 = new Cliente("Cristian", "Trureo", "Trureo", "11/11/1991", 22222221, "Awakelab", "Capacitaciones IT", 55555555, "123123123123", "Lejos 777", "Los Alpes");
        Administrativo administrativo1 = new Administrativo("Ana", "Pavés", "Gonzalez", "25-10-1985", 13562485, "RRHH", "2");
        Administrativo administrativo2 = new Administrativo("Marie", "SAnchez", "Villaba", "05-12-1987", 87562451, "Marketing", "5");
        Administrativo administrativo3 = new Administrativo("Santiago", "Carter", "Monroy", "24-01-2985", 99856241, "Finanzas", "3");
        Profesional profesional1 = new Profesional("Luis", "Zambrano", "Zambrano", "06-06-2023", 18685019, "Analista Programador", "06-06-2023");
        Profesional profesional2 = new Profesional("Livio", "Gut", "Guti", "10-10-2023", 33333333, "Ingeniero Físico Termonuclear", "10-12-2023");
        Profesional profesional3 = new Profesional("Brocacochi", "Chespi", "Rito", "10-10-1990", 45263525, "Informatico", "10-12-2023");
        contenedor.almacenarCliente(cliente1);
        contenedor.almacenarCliente(cliente2);
        contenedor.almacenarCliente(administrativo1);
        contenedor.almacenarCliente(administrativo2);
        contenedor.almacenarCliente(administrativo3);
        contenedor.almacenarCliente(profesional1);
        contenedor.almacenarCliente(profesional2);
        contenedor.almacenarCliente(profesional3);

        //CAPACITACIONES DE PRUEBA
        Capacitacion capacitacion2 = new Capacitacion(2, 18689499, "27", "13:00", "ConCon", 4, 16);
        Capacitacion capacitacion3 = new Capacitacion(3, 16845289, "15", "12:00", "Concepción", 5, 14);
        Capacitacion capacitacion4 = new Capacitacion(4, 64854238, "12", "14:00", "Cohigueco", 7, 15);
        Capacitacion capacitacion5 = new Capacitacion(5, 78941236, "5", "15:00", "Berlin", 8, 12);
        contenedor.almacenarCapacitacion(capacitacion2);
        contenedor.almacenarCapacitacion(capacitacion3);
        contenedor.almacenarCapacitacion(capacitacion4);
        contenedor.almacenarCapacitacion(capacitacion5);

        while (opcion != 9) {
            System.out.println("\n Bienvenido a Sprint Modulo 4 Programación en Java!");
            System.out.println("-------------------------------------------------------");
            System.out.println("Que operación deseas realizar? (Debes pulsar un número)");
            System.out.println("(1) Almacenar cliente");
            System.out.println("(2) Almacenar profesional");
            System.out.println("(3) Almacenar administrativo");
            System.out.println("(4) Almacenar capacitación");
            System.out.println("(5) Eliminar usuario");
            System.out.println("(6) Listar usuarios");
            System.out.println("(7) Listar usuarios por tipo");
            System.out.println("(8) Listar capacitaciones");
            System.out.println("(9) Salir");
            System.out.println("Selecciona una opción:");

            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1:   // Cliente
                        System.out.println("Bienvenido al registro de Clientes");
                        Usuario usuarioCliente = almacenarUsuario(entrada);

                        do {
                            System.out.println("Ingrese el nombre de la empresa");
                            nombreEmpresa = entrada.nextLine();
                        } while (esSoloLetras(nombreEmpresa) || validarLargoString(nombreEmpresa, 2, 30, "Nombre de Empresa"));

                        do {
                            System.out.println("Ingrese giro de la empresa");
                            giroEmpresa = entrada.nextLine();
                        } while (esSoloLetras(giroEmpresa) || validarLargoString(giroEmpresa, 2, 30, "Giro de Empresa"));

                        do {
                            System.out.println("Ingrese el RUT de la empresa");

                            while (!entrada.hasNextInt()) {
                                System.out.println("RUT de la empresa ingresado incorrectamente. Por favor, ingrese solo números.");
                                entrada.next(); // Leer y descartar el token no válido
                            }
                            rut = entrada.nextInt();
                        } while (!validarRut(rut));

                        do {
                            System.out.println("Ingrese el telefono de la empresa");
                            telefonoRepresentante = entrada.next();
                            entrada.nextLine();
                        } while (!esStringObligatorio(telefonoRepresentante));

                        do {
                            System.out.println("Ingrese la dirección de la empresa");
                            direccionEmpresa = entrada.nextLine();
                        } while (validarLargoString(direccionEmpresa, 5, 70, "Dirección"));

                        do {
                            System.out.println("Ingrese la comuna de la empresa");
                            comunaEmpresa = entrada.nextLine();
                        } while (validarLargoString(comunaEmpresa, 2, 50, "Comuna"));

                        Cliente clienteEjemplo = new Cliente(usuarioCliente.getNombre(), usuarioCliente.getApellido1(), usuarioCliente.getApellido2(), usuarioCliente.getFechaDeNacimiento(), usuarioCliente.getRun(), nombreEmpresa, giroEmpresa, rut, telefonoRepresentante, direccionEmpresa, comunaEmpresa);

                        clienteEjemplo.analizarUsuario();
                        contenedor.almacenarCliente(clienteEjemplo);
                        System.out.println("");

                        break;

                    case 2:  // Profesional
                        System.out.println("Bienvenido al registro de Profesionales");
                        Usuario usuarioProfesional = almacenarUsuario(entrada);

                        do {
                            System.out.println("Ingrese título del profesional");
                            titulo = entrada.nextLine();
                        } while (validarLargoString(titulo, 5, 50, "Título"));
                        do {
                            System.out.println("Ingresa la fecha de ingreso:");
                            fechaDeIngreso = entrada.nextLine();
                        } while (!validarFecha(fechaDeIngreso));

                        Profesional profesionalEjemplo = new Profesional(usuarioProfesional.getNombre(), usuarioProfesional.getApellido1(), usuarioProfesional.getApellido2(), usuarioProfesional.getFechaDeNacimiento(), usuarioProfesional.getRun(), titulo, fechaDeIngreso);
                        contenedor.almacenarProfesional(profesionalEjemplo);

                        System.out.println("");

                        break;

                    case 3:   // Administrativo
                        System.out.println("Bienvenido al registro de Administrativo");
                        Usuario usuarioAdministrativo = almacenarUsuario(entrada);

                        do {
                            System.out.println("Ingrese area de administración");
                            area = entrada.nextLine();
                        } while (validarLargoString(area, 5, 20, "Area"));
                        do {
                            System.out.println("Ingrese experiencia previa");
                            experienciaPrevia = entrada.nextLine();
                        } while (validarLargoString(experienciaPrevia, 0, 100, "Experiencia"));

                        Administrativo administrativoEjemplo = new Administrativo(usuarioAdministrativo.getNombre(), usuarioAdministrativo.getApellido1(), usuarioAdministrativo.getApellido2(), usuarioAdministrativo.getFechaDeNacimiento(), usuarioAdministrativo.getRun(), area, experienciaPrevia);
                        contenedor.almacenarAdministrativo(administrativoEjemplo);

                        System.out.println("");


                        break;

                    case 4: // Capacitacion
                        System.out.println("Bienvenido a el Registro de Capacitación");
                        do {
                            System.out.println("Ingrese el ID de Capacitación");
                            while (!entrada.hasNextInt()) {
                                System.out.println("Ingrese un valor numérico válido.");
                                entrada.next(); // Descartar el valor no numérico
                            }
                            idCapacitacion = entrada.nextInt();
                        } while (validarId(idCapacitacion));

                        do {
                            System.out.println("Ingrese el RUT de la empresa");

                            while (!entrada.hasNextInt()) {
                                System.out.println("RUT de la empresa ingresado incorrectamente. Por favor, ingrese solo números.");
                                entrada.next(); // Leer y descartar el token no válido
                            }
                            rutEmpresaCapacitacion = entrada.nextInt();
                        } while (!validarRut(rutEmpresaCapacitacion));

                        do {
                            System.out.println("Ingrese el día de la semana en el que se va a realizar la capacitación");
                            diaCapacitacion = entrada.next();
                            entrada.nextLine();
                        } while (!validarDia(diaCapacitacion));

                        do {
                            System.out.println("Ingrese la hora en la que se va a realizar la capacitación");
                            horaCapacitacion = entrada.nextLine();
                        } while (!validarHora(horaCapacitacion));

                        do {
                            System.out.println("Ingresa el lugar donde se va a realizar al capacitación");
                            lugarCapacitacion = entrada.nextLine();
                        } while (validarLargoString(lugarCapacitacion, 2, 50, "Lugar "));

                        do {
                            System.out.println("Ingresa la duración de la capacitación (en minutos)");
                            if (entrada.hasNextInt()) {
                                duracionCapacitacion = entrada.nextInt();
                                entrada.nextLine(); // Consumir el salto de línea pendiente
                            } else {
                                System.out.println("Duración no válida. Ingrese un número.");
                                entrada.next(); // Descartar el token no válido
                                continue; // Volver al inicio del bucle
                            }
                        } while (!validarDuracion(duracionCapacitacion));

                        do {
                            System.out.println("Ingresa la cantidad de asistentes");
                            if (entrada.hasNextInt()) {
                                cantidadAsistentesCapacitacion = entrada.nextInt();
                                entrada.nextLine(); // Consumir el salto de línea pendiente
                            } else {
                                System.out.println("Cantidad de asistentes no válida. Ingrese un número.");
                                entrada.next(); // Descartar el token no válido
                                continue; // Volver al inicio del bucle
                            }
                        } while (!validarCantidadAsistentes(cantidadAsistentesCapacitacion));

                        Capacitacion capacitacion = new Capacitacion(idCapacitacion, rutEmpresaCapacitacion, diaCapacitacion, horaCapacitacion, lugarCapacitacion, duracionCapacitacion, cantidadAsistentesCapacitacion);
                        contenedor.almacenarCapacitacion(capacitacion);

                        System.out.println("*************************************************************************");
                        System.out.println(capacitacion.mostrarDetalle());
                        System.out.println("*************************************************************************");
                        break;

                    case 5:   // Eliminar usuario
                        System.out.println("Revise los usuarios registrados:\n");
                        contenedor.listarUsuarios();

                        System.out.println("\nIngrese el RUN del usuario que desea eliminar:");
                        int run = entrada.nextInt();
                        contenedor.eliminarUsuario(run);
                        break;

                    case 6: // Listar Usuarios: se llama al método listarUsuarios() de la Clase Contenedor
                        System.out.println("Los usuarios ingresados son:\n");
                        contenedor.listarUsuarios();
                        do {
                            System.out.println("\nPresione ENTER para continuar...");
                        } while (!(entrada.nextLine().isEmpty()));
                        break;

                    case 7:   // Listar usuarios por Tipo
                        System.out.println("Ingrese el numero del tipo de usuario a listar (1: Cliente, 2: Profesional, 3: Administrativo):");
                        String tipoUsuario = entrada.nextLine();

                        // Convertir el tipo de usuario ingresado a un objeto Class
                        Class<? extends IAsesoria> tipo = null;
                        switch (tipoUsuario) {
                            case "1":
                                tipo = Cliente.class;
                                break;
                            case "2":
                                tipo = Profesional.class;
                                break;
                            case "3":
                                tipo = Administrativo.class;
                                break;
                            default:
                                System.out.println("Tipo de usuario no válido");
                                break;
                        }
                        contenedor.listarUsuariosPorTipo(tipo);
                        do {
                            System.out.println("\nPresione ENTER para continuar...");
                        } while (!(entrada.nextLine().isEmpty()));
                        break;

                    case 8: // Listar capacitaciones
                        System.out.println("Las capacitaciones ingresadas son:\n");
                        contenedor.listarCapacitaciones();
                        do {
                            System.out.println("\nPresione ENTER para continuar...");
                        } while (!(entrada.nextLine().isEmpty()));
                        break;

                    case 9: // Salir del programa
                        System.out.println("¡Gracias por usar nuestra aplicación, queremos un 7!");
                        break;

                    default:
                        System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                        break;
                }
            } else {
                System.out.println("Selecciona una opción válida.");
                entrada.nextLine();
            }

        }

    }

}

