package empresaclase14;

/**
 * Clase que representa un Cliente, contiene 8 atributos privados.
 * @author Luis Zambrano
 */
public class Cliente extends Usuario {

    private String nombreEmpresa;
    private String giroEmpresa;
    private String rut;
    private  String telefonoRepresentante;
    private String direccionEmpresa;
    private String comunaEmpresa;

    public Cliente() {
    }

    public Cliente(String nombreEmpresa, String giroEmpresa, String rut, String telefonoRepresentante, String direccionEmpresa, String comunaEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.giroEmpresa = giroEmpresa;
        this.rut = rut;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccionEmpresa = direccionEmpresa;
        this.comunaEmpresa = comunaEmpresa;
    }

    public Cliente(String nombre, String apellido1, String apellido2, String fechaDeNacimiento, String run, String nombreEmpresa, String giroEmpresa, String rut, String telefonoRepresentante, String direccionEmpresa, String comunaEmpresa) {
        super(nombre, apellido1, apellido2, fechaDeNacimiento, run);
        this.nombreEmpresa = nombreEmpresa;
        this.giroEmpresa = giroEmpresa;
        this.rut = rut;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccionEmpresa = direccionEmpresa;
        this.comunaEmpresa = comunaEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getGiroEmpresa() {
        return giroEmpresa;
    }

    public void setGiroEmpresa(String giroEmpresa) {
        this.giroEmpresa = giroEmpresa;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(String telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getComunaEmpresa() {
        return comunaEmpresa;
    }

    public void setComunaEmpresa(String comunaEmpresa) {
        this.comunaEmpresa = comunaEmpresa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", giroEmpresa='" + giroEmpresa + '\'' +
                ", rut='" + rut + '\'' +
                ", telefonoRepresentante='" + telefonoRepresentante + '\'' +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                ", comunaEmpresa='" + comunaEmpresa + '\'' +
                '}';
    }

    public String obtenerNombre(){
        return "El nombre de la empresa es: " + getNombreEmpresa();
    }

    @Override
    public void analizarUsuario() {
        System.out.println("El nombre del usuario es: " + super.getNombre());
        System.out.println("La información del Cliente es: " + this.toString());
    }
}
