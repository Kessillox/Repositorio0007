package individual25;

/**
 * Clase que almacena la informacion de cada trabajador
 * @author Juan Merino
 * @version 1.0
 */
public class Trabajador {

    String nombres, apellidos, run, telefono;
    int edad;

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
}