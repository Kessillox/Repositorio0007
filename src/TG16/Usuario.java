package TG16;
/**
 * @author Gonzalo Alonzo
 *
 */
public class Usuario implements Asesoria{

    private String nombre;
    private String fechaNacimiento;
    private String run;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, String run, int edad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run='" + run + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void AnalizarUsuario(){
        System.out.println("Analizando Usuario "+ this.nombre);
    }
}
