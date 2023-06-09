import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida: <(¬_¬)>");
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
        cli.setNombreUsuario(cadenaMinimoMaximoLenght(sc.nextLine(),10,50,
                "Ingrese Nombre válido: ",true));
        System.out.println("Apellido Paterno: ");
        cli.setApellido1(cadenaMinimoMaximoLenght(sc.nextLine(),5,30,
                "Ingrese Apellido Paterno válido: ",true));
        System.out.println("Apellido Materno: ");
        cli.setApellido2(cadenaMinimoMaximoLenght(sc.nextLine(),5,30,
                "Ingrese Apellido Materno válido: ",true));
        System.out.println("Ingrese fecha de nacimiento: ");
        cli.setFechaDeNacimientoUsuario(sc.nextLine());
        System.out.println("Ingrese RUN: ");
        cli.setRunUsuario(sc.nextLine());
        System.out.println("Ingrese Nombre Empresa: ");
        cli.setNombreEmpresa(cadenaMinimoMaximoLenght(sc.nextLine(),5,30,
                "Ingrese Nombre Empresa válido: ",true));
        System.out.println("Ingrese Giro Empresa: ");
        cli.setGiroEmpresa(sc.nextLine());
        System.out.println("Ingrese RUT: ");
        cli.setRutEmpresa(sc.nextLine());
        System.out.println("Ingrese Telefono: ");
        cli.setTelefonoRepresentanteLegal(sc.nextLine());
        System.out.println("Direccion Empresa: ");
        cli.setDireccion(cadenaMinimoMaximoLenght(sc.nextLine(),0,70,
                "Ingrese Direccion válida: ",false));
        System.out.println("Comuna: ");
        cli.setComuna(cadenaMinimoMaximoLenght(sc.nextLine(),0,50,
                "Ingrese Comuna válida: ",true));
        contenedor.almacenarCliente(cli);
        System.out.println("Registros agregados correctamente ~(^.^)~");
    }

    private static void agregarProfesional() {
        sc.nextLine();
        System.out.println("---- Agregar Profesional ----");
        Profesional pro = new Profesional();
        System.out.println("Nombre Usuario: ");
        pro.setNombreUsuario(cadenaMinimoMaximoLenght(sc.nextLine(),10,50,
                "Ingrese Nombre válido: ",true));
        System.out.println("Apellido Paterno: ");
        pro.setApellido1(cadenaMinimoMaximoLenght(sc.nextLine(),5,30,
                "Ingrese Apellido Paterno válido: ",true));
        System.out.println("Apellido Materno: ");
        pro.setApellido2(cadenaMinimoMaximoLenght(sc.nextLine(),5,30,
                "Ingrese Apellido Materno válido: ",true));
        System.out.println("Ingrese fecha de nacimiento: ");
        pro.setFechaDeNacimientoUsuario(sc.nextLine());
        System.out.println("Ingrese RUN: ");
        pro.setRunUsuario(sc.nextLine());
        System.out.println("Ingrese Titulo: ");
        pro.setTitulo(cadenaMinimoMaximoLenght(sc.nextLine(),5,20,
                "Ingrese Titulo válido: ",true));
        System.out.println("Ingrese la fecha de ingreso: ");
        pro.setFechaDeIngreso(sc.nextLine());
        contenedor.almacenarProfesional(pro);
        System.out.println("Registros agregados correctamente ~(^.^)~");
    }

    private static void agregarAdministrativo() {
        sc.nextLine();
        System.out.println("---- Agregar Administrativo ----");
        Administrativo adm = new Administrativo();
        System.out.println("Nombre Usuario: ");
        adm.setNombreUsuario(cadenaMinimoMaximoLenght(sc.nextLine(),10,50,
                "Ingrese Nombre válido: ",true));
        System.out.println("Apellido Paterno: ");
        adm.setApellido1(cadenaMinimoMaximoLenght(sc.nextLine(),5,30,
                "Ingrese Apellido Paterno válido: ",true));
        System.out.println("Apellido Materno: ");
        adm.setApellido2(cadenaMinimoMaximoLenght(sc.nextLine(),5,30,
                "Ingrese Apellido Materno válido: ",true));
        System.out.println("Ingrese fecha de nacimiento: ");
        adm.setFechaDeNacimientoUsuario(sc.nextLine());
        System.out.println("Ingrese RUN: ");
        adm.setRunUsuario(sc.nextLine());
        System.out.println("Ingrese Área: ");
        adm.setArea(cadenaMinimoMaximoLenght(sc.nextLine(),5,20,
                "Ingrese Área válida: ",true));
        System.out.println("Ingrese Experiencia Previa: ");
        adm.setExperienciaPrevia(cadenaMinimoMaximoLenght(sc.nextLine(),0,100,
                "Ingrese Experiencia Previa válida: ",false));
        contenedor.almacenarAdministrativo(adm);
        System.out.println("Registros agregados correctamente ~(^.^)~");
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
        cap.setLugarCapacitacion(cadenaMinimoMaximoLenght(sc.nextLine(),10,50,
                "Ingrese Lugar válido: ",true));
        System.out.println("Ingrese Duracion: ");
        cap.setDuracionCapacitacion(sc.nextInt());
        contenedor.almacenarCapacitacion(cap);
        System.out.println("Registros agregados correctamente ~(^.^)~");
    }

    private static void eliminarUsuario() {
        sc.nextLine();
        String runn;
        System.out.println("---- Eliminar Usuario ----");
        System.out.println("Ingrese el RUN del usuario a eliminar: ");
        runn = sc.nextLine();
        contenedor.eliminarUsuario(runn);
        System.out.println("Registros agregados correctamente ┌(u.u)┐ ");
    }

    private static void listarUsuarios() {
        System.out.println("---- Listar Usuarios ----");
        contenedor.listarUsuarios();
        System.out.println("Son todos los registros ~(*o*)~");
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
                    System.out.println("Ingrese una opcion valida <(¬_¬)>");
                    break;
            }
        }
        contenedor.listarUsuariosPorTipo(tipo);
        System.out.println("Son todos los registros ~(*o*)~");
    }

    private static void listarCapacitaciones() {
        System.out.println("---- Listar Capacitaciones ----");
        contenedor.listarCapacitaciones();
        System.out.println("Son todos los registros ~(*o*)~");
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

    /**********Validaciones***********/
    private static String cadenaMinimoMaximoLenght (String cadena, int min, int max,String mensajeError,boolean obligatorio) {
        if (obligatorio){
            while (cadena.length() < min || cadena.length() > max) {
                if (cadena.length() < min) {
                    System.out.println("Como mínimo " + min + " caracteres.");
                } else {
                    System.out.println("Como máximo " + max + " caracteres.");
                }
                System.out.println(mensajeError+" <(¬_¬)>");

                cadena = sc.nextLine();
            }
        }else{
            while ( cadena.length() > max) {
                System.out.println("Como máximo " + max + " caracteres.");
                System.out.println(mensajeError+" <(¬_¬)>");
                cadena = sc.nextLine();
            }
        }
        return cadena;
    }

    /*
    VALIDACIONES REVISION Y VISITA TERRENO (En progreso aún)

     */


        public boolean validacionIdRevision (String idRevision){
            try {
                Integer.parseInt(idRevision);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }




    public boolean validacionIdVisita(String idVisitaTerreno) {
        try {
            Integer.parseInt(idVisitaTerreno);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validacionNombreRevision(String nombre) {
        if (nombre.length() > 50 || nombre.length() < 10) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validacionDetalleRevision(String detalle) {
        if (detalle.length() <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validacionEstadoRevision(int estado) {
        return estado <= 3 && estado >= 1;
    }


    // visita terreno
    //misma funcion que revision para el mismo parametro

    // funcion hechas en accidente rut, lugar

    public boolean validacionFecha(String fecha) {
        DateTimeFormatter formateadorFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate.parse(fecha, formateadorFecha);
            return true;
        } catch (DateTimeParseException error) {
            return false;
        }
    }

    public boolean validacionHora(String hora) {
        if (hora.isEmpty()) {
            return false;
        } else {
            String[] horaSeparada = hora.split(":");
            if (horaSeparada.length > 2) {
                return false;
            } else {
                try {
                    int digitosHora = Integer.parseInt(horaSeparada[0]);
                    //CONTINUAR
                } catch (NumberFormatException error) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean validacionComentariosVisitaTerreno(String comentarios) {
        return comentarios.length() <= 100;
    }

    //Validacion de las variables de la clase Accidente
    public boolean validarIdAccidente(Integer idAccidente) {
        return idAccidente > 0;
    }

    public boolean validarDiaAccidente(String diaAccidente) {
        return diaAccidente != null && diaAccidente.length() == 10;
    }

    public boolean validarHoraAccidente(String horaAccidente) {
        return horaAccidente != null && horaAccidente.length() == 5;
    }

    public boolean validarLugar(String lugar) {
        return lugar != null && lugar.length() >= 10 && lugar.length() <= 50;
    }

    public boolean validarOrigen(String origen) {
        return origen == null || origen.length() <= 100;
    }

    public boolean validarConsecuencia(String consecuencia) {
        return consecuencia == null || consecuencia.length() <= 100;
    }

    public boolean validarIngresoAccidente(Integer idAccidente, String diaAccidente, String horaAccidente, String lugar, String origen, String consecuencia) {
        boolean isIdValid = validarIdAccidente(idAccidente);
        boolean isDiaValid = validarDiaAccidente(diaAccidente);
        boolean isHoraValid = validarHoraAccidente(horaAccidente);
        boolean isLugarValid = validarLugar(lugar);
        boolean isOrigenValid = validarOrigen(origen);
        boolean isConsecuenciaValid = validarConsecuencia(consecuencia);

        return isIdValid && isDiaValid && isHoraValid && isLugarValid && isOrigenValid && isConsecuenciaValid;
    }
}

