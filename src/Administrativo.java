
/**
 * @author Natalia Perez
 */

public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    public Administrativo() {}

    public Administrativo(String nombre, String apellido1, String apellido2, String fechaNac, int run, String area, String experienciaPrevia) {
        super(nombre, apellido1, apellido2, fechaNac, run);
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

    /**
     * Muestra en consola datos básicos del usuario.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Area: " + this.getArea());
        System.out.println("Experiencia previa: " + this.getExperienciaPrevia());
    }
}
