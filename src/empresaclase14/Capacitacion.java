package empresaclase14;

public class Capacitacion {

    private int identificador;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadDeAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, int duracion, int cantidadDeAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadDeAsistentes() {
        return cantidadDeAsistentes;
    }

    public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    @Override
    public String toString() {
        return "empresaclase13.Capacitacion{" +
                "identificador=" + identificador +
                ", rutCliente='" + rutCliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadDeAsistentes=" + cantidadDeAsistentes +
                '}';
    }
    /*mostrarDetalle(): retorna un mensaje con el texto “La capacitación será en A a las B del día
C, y durará D minutos”, en donde A es el lugar, B es la hora, C es el día y D son los minutos.*/

    public String mostrarDetalle(){
        return "La capacitación será en " + lugar + " a las " + hora + " del día " + dia +
                ", y durará " + duracion + " minutos";
    }
}
