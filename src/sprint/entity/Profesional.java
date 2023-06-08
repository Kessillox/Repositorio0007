package sprint.entity;

public class Profesional extends Usuario{
    private String titulo;
    private String fechaDeIngreso;

    public Profesional(String nombre, String apellido1, String apellido2, String fechaNacimiento, int run, String titulo, String fechaDeIngreso) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public Profesional() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaDeIngreso='" + fechaDeIngreso + '\'' +
                '}';
    }
}
