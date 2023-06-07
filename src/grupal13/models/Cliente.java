package grupal13.models;

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * La clase Cliente contiene 6 atributos
 * @version 1.0.2
 * @see Cliente
 */

public class Cliente {
    private String rut;
    private String nombre;
    private String nombreRepresentante;
    private String apellido1Representante;
    private String apellido2Representante;
    private String telefonoRepresentante;
    private String direccion;
    private String comuna;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String nombreRepresentante,
                   String apellido1Representante, String apellido2Representante,
                   String telefonoRepresentante, String direccion, String comuna) {
        this.rut = rut;
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    /**
     * Sobre escritura del método toString
     * @return String
     */

    @Override
    public String toString() {
        return "rut: " + rut +
                ", nombre: " + nombre +
                ", nombre representante: " + nombreRepresentante +
                ", teléfono representante: " + telefonoRepresentante +
                ", dirección: " + direccion +
                ", comuna: " + comuna;
    }
}
