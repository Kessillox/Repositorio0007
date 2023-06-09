import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Main donde se crean multiples instancias de Usuario y Capacitacion y se almacenan en dos listas con el propósito de ser usados como datos de prueba.
 * Se instancia un objeto de la clase Contenedor utilizando como parametros dos listas compuestas por las capacitaciones y usuarios creados anteriormente.
 * @author Jonathan Gajardo
 */
public class Main {
    public static void main(String[] args) {
        // DATOS DE PRUEBA
        Usuario usuario1 = new Cliente("Joan", "Perez", "Lopez", "02/01/1995", 17237181, "Juan Enterprise", "Fabricación de lápices", "+569283192", "Calle 1", "Marte City", 28);
        Usuario usuario2 = new Cliente("Joe", "Perez", "Lopez", "02/01/1995", 17237182, "Joan Enterprise", "Fabricación de plumones", "+569283192", "Calle 2", "Moon City", 28);
        Usuario usuario3 = new Cliente("Julian", "Perez", "Lopez", "02/01/1995", 17237183, "Joe Enterprise", "Fabricación de borradores", "+569283192", "Calle 3", "Hell City", 28);
        Usuario usuario4 = new Administrativo("Roberto", "Perez", "Lopez", "02/01/1995", 17237184, "Lapiceras", "-Armado de sacapuntas");
        Usuario usuario5 = new Administrativo("Ximena", "Perez", "Lopez", "02/01/1995", 17237185, "Borradores", "-Ninguna");
        Usuario usuario6 = new Profesional("Matías", "Perez", "Lopez", "02/01/1995", 17237186, "Ingeniería en plumones", "01/02/2003");
        Usuario usuario7 = new Profesional("Omar", "Perez", "Lopez", "02/01/1995", 17237187, "Técnico en pizarras", "01/07/2020");

        Capacitacion capacitacion1 = new Capacitacion(1, 17237181, "Lunes", "20:20", "CASA DE PEDRO", 100, 23);
        Capacitacion capacitacion2 = new Capacitacion(2, 17237182, "Martes", "10:20", "CASA DE JUAN", 120, 3);
        Capacitacion capacitacion3 = new Capacitacion(3, 17237181, "Lunes", "16:20", "CASA DE CATALINA", 150, 1);
        Capacitacion capacitacion4 = new Capacitacion(4, 17237182, "Sábado", "23:20", "CASA DE MILOVAN", 120, 13);
        Capacitacion capacitacion5 = new Capacitacion(5, 17237182, "Domingo", "09:20", "CASA DE NOSE", 120, 97);
        Capacitacion capacitacion6 = new Capacitacion(6, 17237183, "Miercoles", "19:20", "CASA DE FRANCISCO", 20, 65);

        ArrayList <Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
        listaUsuarios.add(usuario3);
        listaUsuarios.add(usuario4);
        listaUsuarios.add(usuario5);
        listaUsuarios.add(usuario6);
        listaUsuarios.add(usuario7);

        ArrayList <Capacitacion> listaCapacitaciones = new ArrayList<>();
        listaCapacitaciones.add(capacitacion1);
        listaCapacitaciones.add(capacitacion2);
        listaCapacitaciones.add(capacitacion3);
        listaCapacitaciones.add(capacitacion4);
        listaCapacitaciones.add(capacitacion5);
        listaCapacitaciones.add(capacitacion6);

        Contenedor contenedor = new Contenedor(listaUsuarios, listaCapacitaciones);

        int selector = 0;
        Scanner sc = new Scanner(System.in);

        while (selector != 9) {
            try {
                System.out.println("= = = MENÚ PRINCIPAL = = =");
                System.out.println("1) Registrar cliente");
                System.out.println("2) Registrar profesional");
                System.out.println("3) Registrar administrativo");
                System.out.println("4) Registrar capacitación");
                System.out.println("5) Eliminar usuario");
                System.out.println("6) Listar usuarios");
                System.out.println("7) Listar usuarios según tipo");
                System.out.println("8) Listar capacitaciones");
                System.out.println("9) Salir");
                selector = Integer.parseInt(sc.nextLine());

                switch (selector) {
                    case 1:
                        contenedor.almacenarCliente();
                        break;
                    case 2:
                        contenedor.almacenarProfesional();
                        break;
                    case 3:
                        contenedor.almacenarAdministrativo();
                        break;
                    case 4:
                        contenedor.almacenarCapacitacion();
                        break;
                    case 5:
                        contenedor.eliminarUsuario();
                        break;
                    case 6:
                        contenedor.listarUsuarios();
                        break;
                    case 7:
                        String tipoDeUsuario = "";
                        while (!tipoDeUsuario.equals("1") && !tipoDeUsuario.equals("2") && !tipoDeUsuario.equals("3")) {
                            System.out.println("= = = SELECCIONAR TIPO DE USUARIO = = =");
                            System.out.println("1) Cliente");
                            System.out.println("2) Profesional");
                            System.out.println("3) Administrativo");
                            tipoDeUsuario = sc.nextLine();
                        }
                        switch (tipoDeUsuario) {
                            case "1":
                                tipoDeUsuario = "CLIENTE";
                                contenedor.listarUsuariosPorTipo(tipoDeUsuario);
                                break;
                            case "2":
                                tipoDeUsuario = "PROFESIONAL";
                                contenedor.listarUsuariosPorTipo(tipoDeUsuario);
                                break;
                            case "3":
                                tipoDeUsuario = "ADMINISTRATIVO";
                                contenedor.listarUsuariosPorTipo(tipoDeUsuario);
                                break;
                        }
                        break;
                    case 8:
                        contenedor.listarCapacitaciones();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Opción no válida");
            }

        }
    }
}
