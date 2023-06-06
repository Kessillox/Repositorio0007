package tg16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Profesional extends Usuario{
    private String titulo;
    private LocalDate fechaIngreso;

    public Profesional(){}

    public Profesional(String nombre, String apellido1, String apellido2, String fechaNac, String run, String titulo, String fechaIngreso) {
        super(nombre, apellido1, apellido2, fechaNac, run);
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
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Fecha de Ingreso: " + this.getFechaIngreso());
    }
}
