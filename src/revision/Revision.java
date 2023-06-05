package revision;

public class Revision {
    private int identificador;
    private String NombreResion;
    private String DetyallesRevision;
    private int estado; //1.-(sin problemas), 2.-(con  observaciones) 3.-(no aprueba)

    public Revision() {
    }

    public Revision(int identificador, String nombreResion, String detyallesRevision, int estado) {
        this.identificador = identificador;
        NombreResion = nombreResion;
        DetyallesRevision = detyallesRevision;
        this.estado = estado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombreResion() {
        return NombreResion;
    }

    public void setNombreResion(String nombreResion) {
        NombreResion = nombreResion;
    }

    public String getDetyallesRevision() {
        return DetyallesRevision;
    }

    public void setDetyallesRevision(String detyallesRevision) {
        DetyallesRevision = detyallesRevision;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "identificador=" + identificador +
                ", NombreResion='" + NombreResion + '\'' +
                ", DetyallesRevision='" + DetyallesRevision + '\'' +
                ", estado=" + estado +
                '}';
    }
}
