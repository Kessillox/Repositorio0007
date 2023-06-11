package individual31gustavov;

public class TrabajadorEventual extends Trabajador {
    private boolean disponibilidad;
    private String email;

    public TrabajadorEventual(String nombres, String apellidos, String run, String telefono, int edad, boolean disponibilidad, String email) {
        super(nombres, apellidos, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.email = email;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String correoElectronico) {
        this.email = correoElectronico;
    }

    @Override
    public String toString() {
        return "Trabajador Eventual - Nombres: " + getNombres() + ", Apellidos: " + getApellidos() +
                ", RUN: " + getRun() + ", Teléfono: " + getTelefono() + ", Edad: " + getEdad() +
                ", Disponibilidad: " + disponibilidad + ", Correo electrónico: " + email;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Disponibilidad: " + disponibilidad);
        System.out.println("Correo electrónico: " + email);
    }
}