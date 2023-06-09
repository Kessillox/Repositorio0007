package empresa.entity;

import empresa.iservices.IAsesoria;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


/**
 * Clase que representa a un Usuario.
 * @author Joaquin Baeza, Cintia Muñoz,Hans Schiess, Oscar Fernandez
 * @Version 1
 *
 *
 *
 */



public class Usuario implements IAsesoria { // se crea la clase Usuario

    private String nombreUsuario;
    private String apellido1;
    private String apellido2;
    private String fechaDeNacimiento;
    private String run;


    /** constructor vacio
     *
     */
    public Usuario() {
    }

    /**
     * Constructor de Usuario que recibe los atributos.
     *
     * @param nombreUsuario     Nombre del usuario.
     * @param apellido1         Primer apellido del usuario.
     * @param apellido2         Segundo apellido del usuario.
     * @param fechaDeNacimiento Fecha de nacimiento del usuario en formato "dd/MM/yyyy".
     * @param run               RUN del usuario.
     */
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

    //Metodo mostrarEdad
    public String mostrarEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(fechaDeNacimiento, formatter);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(date, fechaActual);
        int edad = periodo.getYears();
        return "El usuario tiene " + edad + " años";

    }
    /**
     * Método que analiza y muestra información del usuario implementado desde la Interfaz.
     */

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre usuario: " + getNombreUsuario() + " " + getApellido1() + " " + getApellido2() + ", run usuario: " + getRun());
        System.out.println(mostrarEdad());
    }
}
