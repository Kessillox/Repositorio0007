
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Usuario implements IAsesoria{
    private String nombreUsuario;
    private String apellido1;
    private String apellido2;
    private String fechaDeNacimientoUsuario;
    private String runUsuario;
    private String rutEmpresa;



    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", fechaDeNacimientoUsuario='" + fechaDeNacimientoUsuario + '\'' +
                ", runUsuario='" + runUsuario + '\'' +
                '}';
    }

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String fechaDeNacimientoUsuario,
                   String runUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.fechaDeNacimientoUsuario = fechaDeNacimientoUsuario;
        this.runUsuario = runUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFechaDeNacimientoUsuario() {
        return fechaDeNacimientoUsuario;
    }

    public void setFechaDeNacimientoUsuario(String fechaDeNacimientoUsuario) {
        this.fechaDeNacimientoUsuario = fechaDeNacimientoUsuario;
    }

    public String getRunUsuario() {
        return runUsuario;
    }

    public void setRunUsuario(String runUsuario) {
        this.runUsuario = runUsuario;
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

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: "+this.getNombreUsuario()+"\nRUN: "+this.getRunUsuario());
    }
    public void  mostrarEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(LocalDate.parse(getFechaDeNacimientoUsuario()), fechaActual);
        int edad = periodo.getYears();
        String printedad= "El usuario tiene " + edad + " años";
        System.out.println(printedad);
    }
}
