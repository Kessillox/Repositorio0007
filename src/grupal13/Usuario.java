package grupal13;

/**
 * Clase que almacena la informacion del usuario
 * @author Juan Merino
 * @version 1.0
 */
public class Usuario {
    String nombre, fechaNacimiento, run;

    /**
     * Método toString()
     * @return String de informacion de la clase ordenada y legible
     */
    public String toString() {
        return "\nClase Usuario\n"
                + "Nombre: " + nombre + "\n"
                + "Fecha de Nacimiento: " + fechaNacimiento + "\n"
                + "RUN: " + run + "\n";
    }

    /**
     * Constructor que no recibe parametros
     */
    Usuario() { }

    /**
     * Constructor que recibe todos los atributos como parametros
     * @param nombre          Nombre del usuario, String
     * @param fechaNacimiento Fecha de Nacimiento del usuario, String
     * @param run             RUN del usuario, string
     */
    Usuario(String nombre, String fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }
}