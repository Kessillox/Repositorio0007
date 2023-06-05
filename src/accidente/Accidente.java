package accidente;

/**
 * @author gonzaloalonzo
 */
//clase y atributos
public class Accidente {
    private int identificador;
    private int codigoInterno;
    private int dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    // constructores y sobrecarga
    public Accidente() {
    }

    public Accidente(int identificador, int codigoInterno, int dia, String hora, String lugar, String origen, String consecuencias) {
        this.identificador = identificador;
        this.codigoInterno = codigoInterno;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    //getter and setter
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    //metodo muestra toString
    @Override
    public String toString() {
        return "Accidente{" +
                "identificador=" + identificador +
                ", codigoInterno=" + codigoInterno +
                ", dia=" + dia +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
