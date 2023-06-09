public class Cliente extends Usuario{
    private String rutEmpresa;
    private String giroEmpresa;
    private String nombreEmpresa;
    private String telefonoRepresentanteLegal;
    private String direccion;
    private String comuna;

    @Override
    public String toString() {
        return "Cliente{" +
                "rutEmpresa='" + rutEmpresa + '\'' +
                ", giroEmpresa='" + giroEmpresa + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", telefonoRepresentanteLegal='" + telefonoRepresentanteLegal + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }

    public Cliente() {
    }

    public Cliente(String rutEmpresa, String nombreEmpresa,
                   String telefonoRepresentanteLegal, String direccion, String comuna,String giroEmpresa) {
        this.rutEmpresa = rutEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoRepresentanteLegal = telefonoRepresentanteLegal;
        this.direccion = direccion;
        this.comuna = comuna;
        this.giroEmpresa= giroEmpresa;
    }

    public Cliente(String nombreUsuario, String fechaDeNacimientoUsuario, String runUsuario,
                   String rutEmpresa, String nombreEmpresa, String telefonoRepresentanteLegal,
                   String direccion, String comuna,String giroEmpresa) {
        super(nombreUsuario, fechaDeNacimientoUsuario, runUsuario);
        this.rutEmpresa = rutEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoRepresentanteLegal = telefonoRepresentanteLegal;
        this.direccion = direccion;
        this.comuna = comuna;
        this.giroEmpresa= giroEmpresa;
    }

    public String getGiroEmpresa() {
        return giroEmpresa;
    }

    public void setGiroEmpresa(String giroEmpresa) {
        this.giroEmpresa = giroEmpresa;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }


    public String getTelefonoRepresentanteLegal() {
        return telefonoRepresentanteLegal;
    }

    public void setTelefonoRepresentanteLegal(String telefonoRepresentanteLegal) {
        this.telefonoRepresentanteLegal = telefonoRepresentanteLegal;
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
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(this.getDireccion()+" "+this.getComuna());
    }
}
