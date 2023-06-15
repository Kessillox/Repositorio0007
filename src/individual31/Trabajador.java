package individual31;

/**
 * Clase que almacena la informacion de cada trabajador
 * @author Juan Merino
 * @version 2.0
 */
public class Trabajador {

    private String nombres, apellidos, run, telefono;
    private int edad;

    /**
     * Método toString() sobreescrito
     * @return String con la informacion del trabajador ordenada y legible
     */
    @Override
    public String toString() {
        return "Trabajador\n" +
                "Nombres: " + nombres + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "RUN: " + run + "\n" +
                "Telefono: " + telefono + "\n" +
                "Edad: " + edad + "\n";
    }

    /**
     * Constructor vacio
     */
    public Trabajador() {
    }

    /**
     * Constructor que recibe los atributos como parametros
     * @param nombres   Nombres del trabajador, String
     * @param apellidos Apellidos del trabajador, String
     * @param run       RUN del trabajador debe contener guion, String
     * @param telefono  Telefono del trabajador, String
     * @param edad      Edad del trabajador, int
     */
    public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    /**
     * Metodo que concatena los nombres y apellidos del trabajador
     * @return String con el nombre completo del trabajador
     */
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    /**
     * Metodo que descompone el RUN del trabajador, debe contener un guion para hacer la separacion
     * @return int anterior al guion, 0 en caso que no haya un guion en el RUN
     */
    public int descomponerRun() {
        if (run.contains("-")) {
            return Integer.parseInt(run.split("-")[0]);
        }
        return 0; // no contiene "-"
    }

    /**
     * Método que muestra el teléfono y la edad del trabajador
     * @return String compuesta por el telefono y la edad con formato
     */
    public String mostrarDatos() {
        return "Teléfono: " + this.telefono + "\n" +
                "Edad: " + this.edad + "\n";
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
}