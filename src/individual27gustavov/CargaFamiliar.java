package individual27gustavov;

/**
 * Individual 27: Crear una clase CargaFamiliar creando algunos metodos.
 *
 * @author Gustavo Vargas
 * @version 1.0
 */
public class CargaFamiliar {
    private String runCarga;
    private String nombres;
    private String apellidos;
    private String runFamiliar;
    private int parentesco;
    private int edad;

    // Constructor vacío
    public CargaFamiliar() {
    }

    /**
     * Constructor con parámetros
     * @param nombres
     * @param apellidos
     * @param "Run del" trabajador
     * @param parentesco
     * @param edad
     */
    public CargaFamiliar(String runCarga, String nombres, String apellidos, Trabajador trabajador, int parentesco, int edad) {
        this.runCarga = runCarga;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.runFamiliar = trabajador.getRun();
        this.parentesco = parentesco;
        this.edad = edad;
    }

    // Métodos Get y Set de los parámetros
    public String getRunCarga() {
        return runCarga;
    }

    public void setRunCarga(String runCarga) {
        this.runCarga = runCarga;
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

    public String getRunFamiliar() {
        return runFamiliar;
    }

    public void setRunFamiliar(String runFamiliar) {
        this.runFamiliar = runFamiliar;
    }

    public int getParentesco() {
        return parentesco;
    }

    public void setParentesco(int parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "CargaFamiliar{" +
                "\n runCarga= '" + runCarga + "'," +
                "\n nombres= '" + nombres + "'," +
                "\n apellidos= '" + apellidos + "'," +
                "\n runFamiliar= '" + runFamiliar + "'," +
                "\n parentesco= " + parentesco + "," +
                "\n edad= " + edad + "," +
                "\n}";
    }

}
