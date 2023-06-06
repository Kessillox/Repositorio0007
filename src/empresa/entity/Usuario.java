package empresa.entity;
import empresa.iservices.IAsesoria;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Usuario implements IAsesoria { // se crea la clase Usuario
    // se crea los atributos de la clase
    private String nombreUsuario;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaDeNacimiento;
    private Long run;
    
    // constructor vacio
    public Usuario() {
    }
    
    // constructor con parametros, atributos de la clase
    public Usuario(String nombreUsuario, String apellido1, String apellido2, LocalDate fechaDeNacimiento, Long run) {
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

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        //Se cambia el formato por defecto que tiene el método LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaDeNacimiento = LocalDate.parse(fechaDeNacimiento, formatter);
    }

    public Long getRun() {
        return run;
    }

    public void setRun(Long run) {
        this.run = run;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombreUsuario + apellido1 + apellido1 + ", fechaDeNacimiento=" + fechaDeNacimiento + ", run=" + run + "]";
    }

    //Metodo mostrarEdad
    public String mostrarEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaDeNacimiento, fechaActual);
        return "El usuario tiene "+periodo.getYears()+" Años";

    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre usuario: " + getNombreUsuario() +" " + getApellido1()+" " + getApellido2());
    }
}
