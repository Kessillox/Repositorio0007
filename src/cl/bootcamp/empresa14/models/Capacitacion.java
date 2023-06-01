package cl.bootcamp.empresa14.models;

/**
 * @author Cristian Durán (el más bacán del grupo potrero), Ignacio Aránguiz e Iván Becerra
 * La clase Capacitacion contiene 7 atributos.
 * @version 1.1.0
 * @see Capacitacion
 */
public class Capacitacion {

    private int id;
    private String rutEmpresa;
    private int dia;
    private int hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int id, String rutEmpresa, int dia, int hora,
                        String lugar, String duracion, int cantidadAsistentes) {
        this.id = id;
        this.rutEmpresa = rutEmpresa;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    /**
     * Concatena e imprime por consola los datos de la capacitación
     */
    public void mostrarDetalle() {
        System.out.println("La capacitación será en " + lugar + " a las " + hora
                + " del día " + dia + ", y durará " + duracion + " minutos");
    }

    /**
     * Sobre escritura del método toString
     * @return String
     */
    @Override
    public String toString() {
        return "id: " + id +
                ", rut empresa: " + rutEmpresa +
                ", dia: " + dia +
                ", hora: " + hora +
                ", lugar: " + lugar +
                ", duración: " + duracion +
                ", cantidad asistentes: " + cantidadAsistentes;
    }
}
