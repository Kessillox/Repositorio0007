package grupal.grupal15;

import java.util.Scanner;

public class Cliente { // se crea la clase Cliente
    // se crea los atributos de la clase
    private long rut;
    private String nombreEmpresa;

    private String nombreRepresentante;

    private String apellido1;
    private String apellido2;
    private String telefonoRepresentante;
    private String direccion;
    private String comuna;
    Scanner sc = new Scanner(System.in);

    public Cliente() { // constructor vacio
    }

    // constructor con parametros, atributos de la clase
    public Cliente(long rut, String nombreEmpresa, String nombreRepresentante, String apellido1, String apellido2,String telefonoRepresentante, String direccion, String comuna) {
        if (rut < 999999999) {
            while (rut > 999999999) {
                System.out.println("Ingrese de nuevo el rut: (no debe ser mayor a 999999999)");
                
                rut = sc.nextLong();
            }
            this.rut = rut;
        } else {
            this.rut = rut;
        }
        this.nombreEmpresa = nombreEmpresa;
        this.nombreRepresentante = nombreRepresentante;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    // metodos modificadores set y get
    public long getRut() {
        return rut;
    }

    public void setRut(long rut) {
        if (rut > 999999999) {
            while (rut > 999999999) {
                System.out.println("Ingrese de nuevo el rut: (no debe ser mayor a 999999999)");
                rut = sc.nextLong();
            }
            this.rut = rut;
        } else {
            this.rut = rut;
        }
        sc.close();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }


    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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


    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
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

    public void setApeliido2(String apeliido2) {
        this.apellido2 = apeliido2;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Cliente [rut=" + rut + ", nombreEmpresa=" + nombreEmpresa + ", telefonoRepresentante="
                + telefonoRepresentante + ", direccion=" + direccion + ", comuna=" + comuna + "]";
    }

    //Metodo obtenerNombre
    public String obtenerNombre(){
        return "El nombre del representante legal es: "+nombreRepresentante+" "+apellido1+" "+apellido2;
    }

    
}
