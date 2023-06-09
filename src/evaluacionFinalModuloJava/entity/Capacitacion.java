package evaluacionFinalModuloJava.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Capacitacion {
    private int identificador;
    private int rut;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private LocalTime duracion;
    private int cantidadAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, int rut, LocalDate dia, LocalTime hora, String lugar, int duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = LocalTime.ofSecondOfDay(duracion);
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(String s) { this.dia = dia; }

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

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }
    public int getCantidadAsistentes() { return cantidadAsistentes; }

    public void mostrarDetalles(){
        System.out.println("La capacitacion sera "+ this.getLugar()+ " a las "+this.getHora()+" y durara "+this.getDuracion()+ "minutos" );
    }
}
