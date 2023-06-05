package grupal.grupal16;

import java.time.LocalDate;

public class Profesional extends Usuario{
    private String titulo;
    private String fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombreUsuario, String apellido1, String apellido2, LocalDate fechaDeNacimiento, String run, String titulo, String fechaIngreso) {
        super(nombreUsuario, apellido1, apellido2, fechaDeNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public Profesional(String titulo, String fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        System.out.println();
        System.out.println("******PROFESIONAL******");
        System.out.println("Los datos del profesional ingresado son los siguientes:");
        super.analizarUsuario();
        System.out.println("Título profesional: " + getTitulo());
        System.out.println("Fecha de ingreso: " + getFechaIngreso());
        System.out.println("*******************************************");
    }
}
