import java.time.LocalDate;

public class Profesional extends Usuario {
    private String titulo;
    private String fechaDeIngreso;
    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                "fechaDeIngreso='" + fechaDeIngreso + '\'' +
                '}';
    }
public Profesional(){
}
    public Profesional(String titulo, String fechaDeIngreso) {
        this.titulo = titulo;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public Profesional(String nombreUsuario, String fechaDeNacimientoUsuario,
                       String runUsuario, String titulo, String fechaDeIngreso) {
        super(nombreUsuario, fechaDeNacimientoUsuario, runUsuario);
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
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(this.getTitulo()+" "+ this.getFechaDeIngreso());
    }
}