package empresaclase14;

public class Usuario {
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
        return "empresaclase13.Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", run='" + run + '\'' +
                '}';
    }
}
