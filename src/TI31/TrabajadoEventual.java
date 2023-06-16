package TI31;

public class TrabajadoEventual extends Trabajador {
    boolean disponibilidad;
    String correoElectronico;

    public TrabajadoEventual() {
    }

    public TrabajadoEventual(String nombre, String apellido1, String apellido2, String run, String telefono, int edad) {
        super(nombre, apellido1, apellido2, run, telefono, edad);
    }

    public TrabajadoEventual(boolean disponibilidad, String correoElectronico) {
        this.disponibilidad = disponibilidad;
        this.correoElectronico = correoElectronico;
    }

    public TrabajadoEventual(String nombre, String apellido1, String apellido2, String run, String telefono, int edad, boolean disponibilidad, String correoElectronico) {
        super(nombre, apellido1, apellido2, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.correoElectronico = correoElectronico;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "TrabajadoEventual{" +
                "disponibilidad=" + disponibilidad +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("disponibilidad=" + disponibilidad +
                ", correoElectronico='" + correoElectronico + '\'');
    }
}
