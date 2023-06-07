package cl.bootcamp.individual33.models;

import cl.bootcamp.individual33.interfaces.IDisponible;

public class Repartidor extends Empleado implements IDisponible {

    private String disponibilidad;

    public Repartidor() {
    }

    public Repartidor(String nombre, String apellido, int edad, double salario, String disponibilidad) {
        super(nombre, apellido, edad, salario);
        this.disponibilidad = disponibilidad;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public void bonoAdicional() {
        super.bonoAdicional();
        salario = edad < 30 ? salario + 15000 : salario;
    }

    @Override
    public void disponibilidad() {
        System.out.println("La disponibilidad horaria es: " + disponibilidad);
    }
}
