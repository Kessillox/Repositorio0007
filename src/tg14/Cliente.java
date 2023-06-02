package tg14;

public class Cliente {
    private String rut;
    private String nombreEmpresa;
    private String nombreRepresentate;
    private String apellidoRepresentante1;
    private String apellidoRepresentante2;
    private String telefonoReperesentante;
    private String direccion;
    private String comuna;

    public Cliente() {}

    public Cliente(String rut, String nombreEmpresa, String nombreRepresentate, String apellidoRepresentante1, String apellidoRepresentante2, String telefonoReperesentante, String direccion, String comuna) {
        this.rut = rut;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreRepresentate = nombreRepresentate;
        this.apellidoRepresentante1 = apellidoRepresentante1;
        this.apellidoRepresentante2 = apellidoRepresentante2;
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
                ", apellidoRepresentante1='" + apellidoRepresentante1 + '\'' +
                ", apellidoRepresentante2='" + apellidoRepresentante2 + '\'' +
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

    public String getApellidoRepresentante1() {
        return apellidoRepresentante1;
    }

    public void setApellidoRepresentante1(String apellidoRepresentante1) {
        this.apellidoRepresentante1 = apellidoRepresentante1;
    }

    public String getApellidoRepresentante2() {
        return apellidoRepresentante2;
    }

    public void setApellidoRepresentante2(String apellidoRepresentante2) {
        this.apellidoRepresentante2 = apellidoRepresentante2;
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

    public String obtenerNombre() {
        return String.format("%s %s %s", this.nombreRepresentate, this.apellidoRepresentante1, this.apellidoRepresentante2);
    }

}
