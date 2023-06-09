import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Esta clase almacena una lista con objetos de tipo Usuario y una lista con objetos de tipo Capacitacion.
 * Posee los métodos para gestionar ambas listas.
 * @author Jonathan Gajardo
 */

public class Contenedor {
    private List<Usuario> listaUsuarios;
    private List<Capacitacion> listaCapacitaciones;

    public Contenedor(List<Usuario> listaUsuarios, List<Capacitacion> listaCapacitaciones) {
        this.listaUsuarios = listaUsuarios;
        this.listaCapacitaciones = listaCapacitaciones;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "listaUsuarios=" + listaUsuarios +
                ", listaCapacitaciones=" + listaCapacitaciones +
                '}';
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Capacitacion> getListaCapacitaciones() {
        return listaCapacitaciones;
    }

    public void setListaCapacitaciones(List<Capacitacion> listaCapacitaciones) {
        this.listaCapacitaciones = listaCapacitaciones;
    }

    /**
     * Convierte una fecha LocalDate a un String con formato dd/MM/YYYY
     * @param fecha
     * @return String de una fecha en formato dd/MM/YYYY
     */
    public String convertirFechaAString(LocalDate fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaString = fecha.format(formato);
        return fechaString;
    }

    /**
     * Pide datos por consola al usuario, validando que tengan el formato correcto, finalmente crea un objeto de tipo Cliente y lo agrega a su lista "listaUsuarios"
     */
    public void almacenarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("= = = REGISTRAR CLIENTE = = =");

        String nombre = "";
        while (nombre.length() < 5 || nombre.length() > 50) {
            System.out.println("Ingresar nombre (5 - 50 carácteres)");
            nombre = sc.nextLine();
        }

        String apellido1 = "";
        while (apellido1.length() < 5 || apellido1.length() > 50) {
            System.out.println("Ingresar primer apellido (5 - 50 carácteres)");
            apellido1 = sc.nextLine();
        }

        String apellido2 = "";
        while (apellido2.length() < 5 || apellido2.length() > 50) {
            System.out.println("Ingresar segundo apellido (5 - 50 carácteres)");
            apellido2 = sc.nextLine();
        }

        String fechaNac = "";
        Pattern patron = Pattern.compile("(0[1-9]|1\\d|2\\d|3[01])/(0[1-9]|1[0-2])/(19\\d\\d|20[0-2][0-9])");
        Matcher matcher = patron.matcher(fechaNac);
        while (!matcher.matches()) {
            System.out.println("Ingresar fecha de nacimiento (dd/MM/YYYY)");
            fechaNac = sc.nextLine();
            matcher = patron.matcher(fechaNac);
        }

        int run = 100000000;
        while (run >= 99999999) {
            try {
                System.out.println("Ingresar rut de la empresa sin digito verificador (XXXXXXXX)");
                run = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                sc.nextLine();
            }
        }

        String nombreEmpresa = "";
        while (nombreEmpresa.length() < 5 || nombreEmpresa.length() > 100) {
            System.out.println("Ingresar nombre de la empresa (5 - 100 carácteres)");
            nombreEmpresa = sc.nextLine();
        }

        String giroEmpresa = "";
        while (giroEmpresa.length() < 5 || giroEmpresa.length() > 100) {
            System.out.println("Ingresar giro de la empresa (5 - 100 carácteres)");
            giroEmpresa = sc.nextLine();
        }

        int telefonoRepresentante = 0;
        String strTelefonoRepresentante = "";
        while (strTelefonoRepresentante.length() != 9) {
            System.out.println("Ingresar número telefónico celular del representante sin prefijo (9XXXXXXXX)");
            strTelefonoRepresentante = sc.nextLine();
            if (strTelefonoRepresentante.charAt(0) != '9') {
                strTelefonoRepresentante = "";
                continue;
            }
            try {
                telefonoRepresentante = Integer.parseInt(strTelefonoRepresentante);
            } catch (Exception e) {
                strTelefonoRepresentante = "";
            }
        }

        String direccionEmpresa = "";
        while (direccionEmpresa.length() < 5 || direccionEmpresa.length() > 70) {
            System.out.println("Ingresar dirección de la empresa (5 - 70 carácteres)");
            direccionEmpresa = sc.nextLine();
        }

        String comunaEmpresa = "";
        while (comunaEmpresa.length() < 5 || comunaEmpresa.length() > 50) {
            System.out.println("Ingresar comuna de la empresa (5 - 50 carácteres)");
            comunaEmpresa = sc.nextLine();
        }

        int edad = 151;
        while (edad < 0 || edad >= 150) {
            System.out.println("Ingresar edad del representante");
            try {
                edad = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                sc.nextLine();
            }
        }

        Usuario cliente = new Cliente(nombre, apellido1, apellido2, fechaNac, run, nombreEmpresa, giroEmpresa, strTelefonoRepresentante, direccionEmpresa, comunaEmpresa, edad);
        this.getListaUsuarios().add(cliente);

        System.out.println("CLIENTE REGISTRADO CORRECTAMENTE");
        sc.nextLine();
    }

