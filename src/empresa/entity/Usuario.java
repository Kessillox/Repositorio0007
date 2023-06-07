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
    private int run;
    Scanner sc = new Scanner(System.in);
    
    // constructor vacio
    public Usuario() {
    }
    
    // constructor con parametros, atributos de la clase
    public Usuario(String nombreUsuario, String apellido1, String apellido2, String fechaDeNacimiento, int run) {
        if (nombreUsuario.length() < 10 || nombreUsuario.length() > 50) {
            throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres.");
        }
        this.nombreUsuario = nombreUsuario;
        if (apellido1.length() < 10 || apellido1.length() > 50) {
            throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres.");
        }
        this.apellido1 = apellido1;
        if (apellido2.length() < 10 || apellido2.length() > 50) {
            throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres.");
        }
        this.apellido2 = apellido2;



        while (fechaDeNacimiento.isEmpty()){ //Si viene en blanco entra al while, de lo contrario pasa de largo.
            System.out.println("Dato no puede estar vacío, debe ingresar fecha de nacimiento con el siguiente formato DD/MM/YYYY");
            fechaDeNacimiento = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                LocalDate localDate = LocalDate.parse(fechaDeNacimiento, formatter);
            } catch (Exception e){
                System.out.println("Formato de fecha no valido");
            }
            this.fechaDeNacimiento = fechaDeNacimiento;
        }


        if (run < 999999999) {
            this.run = run;
        } else {
            while (run > 999999999) {
                System.out.println("El run no debe ser mayor a 99999999, vuelva a ingrear un run correcto.");
                run = sc.nextInt();
            }
            this.run = run;
        }
    }

    // metodos modificadores set y get
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario.length() < 10 || nombreUsuario.length() > 50) {
            throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres.");
        }
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

        while (fechaDeNacimiento.isEmpty()){ //Si viene en blanco entra al while, de lo contrario pasa de largo.
            System.out.println("Dato no puede estar vacío, debe ingresar fecha de nacimiento con el siguiente formato DD/MM/YYYY");
            fechaDeNacimiento = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                LocalDate localDate = LocalDate.parse(fechaDeNacimiento, formatter);
            } catch (Exception e){
                System.out.println("Formato de fecha no valido");
            }
            this.fechaDeNacimiento = fechaDeNacimiento;
        }

    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        if (run < 999999999) {
            this.run = run;
        } else {
            while (run > 999999999) {
                System.out.println("El run no debe ser mayor a 99999999, vuelva a ingrear un run correcto.");
                run = sc.nextInt();
            }
            this.run = run;
        }
    }

    // metodo toString
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombreUsuario + apellido1 + apellido1 + ", fechaDeNacimiento=" + fechaDeNacimiento + ", run=" + run + "]";
    }

    //Metodo mostrarEdad
   /* public String mostrarEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.parse(fechaDeNacimiento, formatter);
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return "El usuario tiene " + periodo.getYears() + " años";

    }*/

    //Método analizarUsuario implementado desde la interfaz
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre usuario: " + getNombreUsuario() +" " + getApellido1()+" " + getApellido2() + ", run usuario: " +getRun());
    }
}
