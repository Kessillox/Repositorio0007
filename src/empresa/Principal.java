package empresa;

import empresa.entity.*;
import empresa.services.Contenedor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Clase Principal dónde se ejecuta el proyecto, contiene el menú y métodos para validar datos
 * @author Oscar Fernandez,Cintia Muñoz, Joaquin Baeza, Hans Schiess
 * @version 1.2
 *
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        //Instancias de la clase Scanner y la clase Contenedor
        Scanner sc = new Scanner(System.in);
        Contenedor cont = new Contenedor();

/**
 * Inicio del menú que contiene 9 opciones
 *las cuales incluyen agregar, eliminar y listar los datos de usuarios y capacitaciones ingresados
 */
        int opcion = 0;
        while (opcion != 9) {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    /**
                     * Validaciones de la clase Cliente
                     */
                    //Validar RUN del representante de la empresa
                    System.out.println("Ingrese el RUN del representante de la empresa (Ejemplo: 12345678-9):");
                    System.out.println("*Este campo es obligatorio");
                    String runCliente = sc.nextLine();
                    while (!runCliente.matches("[0-9]{7,8}-[0-9kK]")) {
                        System.out.println("RUN incorrecto. Por favor, ingrese un RUN válido (Ejemplo:12345678-9), sin espacios y que no sea mayor a 99999999");
                        runCliente = sc.nextLine();
                    }

                    //Validar nombre del representante de la empresa
                    System.out.println("Ingrese el nombre del representante de la empresa (entre 3 y 20 caracteres):");
                    System.out.println("*Este campo es obligatorio");
                    String nombreCliente = sc.nextLine();
                    while (nombreCliente.isEmpty() || !nombreCliente.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{3,20}")) {
                        System.out.println("Nombre incorrecto. Por favor, ingrese un nombre con mínimo 3 y máximo 20 caracteres. Este campo no puede quedar vacío");
                        nombreCliente = sc.nextLine();
                    }

                    //Validar primer apellido del representante de la empresa
                    System.out.print("Ingrese el primer apellido del representante de la empresa (entre 3 y 20 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String apellido1 = sc.nextLine();
                    while (apellido1.isEmpty() || !apellido1.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{3,20}")) {
                        System.out.println("Apellido ingresado de forma incorrecta. Por favor, ingrese un apellido válido (entre 3 y 20 caracteres) y no deje este campo vacío");
                        apellido1 = sc.nextLine();
                    }

                    //Validar segundo apellido del representante de la empresa
                    System.out.print("Ingrese el segundo apellido del representante de la empresa (entre 3 y 20 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String apellido2 = sc.nextLine();
                    while (apellido2.isEmpty() || !apellido2.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{3,20}")) {
                        System.out.println("Apellido ingresado de forma incorrecta. Por favor, ingrese un apellido válido (entre 3 y 20 caracteres) y no deje este campo vacío");
                        apellido2 = sc.nextLine();
                    }

                    //Validar fecha de nacimiento del representante de la empresa
                    System.out.println("Ingrese fecha de nacimiento considerando el siguiente formato -> dd/mm/aaaa:");
                    System.out.println("*Este campo es obligatorio");
                    String fechaDeNacimientoCliente = sc.nextLine();
                    while (!fechaDeNacimientoCliente.matches("^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                        System.out.println("Fecha de nacimiento inválida. Por favor, ingrese una fecha válida con el formato dd/mm/aaaa y no deje este campo vacío");
                        fechaDeNacimientoCliente = sc.nextLine();
                    }

                    //Nombre de la empresa
                    System.out.print("Ingrese la Razón Social (nombre) de la empresa (entre 3 y 20 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String razonSocial = sc.nextLine();
                    while (razonSocial.isEmpty() || !razonSocial.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{3,20}")) {
                        System.out.println("Razón social mal ingresada o campo vacío. Por favor, vuelva a ingresala (entre 3 y 20 caracteres):");
                        razonSocial = sc.nextLine();
                    }

                    //Giro de la empresa
                    System.out.print("Ingrese el giro de la empresa (entre 3 y 20 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String giroEmpresa = sc.nextLine();
                    while (giroEmpresa.isEmpty() || !giroEmpresa.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{3,20}")) {
                        System.out.println("Por favor, ingrese giro válido, (entre 3 y 20 caracteres) y no deje este campo vacío:");
                        giroEmpresa = sc.nextLine();
                    }

                    //RUT de la empresa
                    System.out.println("Ingrese el RUT de la empresa (Ejemplo: 72345678-9):");
                    System.out.println("*Este campo es obligatorio");
                    String rutEmpresa = sc.nextLine();
                    while (!rutEmpresa.matches("[0-9]{7,8}-[0-9kK]")) {
                        System.out.println("RUN incorrecto. Por favor, ingrese un RUN válido (Ejemplo:12345678-9), sin espacios y que no sea mayor a 99999999");
                        rutEmpresa = sc.nextLine();
                    }

                    //Teléfono del representante de la empresa
                    System.out.print("Ingrese el número de teléfono del representante (formato +569XXXXXXXX): ");
                    System.out.println("*Este campo es obligatorio");
                    String telefonoRepresentante = sc.nextLine();
                    while (true) {
                        // Validar el número de teléfono con una expresión regular
                        if (telefonoRepresentante.matches("\\+56\\d{9}")) {
                            break;  // Salir del bucle si es válido
                        } else {
                            System.out.println("Número de teléfono ingresado de forma incorrecta. Por favor, ingrese un número de teléfono válido en el formato +569XXXXXXXX.");
                        }
                    }

                    //Dirección de la empresa
                    System.out.print("Dirección  de la empresa (máximo 70 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String direccion = sc.nextLine();
                    while (direccion.isEmpty() || !direccion.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{1,70}")) {
                        System.out.println("Por favor, ingrese una dirección válida (máximo 70 caracteres) y no deje este campo vacío:");
                        direccion = sc.nextLine();
                    }

                    //Comuna de la empresa
                    System.out.print("Comuna  de la empresa (máximo 50 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String comuna = sc.nextLine();
                    while (comuna.isEmpty() || !comuna.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{1,50}")) {
                        System.out.println("Por favor, ingrese una comuna válida (máximo 50 caracteres) y no deje este campo vacío:");
                        comuna = sc.nextLine();
                    }

                    //Se agregan los datos validados al Contenedor con el método almacenarClientes
                    cont.almacenarCliente(new Cliente(nombreCliente, apellido1, apellido2, fechaDeNacimientoCliente, runCliente, razonSocial, giroEmpresa, rutEmpresa, telefonoRepresentante, direccion, comuna));
                    break;

                case 2:
                    /**
                     * Validación de datos del profesional
                     */
                    //RUN profesional
                    System.out.println("Ingrese el RUN del profesional (Ejemplo: 12345678-9):");
                    System.out.println("*Este campo es obligatorio");
                    String runProfesional = sc.nextLine();
                    while (!runProfesional.matches("[0-9]{7,8}-[0-9kK]")) {
                        System.out.println("RUN incorrecto. Por favor, ingrese un RUN válido (Ejemplo:12345678-9), sin espacios y que no sea mayor a 99999999");
                        runProfesional = sc.nextLine();
                    }

                    //Nombre del profesional
                    System.out.println("Ingrese el nombre del profesional (entre 3 y 20 caracteres):");
                    System.out.println("*Este campo es obligatorio");
                    String nombreProfesional = sc.nextLine();
                    while (nombreProfesional.isEmpty() || !nombreProfesional.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{3,20}")) {
                        System.out.println("Nombre incorrecto. Por favor, ingrese un nombre con mínimo 3 y máximo 20 caracteres. Este campo no puede quedar vacío");
                        nombreProfesional = sc.nextLine();
                    }

                    //Primer apellido del profesional
                    System.out.print("Ingrese el primer apellido del profesional (entre 3 y 20 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String apellido1Prof = sc.nextLine();
                    while (apellido1Prof.isEmpty() || !apellido1Prof.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{3,20}")) {
                        System.out.println("Apellido ingresado de forma incorrecta. Por favor, ingrese un apellido válido (entre 3 y 20 caracteres) y no deje este campo vacío");
                        apellido1Prof = sc.nextLine();
                    }

                    //Segundo apellido del profesional
                    System.out.print("Ingrese el segundo apellido del profesional (entre 3 y 20 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String apellido2Prof = sc.nextLine();
                    while (apellido2Prof.isEmpty() || !apellido2Prof.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{3,20}")) {
                        System.out.println("Apellido ingresado de forma incorrecta. Por favor, ingrese un apellido válido (entre 3 y 20 caracteres) y no deje este campo vacío");
                        apellido2Prof = sc.nextLine();
                    }

                    //Fecha de nacimiento del profesional
                    System.out.println("Ingrese fecha de nacimiento considerando el siguiente formato -> dd/mm/aaaa:");
                    System.out.println("*Este campo es obligatorio");
                    String fechaDeNacimientoProfesional = sc.nextLine();
                    while (!fechaDeNacimientoProfesional.matches("^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                        System.out.println("Fecha de nacimiento inválida. Por favor, ingrese una fecha válida con el formato dd/mm/aaaa y no deje este campo vacío");
                        fechaDeNacimientoProfesional = sc.nextLine();
                    }

                    //Título profesional
                    System.out.print("Ingrese el título del profesional (min 10 y max 50 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String titulo = sc.nextLine();
                    while (titulo.isEmpty() || !titulo.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{10,50}")) {
                        System.out.println("Título ingresado de forma incorrecta. Por favor, ingrese un título válido (entre 10 y 50 caracteres) y no deje este campo vacío");
                        titulo = sc.nextLine();
                    }

                    //Fecha de ingreso a la institución
                    System.out.println("Ingrese fecha de ingreso a la institución considerando el siguiente formato -> dd/mm/aaaa:");
                    System.out.println("*Este campo es obligatorio");
                    String fechaIngreso = sc.nextLine();
                    while (!fechaIngreso.matches("^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                        System.out.println("Fecha de nacimiento inválida. Por favor, ingrese una fecha válida con el formato dd/mm/aaaa y no deje este campo vacío");
                        fechaIngreso = sc.nextLine();
                    }

                    //Se agregan los datos validados al Contenedor con el método almacenarProfesional
                    cont.almacenarProfesional(new Profesional(nombreProfesional, apellido1Prof, apellido2Prof, fechaDeNacimientoProfesional, runProfesional, titulo, fechaIngreso));
                    break;
                case 3:
                    /**
                     * Validación de datos del administrativo
                     */
                    //RUN del administrativo
                    System.out.println("Ingrese el RUN del administrativo (Ejemplo: 12345678-9):");
                    System.out.println("*Este campo es obligatorio");
                    String runAdministrativo = sc.nextLine();
                    while (!runAdministrativo.matches("[0-9]{7,8}-[0-9kK]")) {
                        System.out.println("RUN incorrecto. Por favor, ingrese un RUN válido (Ejemplo:12345678-9), sin espacios y que no sea mayor a 99999999");
                        runAdministrativo = sc.nextLine();
                    }

                    //Nombre del administrativo
                    System.out.println("Ingrese el nombre administrativo (entre 3 y 20 caracteres):");
                    System.out.println("*Este campo es obligatorio");
                    String nombreAdministrativo = sc.nextLine();
                    while (nombreAdministrativo.isEmpty() || !nombreAdministrativo.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{3,20}")) {
                        System.out.println("Nombre incorrecto. Por favor, ingrese un nombre con mínimo 3 y máximo 20 caracteres. Este campo no puede quedar vacío");
                        nombreAdministrativo = sc.nextLine();
                    }

                    //Primer apellido del administrativo
                    System.out.print("Ingrese el primer apellido del administrativo (entre 3 y 20 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String apellido1Administrativo = sc.nextLine();
                    while (apellido1Administrativo.isEmpty() || !apellido1Administrativo.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{3,20}")) {
                        System.out.println("Apellido ingresado de forma incorrecta. Por favor, ingrese un apellido válido (entre 3 y 20 caracteres) y no deje este campo vacío");
                        apellido1Administrativo = sc.nextLine();
                    }

                    //Segundo apellido del administrativo
                    System.out.print("Ingrese el segundo apellido del administrativo(entre 3 y 20 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String apellido2Administrativo = sc.nextLine();
                    while (apellido2Administrativo.isEmpty() || !apellido2Administrativo.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{3,20}")) {
                        System.out.println("Apellido ingresado de forma incorrecta. Por favor, ingrese un apellido válido (entre 3 y 20 caracteres) y no deje este campo vacío");
                        apellido2Administrativo = sc.nextLine();
                    }

                    //Fecha de nacimiento del administrativo
                    System.out.println("Ingrese fecha de nacimiento considerando el siguiente formato -> dd/mm/aaaa:");
                    System.out.println("*Este campo es obligatorio");
                    String fechaDeNacimientoAdministrativo = sc.nextLine();
                    while (!fechaDeNacimientoAdministrativo.matches("^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                        System.out.println("Fecha de nacimiento inválida. Por favor, ingrese una fecha válida con el formato dd/mm/aaaa y no deje este campo vacío");
                        fechaDeNacimientoAdministrativo = sc.nextLine();
                    }

                    //Experiencia laboral del administrativo
                    System.out.println("Ingrese experiencia del administrativo (máximo 100 caracteres):");
                    System.out.println("*Este campo es obligatorio");
                    String experienciaAdministrativo = sc.nextLine();
                    while (experienciaAdministrativo.isEmpty() || experienciaAdministrativo.length() > 100 || !experienciaAdministrativo.matches("^[a-zA-Z0-9 ]*$")) {
                        System.out.println("Supera el máximo de caracteres permitidos (100) o se dejó este campo vacío, por favor vuelva a intentarlo:");
                        experienciaAdministrativo = sc.nextLine();
                    }

                    //Area del administrativo
                    System.out.println("Ingrese área del administrativo (entre 5 y 20 caracteres):");
                    System.out.println("*Este campo es obligatorio");
                    String areaAdministrativo = sc.nextLine();
                    while (areaAdministrativo.isEmpty() || !areaAdministrativo.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{5,20}")) {
                        System.out.println("Datos agregados de forma incorrecta. Por favor ingrese el área nuevamente (entre 5 y 20 caracteres)");
                        areaAdministrativo = sc.nextLine();
                    }

                    //Se agregan los datos validados al Contenedor con el método almacenarAdministrativo
                    cont.almacenarAdministrativo(new Administrativo(nombreAdministrativo, apellido1Administrativo, apellido2Administrativo, fechaDeNacimientoAdministrativo, runAdministrativo, areaAdministrativo, experienciaAdministrativo));


                    break;
                case 4:
                    /**
                     * Validación de datos de Capacitacion
                     */

                    //Identificador de la capacitación
                    System.out.println("Ingrese ID de la capacitación:");
                    String idCapacitacion;
                    do {
                        idCapacitacion = sc.nextLine().trim();
                        if (idCapacitacion.isEmpty()) {
                            System.out.println("El campo no puede estar vacío y debe ser un número entero. Ingrese nuevamente:");
                        }
                    } while (idCapacitacion.isEmpty());

                    int idCapacitacionInt = Integer.parseInt(idCapacitacion);

                    //RUT de la empresa
                    System.out.println("Ingrese el RUT de la empresa (Ejemplo: 72345678-9):");
                    System.out.println("*Este campo es obligatorio");
                    String rutClienteCap = sc.nextLine();
                    while (!rutClienteCap.matches("[0-9]{7,8}-[0-9kK]")) {
                        System.out.println("RUT incorrecto. Por favor, ingrese un RUN válido (Ejemplo:72345678-9), sin espacios y que no sea mayor a 99999999");
                        rutClienteCap = sc.nextLine();
                    }

                    //Validación del día de la capacitación
                    System.out.println("Ingrese el dia de la capacitación considerando el siguiente formato -> dd/mm/aaaa::");
                    String fechaStr = sc.nextLine();
                    Date fecha = null;

                    try {
                        fecha = parseFecha(fechaStr);
                    } catch (ParseException e) {
                        System.out.println("La fecha no es válida. Considere el siguiente formato -> dd/mm/aaaa:");
                    }

                    if (fecha != null) {
                        // Formatear la fecha como "DD/MM/AAAA"
                        String fechaFormateada = formatFecha(fecha);
                        System.out.println("Fecha formateada: " + fechaFormateada);
                    }

                    //Validación hora de la capacitación
                    System.out.println("Ingrese la hora de la capacitación considerando el siguiente formato -> HH:MM:");
                    String hora = sc.nextLine();
                    while (!validarHora(hora)) {
                        System.out.println("Hora inválida ingresela nuevamente. Considere el siguiente formato -> HH:MM: ");
                        hora = sc.nextLine();
                    }

                    //Lugar de la capacitación
                    System.out.print("Ingrese el lugar dónde se realizará la capacitación (min 10 y max 70 caracteres): ");
                    System.out.println("*Este campo es obligatorio");
                    String lugar = sc.nextLine();
                    while (lugar.isEmpty() || !lugar.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{10,50}")) {
                        System.out.println("Lugar ingresado de forma incorrecta. Por favor, ingrese un lugar válido (min 10 y max 70 caracteres)  y no deje este campo vacío");
                        lugar = sc.nextLine();
                    }

                    //Duración de la capacitación
                    System.out.print("Ingrese la duración de la capacitación (Ejemplo: 1 hora) ");
                    System.out.println("*Este campo es obligatorio");
                    String duracion = sc.nextLine();
                    while (duracion.isEmpty() || !duracion.matches("[\\p{L}ñÑáéíóúÁÉÍÓÚ\\d\\s]{1,70}")) {
                        System.out.println("La duración fue ingresada de forma incorrecta (Ejemplo: 1 hora). Por favor, reintentelo y no deje este campo vacío");
                        duracion = sc.nextLine();
                    }

                    //Cantidad de asistentes a la capacitación
                    System.out.print("Ingrese la cantidad de asistentes (máximo 1000): ");
                    int cantidadAsistentes;
                    while (true) {
                        String input = sc.nextLine();
                        try {
                            cantidadAsistentes = Integer.parseInt(input);
                            if (cantidadAsistentes >= 1 && cantidadAsistentes < 1000) {
                                break;
                            } else {
                                System.out.println("Cantidad de asistentes no válida. Ingrese un número entero menor que 1000:");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Cantidad de asistentes no válida. Ingrese un número entero menor que 1000:");
                        }
                    }

                    //Se agregan los datos validados al Contenedor con el método almacenarCapacitaciones
                    cont.almacenarCapacitacion(new Capacitacion(idCapacitacionInt, rutClienteCap, fechaStr, hora, lugar, duracion, cantidadAsistentes));
                    break;
                case 5:
                    /**
                     * Eliminar usuario a través del RUN con el método eliminarUsuario()
                     */
                    System.out.println("Ingrese el RUN del usuario a eliminar:");
                    String runEliminar = sc.nextLine();
                    cont.eliminarUsuario(runEliminar);
                    break;
                case 6:
                    /**
                     * Listar usuarios a través del método listarUsuarios()
                     *
                     */
                    cont.listarUsuarios();
                    break;
                case 7:
                    /**
                     * Listar usuario según el tipo
                     * Se llama al método listarUsuariosPorTipo() de la clase Contenedor
                     */
                    System.out.println("Ingrese un número para el tipo de usuario a listar (1.- cliente, 2.- profesional o 3.- administrativo):");
                    String tipoUsuario = sc.nextLine();
                    while (!tipoUsuario.matches("[1-3]")) {
                        System.out.println("Ingrese un número correspondiente al tipo de usuario (1.- cliente, 2.- profesional o 3.- administrativo). El dato ingresado no es correcto.");
                        tipoUsuario = sc.nextLine();
                    }

                    //Menú para seleccionar el usuario
                    Usuario usuarioTipo;
                    switch (tipoUsuario) {
                        case "1":
                            usuarioTipo = new Cliente();
                            break;
                        case "2":
                            usuarioTipo = new Profesional();
                            break;
                        case "3":
                            usuarioTipo = new Administrativo();
                            break;
                        default:
                            System.out.println("Ingrese un número correspondiente al tipo de usuario. El dato ingresado no es correcto.");
                            return;
                    }

                    cont.listarUsuariosPorTipo(usuarioTipo);
                    break;
                case 8:
                    /**
                     * Listar capacitaciones
                     * Se llama al método listarCapacitaciones() de la clase Contenedor
                     */
                    cont.listarCapacitaciones();
                    break;
                case 9:
                    /**
                     * Se finaliza el programa
                     */
                    System.out.println("Saliendo del programa...");
                    System.out.println("PROGRAMA FINALIZADO");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
            System.out.println();
        }
    }

    /**
     * Metodo mostrarMenu()
     */
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

    /**
     * Este método valida que la hora se ingrese en el formato correcto (HH:MM)
     * @param hora
     * @return boolean
     */
    public static boolean validarHora(String hora) {
        // Expresión regular para validar el formato HH:MM
        String patron = "^([01]\\d|2[0-3]):([0-5]\\d)$";
        if (!Pattern.matches(patron, hora)) {
            return false; // El formato no es válido
        }

        // Obtener las partes de la hora (horas y minutos)
        String[] partes = hora.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        // Validar los rangos de las horas y minutos
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
            return false; // Los rangos no son válidos
        }

        return true; // La hora es válida
    }

    /**
     * Metodo para parsear fecha al formato adecuado (dd/mm/yyyy)
     * @param fechaString
     * @return
     * @throws ParseException
     */
    public static Date parseFecha(String fechaString) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(fechaString);
    }

    /**
     * Metodo para darle el formato adecuado a la fecha ingresada
     * @param fecha
     * @return
     */
    public static String formatFecha(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }
}




