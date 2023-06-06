package individuales.individual31;

public class Eventual extends Trabajador{
    private String disponibilidad;
    private String email;

    //Constructor vacío
    public Eventual() {
    }

    //Constructor con atributos de Eventual y heredados de Trabajador


    public Eventual(String nombre, String apellido1, String apellido2, String run, String telefono, int edad, CargaFamiliar carga, String disponibilidad, String email) {
        super(nombre, apellido1, apellido2, run, telefono, edad, carga);
        this.disponibilidad = disponibilidad;
        this.email = email;
    }

    //Constructor con atributos de clase Eventual
    public Eventual(String disponibilidad, String email) {
        this.disponibilidad = disponibilidad;
        this.email = email;
    }

    //Getters y setters
    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Método toString
    @Override
    public String toString() {
        return "Eventual{" +
                "disponibilidad='" + disponibilidad + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //Metodo mostrarDatos heredados de Trabajador
    @Override
    public void mostrarDatos() {
        System.out.println("Disponibilidad del trabajador eventual es: " +getDisponibilidad() +" y su email de contacto es: "+getEmail());
    }
}
