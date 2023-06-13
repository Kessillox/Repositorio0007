package grupal.grupal17;
/**
 * La clase Capacitacion representa una capacitación realizada a un cliente.
 * @author Cintia Muñoz, Oscar Fenández, Joaquín Baeza, Hans Schiess
 * @version 1.0
 */
/*
Principios SOLID que se cumplen:
* 1.Principio de Responsabilidad Única (SRP): La clase Capacitacion
*   cumple con este principio, ya que su única responsabilidad es
*   representar una capacitación y proporcionar métodos para acceder
*   y modificar sus atributos.
* 2.Principio de Abierto/Cerrado (OCP): La clase Capacitacion es
*   cerrada para modificaciones, ya que no tiene métodos para modificar
*   su comportamiento.
*/
public class Capacitacion {// se crea la clase Capacitacion

    // se crea los atributos de la clase
    private int identificador;
    private long rut;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadDeAsistentes;
    // constructor vacio
    public Capacitacion() {
    }

    // constructor con parametros, atributos de la clase
    public Capacitacion(int identificador, long rut, String dia, String hora, String lugar, String duracion,
            int cantidadDeAsistentes) {
        this.identificador = identificador;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    // metodos modificadores set y get
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public long getRut() {
        return rut;
    }
    public void setRut(long rut) {
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
    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public int getCantidadDeAsistentes() {
        return cantidadDeAsistentes;
    }
    public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Capacitacion [identificador=" + identificador + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora
                + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadDeAsistentes=" + cantidadDeAsistentes
                + "]";
    }

    /**
     * Devuelve un detalle de la capacitación en forma de cadena.
     * @return Un detalle de la capacitación.
     */
    public String mostrarDetalle(){
        return "“La capacitación será en "+lugar+" las "+hora+" del día "+dia+" durará "+duracion+" minutos";
    }
    
}
