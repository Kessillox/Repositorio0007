import empresaclase14.*;
import java.util.Scanner;
import static empresaclase14.functions.Funciones.esSoloLetras;
import static empresaclase14.functions.Funciones.validarNombre;

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


        String tituloMenu = "";
        int opcion = 0;

        // Variables de Usuario

        String nombreUsuario = "";
        String apellido1Usuario = "";
        String apellido2Usuario = "";
        String fechaDeNacimientoUsuario = "";
        Integer runUsuario = 0;

        do{
            Scanner entrada = new Scanner(System.in);
            System.out.println("\n Bienvenido a Sprint Modulo 4 Programación en Java!");
            System.out.println("--------------------------------------");
            System.out.println("Que operación deseas realizar? (Debes pulsar un número)");
            System.out.println("\n1.- Registrar Usuario");
            System.out.println("2.- Salir");
            System.out.println("Selecciona una opción:");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Bienvenido al registro de usuarios.\n");
                    System.out.println("Ingresa el nombre: ");
                    do{
                        nombreUsuario = entrada.next();
                    }while(!validarNombre(nombreUsuario));
                    System.out.println("Ingresa el primer apellido:\n");
                    apellido1Usuario = entrada.next();
                    System.out.println("Ingresa el segundo apellido:\n");
                    apellido2Usuario = entrada.next();
                    System.out.println("Ingresa la fecha de nacimiento:\n");
                    fechaDeNacimientoUsuario = entrada.next();
                    System.out.println("Ingresa el RUN:\n");
                    runUsuario = entrada.nextInt();
                    entrada.close();
                    Usuario usuarioEjemplo = new Usuario(nombreUsuario, apellido1Usuario, apellido2Usuario, fechaDeNacimientoUsuario, runUsuario);

            }

        }while(nombreUsuario.isEmpty());

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
