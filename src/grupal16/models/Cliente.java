package grupal16.models;

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * La clase Cliente contiene 5 atributos
 * @version 1.0.0
 * @see Cliente
 */

public class Cliente extends Usuario{
    private String nombreEmpresa;
    private String giroEmpresa;
    private String rut;
    private String telefonoRepresentante;
    private String direccionEmpresa;
    private String comunaEmpresa;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido1, String apellido2,
                   String fechaNacimiento, String run, String nombreEmpresa,
                   String giroEmpresa, String telefonoRepresentante,
                   String direccionEmpresa, String comunaEmpresa, String rut) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run);
        this.nombreEmpresa = nombreEmpresa;
        this.giroEmpresa = giroEmpresa;
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
    public void analizarUsuario() {
        System.out.print("El cliente: ");
        super.analizarUsuario();
        System.out.println(", nombre empresa: " + nombreEmpresa +
                ", giro empresa: " + giroEmpresa +
                ", teléfono representante: " + telefonoRepresentante +
                ", dirección empresa: " + direccionEmpresa +
                ", comuna empresa: " + comunaEmpresa);
    }

    @Override
    public String toString() {
        return super.toString() +
                "nombre empresa: " + nombreEmpresa +
                ", giro empresa: " + giroEmpresa +
                ", teléfono representante: " + telefonoRepresentante +
                ", dirección empresa: " + direccionEmpresa +
                ", comuna empresa: " + comunaEmpresa;
    }
}
