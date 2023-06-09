import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Natalia Perez
 */

public class Usuario implements IAsesoria {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNac;
    private int run;

    public Usuario(){}

    public Usuario(String nombre, String apellido1, String apellido2, String fechaNac, int run) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNac = LocalDate.parse(fechaNac, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaNac=" + fechaNac +
                ", run='" + run + '\'' +
                '}';
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

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    /**
     * Calcula la edad del usuario tomando el tiempo entre la fecha actual y el atributo "fechaNac", para luego convertirlos a años, finalmente muestra en consola un mensaje con la edad.
     */
    public void mostrarEdad() {
        int edad = fechaNac.until(LocalDate.now()).getYears();
        System.out.println("El usuario tiene " + edad + " años");
    }

    /**
     * Muestra en consola datos básicos del usuario.
     */
    public void analizarUsuario() {
        System.out.println("Nombre: " + this.getNombre() );
        System.out.println("RUT o RUN: " + this.getRun());
    };
}

