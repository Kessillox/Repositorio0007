package empresaclase14;

public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    public Administrativo() {
    }

    public Administrativo(String area, String experienciaPrevia) {
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public Administrativo(String nombre, String apellido1, String apellido2, String fechaDeNacimiento, String runORut, String area, String experienciaPrevia) {
        super(nombre, apellido1, apellido2, fechaDeNacimiento, runORut);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
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
                "\n area= '" + area + "'," +
                "\n experienciaPrevia= '" + experienciaPrevia + "'," +
                "\n}";
    }

    @Override
    public void analizarUsuario() {
        System.out.println("El nombre del usuario es: " + super.getNombre());
        System.out.println("La información del Administrativo es: " + this.toString());
    }
}
