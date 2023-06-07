package cl.bootcamp.individual31.models;

/**
 * Esta clase contiene los atributos necesarios para el trabajador.
 *
 * @author Iván Becerra
 * @version 1.3.0
 */
public class Trabajador {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String run;
    private String telefono;
    private int edad;

    public Trabajador() {
    }

    public Trabajador(String nombre, String primerApellido, String segundoApellido, String run, String telefono, int edad) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Concatena los atributos del nombre y los dos apellidos y los retorna.
     *
     * @return String
     */
    public String nombreCompleto() {
        return nombre + " " + primerApellido + " " + segundoApellido;
    }

    /**
     * Descompone el RUN excluyendo el guion y el número verificador y los retorna.
     *
     * @return
     */
    public int descomponerRun() {
        int index = this.run.indexOf("-");
        return Integer.parseInt(run.substring(0, index));
    }

    /**
     * Concatena e imprime por consola el teléfono y la edad.
     */
    public void mostrarDatos() {
        System.out.print("número de teléfono " + telefono + ", edad: " + edad + " años");
    }

    /**
     * Sobre escritura del método toString.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "nombre: " + nombre +
                ", primer apellido: " + primerApellido +
                ", segundo apellido: " + segundoApellido +
                ", run: " + run +
                ", edad: " + edad;
    }
}
