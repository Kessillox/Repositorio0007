package individual25gustavov;

public class trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private String edad;

    public trabajador(){

    }
    public trabajador(String nombres, String apellidos, String run, String telefono, String edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "individual25gustavov.trabajador{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }

    public String nombreCompleto(){

        return "El nombre del trabajador es: " + nombres + apellidos;
    }

    public int descomponerRun() {
        int runDescompuesto = Integer.parseInt(edad);
        return runDescompuesto;
    }
}
