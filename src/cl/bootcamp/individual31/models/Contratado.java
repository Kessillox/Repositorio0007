package cl.bootcamp.individual31.models;

import java.util.Date;

/**
 * Esta clase contiene los atributos necesarios para el trabajador con contrato.
 * Extiende de la clase Trabajador.
 *
 * @author Iván Becerra
 * @version 1.0.0
 */
public class Contratado extends Trabajador{

    private Date fechaIngreso;
    private double salarioMensual;

    public Contratado() {
    }

    public Contratado(String nombre, String primerApellido, String segundoApellido,
                      String run, String telefono, int edad, Date fechaIngreso, double slarioMensual) {
        super(nombre, primerApellido, segundoApellido, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = slarioMensual;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    /**
     * Llama al método del padre y concatena e imprime por consola la fecha de ingreso
     * y el salario mensual.
     */
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(", fecha de ingreso: " + fechaIngreso +
                ", salario mensual: " + salarioMensual);
    }

    /**
     * Sobre escritura del método toString.
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() +
                "fecha de ingreso: " + fechaIngreso +
                ", salario mensual: " + salarioMensual;
    }
}
