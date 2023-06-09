package empresa.entity;

/**
 * La clase Capacitacion representa una capacitación realizada a un cliente.
 * @author Cintia Muñoz, Oscar Fenández, Joaquín Baeza, Hans Schiess
 * @version 1.0
 */
public class Capacitacion {// se crea la clase Capacitacion

    // se crea los atributos de la clase
    private int identificador;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadDeAsistentes;

    // constructor vacio
    public Capacitacion() {
    }

    /**
     * Constructor con parámetros de la clase Capacitacion.
     *
     * @param identificador         El identificador de la capacitación.
     * @param rutCliente            El RUT del cliente al que se le realiza la capacitación.
     * @param dia                   El día de la capacitación.
     * @param hora                  La hora de la capacitación.
     * @param lugar                 El lugar donde se realizará la capacitación.
     * @param duracion              La duración de la capacitación.
     * @param cantidadDeAsistentes  La cantidad de asistentes a la capacitación.
     */
    public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, String duracion, int cantidadDeAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    // metodos modificadores set y get
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidadDeAsistentes() {
        return cantidadDeAsistentes;
    }

    public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    /**
     * Devuelve una representación en forma de cadena de la capacitación.
     *
     * @return Una cadena que representa la capacitación.
     */
    @Override
    public String toString() {
        return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora
                + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadDeAsistentes=" + cantidadDeAsistentes
                + "]";
    }

    /**
     * Devuelve un detalle de la capacitación en forma de cadena.
     *
     * @return Un detalle de la capacitación.
     */
    public String mostrarDetalle() {
        return "“La capacitación será en " + getLugar() + " las " + getHora() + " del día " + getDia() + " durará " + getDuracion() + " minutos";
    }

}
