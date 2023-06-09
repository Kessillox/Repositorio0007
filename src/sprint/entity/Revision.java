package sprint.entity;
/**
 * @author Nazly SotoLabarca
 * @version 1
 * var nombre, apellido1, apellido2, fechaNacimiento, run, area, experienciaPrevia
 * **/

public class Revision {
    private int id;
    private String nombre;
    private String detalle;
    private String estado;

    /**
     * se crea constructor vacio.
     */
    public Revision() {
    }

    /**
     * se crea constructor con parametros.
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
     * se crea toString que retorna todos los parametros.
     * @return
     */
    @Override
    public String toString() {
        return "Revision{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
