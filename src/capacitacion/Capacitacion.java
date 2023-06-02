package capacitacion;

/**
 * @author Gonzal Alonzo
 *
 */
public class Capacitacion {
    private int identificador;
    private int rutcliente;
    private int dv;
    private int dia;
    private String hora;
    private String lugar;
    private double duracion;
    private int cantidadasistentes;

    /**
     * Constructor vacio
     */
    public Capacitacion() {
    }

    /**
     * Constructor con parametros
     * @param identificador
     * @param rutcliente
     * @param dv
     */
    public Capacitacion(int identificador, int rutcliente, int dv, int dia, String hora, String lugar, double duracion, int cantidadasistentes) {
        this.identificador = identificador;
        this.rutcliente = rutcliente;
        this.dv = dv;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadasistentes = cantidadasistentes;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rutcliente=" + rutcliente +
                ", dv=" + dv +
                ", dia=" + dia +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadasistentes=" + cantidadasistentes +
                '}';
    }
}
