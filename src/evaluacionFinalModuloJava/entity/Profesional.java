package evaluacionFinalModuloJava.entity;

import evaluacionFinalModuloJava.interfac.IAsesoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author nehemiasmunoz
 */
public class Profesional  extends Usuario implements IAsesoria {
    private String titulo;
    private LocalDate fechaIngreso;

    /**
     * Constructor vacio
     */
    public Profesional() {
    }

//    /**
//     * Constructor de la clase con parametros
//     *
//     * @param titulo
//     * @param fechaIngreso
//     */
//    public Profesional(String titulo, LocalDate fechaIngreso) {
//        this.titulo = titulo;
//        this.fechaIngreso = fechaIngreso;
//    }

    /**
     * Constructor de la clase con parametros y herencia
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param fechaNacimiento
     * @param run
     * @param titulo
     * @param fechaIngreso
     */
    public Profesional(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, String run, String titulo, LocalDate fechaIngreso) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }


    /**
     * Metodo que retorna los parametros y valores de la clase
     *
     * @return String que contiene los parametros y valores de la clase
     */
    @Override
    public String toString() {
        return super.toString()+ "Profesional{" +
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

    public String getFechaIngreso() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return fechaIngreso.format(dateFormat);
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Metodo que complementado con la interfaz muestra por consola datos del
     * usuario profesional
     */
    @Override
    public void analizarUsuario() {
        System.out.println("Titulo: " + titulo + "\nFecha Ingreso: " + getFechaIngreso());
    }

    @Override
    public void listarDatos() {
        super.listarDatos();
        System.out.println("Tipo profesional \n titulo=" + titulo +", fechaIngreso=" + fechaIngreso);
    }
}