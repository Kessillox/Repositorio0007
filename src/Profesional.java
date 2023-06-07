import java.time.LocalDate;

public class Profesional {
    private String titulo;
    private LocalDate fechaDeIngreso;
    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                "fechaDeIngreso='" + fechaDeIngreso + '\'' +
                '}';
    }
public Profesional(){
}
    public Profesional(String titulo, LocalDate fechaDeIngreso) {
        this.titulo = titulo;
        this.fechaDeIngreso = fechaDeIngreso;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeNacimientoUsuario(LocalDate fechaDeNacimientoUsuario) {
        this.fechaDeIngreso = fechaDeNacimientoUsuario;
    }
}