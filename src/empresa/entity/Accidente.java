package empresa.entity;

public class Accidente {
    //Atributos de la clase Accidente
    private int idAcc;
    private int rutCliente;
    private String diaAcc;
    private  String horaAcc;
    private String lugarAcc;
    private String origenAcc;
    private String consecuencias;

    //Constructor vacío
    public Accidente() {
    }

    //Constructor con atributos de la clase Accidente
    public Accidente(int idAcc, int rutCliente, String diaAcc, String horaAcc, String lugarAcc, String origenAcc, String consecuencias) {
        this.idAcc = idAcc;
        this.rutCliente = rutCliente;
        this.diaAcc = diaAcc;
        this.horaAcc = horaAcc;
        this.lugarAcc = lugarAcc;
        this.origenAcc = origenAcc;
        this.consecuencias = consecuencias;
    }

    //Getters y setters
    public int getIdAcc() {
        return idAcc;
    }

    public void setIdAcc(int idAcc) {
        this.idAcc = idAcc;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDiaAcc() {
        return diaAcc;
    }

    public void setDiaAcc(String diaAcc) {
        this.diaAcc = diaAcc;
    }

    public String getHoraAcc() {
        return horaAcc;
    }

    public void setHoraAcc(String horaAcc) {
        this.horaAcc = horaAcc;
    }

    public String getLugarAcc() {
        return lugarAcc;
    }

    public void setLugarAcc(String lugarAcc) {
        this.lugarAcc = lugarAcc;
    }

    public String getOrigenAcc() {
        return origenAcc;
    }

    public void setOrigenAcc(String origenAcc) {
        this.origenAcc = origenAcc;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    //Método toString
    @Override
    public String toString() {
        return "Accidente{" +
                "idAcc=" + idAcc +
                ", rutCliente=" + rutCliente +
                ", diaAcc='" + diaAcc + '\'' +
                ", horaAcc='" + horaAcc + '\'' +
                ", lugarAcc='" + lugarAcc + '\'' +
                ", origenAcc='" + origenAcc + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
