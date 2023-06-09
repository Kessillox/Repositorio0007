package empresa.entity;



/**Clase Administrativo que hereda los atributos y métodos de la clase Usuario
 * @author Cintia Muñoz, Oscar Fernandez, Joaquin baeza, Hans Schiess
 * @version 1.
 *
 *
 *
 */


public class Administrativo extends Usuario {
    //Atributos de la clase Administrativo
    private String area;
    private String experiencia;

    /**Constructor vacío
     *
     */
    public Administrativo() {
    }

    /**Constructor con atributos de la clase Administrativo
     *
     * @param area
     * @param experiencia
     */
    public Administrativo(String area, String experiencia) {
        this.area = area;
        this.experiencia = experiencia;
    }

    /**Constructor con atributos de la clase Administrativos y atributos heredados de la clase Usuario
     *
     * @param nombreUsuario
     * @param apellido1
     * @param apellido2
     * @param fechaDeNacimiento
     * @param run
     * @param area
     * @param experiencia
     */
    public Administrativo(String nombreUsuario, String apellido1, String apellido2, String fechaDeNacimiento, String run, String area, String experiencia) {
        super(nombreUsuario, apellido1, apellido2, fechaDeNacimiento, run);
        this.area = area;
        this.experiencia = experiencia;
    }

    //Getters y setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    //Metodo toString
    @Override
    public String toString() {
        return super.toString() +
                " " +
                "Administrativo{" +
                "area='" + area + '\'' +
                ", experiencia='" + experiencia + '\'' +
                "} ";
    }

    /**Metodo analizarUsuario heredado de la clase Usuario
     *
     */
    @Override
    public void analizarUsuario() {
        System.out.println();
        System.out.println("******ADMINISTRATIVO******");
        System.out.println("Los datos del administrativo ingresado son los siguientes: ");
        super.analizarUsuario(); //Despliega infomación correspondiente a la clase Usuario
        System.out.println("Área:" + getArea());
        System.out.println("Años de experiencia: " + getExperiencia());
        System.out.println("*******************************************");
    }
}
