package cl.bootcamp.individual27.models;

import cl.bootcamp.individual27.emuns.Parentesco;

/**
 * Esta clase tiene los atributos necesarios para la carga familiar.
 *
 * @author Iván Becerra
 * @version 1.0.0
 */
public class CargaFamiliar {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String run;
    private Parentesco parentesco;
    private int edad;

    public CargaFamiliar() {
    }

    public CargaFamiliar(String nombre, String primerApellido, String segundoApellido,
                         String run, Parentesco parentesco, int edad) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.run = run;
        this.parentesco = parentesco;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public Parentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Sobre escritura del método toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return "nombre: " + nombre +
                ", primerApellido: " + primerApellido +
                ", segundoApellido: " + segundoApellido +
                ", run: " + run +
                ", parentesco: " + parentesco +
                ", edad=" + edad + '\n';
    }
}
