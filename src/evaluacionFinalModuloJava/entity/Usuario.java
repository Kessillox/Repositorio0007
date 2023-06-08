package evaluacionFinalModuloJava.entity;

import evaluacionFinalModuloJava.interfac.IAsesoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario implements IAsesoria {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private String run;

    /**
     * Constructor vacio de la clase
     */
    public Usuario() {
    }

    /**
     * Constructor de la clase
     *
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param fechaNacimiento
     * @param run
     */
    public Usuario(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, String run) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }


    /**
     * Metodo que retorna parametros y valores de la clase
     *
     * @return mensaje con valores y parametros
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run='" + run + '\'' +
                '}';
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return fechaNacimiento.format(dateFormat);
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    /**
     * Metodo que calcula la edad del usuario
     *
     * @return mensaje con la edad en años de usuarios
     */
    public String mostrarEdad() {
        int anioActual = LocalDate.now().getYear();
        return "El usuario tiene " + (anioActual - this.fechaNacimiento.getYear()) + "años.";
    }

    /**
     * Metodo implementado de IAsesoria que muestra por consola el nombre y rut del
     * usuario
     */
    @Override
    public void analizarUsuario() {
        String mensaje = "Nombre: " + this.nombre + "\n Run: " + this.run;
        System.out.println(mensaje);
    }

    @Override
    public void listarDatos() {
        System.out.println("Datos \nnombre=" + nombre  +
                ", apellido1=" + apellido1 +
                ", apellido2=" + apellido2 +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run=" + run);
    }
}