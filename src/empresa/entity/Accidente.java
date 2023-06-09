package empresa.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Accidente {
    //Atributos de la clase Accidente
    private int idAcc;
    private int rutCliente;
    private String diaAcc;
    private  String horaAcc;
    private String lugarAcc;
    private String origenAcc;
    private String consecuencias;
    Scanner sc = new Scanner(System.in);

    //Constructor vacío
    public Accidente() {
    }

    //Constructor con atributos de la clase Accidente
    public Accidente(int idAcc, int rutCliente, String diaAcc, String horaAcc, String lugarAcc, String origenAcc, String consecuencias) {
        String id = Integer.toString(idAcc);
        while (id.isEmpty()) {
            System.out.println("El campo identificador no puede quedar vacío, ingrese un identificador válido.");
            id = sc.nextLine();
        }
        this.idAcc = Integer.parseInt(id);


        //Validar rutCliente
        String rutCli = Integer.toString(rutCliente);
        while (rutCli.isEmpty()) {
            System.out.println("El campo RUT no puede quedar vacío, ingrese un RUT válido: ");
            rutCli = sc.nextLine();
        }
        this.rutCliente = Integer.parseInt(rutCli);


        // Intentar analizar la fecha como una cadena
        Date fecha = null;
        try {
            fecha = parseFecha(diaAcc);
        } catch (ParseException e) {
            System.out.println("La fecha no es válida.");
        }

        if (fecha != null) {
            // Formatear la fecha como "DD/MM/AAAA"
            String fechaFormateada = formatFecha(fecha);
            this.diaAcc = diaAcc;
            System.out.println("Fecha formateada: " + fechaFormateada);
        }


        if (validarHora(horaAcc)) {
            System.out.println("Hora válida");
            this.horaAcc = horaAcc;
        } else {
            while (!validarHora(horaAcc)) {
                System.out.println("Hora inválida ingresela nuevamente: ");
                horaAcc = sc.nextLine();
            }
            this.horaAcc = horaAcc;
        }
        while (lugarAcc.length() < 10 || lugarAcc.length() > 50) {
            System.out.println("El nombre del lugar debe tener entre 10 a 50 caracteres ingreselo nuevamente: ");
            lugarAcc = sc.nextLine();
        }
        this.lugarAcc = lugarAcc;

        while (origenAcc.length() > 100) {
            System.out.println("Se pueden ingresa cómo máximo 100 caracteres ingreselo nuevamente:");
            origenAcc = sc.nextLine();
        }
        this.origenAcc = origenAcc;

        while (consecuencias.length() > 100) {
            System.out.println("Se pueden ingresa cómo máximo 100 caracteres ingreselo nuevamente:");
            consecuencias = sc.nextLine();
        }
        this.consecuencias = consecuencias;
    }

    //Getters y setters
    public int getIdAcc() {
        return idAcc;
    }

    public void setIdAcc(int idAcc) {

        String id = Integer.toString(idAcc);
        while (id.isEmpty()) {
            System.out.println("El campo identificador no puede quedar vacío, ingrese un identificador válido.");
            id = sc.nextLine();
        }
        this.idAcc = Integer.parseInt(id);
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {

        String rutCli = Integer.toString(rutCliente);
        while (rutCli.isEmpty()) {
            System.out.println("El campo RUT no puede quedar vacío, ingrese un RUT válido: ");
            rutCli = sc.nextLine();
        }
        this.rutCliente = Integer.parseInt(rutCli);
    }

    public String getDiaAcc() {
        return diaAcc;
    }

    public void setDiaAcc(String diaAcc) {

        // Intentar analizar la fecha como una cadena
        Date fecha = null;
        try {
            fecha = parseFecha(diaAcc);
        } catch (ParseException e) {
            System.out.println("La fecha no es válida.");
        }

        if (fecha != null) {
            // Formatear la fecha como "DD/MM/AAAA"
            String fechaFormateada = formatFecha(fecha);
            this.diaAcc = diaAcc;
            System.out.println("Fecha formateada: " + fechaFormateada);
        }
    }

    public String getHoraAcc() {
        return horaAcc;
    }

    public void setHoraAcc(String horaAcc) {

        if (validarHora(horaAcc)) {
            System.out.println("Hora válida");
            this.horaAcc = horaAcc;
        } else {
            while (!validarHora(horaAcc)) {
                System.out.println("Hora inválida ingresela nuevamente: ");
                horaAcc = sc.nextLine();
            }
            this.horaAcc = horaAcc;
        }
    }

    public String getLugarAcc() {
        return lugarAcc;
    }

    public void setLugarAcc(String lugarAcc) {
        while (lugarAcc.length() < 10 || lugarAcc.length() > 50) {
            System.out.println("El nombre del lugar debe tener entre 10 a 50 caracteres ingreselo nuevamente: ");
            lugarAcc = sc.nextLine();
        }
        this.lugarAcc = lugarAcc;
    }

    public String getOrigenAcc() {
        return origenAcc;
    }

    public void setOrigenAcc(String origenAcc) {
        while (origenAcc.length() > 100) {
            System.out.println("Se pueden ingresa cómo máximo 100 caracteres ingreselo nuevamente:");
            origenAcc = sc.nextLine();
        }
        this.origenAcc = origenAcc;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {

        while (consecuencias.length() > 100) {
            System.out.println("Se pueden ingresa cómo máximo 100 caracteres ingreselo nuevamente:");
            consecuencias = sc.nextLine();
        }
        this.consecuencias = consecuencias;
    }

    //Método toString
    @Override
    public String toString() {
        return "Accidente{" +
                "idAcc=" + idAcc +
                ", rutCliente=" + rutCliente +
                ", diaAcc='" + diaAcc + '\'' +
                ", horaAcc='" + horaAcc + '\'' +
                ", lugarAcc='" + lugarAcc + '\'' +
                ", origenAcc='" + origenAcc + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }

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




    public static Date parseFecha(String fechaString) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(fechaString);
    }

    public static String formatFecha(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }







    
}
