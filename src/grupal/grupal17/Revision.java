package grupal.grupal17;
/**
 * Clase que representa una revisión.
 * @author Cintia Muñoz, Oscar Fenández, Joaquín Baeza, Hans Schiess
 * @version 1.0
 */
/*
Principios SOLID que se cumplen:
* 1.Principio de Responsabilidad Única (SRP): La clase Revision cumple
*   con este principio, ya que su única responsabilidad es representar
*   una revisión y proporcionar métodos para acceder y modificar sus atributos.
* 2.Principio de Abierto/Cerrado (OCP): La clase Revision está cerrada
*   para modificaciones, ya que no tiene métodos para modificar su comportamiento.
*    Sin embargo, podría ser extendida para agregar funcionalidades adicionales
*    relacionadas con las revisiones, lo que probablemente impliementemos a medida
*   que avanzamos en los distintos módulos.
*/
public class Revision {
    private int idRevision;
    private String nombreRevision;
    private String detalle;
    private int estado;

    //Constructor vacío
    public Revision() {
    }

   //Constructor con atributos
    public Revision(int idRevision, String nombreRevision, String detalle, int estado) {
        this.idRevision = idRevision;
        this.nombreRevision = nombreRevision;
        this.detalle = detalle;
        this.estado = estado;
    }
    //Getters y setters
    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    //Método toString
    @Override
    public String toString() {
        return "Revision{" +
                "idRevision=" + idRevision +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
