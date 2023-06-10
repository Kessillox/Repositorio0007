package empresaclase14;

/**
 * Clase que define una Capacitación, contiene 7 atributos
 * @author Luis Zambrano
 */
public class Capacitacion {

    private Integer idCapacitacion;
    private Integer rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private Integer duracion;
    private Integer cantidadDeAsistentes;
    //public Cliente cliente;

    public Capacitacion() {
    }

    public Capacitacion(Integer idCapacitacion, Integer rutCliente, String dia, String hora, String lugar, Integer duracion, Integer cantidadDeAsistentes) {
        this.idCapacitacion = idCapacitacion;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    public int getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(int idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    public Integer getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
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

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public int getCantidadDeAsistentes() {
        return cantidadDeAsistentes;
    }

    public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }
/*
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
*/
    @Override
    public String toString() {
        return "Capacitacion{" +
                "idCapacitacion=" + idCapacitacion +
                ", rutCliente='" + rutCliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadDeAsistentes=" + cantidadDeAsistentes +
                '}';
    }

    // Se considera que el atributo duración es ingresado en formato HORA
    public String mostrarDetalle(){
        return "La capacitación será en " + this.getLugar() + " a las " + this.getHora() + "hrs. del día " +
                this.getDia() + ", y durará " + this.getDuracion() + " minutos";
    }
}
