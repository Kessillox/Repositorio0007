package individual27;

public class CargaFamiliar {
    private String runC;
    private String nombreC;
    private String apellidoC;
    private String runFamiliar;
    private String parentesco;
    private int edadC;

    public CargaFamiliar() {
    }

    public CargaFamiliar(String runC, String nombreC, String apellidoC, String runFamiliar, String parentesco, int edadC) {
        this.runC = runC;
        this.nombreC = nombreC;
        this.apellidoC = apellidoC;
        this.runFamiliar = runFamiliar;
        this.parentesco = parentesco;
        this.edadC = edadC;
    }

    @Override
    public String toString() {
        return "cargaFamiliar{" +
                "runC='" + runC + '\'' +
                ", nombreC='" + nombreC + '\'' +
                ", apellidoC='" + apellidoC + '\'' +
                ", runFamiliar='" + runFamiliar + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", edadC=" + edadC +
                '}';
    }

    public String getRunC() {
        return runC;
    }

    public void setRunC(String runC) {
        this.runC = runC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getApellidoC() {
        return apellidoC;
    }

    public void setApellidoC(String apellidoC) {
        this.apellidoC = apellidoC;
    }

    public String getRunFamiliar() {
        return runFamiliar;
    }

    public void setRunFamiliar(String runFamiliar) {
        this.runFamiliar = runFamiliar;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdadC() {
        return edadC;
    }

    public void setEdadC(int edadC) {
        this.edadC = edadC;
    }
}
