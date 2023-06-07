/**
 * Esta es la clase Usuario la cual contiene 4 atributos sus constructores, uno vacío y otro con argumentos, sus Getters and Setters, su método toString y mostrarEdad()
 * @author Leadro Villalba
 * @author Luis Zambrano
 * @author Gustavo Vargas
 * @author Cristian Trureo
 * @version 1.1
 */

package empresaclase14;

public class Usuario implements IAsesoria {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String fechaDeNacimiento;
    private String runORut;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, String fechaDeNacimiento, String runORut) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.runORut = runORut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getRunORut() {
        return runORut;
    }

    public void setRunORut(String runORut) {
        this.runORut = runORut;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", runORut='" + runORut + '\'' +
                '}';
    }

    public String mostrarEdad(){
        int edad;
        edad = (2023 - Integer.parseInt(fechaDeNacimiento));
        return "El usuario tiene " + edad;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " +this.getNombre());
    }
}
