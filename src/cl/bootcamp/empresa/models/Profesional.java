package cl.bootcamp.empresa.models;

import java.util.Date;

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * La clase Profesional contiene 2 atributos
 * @version 1.0.0
 * @see Profesional
 */
public class Profesional extends Usuario{

    private String titulo;
    private Date fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, String apellido1, String apellido2, Date fechaNacimiento, String run, String titulo, Date fechaIngreso) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
