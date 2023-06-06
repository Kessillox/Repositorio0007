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

        // Crear instancias de la clase Cliente con constructor vacío
        Cliente cliente1 = new Cliente();

        // Crear instancia de clase cliente con constructor con todos los parámetros
        Cliente cliente2 = new Cliente("11111111-1", "Pelayo", "Macario",
                "Fernandez", "Torrealba", "123456789",
                "Lejos 124", "Los Alpes");

        // Imprimir datos de los clientes
        System.out.println(cliente1);
        System.out.println(cliente2);

        // Modificando datos de los clientes a través de métodos setters
        cliente1.setRut("12345678-9");
        cliente2.setNombreEmpresa("Tritón");

        // Imprimir los datos a través de métodos getters
        System.out.println("El nuevo Rut del cliente 1 es: " + cliente1.getRut());
        System.out.println("El nuevo nombre de la empresa del cliente 2 es: " + cliente2.getNombreEmpresa());
        System.out.println();


        // Crear instancias de la clase Usuario con constructor vacío
        Usuario usuario1 = new Usuario();

        // Crear instancias de la clase Usuario con constructor y tus parámetros
        Usuario usuario2 = new Usuario("Brocacochi", "01/01/2000", "22222222-2");

        // Imprimir datos de los usuarios
        System.out.println(usuario1);
        System.out.println(usuario2);

        // Modificar datos de los usuarios a través de métodos setters
        usuario1.setNombre("Radyk");
        usuario2.setFechaDeNacimiento("28/06/1984");
        System.out.println("El nuevo nombre del usuario 1 es: " + usuario1.getNombre());
        System.out.println("La nueva fecha de nacimiento del usuario 2 es: " + usuario2.getFechaDeNacimiento());
        System.out.println("");

        // Crear instancias de la clase Capacitación
        Capacitacion capacitacion1 = new Capacitacion();
        Capacitacion capacitacion2 = new Capacitacion(1, "11111111-1", "25/03/2023",
                "09:00", "La Punta del Cerro", 4, 20);

        // Imprimir datos de las capacitaciones a través del método toString()
        System.out.println(capacitacion1.toString());
        System.out.println(capacitacion2.toString());

        // Modificar datos de las capacitaciones a través de métodos setters
        capacitacion1.setIdentificador(2);
        capacitacion2.setRutCliente("33333333-3");

        // Imprimir datos de las capacitaciones a través de métodos getters
        System.out.println("El nuevo identificador de la capacitación 1 es: " + capacitacion1.getIdentificador());
        System.out.println("El nuevo RUT del cliente de la capacitación 2 es: " + capacitacion2.getRutCliente());
        System.out.println("");

        // Imprimir datos del usuario llamando el método de interfaz
        usuario1.analizarUsuario();
        System.out.println("");

        // Imprimir datos del Administrativo llamando el método de interfaz
        Administrativo administrativo1 = new Administrativo("Talca","Ninguna");
        administrativo1.setNombre(usuario1.getNombre());
        administrativo1.analizarUsuario();
        System.out.println("");

        // Imprimir datos del Profesional llamando el método de interfaz
        Profesional profesional1 = new Profesional("Ingeniero","02/05/2023");
        profesional1.setNombre(usuario1.getNombre());
        profesional1.analizarUsuario();
        System.out.println("");

        // Imprimir datos del Cliente llamando el método de interfaz
        cliente1.setNombre(usuario1.getNombre());
        cliente1.analizarUsuario();
        System.out.println("");
    }
}
