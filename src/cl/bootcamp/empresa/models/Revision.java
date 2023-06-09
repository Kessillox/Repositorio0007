package cl.bootcamp.empresa.models;

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * @version 1.1.0
 * @see Revision
 * Creación de la clase Revision, contiene 4 atributos
 */

public class Revision {

    private int id;

    private String nombre;

    private String detalle;

    private String estado;

    public Revision() {
    }

    /**
     * Constructor que inicializa los parámetros del objeto Revision
     *
     * @param id
     * @param nombre
     * @param detalle
     * @param estado
     */
    public Revision(int id, String nombre, String detalle, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Sobrescritura del método toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return "id: " + id +
                ", nombre: " + nombre +
                ", detalle: " + detalle +
                ", estado: " + estado;
    }
}
