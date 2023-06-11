package individual31gustavov;

public class TrabajadorHonorario extends Trabajador {
    private String giro;
    private int anioIniciacion;

    public TrabajadorHonorario(String nombres, String apellidos, String run, String telefono, int edad, String giro, int anioIniciacion) {
        super(nombres, apellidos, run, telefono, edad);
        this.giro = giro;
        this.anioIniciacion = anioIniciacion;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getAnioIniciacion() {
        return anioIniciacion;
    }

    public void setAnioIniciacion(int anioIniciacion) {
        this.anioIniciacion = anioIniciacion;
    }

    @Override
    public String toString() {
        return "Trabajador Honorario - Nombres: " + getNombres() + ", Apellidos: " + getApellidos() +
                ", RUN: " + getRun() + ", Teléfono: " + getTelefono() + ", Edad: " + getEdad() +
                ", Giro: " + giro + ", Año de iniciación: " + anioIniciacion;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Giro: " + giro);
        System.out.println("Año de iniciación: " + anioIniciacion);
    }
}
