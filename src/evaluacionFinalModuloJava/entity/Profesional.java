package evaluacionFinalModuloJava.entity;

public class Profesional extends Usuario {
    private String Titulo;
    private String fechaIngreso;

    public Profesional() {
    }

    public Profesional(String titulo, String fechaIngreso) {
        Titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void mostrar(){
        System.out.println("El titulo del profesional es: "+this.getTitulo());
        System.out.println("La fecha de ingreso es : "+this.getFechaIngreso());
    }
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
    }
}
