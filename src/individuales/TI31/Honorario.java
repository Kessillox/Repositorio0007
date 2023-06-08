package individuales.TI31;

public class Honorario extends Trabajador {
    private String giro;
    private int anioIniciacion;

    public Honorario(String nombres, String apellidos, String run, String telefono, int edad, String giro, int anioIniciacion) {
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
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Giro: " + giro);
        System.out.println("Año de Iniciación: " + anioIniciacion);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Honorario{" +
                "giro='" + giro + '\'' +
                ", anioIniciacion=" + anioIniciacion +
                '}';
    }
}
