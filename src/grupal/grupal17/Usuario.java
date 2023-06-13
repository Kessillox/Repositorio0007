package grupal.grupal17;

import java.time.LocalDate;
import java.time.Period;

/**
 * Clase que representa a un Usuario.
 * @author Joaquin Baeza, Cintia Muñoz,Hans Schiess, Oscar Fernandez
 * @Version 1.0
 */

//PRINCIPIOS SOLID EN CLASE USUARIO
/*
* •	Clase Usuario: Principios SOLID que se cumplen:

1.	Principio de Responsabilidad Única (SRP): La clase Usuario tiene
*   una única responsabilidad, que es representar a un usuario y proporcionar
*   métodos relacionados con la gestión de usuarios.
2.	Principio de Abierto/Cerrado (OCP): La clase Usuario no está diseñada
*   para ser extendida (no es declarada como public abstract ni tiene métodos
*   o propiedades abstract). Sin embargo, los métodos y atributos pueden ser
*   modificados y extendidos en subclases.
*/
public class Usuario implements Asesoria { // se crea la clase Usuario
    // se crea los atributos de la clase
    private String nombreUsuario;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaDeNacimiento;
    private String run;
    
    // constructor vacio
    public Usuario() {
    }
    
    // constructor con parametros, atributos de la clase
    public Usuario(String nombreUsuario, String apellido1, String apellido2, LocalDate fechaDeNacimiento, String run) {
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

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
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


    /**
     * Método mostrarEdad
     * @return La edad del usuario
     */
    public String mostrarEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaDeNacimiento, fechaActual);
        return "El usuario tiene "+periodo.getYears()+" Años";

    }

    /**
     * Método que analiza y muestra información del usuario implementado desde la Interfaz.
     */
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre usuario: " + getNombreUsuario() +" " + getApellido1()+" " + getApellido2());
    }
}
