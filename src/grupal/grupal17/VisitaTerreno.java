package grupal.grupal17;

/**
 * Clase que representa una visita de terreno
 *@author Cintia Muñoz, Oscar Fenández, Joaquín Baeza, Hans Schiess
 * @version 1.0
 */

/*
Principios SOLID que se cumplen:
* 1.Principio de Responsabilidad Única (SRP): La clase VisitaTerreno
    cumple con este principio, ya que su única responsabilidad es
    representar una visita de terreno y proporcionar métodos para acceder
    y modificar sus atributos. No parece tener más de una razón para cambiar.
*2.Principio de Abierto/Cerrado (OCP): La clase VisitaTerreno está cerrada
    para modificaciones, ya que no tiene métodos para modificar su comportamiento.
    Sin embargo, puede ser extendida para agregar funcionalidades adicionales
    relacionadas con las visitas de terreno.
*/
public class VisitaTerreno {
    private int idVisit;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;

    //Constructor vacío
    public VisitaTerreno() {
    }

    //Constructor con atributos
    public VisitaTerreno(int idVisit, String dia, String hora, String lugar, String comentarios) {
        this.idVisit = idVisit;
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

    //Método toString
    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "idVisit=" + idVisit +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
