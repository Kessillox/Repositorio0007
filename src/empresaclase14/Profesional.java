package empresaclase14;

public class Profesional extends Usuario {
    private String titulo;
    private String fechaDeIngreso;

    public Profesional() {
    }

    public Profesional(String titulo, String fechaDeIngreso) {
        this.titulo = titulo;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public Profesional(String nombre, String apellido1, String apellido2, String fechaDeNacimiento, String runORut, String titulo, String fechaDeIngreso) {
        super(nombre, apellido1, apellido2, fechaDeNacimiento, runORut);
        this.titulo = titulo;
        this.fechaDeIngreso = fechaDeIngreso;
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
                "\n titulo= '" + titulo + "'," +
                "\n fechaDeIngreso= '" + fechaDeIngreso + "'," +
                "\n}";
    }

    @Override
    public void analizarUsuario() {
        System.out.println("El nombre del usuario es: " + super.getNombre());
        System.out.println("La información del Profesional es: " + this.toString());
    }
}
