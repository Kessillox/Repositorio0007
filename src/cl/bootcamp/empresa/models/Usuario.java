package cl.bootcamp.empresa.models;

import cl.bootcamp.empresa.interfaces.IAsesoria;

/* Principio de responsabilidad única (SRP - Single Responsibility Principle):
La clase Usuario tiene la responsabilidad de representar los datos de un usuario y proporciona métodos para acceder y modificar esos datos.*/

/* Principio de abierto/cerrado (OCP - Open/Closed Principle):
La clase Usuario está abierta a la extensión, ya que se pueden crear nuevas clases derivadas para representar diferentes tipos de usuarios, sin modificar el código existente.*/

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

    private String fechaNacimiento;

    private String run;

    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, String fechaNacimiento, String run, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
        this.edad = edad;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarEdad() {
        System.out.println(nombre + " tiene " + edad + " años");
    }

    @Override
    public void analizarUsuario() {
        System.out.print(nombre + " " + apellido1 + " " + apellido2);
    }

    @Override
    public String toString() {
        return "nombre: " + nombre +
                ", apellido1: " + apellido1 +
                ", apellido2: " + apellido2 +
                ", fecha nacimiento: " + fechaNacimiento +
                ", run: " + run +
                ", edad: " + edad;
    }
}
