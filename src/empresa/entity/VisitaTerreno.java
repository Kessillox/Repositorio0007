package empresa.entity;

/**
 * Clase que representa una visita de terreno
 *@author Cintia Muñoz, Oscar Fenández, Joaquín Baeza, Hans Schiess
  * @version 1.0
 */
public class VisitaTerreno {
    private int idVisit;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;


    //Constructor vacío
    public VisitaTerreno() {
    }

    /**
     * Constructor de la clase VisitaTerreno con atributos.
     * @param idVisit El ID de la visita de terreno.
     * @param rutCliente El RUT del cliente asociado a la visita de terreno.
     * @param dia El día de la visita de terreno.
     * @param hora La hora de la visita de terreno.
     * @param lugar El lugar de la visita de terreno.
     * @param comentarios Los comentarios de la visita de terreno.
     */
    public VisitaTerreno(int idVisit, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.idVisit = idVisit;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    //Getters y setters
    public int getIdVisit() {
        return idVisit;
    }

    public void setIdVisit(int idVisit) {
        this.idVisit = idVisit;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * Devuelve una representación en cadena de la visita de terreno.
     * @return Una cadena que representa la visita de terreno.
     */
    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "idVisit=" + idVisit +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }


}
