package individual31;

/**
 * Clase que almacena la informacion de la carga familiar
 * @author Juan Merino
 * @version 2.0
 */
public class CargaFamiliar {

    private String runCarga, nombresCarga, apellidosCarga, runFamiliar;
    private int parentesco, edad;

    /**
     * Método que entrega la informacion de la clase ordenada y legible
     * @return String con la informacion de la clase
     */
    @Override
    public String toString() {
        String[] opcionesParentesco = {"Cónyuge", "Hijo/a", "Otro"};
        return "\nCarga Familiar\n" +
                "RUN carga: " + runCarga + "\n" +
                "Nombres: " + nombresCarga + "\n" +
                "Apellidos: " + apellidosCarga + "\n" +
                "RUN Familiar: " + runFamiliar + "\n" +
                "Parentesco" + opcionesParentesco[parentesco - 1] + "\n" +
                "Edad: " + edad + "\n";
    }

    public CargaFamiliar() {
    }

    public CargaFamiliar(String runCarga, String nombresCarga, String apellidosCarga, String runFamiliar, int parentesco, int edad) {
        this.runCarga = runCarga;
        this.nombresCarga = nombresCarga;
        this.apellidosCarga = apellidosCarga;
        this.runFamiliar = runFamiliar;
        this.parentesco = parentesco;
        this.edad = edad;
    }

    /**
     * Getter de atributo privado runCarga
     * @return String runCarga almacenada en la clase
     */
    public String getRunCarga() {
        return runCarga;
    }

    /**
     * Setter de atributo privado runCarga
     * @param runCarga String del nuevo RUN a almacenar
     */
    public void setRunCarga(String runCarga) {
        this.runCarga = runCarga;
    }

    /**
     * Getter de atributo privado nombresCarga
     * @return String del atributo almacenado en la clase
     */
    public String getNombresCarga() {
        return nombresCarga;
    }

    /**
     * Setter del atributo privado nombresCarga
     * @param nombresCarga nombre de la carga
     */
    public void setNombresCarga(String nombresCarga) {
        this.nombresCarga = nombresCarga;
    }

    /**
     * Getter del atributo privado apellidoscarga
     * @return apellidos almacenados en la clase
     */
    public String getApellidosCarga() {
        return apellidosCarga;
    }

    /**
     * Setter del atributo que almacena apellidos
     * @param apellidosCarga String con los apellidos de la carga
     */
    public void setApellidosCarga(String apellidosCarga) {
        this.apellidosCarga = apellidosCarga;
    }

    /**
     * Getter del atributo que almacena el run familiar
     * @return String con a información almacenada del run familiar
     */
    public String getRunFamiliar() {
        return runFamiliar;
    }

    /**
     * Setter del atributo que almacena el run familiar
     * @param runFamiliar String con el run familiar a almacenar
     */
    public void setRunFamiliar(String runFamiliar) {
        this.runFamiliar = runFamiliar;
    }

    /**
     * Getter del atributo que almacena el parentesco
     * @return int con relacion de parentesco 1) conyugue 2) hijo/a 3) otro
     */
    public int getParentesco() {
        return parentesco;
    }

    /**
     * Setter del atributo que almacena el parentesco
     * @param parentesco 1 para conyugue, 2 para hijo/a, 3 para otro
     */
    public void setParentesco(int parentesco) {
        this.parentesco = parentesco;
    }

    /**
     * Getter del atributo privado que almacena la edad
     * @return int con la edad de la carga
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter del atributo privado que almacena la edad
     * @param edad int con la edad de la carga
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
