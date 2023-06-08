package empresa.entity;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Capacitacion {// se crea la clase Capacitacion

    // se crea los atributos de la clase
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadDeAsistentes;
    Scanner sc = new Scanner(System.in);

    // constructor vacio
    public Capacitacion() {
    }

    // constructor con parametros, atributos de la clase
    public Capacitacion(int identificador, int rut, String dia, String hora, String lugar, String duracion,
            int cantidadDeAsistentes) {
        String id = Integer.toString(identificador);
        if (id.isEmpty()) {
            while (id.isEmpty()) {
                System.out.println("El campo identificador no puede quedar vacío, ingrese un identificador válido.");
                id = sc.nextLine();
            }
            this.identificador = Integer.parseInt(id);
        } else {
            this.identificador = Integer.parseInt(id);
        }
        //Validar rutCliente
        String rutCli = Integer.toString(rut);
        if (rutCli.isEmpty()) {
            while (rutCli.isEmpty()) {
                System.out.println("El campo RUT no puede quedar vacío, ingrese un RUT válido: ");
                rutCli = sc.nextLine();
            }
            this.rutCliente = Integer.parseInt(rutCli);
        } else {
            this.rutCliente = Integer.parseInt(rutCli);
        }
        //Validar día
        switch (dia.toLowerCase()) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
            case "sábado":
            case "domingo":
                System.out.println("Día válido");
                this.dia = dia;
                break;
            default:
                System.out.println("Día inválido");
                break;
        }
        // validar hora
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

        //Validar lugar
        while (lugar.length() < 10 || lugar.length() > 50) {
            System.out.println("El nombre del lugar debe tener entre 10 a 50 caracteres ingreselo nuevamente: ");
            lugar = sc.nextLine();
        }
        this.lugar = lugar;

        //Validar duración
        while (duracion.length() > 70) {
            System.out.println("Se pueden ingresa cómo máximo 70 caracteres ingreselo nuevamente:");
            duracion = sc.nextLine();
        }
        this.duracion = duracion;

        //Validar cantidad de asistents
        if (cantidadDeAsistentes < 100) {
            String cantAsist = Integer.toString(cantidadDeAsistentes);
            if (cantAsist.isEmpty()) {
                while (cantAsist.isEmpty()) {
                    System.out.println("Este campo no puede quedar vacío, ingrese un RUT válido.");
                    cantAsist = sc.nextLine();
                }
                this.cantidadDeAsistentes = Integer.parseInt(cantAsist);
            } else {
                this.cantidadDeAsistentes = Integer.parseInt(cantAsist);
            }
        } else {
            while (cantidadDeAsistentes > 100) {
                System.out.println("La catidad máxima de asistentes permitidos es 100");
                cantidadDeAsistentes = sc.nextInt();
            }
            this.cantidadDeAsistentes = cantidadDeAsistentes;
        }
    }


    // metodos modificadores set y get
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {

        String id = Integer.toString(identificador);
        if (id.isEmpty()) {
            while (id.isEmpty()) {
                System.out.println("El campo identificador no puede quedar vacío, ingrese un identificador válido.");
                id = sc.nextLine();
            }
            this.identificador = Integer.parseInt(id);
        } else {
            this.identificador = Integer.parseInt(id);
        }
    }
    public int getRutCliente() {
        return rutCliente;
    }
    public void setRutCliente(int rutCliente) {

        String rutCli = Integer.toString(rutCliente);
        if (rutCli.isEmpty()) {
            while (rutCli.isEmpty()) {
                System.out.println("El campo RUT no puede quedar vacío, ingrese un RUT válido.");
                rutCli = sc.nextLine();
            }
            this.rutCliente = Integer.parseInt(rutCli);
        } else {
            this.rutCliente = Integer.parseInt(rutCli);
        }
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {

        switch (dia.toLowerCase()) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
            case "sábado":
            case "domingo":
                System.out.println("Día válido");
                this.dia = dia;
                break;
            default:
                System.out.println("Día inválido");
                break;
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
    public String getDuracion() { return duracion;}
    public void setDuracion(String duracion) {

        while (duracion.length() > 70) {
            System.out.println("Se pueden ingresa cómo máximo 70 caracteres ingreselo nuevamente:");
            duracion = sc.nextLine();
        }
        this.duracion = duracion;
    }
    public int getCantidadDeAsistentes() {
        return cantidadDeAsistentes;
    }
    public void setCantidadDeAsistentes(int cantidadDeAsistentes) {

        if (cantidadDeAsistentes < 100) {
            String cantAsist = Integer.toString(cantidadDeAsistentes);
            if (cantAsist.isEmpty()) {
                while (cantAsist.isEmpty()) {
                    System.out.println("Este campo no puede quedar vacío, ingrese una cantidad de asistentes.");
                    cantAsist = sc.nextLine();
                }
                this.cantidadDeAsistentes = Integer.parseInt(cantAsist);
            } else {
                this.cantidadDeAsistentes = Integer.parseInt(cantAsist);
            }
        } else {
            while (cantidadDeAsistentes > 100) {
                System.out.println("La catidad máxima de asistentes permitidos es 100 ingreselo nuevamente: ");
                cantidadDeAsistentes = sc.nextInt();
            }
            this.cantidadDeAsistentes = cantidadDeAsistentes;
        }
    }

    // metodo toString
    @Override
    public String toString() {
        return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora
                + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadDeAsistentes=" + cantidadDeAsistentes
                + "]";
    }

    //Metodo mostrarDetalle
    public String mostrarDetalle(){
        return "“La capacitación será en " +getLugar()+ " las " +getHora()+ " del día " +getDia()+ " durará " +getDuracion()+ " minutos";
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
