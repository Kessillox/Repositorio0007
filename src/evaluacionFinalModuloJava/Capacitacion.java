package evaluacionFinalModuloJava;

public class Capacitacion {
    private int identificador;
    private int rut;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, int rut, String dia, String hora, String lugar, int duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public void mostrarDetalles(){
        System.out.println("La capacitacion sera "+ this.getLugar()+ " a las "+this.getHora()+" y durara "+this.getDuracion()+ "minutos" );
    }
}
