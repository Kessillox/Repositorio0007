package cl.bootcamp.empresa.models;

/* Principio de responsabilidad única (SRP - Single Responsibility Principle):
La clase Cliente extiende de la clase Usuario y agrega campos y comportamientos específicos para representar a un administrativo.*/

/* Principio de abierto/cerrado (OCP - Open/Closed Principle):
La clase Cliente está abierta a la extensión, ya que se pueden crear nuevas clases derivadas para representar diferentes tipos de usuarios, sin modificar el código existente.*/

/* Principio de sustitución de Liskov (LSP - Liskov Substitution Principle):
 La clase Cliente extiende de la clase Usuario. Según el principio de Liskov, los objetos de las clases derivadas pueden reemplazar a los objetos de la clase base (Usuario) sin alterar el comportamiento del programa.*/

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * La clase Cliente contiene 5 atributos
 * @version 1.0.0
 * @see Cliente
 */

public class Cliente extends Usuario {

    private String nombreEmpresa;
    private String giroEmpresa;
    private String rut;
    private String telefonoRepresentante;
    private String direccionEmpresa;
    private String comunaEmpresa;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido1, String apellido2,
                   String fechaNacimiento, String run, int edad, String nombreEmpresa,
                   String giroEmpresa, String telefonoRepresentante,
                   String direccionEmpresa, String comunaEmpresa, String rut) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run, edad);
        this.nombreEmpresa = nombreEmpresa;
        this.giroEmpresa = giroEmpresa;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccionEmpresa = direccionEmpresa;
        this.comunaEmpresa = comunaEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getGiroEmpresa() {
        return giroEmpresa;
    }

    public void setGiroEmpresa(String giroEmpresa) {
        this.giroEmpresa = giroEmpresa;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(String telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getComunaEmpresa() {
        return comunaEmpresa;
    }

    public void setComunaEmpresa(String comunaEmpresa) {
        this.comunaEmpresa = comunaEmpresa;
    }

    public String obtenerNombre (){
        return nombreEmpresa;
    }

    @Override
    public void analizarUsuario() {
        System.out.print("El cliente: ");
        super.analizarUsuario();
        System.out.println(", nombre empresa: " + nombreEmpresa +
                ", dirección empresa: " + direccionEmpresa +
                ", comuna empresa: " + comunaEmpresa);
    }

    @Override
    public String toString() {
        return super.toString() +
                "nombre empresa: " + nombreEmpresa +
                ", giro empresa: " + giroEmpresa +
                ", teléfono representante: " + telefonoRepresentante +
                ", dirección empresa: " + direccionEmpresa +
                ", comuna empresa: " + comunaEmpresa;
    }
}
