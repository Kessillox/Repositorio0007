import empresaclase14.*;

/**
 * Esta es la clase Main donde se crea la instancia de los objetos Usuario, Capacitación y Cliente
 * @author Leadro Villalba
 * @author Luis Zambrano
 * @author Gustavo Vargas
 * @author Cristian Trureo
 * @version 1.1
 */

public class Main {
    public static void main(String[] args) {

        // Se instancia la clase Listado
        Listado listadoDeUsuarios = new Listado();

        // Se instancian 6 tipos de usuarios
        Usuario usuario1 = new Usuario("Brocacochi", "Chespi", "Rito", "10-10-1990", 33333333);
        Usuario usuario2 = new Usuario("Benito", "Mussolini", "Repetto", "01/01/1941", 11111112);

        //  Se instancian los tipo cliente
        Cliente cliente1 = new Cliente("Pelayo", "Fernandez", "Torrealba", "12/12/1990", 111111111, "Fundimax", "Fundidora", "99.999.999-9", "9845615498", "Lejos 124", "Los Alpes" );
        Cliente cliente2 = new Cliente("Cristian", "Trureo", "Trureo", "11/11/1991", 222222221, "Awakelab", "Capacitaciones IT", "55.555.555-5","123123123123", "Lejos 777", "Los Alpes");

        Profesional profesional1 = new Profesional("Luis", "Zambrano", "Zambrano", "06-06-2023", 186850149, "Analista Programador", "06-06-2023");
        Profesional profesional2 = new Profesional("Livio", "Gut", "Guti", "10-10-2023", 333333333, "Ingeniero Físico Termonuclear", "10-12-2023");

        // Se agregan las instancias de usuarios al Listado
        listadoDeUsuarios.addElemento(usuario1);
        listadoDeUsuarios.addElemento(usuario2);
        listadoDeUsuarios.addElemento(cliente1);
        listadoDeUsuarios.addElemento(cliente2);
        listadoDeUsuarios.addElemento(profesional1);
        listadoDeUsuarios.addElemento(profesional2);

        // Se llama al método para desplegar los datos
        listadoDeUsuarios.instanciasRegistradas();

    }
}
