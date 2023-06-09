package cl.bootcamp.empresa.models;

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * @version 1.1.0
 * @see Accidente
 * Creación de la clase Accidente, contiene 6 atributos
 */
public class Accidente {

    private int id;

    private String dia;

    private String hora;

    private String lugar;

    private String origen;

    private String consecuencia;

    public Accidente() {
    }

    /**
     * Constructor que inicializa los parámetros del objeto Accidente
     *
     * @param id
     * @param dia
     * @param hora
     * @param lugar
     * @param origen
     * @param consecuencias
     */
    public Accidente(int id, String dia, String hora, String lugar,
                     String origen, String consecuencias) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencia = consecuencias;
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

    /**
     * Sobrescritura del método toString
     *
     * @return String
     */

    @Override
    public String toString() {
        return "id: " + id +
                ", dia: " + dia +
                ", hora: " + hora +
                ", lugar: " + lugar +
                ", origen: " + origen +
                ", consecuencias: " + consecuencia;
    }
}
