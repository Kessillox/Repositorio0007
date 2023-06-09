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

        // Instancias de la clase Usuario
        Usuario usuario1 = new Usuario();

        usuario1.setNombreUsuario("John");
        usuario1.setApellido1("Doe");
        usuario1.setApellido2("Smith");
        usuario1.setFechaDeNacimientoUsuario("30/12/2020");
        usuario1.setRunUsuario("12345678-9");
        usuario1.setRutEmpresa("12345678-9");

        System.out.println("Ingrese Nombre: " + usuario1.getNombreUsuario());
        System.out.println("Ingrese Apellido Paterno: " + usuario1.getApellido1());
        System.out.println("Ingrese Apellido Materno: " + usuario1.getApellido2());
        System.out.println("Ingrese Fecha de Nacimiento: " + usuario1.getFechaDeNacimientoUsuario());
        System.out.println("Ingrese RUN: " + usuario1.getRunUsuario());
        System.out.println("Ingrese RUT Empresa: " + usuario1.getRutEmpresa());

        Usuario usuario2 = new Usuario();

        usuario2.setNombreUsuario("Pedro");
        usuario2.setApellido1("Ortega");
        usuario2.setApellido2("Rocha");
        usuario2.setFechaDeNacimientoUsuario("01/03/1996");
        usuario2.setRunUsuario("19077957-8");
        usuario2.setRutEmpresa("12345678-9");

        System.out.println("Ingrese Nombre: " + usuario2.getNombreUsuario());
        System.out.println("Ingrese Apellido Paterno: " + usuario2.getApellido1());
        System.out.println("Ingrese Apellido Materno: " + usuario2.getApellido2());
        System.out.println("Ingrese Fecha de Nacimiento: " + usuario2.getFechaDeNacimientoUsuario());
        System.out.println("Ingrese RUN: " + usuario2.getRunUsuario());
        System.out.println("Ingrese RUT Empresa: " + usuario2.getRutEmpresa());

        Usuario usuario3 = new Usuario();

        usuario3.setNombreUsuario("Emilia");
        usuario3.setApellido1("Cortez");
        usuario3.setApellido2("Garrido");
        usuario3.setFechaDeNacimientoUsuario("19/07/1982");
        usuario3.setRunUsuario("16743158-9");
        usuario3.setRutEmpresa("12345678-9");

        System.out.println("Ingrese Nombre: " + usuario3.getNombreUsuario());
        System.out.println("Ingrese Apellido Paterno: " + usuario3.getApellido1());
        System.out.println("Ingrese Apellido Materno: " + usuario3.getApellido2());
        System.out.println("Ingrese Fecha de Nacimiento: " + usuario3.getFechaDeNacimientoUsuario());
        System.out.println("Ingrese RUN: " + usuario3.getRunUsuario());
        System.out.println("Ingrese RUT Empresa: " + usuario3.getRutEmpresa());

        Usuario usuario4 = new Usuario();

        usuario4.setNombreUsuario("Sebastián");
        usuario4.setApellido1("Zapata");
        usuario4.setApellido2("Cruz");
        usuario4.setFechaDeNacimientoUsuario("12/08/1990");
        usuario4.setRunUsuario("18898635-1");
        usuario4.setRutEmpresa("12345678-9");

        System.out.println("Ingrese Nombre: " + usuario4.getNombreUsuario());
        System.out.println("Ingrese Apellido Paterno: " + usuario4.getApellido1());
        System.out.println("Ingrese Apellido Materno: " + usuario4.getApellido2());
        System.out.println("Ingrese Fecha de Nacimiento: " + usuario4.getFechaDeNacimientoUsuario());
        System.out.println("Ingrese RUN: " + usuario4.getRunUsuario());
        System.out.println("Ingrese RUT Empresa: " + usuario4.getRutEmpresa());

        Usuario usuario5 = new Usuario();

        usuario5.setNombreUsuario("Jose");
        usuario5.setApellido1("Dominguez");
        usuario5.setApellido2("Aguayo");
        usuario5.setFechaDeNacimientoUsuario("11/09/1995");
        usuario5.setRunUsuario("19754610-5");
        usuario5.setRutEmpresa("12345678-9");

        System.out.println("Ingrese Nombre: " + usuario5.getNombreUsuario());
        System.out.println("Ingrese Apellido Paterno: " + usuario5.getApellido1());
        System.out.println("Ingrese Apellido Materno: " + usuario5.getApellido2());
        System.out.println("Ingrese Fecha de Nacimiento: " + usuario5.getFechaDeNacimientoUsuario());
        System.out.println("Ingrese RUN: " + usuario5.getRunUsuario());
        System.out.println("Ingrese RUT Empresa: " + usuario5.getRutEmpresa());

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
        cli.setRunUsuario(validarRun(sc.nextLine(),"RUN"));
        System.out.println("Ingrese Nombre Empresa: ");
        cli.setNombreEmpresa(cadenaMinimoMaximoLenght(sc.nextLine(),5,30,
                "Ingrese Nombre Empresa válido: ",true));
        System.out.println("Ingrese Giro Empresa: ");
        cli.setGiroEmpresa(sc.nextLine());
        System.out.println("Ingrese RUT: ");
        cli.setRutEmpresa(validarRun(sc.nextLine(),"RUT"));
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
        pro.setFechaDeNacimientoUsuario(validacionFecha(sc.nextLine(), true));
        System.out.println("Ingrese RUN: ");
        pro.setRunUsuario(validarRun(sc.nextLine(),"RUN"));
        System.out.println("Ingrese Titulo: ");
        pro.setTitulo(cadenaMinimoMaximoLenght(sc.nextLine(),5,20,
                "Ingrese Titulo válido: ",true));
        System.out.println("Ingrese la fecha de ingreso: ");
        pro.setFechaDeIngreso(validacionFecha(sc.nextLine(), true));
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
        adm.setFechaDeNacimientoUsuario(validacionFecha(sc.nextLine(), true));
        System.out.println("Ingrese RUN: ");
        adm.setRunUsuario(validarRun(sc.nextLine(),"RUN"));
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
        //System.out.println("Ingrese ID: ");
        cap.setIdCapacitacion(validarInt("Ingrese ID: "));
        sc.nextLine();
        System.out.println("Ingrese Rut Empresa: ");
        cap.setRutEmpresa(validarRun(sc.nextLine(),"RUT"));
        System.out.println("Ingrese fecha: ");
        cap.setDiaCapacitacion(validacionFecha(sc.nextLine(), true));
        System.out.println("Ingrese Hora: ");
        cap.setHoraCapacitacion(validarHora(sc.nextLine()));
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

    public static String validarRun(String cadena,String tipoIdentidad){
        boolean valido = false;
        while (!valido){
            int posicionGuion=-1, intNumerosRun=0;
            String strNumerosRun ="";

            for (int i = 0; i < cadena.length() ; i++) {
                char caracter = cadena.charAt(i);
                if(caracter=='-'){
                    posicionGuion = i;
                }
            }
            if(posicionGuion!=-1){
                for (int x=0; x <= posicionGuion; x++){
                    char caracter = cadena.charAt(x);
                    if(Character.isDigit(caracter)){
                        strNumerosRun +=String.valueOf(caracter);
                    }
                }
            }else{
                for (int x=0; x < cadena.length(); x++){
                    char caracter = cadena.charAt(x);
                    if(Character.isDigit(caracter)){
                        strNumerosRun +=String.valueOf(caracter);
                    }
                }
            }  if(!strNumerosRun.isEmpty()){intNumerosRun = Integer.parseInt(strNumerosRun);}

            if (intNumerosRun > 99999999 || intNumerosRun==0){
                System.out.println("El "+tipoIdentidad+" "+ intNumerosRun +" no es valido <(u_u)>");
                System.out.println("99.999.999-k");
                System.out.println("Ingrese un "+tipoIdentidad+" valido: <(¬_¬)>");
                cadena=sc.nextLine();
            }else{
                valido=true;
            }
        }
        return cadena;
    }

    public static String validarHora(String horaCadena){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora= null;
        boolean validar = false;
        while (!validar) {
            try {
                hora = LocalTime.parse(horaCadena, formato);
                horaCadena = String.valueOf(hora);
                validar = true;
            } catch (DateTimeParseException e) {
                System.out.println("<(¬_¬)> Formato correcto HH:mm, ejemplo: 23:59");
                System.out.println("Ingrese una hora correcta: ");
                horaCadena = sc.nextLine();
                validar = false;
            }
        }
        System.out.println(hora);
        System.out.println(horaCadena);
        return  horaCadena;
    }

    public boolean validacionIdRevision (String idRevision){
        try {
            Integer.parseInt(idRevision);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * @deprecated
     */
    public boolean validacionIdVisita(String idVisitaTerreno) {
        try {
            Integer.parseInt(idVisitaTerreno);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * @deprecated
     */
    public boolean validacionNombreRevision(String nombre) {
        if (nombre.length() > 50 || nombre.length() < 10) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @deprecated
     */
    public boolean validacionDetalleRevision(String detalle) {
        if (detalle.length() <= 100) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @deprecated
     */
    public boolean validacionEstadoRevision(int estado) {

        return estado <= 3 && estado >= 1;
    }

    private static String validacionFecha(String fecha, boolean obligatorio) {
        LocalDate fechaFormateada;
        DateTimeFormatter formateadorFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (obligatorio) {

            if (fecha.isEmpty()) {
                return "Sin Fecha";
            }

            try {
                fechaFormateada = LocalDate.parse(fecha, formateadorFecha);
                obligatorio = false;
                return fechaFormateada.toString();
            } catch (DateTimeParseException error) {
                System.out.println("Fecha Ingresada no cumple el formato. Intente nuevamente (dd/MM/yyyy).");
                fecha = sc.nextLine();
                }
            }

        return "Sin Fecha";
    }

    /**
     * @deprecated
     */
    public boolean validacionHora(String hora) {
        if (hora.isEmpty()) {
            return false;
        } else {
            String[] horaSeparada = hora.split(":");
            if (horaSeparada.length != 2) {
                return false;
            } else {
                try {
                    int digitosHora = Integer.parseInt(horaSeparada[0]);
                    if (digitosHora < 0 || digitosHora > 23) {
                        return false;
                    }
                    int digitosMinutos = Integer.parseInt(horaSeparada[1]);
                    if (digitosMinutos < 0 || digitosMinutos > 59) {
                        return false;
                    }
                } catch (NumberFormatException error) {
                    return false;
                }
                return true;
            }
        }
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

