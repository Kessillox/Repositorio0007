public class Accidente {

    private int idAccidente;
    public String diaAccidente;
    public String horaAccidente;
    private String lugar;
    private String origen;
    private String consecuencia;

    @Override
    public String toString() {
        return "Accidente{" +
                "idAccidente=" + idAccidente +
                ", diaAccidente='" + diaAccidente + '\'' +
                ", horaAccidente='" + horaAccidente + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencia='" + consecuencia + '\'' +
                '}';
    }

    public Accidente(int idAccidente, String diaAccidente, String horaAccidente, String lugar, String origen, String consecuencia) {
        this.idAccidente = idAccidente;
        this.diaAccidente = diaAccidente;
        this.horaAccidente = horaAccidente;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencia = consecuencia;
    }

    public int getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(int idAccidente) {
        this.idAccidente = idAccidente;
    }

    public String getDiaAccidente() {
        return diaAccidente;
    }

    public void setDiaAccidente(String diaAccidente) {
        this.diaAccidente = diaAccidente;
    }

    public String getHoraAccidente() {
        return horaAccidente;
    }

    public void setHoraAccidente(String horaAccidente) {
        this.horaAccidente = horaAccidente;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencia() {
        return consecuencia;
    }

    public void setConsecuencia(String consecuencia) {
        this.consecuencia = consecuencia;
    }
}


