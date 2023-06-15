package individual31;

public class Eventual extends Trabajador{

    private String disponibilidad, correoElectronico;

    @Override
    public String toString() {
        return "Eventual{" +
                "disponibilidad='" + disponibilidad + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

    @Override
    public String mostrarDatos() {
        return "Disponibilidad: " + this.disponibilidad + "\n" +
                "Correo Electrónico: " + this.correoElectronico + "\n";
    }

    public Eventual() {
    }

    public Eventual(String nombres, String apellidos, String run, String telefono, int edad) {
        super(nombres, apellidos, run, telefono, edad);
    }

    public Eventual(String disponibilidad, String correoElectronico) {
        this.disponibilidad = disponibilidad;
        this.correoElectronico = correoElectronico;
    }

    public Eventual(String nombres, String apellidos, String run, String telefono, int edad, String disponibilidad, String correoElectronico) {
        super(nombres, apellidos, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.correoElectronico = correoElectronico;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
