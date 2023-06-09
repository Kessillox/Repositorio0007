package empresaclase14;

/**
 * Clase que representa un profesional, que extiende la clase Usuario.
 * Contiene información adicional sobre el título y fecha de ingreso del profesional.
 * También tiene un método para analizar la información del profesional.
 */
public class Profesional extends Usuario {
    private String titulo;
    private String fechaDeIngreso;

    public Profesional() {
    }

    public Profesional(String titulo, String fechaDeIngreso) {
        this.titulo = titulo;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public Profesional(String nombre, String apellido1, String apellido2, String fechaDeNacimiento, Integer run, String titulo, String fechaDeIngreso) {
        super(nombre, apellido1, apellido2, fechaDeNacimiento, run);
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
                "titulo='" + titulo + '\'' +
                ", fechaDeIngreso='" + fechaDeIngreso + '\'' +
                '}';
    }

    /**
     * Método para analizar la información del profesional.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("La información del Profesional es: " + this.toString());
    }
}
