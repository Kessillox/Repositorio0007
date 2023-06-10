package cl.bootcamp.empresa.models;

/* Principio de responsabilidad única (SRP - Single Responsibility Principle):
La clase Administrativo extiende de la clase Usuario y agrega campos y comportamientos específicos para representar a un administrativo.*/

/* Principio de abierto/cerrado (OCP - Open/Closed Principle):
La clase Administrador está abierta a la extensión, ya que se pueden crear nuevas clases derivadas para representar diferentes tipos de usuarios, sin modificar el código existente.*/

/* Principio de sustitución de Liskov (LSP - Liskov Substitution Principle):
 La clase Administrador extiende de la clase Usuario. Según el principio de Liskov, los objetos de las clases derivadas pueden reemplazar a los objetos de la clase base (Usuario) sin alterar el comportamiento del programa.*/

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * @version 1.1.0
 * @see Administrativo
 * Creación de la clase Administrativo, contiene 2 atributos
 */

public class Administrativo extends Usuario {

    private String area;
    private String experenciaArea;

    public Administrativo() {
    }

    /**
     * Constructor que inicializa los parámetros del objeto Administrativo
     *
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param fechaNacimiento
     * @param run
     * @param edad
     * @param area
     * @param experenciaArea
     */

    public Administrativo(String nombre, String apellido1, String apellido2,
                          String fechaNacimiento, String run, int edad, String area,
                          String experenciaArea) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run, edad);
        this.area = area;
        this.experenciaArea = experenciaArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperenciaArea() {
        return experenciaArea;
    }

    public void setExperenciaArea(String experenciaArea) {
        this.experenciaArea = experenciaArea;
    }

    /**
     * Sobrescritura del método analizarUsuario()
     */
    @Override
    public void analizarUsuario() {
        System.out.print("El administrativo: ");
        super.analizarUsuario();
        System.out.println(", área: " + area + ", experiencia: " + experenciaArea);
    }

    /**
     * Sobrescritura del método toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() +
                ", area: " + area +
                ", experenciaArea: " + experenciaArea;
    }
}
