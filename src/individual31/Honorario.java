package individual31;

public class Honorario extends Trabajador {
    private String giro;
    private int anioIniciacion;

    @Override
    public String toString() {
        return "Honorario{" +
                "giro='" + giro + '\'' +
                ", anioIniciacion=" + anioIniciacion +
                '}';
    }

    @Override
    public String mostrarDatos() {
        return "Giro: " + this.giro + "\n" +
                "Año de Iniciación: " + this.anioIniciacion + "\n";
    }

    public Honorario() { }

    public Honorario(String giro, int anioIniciacion) {
        this.giro = giro;
        this.anioIniciacion = anioIniciacion;
    }

    public Honorario(String nombres, String apellidos, String run, String telefono, int edad, String giro, int anioIniciacion) {
        super(nombres, apellidos, run, telefono, edad);
        this.giro = giro;
        this.anioIniciacion = anioIniciacion;
    }

    public Honorario(String nombres, String apellidos, String run, String telefono, int edad) {
        super(nombres, apellidos, run, telefono, edad);
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
}
