package cl.bootcamp.individual31.models;

/**
 * Esta clase contiene los atributos necesarios para el trabajador eventual.
 * Extiende de la clase Trabajador.
 *
 * @author Iván Becerra
 * @version 1.0.0
 */
public class Eventual extends Trabajador{

    private String disponibilidad;
    private String correo;

    public Eventual() {
    }

    public Eventual(String nombre, String primerApellido, String segundoApellido,
                    String run, String telefono, int edad, String disponibilidad, String correo) {
        super(nombre, primerApellido, segundoApellido, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.correo = correo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Llama al método del padre y concatena e imprime por consola la disponibilidad
     * y el correo.
     */
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(", disponibilidad: " + disponibilidad + ", correo: " + correo);
    }

    /**
     * Sobre escritura del método toString.
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() +
                "disponibilidad: " + disponibilidad +
                ", correo: " + correo;
    }
}
