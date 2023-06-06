package individuales.individual31;

public class Honorario extends Trabajador{
    private String giro;
    private String fechaInicioAct;

    //Constructor vacío
    public Honorario() {
    }

    //Constructor con atributos de clase Honorario y atributos de Trabajador
    public Honorario(String nombre, String apellido1, String apellido2, String run, String telefono, int edad, CargaFamiliar carga, String giro, String fechaInicioAct) {
        super(nombre, apellido1, apellido2, run, telefono, edad, carga);
        this.giro = giro;
        this.fechaInicioAct = fechaInicioAct;
    }

    //Constructor con atributos de clase Honorario
    public Honorario(String giro, String fechaInicioAct) {
        this.giro = giro;
        this.fechaInicioAct = fechaInicioAct;
    }

    //Getters y setters
    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getFechaInicioAct() {
        return fechaInicioAct;
    }

    public void setFechaInicioAct(String fechaInicioAct) {
        this.fechaInicioAct = fechaInicioAct;
    }

    //Método toString
    @Override
    public String toString() {
        return "Honorario{" +
                "giro='" + giro + '\'' +
                ", fechaInicioAct='" + fechaInicioAct + '\'' +
                '}';
    }


    //Metodo mostrarDatos extendido de la clase Trabajador

    @Override
    public void mostrarDatos() {
        System.out.println("El giro del trabajador es: " +getGiro() +" y la fecha de inicio de actividades es: " +getFechaInicioAct());
    }
}
