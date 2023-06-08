package evaluacionFinalModuloJava.entity;

public class Revision {
    private int idRevision;
    private String nombreRevision;
    private String detalleRevision;
    private char estado;

    public Revision() {
    }

    public Revision(int idRevision, String nombreRevision, String detalleRevision, char estado) {
        this.idRevision = idRevision;
        this.nombreRevision = nombreRevision;
        this.detalleRevision = detalleRevision;
        this.estado = estado;
    }

    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
    }

    public String getDetalleRevision() {
        return detalleRevision;
    }

    public void setDetalleRevision(String detalleRevision) {
        this.detalleRevision = detalleRevision;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "idRevision=" + idRevision +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalleRevision='" + detalleRevision + '\'' +
                ", estado=" + estado +
                '}';
    }
}
