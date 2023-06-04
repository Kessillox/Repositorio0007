package grupal13;

/**
 * Clase que almacena la informacion de la capacitacion
 * @author Juan Merino
 * @version 1.0
 */
public class Capacitacion {

    int identificador, rutCliente, cantidadAsistentes;
    String dia, hora, lugar, duracion;

    /**
     * Método toString()
     * @return String de informacion de la clase ordenada y legible
     */
    public String toString() {
        return "\nClase Capacitación\n"
                + "Identificador: " + identificador + "\n"
                + "RUT Cliente: " + rutCliente + "\n"
                + "Día: " + dia + "\n"
                + "Hora: " + hora + "\n"
                + "Lugar: " + lugar + "\n"
                + "Duración: " + duracion + "\n"
                + "Cantidad de Asistentes: " + cantidadAsistentes + "\n";
    }

    /**
     * Constructor que no recibe parametros
     */
    Capacitacion() { }

    /**
     * Constructor que recibe todos los atributos como parametros
     * @param identificador      número interno de la capacitacion manejado por la empresa, int
     * @param rutCliente         RUT del cliente, int
     * @param dia                Dia de la capacitacion en cualquier formato, String
     * @param hora               Hora de la capacitacion en cualquier formato, String
     * @param lugar              Lugar de la capacitacion, String
     * @param duracion           Duracion de la capacitacion en cualquier formato, String
     * @param cantidadAsistentes Numero de asistentes a la capacitacion, int
     */
    Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar,
                 String duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }
}
