package empresaclase14;

/**
 * Clase que define una Capacitación, contiene 7 atributos
 * @author Luis Zambrano
 */
public class Capacitacion {

    private int idCapacitacion;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadDeAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, int duracion, int cantidadDeAsistentes) {
        this.idCapacitacion = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    public int getIdentificador() {
        return idCapacitacion;
    }

    public void setIdentificador(int identificador) {
        this.idCapacitacion = identificador;
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
        return "Capacitacion{" +
                "\n identificador=" + idCapacitacion + "'," +
                "\n rutCliente='" + rutCliente + "'," +
                "\n dia='" + dia + "'," +
                "\n hora='" + hora + "'," +
                "\n lugar='" + lugar + "'," +
                "\n duracion=" + duracion + "," +
                "\n cantidadDeAsistentes=" + cantidadDeAsistentes +
                "\n}";
    }
    // Se considera que el atributo duración es ingresado en formato HORA
    public String mostrarDetalle(){
        return "La capacitación será en " + lugar + " a las " + hora + "hrs. del día " + dia +
                ", y durará " + (duracion*60) + " minutos";
    }
}
