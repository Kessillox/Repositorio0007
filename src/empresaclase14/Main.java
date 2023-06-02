package empresaclase14;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de la clase Cliente
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente("11111111-1", "Pelayo", "Macario",
                "Fernandez", "Torrealba", "123456789",
                "Lejos 124", "Los Alpes");

        // Imprimir datos de los clientes
        System.out.println(cliente1);
        System.out.println(cliente2);

        // Modificando datos de los clientes
        cliente1.setRut("12345678-9");
        cliente2.setNombreEmpresa("Tritón");
        System.out.println("El nuevo Rut del cliente 1 es: " + cliente1.getRut());
        System.out.println("El nuevo nombre de la empresa del cliente 2 es: " + cliente2.getNombreEmpresa());
        System.out.println();


        // Crear instancias de la clase Usuario
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario("Brocacochi", "01/01/2000", "22222222-2");

        // Imprimir datos de los usuarios
        System.out.println(usuario1);
        System.out.println(usuario2);

        // Modificar datos de los usuarios
        usuario1.setNombre("Radyk");
        usuario2.setFechaDeNacimiento("28/06/1984");
        System.out.println("El nuevo nombre del usuario 1 es: " + usuario1.getNombre());
        System.out.println("La nueva fecha de nacimiento del usuario 2 es: " + usuario2.getFechaDeNacimiento());
        System.out.println("");

        // Crear instancias de la clase Capacitacion
        Capacitacion capacitacion1 = new Capacitacion();
        Capacitacion capacitacion2 = new Capacitacion(1, "11111111-1", "25/03/2023",
                "09:00", "La Punta del Cerro", 4, 20);

        // Imprimir datos de las capacitaciones
        System.out.println(capacitacion1.toString());
        System.out.println(capacitacion2.toString());

        // Modificar datos de las capacitaciones
        capacitacion1.setIdentificador(2);
        capacitacion2.setRutCliente("33333333-3");
        System.out.println("El nuevo identificador de la capacitación 1 es: " + capacitacion1.getIdentificador());
        System.out.println("El nuevo RUT del cliente de la capacitación 2 es: " + capacitacion2.getRutCliente());
    }
}
