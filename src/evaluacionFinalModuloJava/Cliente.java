package evaluacionFinalModuloJava;

import java.util.ArrayList;

public class Cliente extends Usuario{

    private int rut;
    private String nombreEmpresa;
    private String giroEmpresa;
    private String telefonoRepresentante;
    private String DireccionEmpresa;
    private String comunaEmpresa;
    private ArrayList<Capacitacion> capacitaciones;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido1, String apellido2, String fechaNacimiento, int run, String afp, String sistemaSalud, int edad, int rut, String nombreEmpresa, String giroEmpresa, String telefonoRepresentante, String direccionEmpresa, String comunaEmpresa, ArrayList<Capacitacion> capacitaciones) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run, afp, sistemaSalud, edad);
        this.rut = rut;
        this.nombreEmpresa = nombreEmpresa;
        this.giroEmpresa = giroEmpresa;
        this.telefonoRepresentante = telefonoRepresentante;
        DireccionEmpresa = direccionEmpresa;
        this.comunaEmpresa = comunaEmpresa;
        this.capacitaciones = capacitaciones;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
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

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(String telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }

    public String getDireccionEmpresa() {
        return DireccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        DireccionEmpresa = direccionEmpresa;
    }

    public String getComunaEmpresa() {
        return comunaEmpresa;
    }

    public void setComunaEmpresa(String comunaEmpresa) {
        this.comunaEmpresa = comunaEmpresa;
    }

    public ArrayList<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(ArrayList<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
    }
}
