package cl.bootcamp.empresa14.models;

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * La clase Usuario contiene 3 atributos
 * @version 1.1.0
 * @see Usuario
 */
public class Usuario {
    private String run;
    private String nombre;
    private int edad;
    private String fechaNacimiento;

    public Usuario() {
    }

    public Usuario(String run, String nombre, int edad, String fechaNacimiento) {
        this.run = run;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Concatena nombre y edad del usuario y los imprime
     */
    public void obtenerNombre() {
        System.out.println("El usuario: " + nombre + " tiene " + edad + " años");
    }

    /**
     * Sobre escritura del método toString
     * @return String
     */
    @Override
    public String toString() {
        return "run: " + run +
                ", nombre: " + nombre +
                ", fecha nacimiento: " + fechaNacimiento;
    }
}
