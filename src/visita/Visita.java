package visita;

/**
 * @author gonzaloalonzo
 */

// clase y atributos
public class Visita {
    private int identificador;
    private int dia;
    private String hora;
    private String lugar;
    private String comentario;

    //contructores y sobre carga
    public Visita() {
    }

    public Visita(int identificador, int dia, String hora, String lugar, String comentario) {
        this.identificador = identificador;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentario = comentario;
    }
//getters an setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    //metodo toString para mostrar datos de la clase
    @Override
    public String toString() {
        return "Visita{" +
                "identificador=" + identificador +
                ", dia=" + dia +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