    /**
     * Pide datos por consola al usuario, validando que tengan el formato correcto, finalmente crea un objeto de tipo Profesional y lo agrega a su lista "listaUsuarios"
     */
    public void almacenarProfesional() {
        Scanner sc = new Scanner(System.in);
        System.out.println("= = = REGISTRAR PROFESIONAL = = =");

        String nombre = "";
        while (nombre.length() < 5 || nombre.length() > 50) {
            System.out.println("Ingresar nombre (5 - 50 carácteres)");
            nombre = sc.nextLine();
        }

        String apellido1 = "";
        while (apellido1.length() < 5 || apellido1.length() > 50) {
            System.out.println("Ingresar primer apellido (5 - 50 carácteres)");
            apellido1 = sc.nextLine();
        }

        String apellido2 = "";
        while (apellido2.length() < 5 || apellido2.length() > 50) {
            System.out.println("Ingresar segundo apellido (5 - 50 carácteres)");
            apellido2 = sc.nextLine();
        }

        String fechaNac = "";
        Pattern patron = Pattern.compile("(0[1-9]|1\\d|2\\d|3[01])/(0[1-9]|1[0-2])/(19\\d\\d|20[0-2][0-9])");
        Matcher matcher = patron.matcher(fechaNac);
        while (!matcher.matches()) {
            System.out.println("Ingresar fecha de nacimiento (dd/MM/YYYY)");
            fechaNac = sc.nextLine();
            matcher = patron.matcher(fechaNac);
        }

        int run = 100000000;
        while (run >= 99999999) {
            try {
                System.out.println("Ingresar run sin digito verificador (XXXXXXXX)");
                run = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                sc.nextLine();
            }
        }

        String titulo = "";
        while (titulo.length() < 10 || titulo.length() > 50) {
            System.out.println("Ingresar título académico (10 - 50 carácteres)");
            titulo = sc.nextLine();
        }

        String fechaIngreso = "";
        Matcher matcher2 = patron.matcher(fechaIngreso);
        while (!matcher2.matches()) {
            System.out.println("Ingresar fecha de ingreso (dd/MM/YYYY)");
            fechaIngreso = sc.nextLine();
            matcher2 = patron.matcher(fechaIngreso);
        }

        Usuario profesional = new Profesional(nombre, apellido1, apellido2, fechaNac, run, titulo, fechaIngreso);
        this.getListaUsuarios().add(profesional);

        System.out.println("PROFESIONAL REGISTRADO CORRECTAMENTE");
        sc.nextLine();
    }

    /**
     * Pide datos por consola al usuario, validando que tengan el formato correcto, finalmente crea un objeto de tipo Administrativo y lo agrega a su lista "listaUsuarios"
     */
    public void almacenarAdministrativo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("= = = REGISTRAR ADMINISTRATIVO = = =");

        String nombre = "";
        while (nombre.length() < 5 || nombre.length() > 50) {
            System.out.println("Ingresar nombre (5 - 50 carácteres)");
            nombre = sc.nextLine();
        }

        String apellido1 = "";
        while (apellido1.length() < 5 || apellido1.length() > 50) {
            System.out.println("Ingresar primer apellido (5 - 50 carácteres)");
            apellido1 = sc.nextLine();
        }

        String apellido2 = "";
        while (apellido2.length() < 5 || apellido2.length() > 50) {
            System.out.println("Ingresar segundo apellido (5 - 50 carácteres)");
            apellido2 = sc.nextLine();
        }

        String fechaNac = "";
        Pattern patron = Pattern.compile("(0[1-9]|1\\d|2\\d|3[01])/(0[1-9]|1[0-2])/(19\\d\\d|20[0-2][0-9])");
        Matcher matcher = patron.matcher(fechaNac);
        while (!matcher.matches()) {
            System.out.println("Ingresar fecha de nacimiento (dd/MM/YYYY)");
            fechaNac = sc.nextLine();
            matcher = patron.matcher(fechaNac);
        }

        int run = 100000000;
        while (run >= 99999999) {
            try {
                System.out.println("Ingresar run sin digito verificador (XXXXXXXX)");
                run = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                sc.nextLine();
            }
        }

