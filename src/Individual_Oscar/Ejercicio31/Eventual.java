package Individual_Oscar.Ejercicio31;

public class Eventual extends Trabajador {
    private String disponibilidad;
    private String correo;

    public Eventual() {
    }
    public Eventual(String disponibilidad, String correo) {
        this.disponibilidad = disponibilidad;
        this.correo = correo;
    }
    public String getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(String disponibilidad) {
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

}
