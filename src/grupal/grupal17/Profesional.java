package grupal.grupal17;

import java.time.LocalDate;
/**Clase Profesional que hereda los atributos y métodos de la clase Usuario
 * @author Cintia Muñoz, Oscar Fernandez, Joaquin baeza, Hans Schiess
 * @version 1.0
 *
 */

/*
* •	Principios SOLID que se cumplen:
1.	Principio de Responsabilidad Única (SRP): Las clases Profesional
*  tiene una única responsabilidad, que es representar a un profesional
*  y proporcionar métodos relacionados con la gestión de profesionales.
2.	Principio de Sustitución de Liskov (LSP): La clase Profesional
*  es subclase de Usuario y puede ser utilizada en lugar de la clase
* padre sin afectar el funcionamiento del programa.
3.	Principio de Abierto/Cerrado (OCP): La clase Profesional extiende
* de la clase Usuario sin modificar su comportamiento existente.
* Permite la adición de nuevos atributos y métodos específicos de profesionales.
*/
public class Profesional extends Usuario {
    private String titulo;
    private String fechaIngreso;

    //Constructor vacío
    public Profesional() {
    }

    //Constructor con atributos de la clase y heredados
    public Profesional(String nombreUsuario, String apellido1, String apellido2, LocalDate fechaDeNacimiento, String run, String titulo, String fechaIngreso) {
        super(nombreUsuario, apellido1, apellido2, fechaDeNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    //Constructor
    public Profesional(String titulo, String fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    //Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    //Método toString
    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    /**Método analizarUsuario heredado de la clase Usuario
     *
     */
    @Override
    public void analizarUsuario() {
        System.out.println();
        System.out.println("******PROFESIONAL******");
        System.out.println("Los datos del profesional ingresado son los siguientes:");
        super.analizarUsuario();
        System.out.println("Título profesional: " + getTitulo());
        System.out.println("Fecha de ingreso: " + getFechaIngreso());
        System.out.println("*******************************************");
    }
}
