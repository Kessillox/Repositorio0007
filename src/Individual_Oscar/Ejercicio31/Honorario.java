package Individual_Oscar.Ejercicio31;

public class Honorario extends Trabajador {
    private String giro;
    private String anioIniciacion;

    public Honorario() {
    }


    public Honorario(String giro, String anioIniciacion) {
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


}
