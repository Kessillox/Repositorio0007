/**
 * Esta clase actualmente no tiene uso
 * @author Natalia Perez
 */

public class Revision {
    private int id;
    private int idVisita;
    private String nombre;
    private String detalles;
    private int estado;

    public Revision() {}

    public Revision(int id, int idVisita, String nombre, String detalles, int estado) {
        this.id = id;
        this.idVisita = idVisita;
        this.nombre = nombre;
        this.detalles = detalles;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "id=" + id +
                ", idVisita=" + idVisita +
                ", nombre='" + nombre + '\'' +
                ", detalles='" + detalles + '\'' +
                ", estado=" + estado +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
