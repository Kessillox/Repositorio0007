package sprint.entity;

public class Accidente {
    private int id;
    private String dia;
    private int hora;
    private String lugar;
    private String origen;
    private String consecuencia;

    public Accidente() {
    }

    public Accidente(int id, String dia, int hora, String lugar, String origen, String consecuencia) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencia = consecuencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
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

    @Override
    public String toString() {
        return "Accidente{" +
                "id=" + id +
                ", dia='" + dia + '\'' +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencia='" + consecuencia + '\'' +
                '}';
    }
}
