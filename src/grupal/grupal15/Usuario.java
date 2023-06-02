package grupal.grupal15;
import java.time.LocalDate;
import java.time.Period;
public class Usuario { // se crea la clase Usuario
    // se crea los atributos de la clase
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private String run;
    
    // constructor vacio
    public Usuario() {
    }
    
    // constructor con parametros, atributos de la clase
    public Usuario(String nombre, LocalDate fechaDeNacimiento, String run) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.run = run;
    }

    // metodos modificadores set y get
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public String getRun() {
        return run;
    }
    public void setRun(String run) {
        this.run = run;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", run=" + run + "]";
    }

    //Metodo mostrarEdad
    public String mostrarEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaDeNacimiento, fechaActual);
        return "El usuario tiene "+periodo.getYears()+" Años";

    }
}
