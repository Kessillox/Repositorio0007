package grupal.grupal17;
/**
 * La clase Accidente representa un accidente registrado en una empresa.
 * Contiene información como el identificador del accidente, el RUT del cliente involucrado,
 * el día y hora del accidente, el lugar donde ocurrió, el origen del accidente y las consecuencias del mismo.
 * @author Cintia Muñoz, Oscar Fenández, Joaquín Baeza, Hans Schiess
 * @version 1.0
 */

/*
* 1.Principio de Responsabilidad Única (SRP): La clase Accidente cumple
*   con este principio, ya que su única responsabilidad es representar
*   un accidente y proporcionar métodos para acceder y modificar sus atributos.
* 2.Principio de Abierto/Cerrado (OCP): La clase Accidente es cerrada para
*   modificaciones, ya que no tiene métodos para modificar su comportamiento.
*   Sin embargo, podría ser extendida para agregar funcionalidades adicionales
*    relacionadas con los accidentes.
*/

public class Accidente {
    //Atributos de la clase Accidente
    private int idAcc;
    private String diaAcc;
    private  String horaAcc;
    private String lugarAcc;
    private String origenAcc;
    private String consecuencias;

    //Constructor vacío
    public Accidente() {
    }

    //Constructor con atributos de la clase Accidente
    public Accidente(int idAcc, String diaAcc, String horaAcc, String lugarAcc, String origenAcc, String consecuencias) {
        this.idAcc = idAcc;
        this.diaAcc = diaAcc;
        this.horaAcc = horaAcc;
        this.lugarAcc = lugarAcc;
        this.origenAcc = origenAcc;
        this.consecuencias = consecuencias;
    }

    //Getters y setters
    public int getIdAcc() {
        return idAcc;
    }

    public void setIdAcc(int idAcc) {
        this.idAcc = idAcc;
    }

    public String getDiaAcc() {
        return diaAcc;
    }

    public void setDiaAcc(String diaAcc) {
        this.diaAcc = diaAcc;
    }

    public String getHoraAcc() {
        return horaAcc;
    }

    public void setHoraAcc(String horaAcc) {
        this.horaAcc = horaAcc;
    }

    public String getLugarAcc() {
        return lugarAcc;
    }

    public void setLugarAcc(String lugarAcc) {
        this.lugarAcc = lugarAcc;
    }

    public String getOrigenAcc() {
        return origenAcc;
    }

    public void setOrigenAcc(String origenAcc) {
        this.origenAcc = origenAcc;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    //Método toString
    @Override
    public String toString() {
        return "Accidente{" +
                "idAcc=" + idAcc +
                ", diaAcc='" + diaAcc + '\'' +
                ", horaAcc='" + horaAcc + '\'' +
                ", lugarAcc='" + lugarAcc + '\'' +
                ", origenAcc='" + origenAcc + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
