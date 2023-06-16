package TI31;

public class TrabajadorHonorario extends Trabajador{
    private String giro;
    private String annoIniciacion;

    public TrabajadorHonorario() {
    }

    public TrabajadorHonorario(String nombre, String apellido1, String apellido2, String run, String telefono, int edad) {
        super(nombre, apellido1, apellido2, run, telefono, edad);
    }

    public TrabajadorHonorario(String giro, String annoIniciacion) {
        this.giro = giro;
        this.annoIniciacion = annoIniciacion;
    }

    public TrabajadorHonorario(String nombre, String apellido1, String apellido2, String run, String telefono, int edad, String giro, String annoIniciacion) {
        super(nombre, apellido1, apellido2, run, telefono, edad);
        this.giro = giro;
        this.annoIniciacion = annoIniciacion;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getAnnoIniciacion() {
        return annoIniciacion;
    }

    public void setAnnoIniciacion(String annoIniciacion) {
        this.annoIniciacion = annoIniciacion;
    }

    @Override
    public String toString() {
        return "TrabajadorHonorario{" +
                "giro='" + giro + '\'' +
                ", annoIniciacion='" + annoIniciacion + '\'' +
                '}';
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El giro: '" + giro + '\'' +
                ", anno Iniciacion: '" + annoIniciacion + '\''
        );
    }
}
