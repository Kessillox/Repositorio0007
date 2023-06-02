package empresaclase14;

/**
 * Clase que representa un Cliente, contiene 8 atributos privados.
 * @author Luis Zambrano
 */
public class Cliente {

    private String rut;
    private String nombreEmpresa;
    private String nombreRepresentante;
    private  String apellido1Representante;
    private String apellido2Representante;
    private String telefonoRepresentante;
    private String direccion;
    private String comuna;

    public Cliente() {
    }

    public Cliente(String rut, String nombreEmpresa, String nombreRepresentante, String apellido1Representante, String apellido2Representante, String telefonoRepresentante, String direccion, String comuna) {
        this.rut = rut;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreRepresentante = nombreRepresentante;
        this.apellido1Representante = apellido1Representante;
        this.apellido2Representante = apellido2Representante;
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

    public String getApellido1Representante() {
        return apellido1Representante;
    }

    public void setApellido1Representante(String apellido1Representante) {
        this.apellido1Representante = apellido1Representante;
    }

    public String getApellido2Representante() {
        return apellido2Representante;
    }

    public void setApellido2Representante(String apellido2Representante) {
        this.apellido2Representante = apellido2Representante;
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
        return "Cliente{" +
                "\n rut='" + rut + "'," +
                "\n nombreEmpresa='" + nombreEmpresa + "'," +
                "\n nombreRepresentante='" + nombreRepresentante + "'," +
                "\n apellido1Representante='" + apellido1Representante + "'," +
                "\n apellido2Representante='" + apellido2Representante + "'," +
                "\n telefonoRepresentante='" + telefonoRepresentante + "'," +
                "\n direccion='" + direccion + "'," +
                "\n comuna='" + comuna + "'" +
                "\n}";
    }

    public String obtenerNombre(){
        return nombreRepresentante + " " + apellido1Representante + " " + apellido2Representante;
    }
}
