package individualesvalentin.ti31;

public class CargaFamiliar {
    private String runCarga;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String runFamiliar;
    private String parentesco;
    private int edad;

    public CargaFamiliar() {
    }

    public CargaFamiliar(String runCarga, String nombre1, String nombre2, String apellido1, String apellido2,
                         String runFamiliar, String parentesco, int edad) {
        this.runCarga = runCarga;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.runFamiliar = runFamiliar;
        switch (parentesco) {
            case "1" -> this.parentesco = "Conyugue";
            case "2" -> this.parentesco = "hijo";
            case "3" -> this.parentesco = "otro";
            default -> this.parentesco = parentesco;
        }
        this.edad = edad;
    }

    public String getRunCarga() {
        return runCarga;
    }

    public void setRunCarga(String runCarga) {
        this.runCarga = runCarga;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "CargaFamiliar{" +
                "runCarga='" + runCarga + '\'' +
                ", nombre1='" + nombre1 + '\'' +
                ", nombre2='" + nombre2 + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", runFamiliar='" + runFamiliar + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", edad=" + edad +
                '}';
    }
}