        String area = "";
        while (area.length() < 5 || area.length() > 20) {
            System.out.println("Ingresar area (5 - 20 carácteres)");
            area = sc.nextLine();
        }

        String experienciaPrevia = "";
        while (experienciaPrevia.length() < 1 || experienciaPrevia.length() > 100) {
            System.out.println("Ingresar experiencia previa (1 - 100 carácteres)");
            experienciaPrevia = sc.nextLine();
        }

        Usuario administrativo = new Administrativo(nombre, apellido1, apellido2, fechaNac, run, area, experienciaPrevia);
        this.getListaUsuarios().add(administrativo);

        System.out.println("ADMINISTRATIVO REGISTRADO CORRECTAMENTE");
        sc.nextLine();
    }

    /**
     * Pide datos por consola al usuario, validando que tengan el formato correcto, finalmente crea un objeto de tipo Capacitacion y lo agrega a su lista "listaCapacitaciones"
     */
    public void almacenarCapacitacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("= = = REGISTRAR CAPACITACIÓN = = =");

        int id = 0;
        while (id < 1) {
            try {
                System.out.println("Ingresar id (1 - *)");
                id = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                sc.nextLine();
            }
        }

        int runCliente = 100000000;
        while (runCliente >= 99999999) {
            try {
                System.out.println("Ingresar rut del cliente sin digito verificador (XXXXXXXX)");
                runCliente = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
            }
        }

        String dia = "";
        boolean diaEncontrado = false;
        String[] diasSemana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        while (!diaEncontrado) {
            System.out.println("Ingresar día de la semana (Lunes - Martes - Miercoles - Jueves - Viernes - Sabado - Domingo)");
            dia = sc.nextLine();
            for (String diaValido : diasSemana) {
                if (diaValido.equalsIgnoreCase(dia)) {
                    diaEncontrado = true;
                    break;
                }
            }
        }

        String hora = "";
        Pattern patronHora = Pattern.compile("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
        Matcher matcherHora = patronHora.matcher(hora);
        while (!matcherHora.matches()) {
            System.out.println("Ingresar hora de la capacitación (HH:MM)");
            hora = sc.nextLine();
            matcherHora = patronHora.matcher(hora);
        }

        String lugar = "";
        while (lugar.length() < 10 || lugar.length() > 50) {
            System.out.println("Ingresar lugar de la capacitación (10 - 50 carácteres)");
            lugar = sc.nextLine();
        }

        int duracion = 0;
        while (duracion < 1 || duracion > 1000000000) {
            try {
                System.out.println("Ingresar duración de la capacitación en minutos (1 - *)");
                duracion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
            }
        }

        int cantidadAsistentes = 1001;
        while (cantidadAsistentes > 1000) {
            System.out.println("Ingresar cantidad de asistentes");
            try {
                cantidadAsistentes = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                sc.nextLine();
            }
        }

        Capacitacion capacitacion = new Capacitacion(id, runCliente, dia, hora, lugar, duracion, cantidadAsistentes);
        this.getListaCapacitaciones().add(capacitacion);

        System.out.println("CAPACITACIÓN REGISTRADA CORRECTAMENTE");
        sc.nextLine();
    }

    /**
     * Solicita un texto al usuario, si es equivalente a "salir" termina el bucle sino, convierte el texto a int y verifica si el mismo corresponde a uno los run registrados en clientes
     * si hay una coincidencia elimina dicho cliente de la lista "listaUsuarios"
     */
    public void eliminarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("= = = ELIMINAR USUARIO = = =");

        boolean usuarioEliminado = false;
        while (!usuarioEliminado) {
            try {
                System.out.println("Ingresar RUN o RUT del usuario sin dígito verificador o 'Salir' para volver al menu principal");
                String runUsuarioEliminar = sc.nextLine();
                if (runUsuarioEliminar.equalsIgnoreCase("salir")) {
                    break;
                } else {
                    int intRunUsuarioEliminar = Integer.parseInt(runUsuarioEliminar);
                    if (this.getListaUsuarios().removeIf(usuario -> (usuario.getRun() == intRunUsuarioEliminar))) {
                        System.out.println("Usuario encontrado y eliminado");
                        usuarioEliminado = true;
                    } else {
                        System.out.println("Usuario no encontrado");
                    }
                }
            } catch (Exception e) {
                System.out.println("RUN o RUT en formato incorrecto");
            }
        }
    }

    /**
     * Recorre cada elemento de la lista "listaUsuarios" y muestra los datos correspondientes por consola
     */
    public void listarUsuarios() {
        Scanner sc = new Scanner(System.in);
        System.out.println("= = = LISTA DE USUARIOS = = =");
        System.out.println("= = = = = = = = = = = = = = =");

        for (Usuario usuario : this.getListaUsuarios()) {
            usuario.analizarUsuario();
            System.out.println("Primer apellido: " + usuario.getApellido1());
            System.out.println("Segundo apellido: " + usuario.getApellido2());
            System.out.println("Fecha de nacimiento: " + this.convertirFechaAString(usuario.getFechaNac()));
            System.out.println("= = = = = = = = = = = = = = =");
        }
        sc.nextLine();
    }

    /**
     * Filtra según el tipo de usuario recibido por parámetro y muestra los datos correspondientes
     * @param tipoDeUsuario Tipo de usuario con el que se debe filtrar el listado de usuarios
     */
    public void listarUsuariosPorTipo(String tipoDeUsuario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("= = = LISTA DE USUARIOS DE TIPO " + tipoDeUsuario + " = = =");
        for (Usuario usuario : this.getListaUsuarios()) {
            if (usuario.getClass().getSimpleName().equalsIgnoreCase(tipoDeUsuario)) {
                usuario.analizarUsuario();
                System.out.println("Primer apellido: " + usuario.getApellido1());
                System.out.println("Segundo apellido: " + usuario.getApellido2());
                System.out.println("Fecha de nacimiento: " + this.convertirFechaAString(usuario.getFechaNac()));
                if (tipoDeUsuario.equals("CLIENTE")) {
                        Cliente cliente = (Cliente) usuario;
                        System.out.println("Nombre de la empresa: " + cliente.getNombreEmpresa());
                        System.out.println("Giro de la empresa: " + cliente.getGiroEmpresa());
                        System.out.println("Teléfono del representante: " + cliente.getTelefonoRepresentante());
                        System.out.println("Dirección de la empresa: " + cliente.getDireccionEmpresa());
                        System.out.println("Comuna de la empresa: " + cliente.getComunaEmpresa());
                        System.out.println("Edad del representante: " + cliente.getEdad());
                        System.out.println("= = = = = = = = = = = = = = =");
                } else {
                    System.out.println("= = = = = = = = = = = = = = =");
                }
            }
        }
        sc.nextLine();
    }

    /**
     * Recorre con un forEach la lista "ListaCapacitaciones", muestra los datos de la capacitación, y en cada ciclo recorre la lista "listaUsuarios" filtrando por Cliente,
     * busca una coincidencia entre el atributo "rutCliente" de la capacitación y "run" del cliente, si la encuentra también muestra los datos del Cliente
     */
    public void listarCapacitaciones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("= = = LISTA DE CAPACITACIONES = = =");

        for (Capacitacion capacitacion : this.getListaCapacitaciones()) {
            System.out.println("ID: " + capacitacion.getIdentificador());
            System.out.println("RUT del cliente: " + capacitacion.getRutCliente());
            System.out.println("Día de realización: " + capacitacion.getDia());
            System.out.println("Hora de realización: " + capacitacion.getHora());
            System.out.println("Lugar de realización: " + capacitacion.getLugar());
            System.out.println("Duración: " + capacitacion.getDuracion());
            System.out.println("Cantidad de asistentes: " + capacitacion.getCantidadAsistentes());
            for (Usuario usuario : this.getListaUsuarios()) {
                if (usuario instanceof Cliente && usuario.getRun() == capacitacion.getRutCliente()) {
                    Cliente cliente = (Cliente) usuario;
                    System.out.println("- - - CLIENTE ASOCIADO - - -");
                    usuario.analizarUsuario();
                    System.out.println("Primer apellido: " + usuario.getApellido1());
                    System.out.println("Segundo apellido: " + usuario.getApellido2());
                    System.out.println("Fecha de nacimiento: " + this.convertirFechaAString(usuario.getFechaNac()));
                    System.out.println("Nombre de la empresa: " + cliente.getNombreEmpresa());
                    System.out.println("Giro de la empresa: " + cliente.getGiroEmpresa());
                    System.out.println("Teléfono del representante: " + cliente.getTelefonoRepresentante());
                    System.out.println("Dirección de la empresa: " + cliente.getDireccionEmpresa());
                    System.out.println("Comuna de la empresa: " + cliente.getComunaEmpresa());
                    System.out.println("Edad del representante: " + cliente.getEdad());
                }
            }
            System.out.println("= = = = = = = = = = = = = = =");
        }
        sc.nextLine();
    }
}
