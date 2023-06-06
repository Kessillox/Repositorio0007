package tg16;

public class Cliente extends Usuario{
    private String nombreEmpresa;
    private String giroEmpresa;
    private String telefonoRepresentante;
    private String direccionEmpresa;
    private String comunaEmpresa;

    public Cliente() {}

    public Cliente(String nombre, String apellido1, String apellido2, String fechaNac, String run, String nombreEmpresa, String giroEmpresa, String telefonoRepresentante, String direccionEmpresa, String comunaEmpresa) {
        super(nombre, apellido1, apellido2, fechaNac, run);
        this.nombreEmpresa = nombreEmpresa;
        this.giroEmpresa = giroEmpresa;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccionEmpresa = direccionEmpresa;
        this.comunaEmpresa = comunaEmpresa;
    }

    @Override
    public String toString() {
        return super.toString() +
            "Cliente{" +
            "nombreEmpresa='" + nombreEmpresa + '\'' +
            ", giroEmpresa='" + giroEmpresa + '\'' +
            ", telefonoRepresentante='" + telefonoRepresentante + '\'' +
            ", direccionEmpresa='" + direccionEmpresa + '\'' +
            ", comunaEmpresa='" + comunaEmpresa + '\'' +
            '}';
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

    public String obtenerNombre() {
        return String.format("%s %s %s", this.getNombre(), this.getApellido1(), this.getApellido2());
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Nombre de la empresa: " + this.getNombreEmpresa());
        System.out.println("Giro de la empresa: " + this.getGiroEmpresa());
        System.out.println("Teléfono del representante: " + this.getTelefonoRepresentante());
        System.out.println("Dirección de la empresa: " + this.getDireccionEmpresa());
        System.out.println("Comuna de la empresa: " + this.getComunaEmpresa());
    }
}
