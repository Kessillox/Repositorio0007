package TI27;

/**
 * @author gonzaloalonzo
 */

/**
 * @serial 1
 * crea clase y atributos privados para encapsulamiento de la clase
 */
public class CargasFamiliares {
    private String runCarga;
    private String nombreCarga;
    private String Apellido1Carga;
    private String Apellido2Carga;
    private String runFamiliarcarga;
    private char parentesco;
    private int edadCarga;

    /**
     * sobre carga de constructores
      */
    public CargasFamiliares() {
    }

    public CargasFamiliares(String runCarga, String nombreCarga, String apellido1Carga, String apellido2Carga, String runFamiliarcarga, char parentesco, int edadCarga) {
        this.runCarga = runCarga;
        this.nombreCarga = nombreCarga;
        Apellido1Carga = apellido1Carga;
        Apellido2Carga = apellido2Carga;
        this.runFamiliarcarga = runFamiliarcarga;
        this.parentesco = parentesco;
        this.edadCarga = edadCarga;
    }

    /**
     * getters and setter de la clase
     */

    public String getRunCarga() {
        return runCarga;
    }

    public void setRunCarga(String runCarga) {
        this.runCarga = runCarga;
    }

    public String getNombreCarga() {
        return nombreCarga;
    }

    public void setNombreCarga(String nombreCarga) {
        this.nombreCarga = nombreCarga;
    }

    public String getApellido1Carga() {
        return Apellido1Carga;
    }

    public void setApellido1Carga(String apellido1Carga) {
        Apellido1Carga = apellido1Carga;
    }

    public String getApellido2Carga() {
        return Apellido2Carga;
    }

    public void setApellido2Carga(String apellido2Carga) {
        Apellido2Carga = apellido2Carga;
    }

    public String getRunFamiliarcarga() {
        return runFamiliarcarga;
    }

    public void setRunFamiliarcarga(String runFamiliarcarga) {
        this.runFamiliarcarga = runFamiliarcarga;
    }

    public char getParentesco() {
        return parentesco;
    }

    public void setParentesco(char parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdadCarga() {
        return edadCarga;
    }

    public void setEdadCarga(int edadCarga) {
        this.edadCarga = edadCarga;
    }
    /**
     * metodo toString
     */
    @Override
    public String toString() {
        return "CargasFamiliares{" +
                "runCarga='" + runCarga + '\'' +
                ", nombreCarga='" + nombreCarga + '\'' +
                ", Apellido1Carga='" + Apellido1Carga + '\'' +
                ", Apellido2Carga='" + Apellido2Carga + '\'' +
                ", runFamiliarcarga='" + runFamiliarcarga + '\'' +
                ", parentesco=" + parentesco +
                ", edadCarga=" + edadCarga +
                '}';
    }



}
