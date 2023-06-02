package cl.bootcamp.individual27.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase tiene los atributos necesarios para el trabajador.
 *
 * @author Iván Becerra
 * @version 1.1.0
 */
public class Trabajador {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String run;
    private int edad;
    private List<CargaFamiliar> cargasFamiliares;

    public Trabajador() {
        cargasFamiliares = new ArrayList<>();
    }

    public Trabajador(String nombre, String primerApellido, String segundoApellido, String run, int edad) {
        this();
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.run = run;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<CargaFamiliar> getCargasFamiliares() {
        return cargasFamiliares;
    }

    /**
     * Este método recibe por parámetro una lista del tipo CargaFamiliar
     * y agrega cada carga a la lista cargasFamiliares
     *
     * @param cargasFamiliares
     */
    public void addCargaFamiliar(List<CargaFamiliar> cargasFamiliares) {
        for (CargaFamiliar cargaFamiliar : cargasFamiliares) {
            this.cargasFamiliares.add(cargaFamiliar);
        }
    }

    /**
     * Concatena los atributos del nombre y los dos apellidos y los retorna.
     *
     * @return String
     */
    public String nombreCompleto() {
        return nombre + " " + primerApellido + " " + segundoApellido;
    }

    /**
     * Descompone el RUN excluyendo el guion y el número verificador y los retorna.
     *
     * @return
     */
    public int descomponerRun() {
        int index = this.run.indexOf("-");
        return Integer.parseInt(run.substring(0, index));
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
                ", edad: " + edad +
                "\n" + cargasFamiliares;
    }
}
