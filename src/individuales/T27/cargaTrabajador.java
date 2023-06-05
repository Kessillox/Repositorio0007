package individuales.T27;

/**
 * @author Manuel Pinot
 */

public class cargaTrabajador {

    private String runCarga;
    private String nombres;
    private String apellidos;
    private String runFamiliar;
    private String Parentesco;
    private int edad;

    //Constructor vacio
    public cargaTrabajador() {
    }

    /**
     * @param runCarga
     * @param runCarga
     * @param nombres
     * @param apellidos
     * @param runFamiliar
     * @param parentesco
     * @param edad
     */
    public cargaTrabajador(String runCarga, String nombres, String apellidos, String runFamiliar, String parentesco, int edad) {
        this.runCarga = runCarga;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.runFamiliar = runFamiliar;
        Parentesco = parentesco;
        this.edad = edad;
    }

        //Getter and Setter
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

    public String getParentesco() {
        return Parentesco;
    }

    public void setParentesco(String parentesco) {
        Parentesco = parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //toString()
    @Override
    public String toString() {
        return "cargaTrabajador{" +
                "runCarga='" + runCarga + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", runFamiliar='" + runFamiliar + '\'' +
                ", Parentesco='" + Parentesco + '\'' +
                ", edad=" + edad +
                '}';
    }
}
