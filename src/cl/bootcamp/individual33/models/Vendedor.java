package cl.bootcamp.individual33.models;

import cl.bootcamp.individual33.interfaces.IFechaInicio;

import java.util.Date;

public class Vendedor extends Empleado implements IFechaInicio {

    private Date fechaInicio;

    public Vendedor() {
    }

    public Vendedor(String nombre, String apellido, int edad, double salario, Date fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public void bonoAdicional() {
        super.bonoAdicional();
        this.salario += 50000;
    }

    @Override
    public void saberFechaInicio() {
        System.out.println("La fecha de inicio es el " + fechaInicio);
    }
}
