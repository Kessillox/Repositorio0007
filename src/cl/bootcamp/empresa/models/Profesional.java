package cl.bootcamp.empresa.models;

/* Principio de responsabilidad única (SRP - Single Responsibility Principle):
La clase Profesional extiende de la clase Usuario y agrega campos y comportamientos específicos para representar a un administrativo.*/

/* Principio de abierto/cerrado (OCP - Open/Closed Principle):
La clase Profesional está abierta a la extensión, ya que se pueden crear nuevas clases derivadas para representar diferentes tipos de usuarios, sin modificar el código existente.*/

/* Principio de sustitución de Liskov (LSP - Liskov Substitution Principle):
 La clase Profesional extiende de la clase Usuario. Según el principio de Liskov, los objetos de las clases derivadas pueden reemplazar a los objetos de la clase base (Usuario) sin alterar el comportamiento del programa.*/

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * La clase Profesional contiene 2 atributos
 * @version 1.0.0
 * @see Profesional
 */
public class Profesional extends Usuario{

    private String titulo;
    private String fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, String apellido1, String apellido2, String fechaNacimiento, String run, int edad, String titulo, String fechaIngreso) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run, edad);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

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

    @Override
    public void analizarUsuario() {
        System.out.print("El profesional: ");
        super.analizarUsuario();
        System.out.println(", titulo: " + titulo + ", fecha de ingreso: " + fechaIngreso);
    }

    @Override
    public String toString() {
        return super.toString() +
                "titulo: " + titulo +
                ", fechaIngreso: " + fechaIngreso;
    }
}
