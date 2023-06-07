package cl.bootcamp.empresa.models;

import java.util.Date;

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * La clase Administrativo contiene 2 atributos
 * @version 1.0.0
 * @see Administrativo
 */
public class Administrativo extends Usuario{

    private String area;

    private String experenciaArea;

    public Administrativo() {
    }

    public Administrativo(String nombre, String apellido1, String apellido2,
                          String fechaNacimiento, String run, String area,
                          String experenciaArea) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run);
        this.area = area;
        this.experenciaArea = experenciaArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperenciaArea() {
        return experenciaArea;
    }

    public void setExperenciaArea(String experenciaArea) {
        this.experenciaArea = experenciaArea;
    }

    @Override
    public String toString() {
        return super.toString() +
                "area: " + area +
                ", experenciaArea: " + experenciaArea;
    }
}
