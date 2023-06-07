import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Listado lista = new Listado();
        Usuario usuario1 = new Cliente("Juan", "Perez", "Lopez", "02/01/1995", 17237181, "Juan Enterprise", "Lapices", "+569283192", "Calle 1", "Marte City", 99);
        Usuario usuario2 = new Administrativo("Roberto", "Perez", "Lopez", "02/01/1995", 17237182, "Lapiceras", "-Armado de sacapuntas");
        Usuario usuario3 = new Administrativo("Ximena", "Perez", "Lopez", "02/01/1995", 17237183, "Borradores", "-Ninguna");
        Usuario usuario4 = new Profesional("Matías", "Perez", "Lopez", "02/01/1995", 17237184, "Ingeniería en plumones", "01/02/2003");
        Usuario usuario5 = new Profesional("Omar", "Perez", "Lopez", "02/01/1995", 17237185, "Técnico en pizarras", "01/07/2020");

        lista.agregar(usuario1);
        lista.agregar(usuario2);
        lista.agregar(usuario3);
        lista.agregar(usuario4);
        lista.agregar(usuario5);

        lista.mostrarDatos();

        Contenedor lista2 = new Contenedor(new ArrayList<>(), new ArrayList<>());

        lista2.almacenarCliente();


    }
}
