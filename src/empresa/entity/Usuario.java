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

        //Validar nombre y apellidos con la cantidad de caracteres necesarios
        if (nombreUsuario.length() < 3 || nombreUsuario.length() > 20) {
            throw new IllegalArgumentException("El nombre debe tener entre 3 y 20 caracteres.");
        }
        this.nombreUsuario = nombreUsuario;
        if (apellido1.length() < 3 || apellido1.length() > 20) {
            throw new IllegalArgumentException("El nombre debe tener entre 3 y 20 caracteres.");
        }
        this.apellido1 = apellido1;
        if (apellido2.length() < 3 || apellido2.length() > 20) {
            throw new IllegalArgumentException("El nombre debe tener entre 3 y 20 caracteres.");
        }
        this.apellido2 = apellido2;


        //Validar fecha de nacimiento
        while (fechaDeNacimiento.isEmpty()){ //Si viene en blanco entra al while, de lo contrario pasa de largo.
            if (fechaDeNacimiento.isEmpty()) {
                throw new IllegalArgumentException("La fecha de nacimiento no puede quedar vacía");
            }
            if (!validarFormatoFecha(fechaDeNacimiento)) {
                throw new IllegalArgumentException("El formato de la fecha de nacimiento es incorrecto. Debe ser dd/MM/yyyy");
            }
        }
        this.fechaDeNacimiento = fechaDeNacimiento;


        //Validar run
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
        if (nombreUsuario.length() < 3 || nombreUsuario.length() > 20) {
            throw new IllegalArgumentException("El nombre debe tener entre 3 y 20 caracteres.");
        }
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        if (apellido1.length() < 3 || apellido1.length() > 20) {
            throw new IllegalArgumentException("El nombre debe tener entre 3 y 20 caracteres.");
        }
        this.apellido1 = apellido1;
    }

    public String getApellido2() {

        return apellido2;
    }

    public void setApellido2(String apellido2) {
        if (apellido2.length() < 3 || apellido2.length() > 20) {
            throw new IllegalArgumentException("El nombre debe tener entre 3 y 20 caracteres.");
        }
        this.apellido2 = apellido2;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {

        if (fechaDeNacimiento.isEmpty()) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede quedar vacía");
        }
        if (!validarFormatoFecha(fechaDeNacimiento)) {
            throw new IllegalArgumentException("El formato de la fecha de nacimiento es incorrecto. Debe ser dd/MM/yyyy");
        }
        this.fechaDeNacimiento = fechaDeNacimiento;

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
