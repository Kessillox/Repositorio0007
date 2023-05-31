package tg13;

public class Cliente {
    private String rut;
    private String nombreEmpresa;
    private String nombreRepresentate;
    private String telefonoReperesentante;
    private String direccion;
    private String comuna;

    public Cliente() {}

    public Cliente(String rut, String nombreEmpresa, String nombreRepresentate, String telefonoReperesentante, String direccion, String comuna) {
        this.rut = rut;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreRepresentate = nombreRepresentate;
        this.telefonoReperesentante = telefonoReperesentante;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", nombreRepresentate='" + nombreRepresentate + '\'' +
                ", telefonoReperesentante='" + telefonoReperesentante + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreRepresentate() {
        return nombreRepresentate;
    }

    public void setNombreRepresentate(String nombreRepresentate) {
        this.nombreRepresentate = nombreRepresentate;
    }

    public String getTelefonoReperesentante() {
        return telefonoReperesentante;
    }

    public void setTelefonoReperesentante(String telefonoReperesentante) {
        this.telefonoReperesentante = telefonoReperesentante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
}
