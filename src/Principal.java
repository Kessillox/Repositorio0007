import java.time.LocalTime;
import java.util.Scanner;

public class Principal {
    private static Contenedor contenedor;
    private static Scanner sc;
    public static void main(String[] args) {
        contenedor = new Contenedor();
        sc = new Scanner(System.in);

        boolean salir = false;
        int opcion;

        while (!salir) {
            mostrarMenuPrincipal();
            opcion = validarInt("Ingrese una opción: ");

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    agregarProfesional();
                    break;
                case 3:
                    agregarAdministrativo();
                    break;
                case 4:
                    agregarCapacitacion();
                    break;
                case 5:
                    eliminarUsuario();
                    break;
                case 6:
                    listarUsuarios();
                    break;
                case 7:
                    listarUsuariosPorTipo();
                    break;
                case 8:
                    listarCapacitaciones();
                    break;
                case 9:
                    salir = true;
                    System.out.println("¡Gracias por su preferencia <(n.n)>!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida: ");
                    break;
            }
        }
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("----- MENÚ PRINCIPAL -----");
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Agregar Profesional");
        System.out.println("3. Agregar Administrativo");
        System.out.println("4. Agregar Capacitación");
        System.out.println("5. Eliminar Usuario");
        System.out.println("6. Listar Usuarios");
        System.out.println("7. Listar Usuarios por Tipo");
        System.out.println("8. Listar Capacitaciones");
        System.out.println("9. Salir");
        System.out.println("--------------------------");
    }

    private static void agregarCliente() {
        sc.nextLine();
        System.out.println("---- Agregar Cliente ----");
        Cliente cli = new Cliente();
        System.out.println("Nombre Usuario: ");
        cli.setNombreUsuario(sc.nextLine());
        System.out.println("Apellido Paterno: ");
        cli.setApellido1(sc.nextLine());
        System.out.println("Apellido Materno: ");
        cli.setApellido2(sc.nextLine());
        System.out.println("Ingrese fecha de nacimiento: ");
        cli.setFechaDeNacimientoUsuario(sc.nextLine());
        System.out.println("Ingrese RUN: ");
        cli.setRunUsuario(sc.nextLine());
        System.out.println("Ingrese Nombre Empresa: ");
        cli.setNombreEmpresa(sc.nextLine());
        System.out.println("Ingrese Giro Empresa: ");
        cli.setGiroEmpresa(sc.nextLine());
        System.out.println("Ingrese RUT: ");
        cli.setRutEmpresa(sc.nextLine());
        System.out.println("Ingrese Telefono: ");
        cli.setTelefonoRepresentanteLegal(sc.nextLine());
        System.out.println("Direccion Empresa: ");
        cli.setDireccion(sc.nextLine());
        System.out.println("Comuna: ");
        cli.setComuna(sc.nextLine());
        contenedor.almacenarCliente(cli);

    }

    private static void agregarProfesional() {
        sc.nextLine();
        System.out.println("---- Agregar Profesional ----");
        Profesional pro = new Profesional();
        System.out.println("Nombre Usuario: ");
        pro.setNombreUsuario(sc.nextLine());
        System.out.println("Apellido Paterno: ");
        pro.setApellido1(sc.nextLine());
        System.out.println("Apellido Materno: ");
        pro.setApellido2(sc.nextLine());
        System.out.println("Ingrese fecha de nacimiento: ");
        pro.setFechaDeNacimientoUsuario(sc.nextLine());
        System.out.println("Ingrese RUN: ");
        pro.setRunUsuario(sc.nextLine());
        System.out.println("Ingrese Titulo: ");
        pro.setTitulo(sc.nextLine());
        System.out.println("Ingrese la fecha de ingreso: ");
        pro.setFechaDeIngreso(sc.nextLine());
        contenedor.almacenarProfesional(pro);
    }

    private static void agregarAdministrativo() {
        sc.nextLine();
        System.out.println("---- Agregar Administrativo ----");
        Administrativo adm = new Administrativo();
        System.out.println("Nombre Usuario: ");
        adm.setNombreUsuario(sc.nextLine());
        System.out.println("Apellido Paterno: ");
        adm.setApellido1(sc.nextLine());
        System.out.println("Apellido Materno: ");
        adm.setApellido2(sc.nextLine());
        System.out.println("Ingrese fecha de nacimiento: ");
        adm.setFechaDeNacimientoUsuario(sc.nextLine());
        System.out.println("Ingrese RUN: ");
        adm.setRunUsuario(sc.nextLine());
        System.out.println("Ingrese Area: ");
        adm.setArea(sc.nextLine());
        System.out.println("Ingrese Experiencia Previa: ");
        adm.setExperienciaPrevia(sc.nextLine());
        contenedor.almacenarAdministrativo(adm);
    }

    private static void agregarCapacitacion() {
        sc.nextLine();
        System.out.println("---- Agregar Capacitación ----");
        Capacitacion cap = new Capacitacion();
        System.out.println("Ingrese ID: ");
        cap.setIdCapacitacion(sc.nextLine());
        System.out.println("Ingrese Rut Empresa: ");
        cap.setRutEmpresa(sc.nextLine());
        System.out.println("Ingrese fecha: ");
        cap.setDiaCapacitacion(sc.nextLine());
        System.out.println("Ingrese Hora: ");
        cap.setHoraCapacitacion(sc.nextLine());
        System.out.println("Ingrese Lugar: ");
        cap.setLugarCapacitacion(sc.nextLine());
        System.out.println("Ingrese DUracion: ");
        cap.setDuracionCapacitacion(sc.nextInt());
        contenedor.almacenarCapacitacion(cap);
    }

    private static void eliminarUsuario() {
        sc.nextLine();
        String runn;
        System.out.println("---- Eliminar Usuario ----");
        System.out.println("Ingrese el RUN del usuario a eliminar: ");
        runn = sc.nextLine();
        contenedor.eliminarUsuario(runn);
    }

    private static void listarUsuarios() {
        System.out.println("---- Listar Usuarios ----");
        contenedor.listarUsuarios();
    }

    private static void listarUsuariosPorTipo() {
        String tipo="";
        boolean validar = false;
        while (!validar) {
            System.out.println("---- Listar Usuarios por Tipo ----");
            System.out.println("1.- Administrativo");
            System.out.println("2.- Profesional");
            System.out.println("3.- Cliente");
            System.out.println("Ingrese el nombre del tipo de Usuario");
            tipo = sc.nextLine();
            switch (tipo) {
                case "Administrativo":
                case "Profesional":
                case "Cliente":
                    validar=true;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
        contenedor.listarUsuariosPorTipo(tipo);
    }

    private static void listarCapacitaciones() {
        System.out.println("---- Listar Capacitaciones ----");
        contenedor.listarCapacitaciones();
    }

    private static int validarInt(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Ingrese un número válido: ");
        }
        return sc.nextInt();
    }

    private static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }


    }
