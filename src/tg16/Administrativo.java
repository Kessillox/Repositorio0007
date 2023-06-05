package tg16;

public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    public Administrativo() {}

    public Administrativo(String rut, String nombre, String fechaNac, String area, String experienciaPrevia) {
        super(rut, nombre, fechaNac);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
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
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Area: " + getArea());
        System.out.println("Experiencia previa: " + getExperienciaPrevia());
    }
}
