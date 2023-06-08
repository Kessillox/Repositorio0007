package Individual27;

public class cargaFamiliar {
    private String runCarga;
    private String nombreCarga;
    private String apellidoCarga;
    private String runFamiliar;
    private String parentesco;
    private int edadCarga;

    public cargaFamiliar() {
    }

    public cargaFamiliar(String runCarga, String nombreCarga, String apellidoCarga,
                         String runFamiliar, String parentesco, int edadCarga) {
        this.runCarga = runCarga;
        this.nombreCarga = nombreCarga;
        this.apellidoCarga = apellidoCarga;
        this.runFamiliar = runFamiliar;
        this.parentesco = parentesco;
        this.edadCarga = edadCarga;
    }

    @Override
    public String toString() {
        return "cargaFamiliar{" +
                "runCarga='" + runCarga + '\'' +
                ", nombreCarga='" + nombreCarga + '\'' +
                ", apellidoCarga='" + apellidoCarga + '\'' +
                ", runFamiliar='" + runFamiliar + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", edadCarga=" + edadCarga +
                '}';
    }

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

    public String getApellidoCarga() {
        return apellidoCarga;
    }

    public void setApellidoCarga(String apellidoCarga) {
        this.apellidoCarga = apellidoCarga;
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

    public int getEdadCarga() {
        return edadCarga;
    }

    public void setEdadCarga(int edadCarga) {
        this.edadCarga = edadCarga;
    }
}
