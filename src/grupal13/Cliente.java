package grupal13;

/**
 * Clase que almacena la informacion del cliente
 * Se asume que parametros escritos en Slack son los unicos que se requieren
 * @author Juan Merino
 * @version 1.0
 */
public class Cliente {

    // atributos
    String nombreEmpresa, nombreRepresentante, telefonoRepresentante, direccion, comuna;
    int rut;

    /**
     * Método toString()
     * @return String de informacion de la clase ordenada y legible
     */
    public String toString() {
        return "\nClase Cliente\n"
                + "Nombre Empresa: " + nombreEmpresa + "\n"
                + "Nombre Representante: " + nombreRepresentante + "\n"
                + "Teléfono Representante: " + telefonoRepresentante + "\n"
                + "Dirección: " + direccion + "\n"
                + "Comuna: " + comuna + "\n"
                + "RUT: " + rut + "\n";
    }

    /**
     * Constructor que no recibe parametros
     */
    Cliente() {}

    /**
     * Constructor que recibe todos los atributos como parametros
     * @param nombreEmpresa         Nombre de la empresa, String
     * @param nombreRepresentante   Nombre del representante, String
     * @param telefonoRepresentante Telefono del representante, String
     * @param direccion             Direccion, String
     * @param comuna                Comuna, String
     * @param rut                   RUT, int menor a 99.999.999
     */
    Cliente(String nombreEmpresa, String nombreRepresentante, String telefonoRepresentante,
            String direccion, String comuna, int rut) {
        this.nombreEmpresa = nombreEmpresa;
        this.nombreRepresentante = nombreRepresentante;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccion = direccion;
        this.comuna = comuna;
        this.rut = rut;
    }
}