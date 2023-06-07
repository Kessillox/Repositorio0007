package sprint.entity;

public class Administrativo extends Usuario{
    private String area;
    private String experienciaPrevia;

    public Administrativo(String nombre, String apellido1, String apellido2, String fechaNacimiento, String run, String area, String experienciaPrevia) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public Administrativo() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }
}
