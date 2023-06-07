package individualesvalentin.ti31;

public class Eventual extends Trabajador{
    private String disponibilidad;
    private String correo;

    public Eventual(String nombre1, String nombre2, String apellido1, String apellido2, String run, int telefono,
                    int edad, String disponibilidad, String correo) {
        super(nombre1, nombre2, apellido1, apellido2, run, telefono, edad);
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
        return "Eventual{" +
                "disponibilidad='" + disponibilidad + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("%s: %s%n%s: %s%n","Disponibilidad",getDisponibilidad(),"Correo",getCorreo());
    }
}
