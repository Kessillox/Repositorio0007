package empresaclase14;

public class Cliente {

    private String rut;
    private String nombreEmpresa;
    private String nombreRepresentante;
    private String telefonoRepresentante;
    private String direccion;
    private String comuna;

    public Cliente() {
    }

    public Cliente(String rut, String nombreEmpresa, String nombreRepresentante, String telefonoRepresentante, String direccion, String comuna) {
        this.rut = rut;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreRepresentante = nombreRepresentante;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccion = direccion;
        this.comuna = comuna;
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

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(String telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
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

    @Override
    public String toString() {
        return "empresaclase13.Cliente{" +
                "rut='" + rut + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", nombreRepresentante='" + nombreRepresentante + '\'' +
                ", telefonoRepresentante='" + telefonoRepresentante + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
