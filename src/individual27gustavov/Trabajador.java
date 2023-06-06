package individual27gustavov;

/**
 * Individual 25: Crear una clase Trabajador creando algunos metodos.
 *
 * @author Gustavo Vargas
 * @version 1.0
 */
public class Trabajador {

    // Iniciación de los Atributos de la clase
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;

    // Constructor vacío
    public Trabajador() {
    }

    /**
     * Constructor con parámetros
     * @param nombres
     * @param apellidos
     * @param run
     * @param telefono
     * @param edad
     */
    public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    // Métodos Get y Set de los parámetros
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

    // Método toString
    @Override
    public String toString() {
        return "Trabajador{" +
                "\n  nombres='" + nombres + '\'' +
                "\n  apellidos='" + apellidos + '\'' +
                "\n  run='" + run + '\'' +
                "\n  telefono='" + telefono + '\'' +
                "\n  edad='" + edad + '\'' +
                "\n}";
    }

    /**
     * Método de concatenación del nombre completo
     * @return Devuelve el nombre completo del trabajador como una cadena
     */
    public String nombreCompleto(){
        return nombres + " " + apellidos;
    }

    /**
     * Método de descomposición del RUN
     * @return Devuelve como un entero, los números del RUN antes del guión
     */
    public int descomponerRun() {
        int posicionGuion = run.indexOf("-");  /* .indexOf() se utiliza para encontrar la posición de un caracter. Si no
                                                se encuentra dará como resultado un "-1".
        Luego se crea una variable runSinGuion con el resultado de una expresión ternaria (forma abreviada de un if-else),
        dónde si la posición es igual a -1, se utiliza la misma cadena; sino usará .substring() para obtener los
        caracteres desde 0 a la posicionGuion encontrada.
         */
        String runSinGuion = posicionGuion == -1 ? run : run.substring(0, posicionGuion);
        int runDescompuesto = Integer.parseInt(runSinGuion);  // con .parseInt() se convierte en un número entero
        return runDescompuesto;  // retorno entero del método
    }
}