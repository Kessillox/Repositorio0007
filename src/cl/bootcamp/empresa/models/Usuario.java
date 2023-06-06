package cl.bootcamp.empresa.models;

import cl.bootcamp.empresa.interfaces.IAsesoria;

import java.util.Date;

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * La clase Usuario contiene 5 atributos
 * @version 1.0.0
 * @see Usuario
 */
public class Usuario implements IAsesoria {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fechaNacimiento;
    private String run;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, Date fechaNacimiento, String run) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public void mostrarEdad() {
        System.out.println(nombre + " tiene " + edad + " años");
    }

    @Override
    public void analizarUsuario() {
        System.out.println(nombre + " " + apellido1 + " " + apellido2);
    }
}
