/**
 * Esta es la clase Usuario la cual contiene 4 atributos sus constructores, uno vacío y otro con argumentos, sus Getters and Setters, su método toString y mostrarEdad()
 * @author Leadro Villalba
 * @author Luis Zambrano
 * @author Gustavo Vargas
 * @author Cristian Trureo
 * @version 1.1
 */

package empresaclase14;

public class Usuario implements Asesoria{
    private String nombre;
    private String fechaDeNacimiento;
    private String run;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaDeNacimiento, String run) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "\n nombre='" + nombre + "'," +
                "\n fechaDeNacimiento='" + fechaDeNacimiento + "'," +
                "\n run='" + run + "'" +
                "\n}";
    }

    public String mostrarEdad(){
        int edad;
        edad = (2023 - Integer.parseInt(fechaDeNacimiento));
        return "El usuario tiene " + edad;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " +this.getNombre() +"\nFecha de nacimiento: "+this.getFechaDeNacimiento()
        +"\nRun: "+this.getRun());
    }
}
