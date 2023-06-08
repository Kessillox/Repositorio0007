package grupal16;

public class Profesional extends Usuario {
    private String titulo;
    private String fechaIngreso;

    public Profesional(String nombreUsuario, String titulo, String fechaIngreso) {
        super(nombreUsuario);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }
}
