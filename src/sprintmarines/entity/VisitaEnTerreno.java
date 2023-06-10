package sprintmarines.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una visita en terreno.
 * Contiene información sobre el ID, día, hora, lugar y comentarios de la visita.
 * También tiene una lista de revisiones asociadas y un cliente asociado.
 * @author Leadro Villalba
 * @author Luis Zambrano
 * @author Gustavo Vargas
 * @author Cristian Trureo
 * @version 1.2
 */
public class VisitaEnTerreno {
    private int idVisitaTerreno;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;
    public Cliente cliente;

    /**
     * Lista de revisiones asociadas a la visita en terreno.
     */
    public List<Revision> revisionList = new ArrayList<>();

    public VisitaEnTerreno() {
    }

    public VisitaEnTerreno(int idVisitaTerreno, String dia, String hora, String lugar, String comentarios) {
        this.idVisitaTerreno = idVisitaTerreno;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    public int getIdVisitaTerreno() {
        return idVisitaTerreno;
    }

    public void setIdVisitaTerreno(int idVisitaTerreno) {
        this.idVisitaTerreno = idVisitaTerreno;
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

    @Override
    public String toString() {
        return "VisitaEnTerreno{" +
                "idVisitaTerreno=" + idVisitaTerreno +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }

    /**
     * Método que agrega una revisión a la lista de revisiones.
     * @param revision Revisión a agregar a la lista de revisiones asociadas a la visita en terreno.
     */
    public void agregarRevision(Revision revision) {
        this.revisionList.add(revision);
    }

}
