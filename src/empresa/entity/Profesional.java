package empresa.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Profesional extends Usuario {
    private String titulo;
    private String fechaIngreso;

    //Constructor vacío
    public Profesional() {
    }

    //Constructor con atributos de la clase Profesional y de la clase Usuario
    public Profesional(String nombreUsuario, String apellido1, String apellido2, String  fechaDeNacimiento, String run, String titulo, String fechaIngreso) {
        super(nombreUsuario, apellido1, apellido2, fechaDeNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    //Constructor con atributos de la clase Profesional
    public Profesional(String titulo, String fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    //Getters y Setters
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

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaIngreso = String.valueOf(LocalDate.parse(fechaIngreso, formatter));
    }

    //Método toString
    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    //Método analizarUsuario heredada de la clase Usuario
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
