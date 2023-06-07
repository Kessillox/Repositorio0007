package cl.bootcamp.individual33.models;

import cl.bootcamp.individual33.interfaces.IBonoAdicionable;

public class Empleado implements IBonoAdicionable {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public void bonoAdicional() {
        salario = edad > 40 ? salario + 100000 : salario;
    }
}
