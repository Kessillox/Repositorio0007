package tg16;

public class Cliente extends Usuario{
    private String apellido1;
    private String apellido2;
    private String nombreEmpresa;
    private String telefono;
    private String direccion;
    private String comuna;

    public Cliente() {}

    public Cliente(String rut, String nombre, String fechaNac, String apellido1, String apellido2, String nombreEmpresa, String telefono, String direccion, String comuna) {
        super(rut, nombre, fechaNac);
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return super.toString() +
            "Cliente{" +
            "apellido1='" + apellido1 + '\'' +
            ", apellido2='" + apellido2 + '\'' +
            ", nombreEmpresa='" + nombreEmpresa + '\'' +
            ", telefono='" + telefono + '\'' +
            ", direccion='" + direccion + '\'' +
            ", comuna='" + comuna + '\'' +
            '}';
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public String obtenerNombre() {
        return String.format("%s %s %s", getNombre(), getApellido1(), getApellido2());
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Primer apellido: " + getApellido1());
        System.out.println("Segundo apellido: " + getApellido2());
        System.out.println("Nombre de la empresa: " + getNombreEmpresa());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Comuna: " + getComuna());
    }
}
