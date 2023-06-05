package capacitacion;

/**
 * @author Gonzalo Alonzo
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

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getRutcliente() {
        return rutcliente;
    }

    public void setRutcliente(int rutcliente) {
        this.rutcliente = rutcliente;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
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

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getCantidadasistentes() {
        return cantidadasistentes;
    }

    public void setCantidadasistentes(int cantidadasistentes) {
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

    /**
     * Metodo que retorna informacion de la capacitacion
     *
     * @return String con datos de la capacitacion
     */
    public String mostrarDetalle() {
        StringBuilder mensaje = new StringBuilder("La capacitacion será en ");
        mensaje.append(lugar);
        mensaje.append(" a las ");
        mensaje.append(hora);
        mensaje.append(" del día ");
        mensaje.append(dia);
        mensaje.append("Y durará ");
        mensaje.append(duracion);
        mensaje.append(" minutos");
        return mensaje.toString();
    }
}

