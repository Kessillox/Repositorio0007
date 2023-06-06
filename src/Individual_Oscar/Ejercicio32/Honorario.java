package Individual_Oscar.Ejercicio32;

public class Honorario extends Trabajador {
    private String giro;
    private String anioIniciacion;

    public Honorario() {
    }


    public Honorario(String nombres, String apellidos, String run, String telefono, int edad, String giro, String anioIniciacion) {
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

    public String getAnioIniciacion() {
        return anioIniciacion;
    }

    public void setAnioIniciacion(String anioIniciacion) {
        this.anioIniciacion = anioIniciacion;
    }

    @Override
    public String toString() {
        return "Honorario{" +
                "giro='" + giro + '\'' +
                ", anioIniciacion='" + anioIniciacion + '\'' +
                '}';
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Giro: " + giro);
        System.out.println("Anio Iniciacion: " + anioIniciacion);
    }
}
