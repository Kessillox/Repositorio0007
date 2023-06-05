package procesovalidarelementos;

public class Video implements Validacion{
    private String nombre;

    public Video(String nombre) {
        this.nombre = nombre;
    }

    public Video() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Video{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void validar() {
        System.out.println("El video de nombre " + getNombre() + "ha sido validado");
    }
}
