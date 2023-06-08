package individuales.TI31;

public class Eventual extends Trabajador {
    private boolean disponibilidad;
    private String correoElectronico;

    public Eventual(String nombres, String apellidos, String run, String telefono, int edad, boolean disponibilidad, String correoElectronico) {
        super(nombres, apellidos, run, telefono, edad);
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
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Disponibilidad: " + disponibilidad);
        System.out.println("Correo electrónico: " + correoElectronico);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Eventual{" +
                "disponibilidad=" + disponibilidad +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}