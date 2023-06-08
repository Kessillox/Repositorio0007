package evaluacionFinalModuloJava.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaTerreno {
    private int indetificadorVisita;
    private LocalDate diaAccidente;
    private LocalTime hora;
    private String lugar;
    private String comentario;

    public VisitaTerreno() {
    }

    public VisitaTerreno(int indetificadorVisita, LocalDate diaAccidente, LocalTime hora, String lugar, String comentario) {
        this.indetificadorVisita = indetificadorVisita;
        this.diaAccidente = diaAccidente;
        this.hora = hora;
        this.lugar = lugar;
        this.comentario = comentario;
    }

    public int getIndetificadorVisita() {
        return indetificadorVisita;
    }

    public void setIndetificadorVisita(int indetificadorVisita) {
        this.indetificadorVisita = indetificadorVisita;
    }

    public LocalDate getDiaAccidente() {
        return diaAccidente;
    }

    public void setDiaAccidente(LocalDate diaAccidente) {
        this.diaAccidente = diaAccidente;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
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
        return "VisitaTerreno{" +
                "indetificadorVisita=" + indetificadorVisita +
                ", diaAccidente=" + diaAccidente +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
