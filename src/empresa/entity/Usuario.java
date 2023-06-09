package empresa.entity;
import empresa.iservices.IAsesoria;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Usuario implements IAsesoria { // se crea la clase Usuario
    // se crea los atributos de la clase
    private String nombreUsuario;
    private String apellido1;
    private String apellido2;
    private String fechaDeNacimiento;
    private String run;
    Scanner sc = new Scanner(System.in);
    
    // constructor vacio
    public Usuario() {
    }
    
    // constructor con parametros, atributos de la clase
    public Usuario(String nombreUsuario, String apellido1, String apellido2, String fechaDeNacimiento, String run) {

        this.nombreUsuario = nombreUsuario;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.run = run;
    }

    // metodos modificadores set y get
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;

    }


    public String getRun() {
        return run;
    }

    public void setRun(String run) {
            this.run = run;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombreUsuario + apellido1 + apellido1 + ", fechaDeNacimiento=" + fechaDeNacimiento + ", run=" + run + "]";
    }

    private boolean validarFormatoFecha(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate.parse(fecha, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Metodo mostrarEdad
    public String mostrarEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(fechaDeNacimiento, formatter);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(date, fechaActual);
        int edad = periodo.getYears();
        return "El usuario tiene " + edad + " años";

    }

    //Método analizarUsuario implementado desde la interfaz
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre usuario: " + getNombreUsuario() +" " + getApellido1()+" " + getApellido2() + ", run usuario: " +getRun());
        System.out.println(mostrarEdad() );
    }
}
