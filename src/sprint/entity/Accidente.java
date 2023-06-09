package sprint.entity;
/**
 * @author Nazly SotoLabarca
 * @version 1
 * var nombre, apellido1, apellido2, fechaNacimiento, run, area, experienciaPrevia
 * **/

public class Accidente {
    private int id;
    private String dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencia;

    /**
     *se crea constructor vacio.
     */
    public Accidente() {
    }

    /**
     *se crea constructor con parametros
     * @param id
     * @param dia
     * @param hora
     * @param lugar
     * @param origen
     * @param consecuencia
     */
    public Accidente(int id, String dia, String hora, String lugar, String origen, String consecuencia) {
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
     * se crea toString que retorna todos los parametros.
     * @return
     */
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
