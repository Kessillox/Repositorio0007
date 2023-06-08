package empresaclase14;

/*
  PRINCIPIO ABIERTO/CERRADO

  Esta clase extiende desde la clase usuario, es decir hereda
  a su vez sus atributos están privados por lo que se puede amplicar sin modificar su
  implementación existente.
 */
public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    public Administrativo() {
    }

    public Administrativo(String area, String experienciaPrevia) {
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public Administrativo(String nombre, String apellido1, String apellido2, String fechaDeNacimiento, Integer rut, String area, String experienciaPrevia) {
        super(nombre, apellido1, apellido2, fechaDeNacimiento, rut);
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
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Pertenece a área de " + this.getArea() + " y su experiencia previa es " + this.getExperienciaPrevia());
        //System.out.println("El nombre del usuario es: " + super.getNombre()+", run: "+super.getRun());
        //System.out.println("La información del Administrativo es: " + this.toString());
    }
}
