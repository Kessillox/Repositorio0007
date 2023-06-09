package empresa.entity;

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

    // constructor con parametros, atributos de la clase
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

    // metodo toString
    @Override
    public String toString() {
        return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora
                + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadDeAsistentes=" + cantidadDeAsistentes
                + "]";
    }

    //Metodo mostrarDetalle
    public String mostrarDetalle() {
        return "“La capacitación será en " + getLugar() + " las " + getHora() + " del día " + getDia() + " durará " + getDuracion() + " minutos";
    }

}
