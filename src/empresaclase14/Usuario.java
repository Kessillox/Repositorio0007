/**
 * Esta es la clase Usuario la cual contiene 4 atributos sus constructores, uno vacío y otro con argumentos, sus Getters and Setters, su método toString y mostrarEdad()
 * @author Leadro Villalba
 * @author Luis Zambrano
 * @author Gustavo Vargas
 * @author Cristian Trureo
 * @version 1.1
 */

package empresaclase14;

/*
    Principio de Sustitución de Liskov

    La clase Usuario es la clase Padre de Cliente, Administrativo y Profesional

    Usuario está abstraída de manera tal que cuando utilicemos las clases hijas no
    se altere el comportamiento de la clase padre (ni del programa), no haya que
    sobreecribir métodos que no sirvan a las clases hijas y también para que los
    atributos de la clase padre tengan sentido para las clases hijas*/

public class Usuario implements IAsesoria {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String fechaDeNacimiento;
    private Integer run;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, String fechaDeNacimiento, int run) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.run = run;
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

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", run='" + run + '\'' +
                '}';
    }

    public String mostrarEdad(){
        int edad;
        edad = (2023 - Integer.parseInt(fechaDeNacimiento));
        return "El usuario tiene " + edad;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " + this.getNombre());
    }
}
