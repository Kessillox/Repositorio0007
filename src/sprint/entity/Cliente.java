package sprint.entity;

public class Cliente extends Usuario{
    private String NombreEmpresa;
    private String GiroEmpresa;
    private String Rut;
    private String TlfRepresentante;
    private String DireccionEmpresa;
    private String Comuna;

    public Cliente() {
    }

    public Cliente(String nombreEmpresa, String giroEmpresa, String rut, String tlfRepresentante, String direccionEmpresa, String comuna) {
        NombreEmpresa = nombreEmpresa;
        GiroEmpresa = giroEmpresa;
        Rut = rut;
        TlfRepresentante = tlfRepresentante;
        DireccionEmpresa = direccionEmpresa;
        Comuna = comuna;
    }

    public Cliente(String nombre, String apellido1, String apellido2, String fechaNacimiento, int run, String nombreEmpresa, String giroEmpresa, String rut, String tlfRepresentante, String direccionEmpresa, String comuna) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run);
        NombreEmpresa = nombreEmpresa;
        GiroEmpresa = giroEmpresa;
        Rut = rut;
        TlfRepresentante = tlfRepresentante;
        DireccionEmpresa = direccionEmpresa;
        Comuna = comuna;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        NombreEmpresa = nombreEmpresa;
    }

    public String getGiroEmpresa() {
        return GiroEmpresa;
    }

    public void setGiroEmpresa(String giroEmpresa) {
        GiroEmpresa = giroEmpresa;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String rut) {
        Rut = rut;
    }

    public String getTlfRepresentante() {
        return TlfRepresentante;
    }

    public void setTlfRepresentante(String tlfRepresentante) {
        TlfRepresentante = tlfRepresentante;
    }

    public String getDireccionEmpresa() {
        return DireccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        DireccionEmpresa = direccionEmpresa;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String comuna) {
        Comuna = comuna;
    }


    public String ObtenerNombre(){
        return "El nombre es" + this.getNombre();
    }
}