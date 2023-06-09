package sprint.entity;

import sprint.IAsesoria;
/**
 * @author Genesis paola
 * @version 1
 * var NombreEmpresa, GiroEmpresa, Rut, TlfRepresentante, DireccionEmpresa, Comuna.
 * **/
public class Usuario implements IAsesoria {
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String FechaNacimiento;
    private int run;

    /**
     * se crea el constructor vacio.
     */
    public Usuario() {
    }

    /**
     *se crean los constructores con los parametros.
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param fechaNacimiento
     * @param run
     */
    public Usuario(String nombre, String apellido1, String apellido2, String fechaNacimiento, int run) {
        Nombre = nombre;
        Apellido1 = apellido1;
        Apellido2 = apellido2;
        FechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }
    /**
     * se crea metodo toString que retorna todo los datos de los usuarios
     * **/
    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido1='" + Apellido1 + '\'' +
                ", Apellido2='" + Apellido2 + '\'' +
                ", FechaNacimiento='" + FechaNacimiento + '\'' +
                ", run=" + run +
                '}';
    }
    /**
     * se crea metodo analizar usuario que muesta nombre y run
     * **/
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre " + this.getNombre() + "Su run es " + this.getRun());
    }
    // probando
}
