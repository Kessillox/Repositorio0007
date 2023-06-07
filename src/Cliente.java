public class Cliente {
    private String rutEmpresa;
    private String nombreEmpresa;
    private String runRepresentanteLegal;
    private String nombreRepresentanteLegal;
    private String telefonoRepresentanteLegal;
    private String direccion;
    private String comuna;

    @Override
    public String toString() {
        return "Cliente{" +
                "rutEmpresa='" + rutEmpresa + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", runRepresentanteLegal='" + runRepresentanteLegal + '\'' +
                ", nombreRepresentanteLegal='" + nombreRepresentanteLegal + '\'' +
                ", telefonoRepresentanteLegal='" + telefonoRepresentanteLegal + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }

    public Cliente() {
    }

    public Cliente(String rutEmpresa, String nombreEmpresa,
                   String runRepresentanteLegal, String nombreRepresentanteLegal,
                   String telefonoRepresentanteLegal, String direccion, String comuna) {
        this.rutEmpresa = rutEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.runRepresentanteLegal = runRepresentanteLegal;
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
        this.telefonoRepresentanteLegal = telefonoRepresentanteLegal;
        this.direccion = direccion;
        this.comuna = comuna;
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

    public String getRunRepresentanteLegal() {
        return runRepresentanteLegal;
    }

    public void setRunRepresentanteLegal(String runRepresentanteLegal) {
        this.runRepresentanteLegal = runRepresentanteLegal;
    }

    public String getNombreRepresentanteLegal() {
        return nombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
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

    public String obtenerNombre(){
        String cadena = "El nombre es: "+getNombreEmpresa()+
                "\nEl nombre del representante legal es: "+getNombreRepresentanteLegal();
        return cadena;
    }
}
