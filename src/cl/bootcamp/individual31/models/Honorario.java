package cl.bootcamp.individual31.models;

import java.util.Date;

/**
 * Esta clase contiene los atributos necesarios para el trabajador a honorarios.
 * Extiende de la clase Trabajador.
 *
 * @author Iván Becerra
 * @version 1.0.0
 */
public class Honorario extends Trabajador {

    private String giro;
    private Date anioIniciacionActividades;

    public Honorario() {
    }

    public Honorario(String nombre, String primerApellido, String segundoApellido,
                     String run, String telefono, int edad, String giro, Date anioIniciacionActividades) {
        super(nombre, primerApellido, segundoApellido, run, telefono, edad);
        this.giro = giro;
        this.anioIniciacionActividades = anioIniciacionActividades;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public Date getAnioIniciacionActividades() {
        return anioIniciacionActividades;
    }

    public void setAnioIniciacionActividades(Date anioIniciacionActividades) {
        this.anioIniciacionActividades = anioIniciacionActividades;
    }

    /**
     * Llama al método del padre y concatena e imprime por consola el giro
     * y el año de iniciación de actividades.
     */
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(", giro: " + giro +
                ", año de iniciación de actividades: " + anioIniciacionActividades);
    }

    /**
     * Sobre escritura del método toString.
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() +
                ", giro: " + giro +
                ", año de iniciación de actividades: " + anioIniciacionActividades;
    }
}
