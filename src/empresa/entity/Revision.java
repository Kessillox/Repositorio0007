package empresa.entity;

/**
 * Clase que representa una revisión.
 * @author Cintia Muñoz, Oscar Fenández, Joaquín Baeza, Hans Schiess
 * @version 1.0
 */
public class Revision {
    private int idRevision;
    private int idVisita;
    private String nombreRevision;
    private String detalle;
    private int estado;

    //Constructor vacío
    public Revision() {
    }

    /**
     * Constructor de la clase Revision con atributos.
     * @param idRevision El ID de la revisión.
     * @param idVisita El ID de la visita asociada a la revisión.
     * @param nombreRevision El nombre de la revisión.
     * @param detalle El detalle de la revisión.
     * @param estado El estado de la revisión.
     */
    public Revision(int idRevision, int idVisita, String nombreRevision, String detalle, int estado) {
        this.idRevision = idRevision;
        this.idVisita = idVisita;
        this.nombreRevision = nombreRevision;
        this.detalle = detalle;
        this.estado = estado;
    }

    //Getters y setters
    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * Devuelve una representación en cadena de la revisión.
     * @return La representación en cadena de la revisión.
     */
    @Override
    public String toString() {
        return "Revision{" +
                "idRevision=" + idRevision +
                ", idVisita=" + idVisita +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
