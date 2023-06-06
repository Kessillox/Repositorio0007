package empleados.entity;

public class Cliente extends Persona{

    private String nombreEmpresa;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombreEmpresa, String telefono) {
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
    }

    public Cliente(int edad, String nombre, String nombreEmpresa, String telefono) {
        super(edad, nombre);
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
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

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("el cliente es " + this.getNombreEmpresa() + " su telefono es " + this.getTelefono());
    }
}
