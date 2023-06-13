package grupal.grupal17;

import java.time.LocalDate;
import java.util.Scanner;
/**Clase Cliente que hereda los atributos y métodos de la clase Usuario
 * @author Cintia Muñoz, Oscar Fernandez, Joaquin baeza, Hans Schiess
 * @version 1.0
 *
 */
/*
* •	Principios SOLID que se cumplen:
1.	Principio de Responsabilidad Única (SRP): Las clases Cliente
*   tiene una única responsabilidad, que es representar a un Cliente
*   y proporcionar métodos relacionados con la gestión de clientes.
2.	Principio de Sustitución de Liskov (LSP): La clase Cliente
*   es subclase de Usuario y puede ser utilizada en lugar de la clase
*   padre sin afectar el funcionamiento del programa.
3.	Principio de Abierto/Cerrado (OCP): La clase Cliente extiende
*   de la clase Usuario sin modificar su comportamiento existente.
*   Permite la adición de nuevos atributos y métodos específicos de clientes.
*/

// Clase Cliente que hereda los atributos y métodos de la clase Usuario
public class Cliente extends Usuario {
    // se crea los atributos de la clase
    private String razonSocial; //es el nombre de la empresa
    private String giroEmpresa;
    private String telefonoRepresentante;
    private String direccion;
    private String comuna;

    // constructor vacio
    public Cliente() {
    }

    //Constructor con atributos de la clase Cliente y atributos heredados de la clase Usuario
    public Cliente(String nombreUsuario, String apellido1, String apellido2, LocalDate fechaDeNacimiento, String run, String razonSocial, String giroEmpresa, String telefonoRepresentante, String direccion, String comuna) {
        super(nombreUsuario, apellido1, apellido2, fechaDeNacimiento, run);
        this.razonSocial = razonSocial;
        this.giroEmpresa = giroEmpresa;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    // constructor con parametros, atributos de la clase Cliente

    public Cliente(String razonSocial, String giroEmpresa, String telefonoRepresentante, String direccion, String comuna, Scanner sc) {
        this.razonSocial = razonSocial;
        this.giroEmpresa = giroEmpresa;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    //Getters y setters
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getGiroEmpresa() {
        return giroEmpresa;
    }

    public void setGiroEmpresa(String giroEmpresa) {
        this.giroEmpresa = giroEmpresa;
    }

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(String telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }


    // metodo toString
    @Override
    public String toString() {
        return "Cliente{" +
                "razonSocial='" + razonSocial + '\'' +
                ", giroEmpresa='" + giroEmpresa + '\'' +
                ", telefonoRepresentante='" + telefonoRepresentante + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }

    /**
     * Método obtenerNombre
     * Obtiene el nombre del representante de la empresa
     * @return Una cadena que representa el nombre del representante legal.
     */
    public String obtenerNombre(){
        return "El nombre del representante legal es: "+getNombreUsuario()+" "+getApellido1()+" "+getApellido2();
    }

    /**Metodo heredado de Usuario
     */
    @Override
    public void analizarUsuario() {
        System.out.println();
        System.out.println("******CLIENTE******");
        System.out.println("Los datos del representante de la empresa son los siguientes: ");
        super.analizarUsuario(); //Despliega infomación correspondiente a la clase Usuario
        System.out.println("Los datos de la empresa son los siguientes: ");
        System.out.println("Razón social: " + getRazonSocial());
        System.out.println("Giro de la empresa: " + getGiroEmpresa());
        System.out.println("Teléfono del representante: " + getTelefonoRepresentante());
        System.out.println("Dirección: " + getDireccion() + " Comuna: " + getComuna() );
        System.out.println("*******************************************");
    }
}
