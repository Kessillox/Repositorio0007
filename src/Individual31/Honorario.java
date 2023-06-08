package Individual31;

import java.time.LocalDate;

public class Honorario extends Trabajador{
    private LocalDate giro;
    private int anioInicio;

    public LocalDate getGiro() {
        return giro;
    }

    public void setGiro(LocalDate giro) {
        this.giro = giro;
    }

    public int getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(int anioInicio) {
        this.anioInicio = anioInicio;
    }

    @Override
    public String toString() {
        return "Honorario{" +
                "giro=" + giro +
                ", anioInicio=" + anioInicio +
                '}';
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El año de inicio de actividades es: "+this.getAnioInicio());
    }
}

