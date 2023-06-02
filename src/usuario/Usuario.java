package usuario;

/**
 * @author Manuel Pinot
 *
 */
public class Usuario {

    private String nombre;
    private String fechaNacimiento;
    private String run;
    private int edad;

    /**
     * Constructor vacio
     */
    public Usuario() {
    }

    /**
     * Constructor con parametros
     * @param nombre
     * @param fechaNacimiento
     * @param run
     * @param edad
     */
    public Usuario(String nombre, String fechaNacimiento, String run, int edad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
        this.edad = edad;

    }

    //toString
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run='" + run + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }

    //Getter and Setter
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

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getEdad() { return edad; }

    public void setEdad(int edad) {this.edad = edad;}

    public String mostrarEdad() {
        return "El usuario tiene " + edad + " años";
    }
}
