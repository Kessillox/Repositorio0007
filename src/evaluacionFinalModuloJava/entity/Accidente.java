package evaluacionFinalModuloJava.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Accidente {
    private int identificadorAccidente;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    public Accidente() {
    }

    public Accidente(int identificadorAccidente, LocalDate dia, LocalTime hora, String lugar, String origen, String consecuencias) {
        this.identificadorAccidente = identificadorAccidente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public int getIdentificadorAccidente() {
        return identificadorAccidente;
    }

    public void setIdentificadorAccidente(int identificadorAccidente) {
        this.identificadorAccidente = identificadorAccidente;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
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

    @Override
    public String toString() {
        return "Accidente{" +
                "identificadorAccidente=" + identificadorAccidente +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
