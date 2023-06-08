package empresa.entity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class VisitaTerreno {
    private int idVisit;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;
    Scanner sc = new Scanner(System.in);

    public VisitaTerreno() {
    }

    public VisitaTerreno(int idVisit, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        String id = Integer.toString(idVisit);
        while (id.isEmpty()) {
            System.out.println("El campo identificador no puede quedar vacío, ingrese un identificador válido.");
            id = sc.nextLine();
        }
        this.idVisit = idVisit;

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
            fecha = parseFecha(dia);
        } catch (ParseException e) {
            System.out.println("La fecha no es válida.");
        }

        if (fecha != null) {
            // Formatear la fecha como "DD/MM/AAAA"
            String fechaFormateada = formatFecha(fecha);
            this.dia = dia;
            System.out.println("Fecha formateada: " + fechaFormateada);
        }

        if (validarHora(hora)) {
            System.out.println("Hora válida");
            this.hora = hora;
        } else {
            while (!validarHora(hora)) {
                System.out.println("Hora inválida ingresela nuevamente: ");
                hora = sc.nextLine();
            }
            this.hora = hora;
        }

        while (lugar.length() < 10 || lugar.length() > 50) {
            System.out.println("El nombre del lugar debe tener entre 10 a 50 caracteres ingreselo nuevamente: ");
            lugar = sc.nextLine();
        }
        this.lugar = lugar;

        while (comentarios.length() > 100) {
            System.out.println("Se pueden ingresa cómo máximo 100 caracteres ingreselo nuevamente:");
            comentarios = sc.nextLine();
        }
        this.comentarios = comentarios;
    }

    public int getIdVisit() {
        return idVisit;
    }

    public void setIdVisit(int idVisit) {
        String id = Integer.toString(idVisit);
        while (id.isEmpty()) {
            System.out.println("El campo identificador no puede quedar vacío, ingrese un identificador válido.");
            id = sc.nextLine();
        }
        this.idVisit = idVisit;
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {

        Date fecha = null;
        try {
            fecha = parseFecha(dia);
        } catch (ParseException e) {
            System.out.println("La fecha no es válida.");
        }

        if (fecha != null) {
            // Formatear la fecha como "DD/MM/AAAA"
            String fechaFormateada = formatFecha(fecha);
            this.dia = dia;
            System.out.println("Fecha formateada: " + fechaFormateada);
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {

        if (validarHora(hora)) {
            System.out.println("Hora válida");
            this.hora = hora;
        } else {
            while (!validarHora(hora)) {
                System.out.println("Hora inválida ingresela nuevamente: ");
                hora = sc.nextLine();
            }
            this.hora = hora;
        }
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {

        while (lugar.length() < 10 || lugar.length() > 50) {
            System.out.println("El nombre del lugar debe tener entre 10 a 50 caracteres ingreselo nuevamente: ");
            lugar = sc.nextLine();
        }
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {

        while (comentarios.length() > 100) {
            System.out.println("Se pueden ingresa cómo máximo 100 caracteres ingreselo nuevamente:");
            comentarios = sc.nextLine();
        }
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "idVisit=" + idVisit +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }

    public static Date parseFecha(String fechaString) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(fechaString);
    }

    public static String formatFecha(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
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
}
