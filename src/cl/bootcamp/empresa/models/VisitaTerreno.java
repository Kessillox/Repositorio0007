package cl.bootcamp.empresa.models;

public class VisitaTerreno {

    private int id;
    private String dia;
    private String hora;
    private String lugar;
    private String comentario;

    public VisitaTerreno() {
    }

    public VisitaTerreno(int id, String dia, String hora, String lugar, String comentario) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentario = comentario;
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

    @Override
    public String toString() {
        return "id: " + id +
                ", dia: " + dia +
                ", hora: " + hora +
                ", lugar: " + lugar +
                ", comentario: " + comentario;
    }
}
