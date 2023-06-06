package Individual_Oscar.Ejercicio32;

public class Eventual extends Trabajador {
    private Boolean disponibilidad;
    private String correo;

    public Eventual() {
    }

    public Eventual(String nombres, String apellidos, String run, String telefono, int edad, Boolean disponibilidad, String correo) {
        super(nombres, apellidos, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.correo = correo;
    }
    public Boolean getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    @Override
    public String toString() {
        return "Eventual{" + "disponibilidad=" + disponibilidad + ", correo=" + correo + '}';
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Disponibilidad: " + disponibilidad);
        System.out.println("Correo: " + correo);

    }
}
