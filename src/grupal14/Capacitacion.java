package grupal14;

public class Capacitacion {
    private String idCapacitacion;
    private String rutCliente;
    private String diaCapacitacion;
    private String horaCapacitacion;
    private String lugarCapacitacion;
    private int duracionCapacitacion;
    private int cantidadDeAsistentes;

    @Override
    public String toString() {
        return "Capacitacion{" +
                "idCapacitacion='" + idCapacitacion + '\'' +
                ", rutCliente='" + rutCliente + '\'' +
                ", diaCapacitacion='" + diaCapacitacion + '\'' +
                ", horaCapacitacion='" + horaCapacitacion + '\'' +
                ", lugarCapacitacion='" + lugarCapacitacion + '\'' +
                ", duracionCapacitacion='" + duracionCapacitacion + '\'' +
                ", cantidadDeAsistentes='" + cantidadDeAsistentes + '\'' +
                '}';
    }

    public Capacitacion() {
    }

    public Capacitacion(String idCapacitacion, String rutCliente,
                        String diaCapacitacion, String horaCapacitacion,
                        String lugarCapacitacion, int duracionCapacitacion,
                        int cantidadDeAsistentes) {
        this.idCapacitacion = idCapacitacion;
        this.rutCliente = rutCliente;
        this.diaCapacitacion = diaCapacitacion;
        this.horaCapacitacion = horaCapacitacion;
        this.lugarCapacitacion = lugarCapacitacion;
        this.duracionCapacitacion = duracionCapacitacion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    public String getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(String idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDiaCapacitacion() {
        return diaCapacitacion;
    }

    public void setDiaCapacitacion(String diaCapacitacion) {
        this.diaCapacitacion = diaCapacitacion;
    }

    public String getHoraCapacitacion() {
        return horaCapacitacion;
    }

    public void setHoraCapacitacion(String horaCapacitacion) {
        this.horaCapacitacion = horaCapacitacion;
    }

    public String getLugarCapacitacion() {
        return lugarCapacitacion;
    }

    public void setLugarCapacitacion(String lugarCapacitacion) {
        this.lugarCapacitacion = lugarCapacitacion;
    }

    public int getDuracionCapacitacion() {
        return duracionCapacitacion;
    }

    public void setDuracionCapacitacion(int duracionCapacitacion) {
        this.duracionCapacitacion = duracionCapacitacion;
    }

    public int getCantidadDeAsistentes() {
        return cantidadDeAsistentes;
    }

    public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }
}
