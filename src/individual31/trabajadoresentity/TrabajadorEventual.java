package individual31.trabajadoresentity;

import individual31.ITipoTrabajador;

public class TrabajadorEventual extends Trabajador implements ITipoTrabajador {
    private String disponibilidad;
    private String email;

    public TrabajadorEventual() {
    }

    public TrabajadorEventual(String disponibilidad, String email) {
        this.disponibilidad = disponibilidad;
        this.email = email;
    }

    public TrabajadorEventual(String nombre, String apellido, String run, String telefono, int edad, String disponibilidad, String email) {
        super(nombre, apellido, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.email = email;
    }

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

    @Override
    public String toString() {
        return "TrabajadorEventual{" +
                "disponibilidad='" + disponibilidad + '\'' +
                ", email='" + email + '\'' +
                "} " + super.toString();
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Disponibilidad: "+ this.getDisponibilidad()+ " email:" + this.getEmail());

    }
}
