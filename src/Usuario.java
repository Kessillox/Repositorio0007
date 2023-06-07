public class Usuario {
    private String nombreUsuario;
    private String fechaDeNacimientoUsuario;
    private String runUsuario;

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", fechaDeNacimientoUsuario='" + fechaDeNacimientoUsuario + '\'' +
                ", runUsuario='" + runUsuario + '\'' +
                '}';
    }

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String fechaDeNacimientoUsuario,
                   String runUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.fechaDeNacimientoUsuario = fechaDeNacimientoUsuario;
        this.runUsuario = runUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFechaDeNacimientoUsuario() {
        return fechaDeNacimientoUsuario;
    }

    public void setFechaDeNacimientoUsuario(String fechaDeNacimientoUsuario) {
        this.fechaDeNacimientoUsuario = fechaDeNacimientoUsuario;
    }

    public String getRunUsuario() {
        return runUsuario;
    }

    public void setRunUsuario(String runUsuario) {
        this.runUsuario = runUsuario;
    }
}
