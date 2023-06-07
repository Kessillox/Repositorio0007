package individualesvalentin.ti31;

public class Honorario extends Trabajador{
    private String giro;
    private int annoIniAct;

    public Honorario(String nombre1, String nombre2, String apellido1, String apellido2, String run, int telefono,
                     int edad, String giro, int annoIniAct) {
        super(nombre1, nombre2, apellido1, apellido2, run, telefono, edad);
        this.giro = giro;
        this.annoIniAct = annoIniAct;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getAnnoIniAct() {
        return annoIniAct;
    }

    public void setAnnoIniAct(int annoIniAct) {
        this.annoIniAct = annoIniAct;
    }

    @Override
    public String toString() {
        return "Honorario{" +
                "giro='" + giro + '\'' +
                ", annoIniAct=" + annoIniAct +
                '}';
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("%s: %s%n%s: %s%n","Giro",getGiro(),"Año Iniciacion",getAnnoIniAct());
    }
}
