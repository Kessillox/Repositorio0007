package tg16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Profesional extends Usuario{
    private String titulo;
    private LocalDate fechaIngreso;

    public Profesional(){}

    public Profesional(String rut, String nombre, String fechaNac, String titulo, String fechaIngreso) {
        super(rut, nombre, fechaNac);
        this.titulo = titulo;
        this.fechaIngreso = LocalDate.parse(fechaIngreso, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        return super.toString() +
                "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        // SOBREESCRIBIR EL FUNCIONAMIENTO DEL METODO
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Fecha de Ingreso: " + getFechaIngreso());
    }
}
