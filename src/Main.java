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

        // Crear instancia de clase cliente con constructor con todos los parámetros
        Cliente cliente1 = new Cliente("11.111.111-1", "Pelayo", "Macario",
                "Fernandez", "Torrealba", "123456789",
                "Lejos 124", "Los Alpes");

        Cliente cliente2 = new Cliente("22.222.222-2", "AwakeLab", "Cristian",
                "Trureo", "Trureo", "123456789",
                "Lejos 124", "Los Alpes");

        // Crear instancias de la clase Usuario con constructor y tus parámetros
        Usuario usuario1 = new Usuario("Brocacochi", "01/01/2000", "22222222-2");
        Usuario usuario2 = new Usuario("Benito Mussolini", "01/01/2000", "33.333.333-3");

        // Crear instancias de la clase Profesional con constructor y tus parámetros
        Profesional profesional1 = new Profesional("Luis", "06-06-2023", "18.685.014-9", "Analista Programador", "06-06-2023");
        Profesional profesional2 = new Profesional("Livio", "10-10-2023", "33.333.333-3", "Ingeniero Físico Termonuclear", "10-12-2023");

        cliente1.analizarUsuario();
        cliente2.analizarUsuario();

        usuario1.analizarUsuario();
        usuario2.analizarUsuario();

        profesional1.analizarUsuario();
        profesional2.analizarUsuario();




    }
}
