package grupal.grupal17;

import java.time.LocalDate;
/**Clase Administrativo que hereda los atributos y métodos de la clase Usuario
 * @author Cintia Muñoz, Oscar Fernandez, Joaquin baeza, Hans Schiess
 * @version 1.0.2
 *
 */
/*
* •	Principios SOLID que se cumplen:
*1.	Principio de Responsabilidad Única (SRP): Las clases Administrativo
*   tiene una única responsabilidad, que es representar a un administrativo
*   y proporcionar métodos relacionados con la gestión de administrativos.
*2.	Principio de Sustitución de Liskov (LSP): La clase Administrativo
*   es subclase de Usuario y puede ser utilizada en lugar de la clase
*   padre sin afectar el funcionamiento del programa.
*3.	Principio de Abierto/Cerrado (OCP): La clase Administrativo extiende
*   de la clase Usuario sin modificar su comportamiento existente.
*   Permite la adición de nuevos atributos y métodos específicos de administrativos.
*/

//Clase Administrativo que hereda atributos y métodos desde la clase Usuario
public class Administrativo extends Usuario {
    //Atributos de la clase Administrativo
    private String area;

    private String experiencia;

    //Constructor vacío
    public Administrativo() {
    }

    //Constructor con atributos de la clase Administrativo
    public Administrativo(String area, String experiencia) {
        this.area = area;
        this.experiencia = experiencia;
    }

    //Constructor con atributos de la clase Administrativos y atributos heredados de la clase Usuario
    public Administrativo(String nombreUsuario, String apellido1, String apellido2, LocalDate fechaDeNacimiento, String run, String area, String experiencia) {
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

    //Método toString
    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }

    /**Metodo heredado de Usuario
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
