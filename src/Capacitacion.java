
public class Capacitacion {
    private int idCapacitacion;
    private String rutEmpresa;
    private String diaCapacitacion;
    private String horaCapacitacion;
    private String lugarCapacitacion;
    private int duracionCapacitacion;
    private int cantidadDeAsistentes;

    @Override
    public String toString() {
        return "Capacitacion{" +
                "idCapacitacion='" + idCapacitacion + '\'' +
                ", rutCliente='" + rutEmpresa + '\'' +
                ", diaCapacitacion='" + diaCapacitacion + '\'' +
                ", horaCapacitacion='" + horaCapacitacion + '\'' +
                ", lugarCapacitacion='" + lugarCapacitacion + '\'' +
                ", duracionCapacitacion='" + duracionCapacitacion + '\'' +
                ", cantidadDeAsistentes='" + cantidadDeAsistentes + '\'' +
                '}';
    }

    public Capacitacion() {
    }

    public Capacitacion(int idCapacitacion, String rutEmpresa,
                        String diaCapacitacion, String horaCapacitacion,
                        String lugarCapacitacion, int duracionCapacitacion,
                        int cantidadDeAsistentes) {
        this.idCapacitacion = idCapacitacion;
        this.rutEmpresa = rutEmpresa;
        this.diaCapacitacion = diaCapacitacion;
        this.horaCapacitacion = horaCapacitacion;
        this.lugarCapacitacion = lugarCapacitacion;
        this.duracionCapacitacion = duracionCapacitacion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    public int getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(int idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    public String getRutCliente() {
        return rutEmpresa;
    }

    public void setRutCliente(String rutCliente) {
        this.rutEmpresa = rutCliente;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
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
    public void mostrarDetalle(){
        System.out.println("La capacitación sera en "+this.getLugarCapacitacion()
                +" a las "+this.getHoraCapacitacion()+ " del día "+this.getDiaCapacitacion()
                + " y durará "+ this.getDuracionCapacitacion()+" minutos" );
    }

}
