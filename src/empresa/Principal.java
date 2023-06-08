package empresa;

import empresa.entity.Administrativo;
import empresa.entity.Cliente;
import empresa.entity.Profesional;
import empresa.services.Contenedor;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Contenedor cont = new Contenedor();
        Administrativo user1 = new Administrativo("Cintia", "Muñoz", "Valdés", "19/09/1957", 22000000, "sidu", "5 años");

        //cont.almacenarAdministrativo(new Administrativo("Cintiaaaaaaa", "Muñoz", "Valdés", LocalDate.of(2000, 05, 19), 22000000, "sidu", "5 años") );

        //System.out.println(user1.mostrarEdad());


        //System.out.println(user1.toString());
        user1.analizarUsuario();

        cont.almacenarAdministrativo(user1);//Agregar a la lista


        cont.listarUsuariosPorTipo(user1);

        /*Scanner sc = new Scanner(System.in);

        int run;
        System.out.println("Ingrese run");
        run = sc.nextInt();

        cont.eliminarUsuario(run);
        System.out.println();

        cont.listarUsuarios();*/

        int opcion = 0;
        while (opcion != 9) {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el RUN del cliente:");
                    int run = sc.nextInt();
                    System.out.println("Ingrese el nombre del cliente:");
                    String nombreUsuario = sc.next();

                    System.out.println("Ingrese el fecha de Nacimiento:");
                    String fechaDeNacimiento = sc.next();
                    System.out.println("ingrese el Apellido1 del cliente:");
                    String apellido1 = sc.next();
                    System.out.println("Ingrese el Apellido2 del cliente:");
                    String apellido2 = sc.next();
                    System.out.println("ingrese razon social del cliente:");
                    String razon = sc.next();
                    System.out.println("ingrese giro del cliente:");
                    String giroEmpresa = sc.next();
                    System.out.println("ingrese telefono del cliente:");
                    String telefonoRepresentante = sc.next();
                    System.out.println("ingrese direccion del cliente:");
                    String direccion = sc.next();
                    System.out.println("ingrese comuna del cliente:");
                    String comuna = sc.next();


                    cont.almacenarCliente(new Cliente());
                    break;
                case 2:
                    System.out.println("Ingrese el RUN del profesional:");
                    int runProfesional = sc.nextInt();
                    System.out.println("Ingrese el nombre del profesional:");
                    String nombreProfesional = sc.next();
                    cont.almacenarProfesional(new Profesional());
                    break;
                case 3:
                    System.out.println("Ingrese el RUN del administrativo:");
                    int runAdministrativo = sc.nextInt();
                    System.out.println("Ingrese el nombre del administrativo:");
                    String nombreAdministrativo = sc.next();
                    cont.almacenarAdministrativo(new Administrativo());
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la capacitación:");
                    String nombreCapacitacion = sc.next();
                    System.out.println("Ingrese el RUN del cliente asociado:");
                    String clienteAsociado = sc.next();
                    //cont.almacenarCapacitacion(new Capacitacion(nombreCapacitacion, clienteAsociado));
                    break;
                case 5:
                    System.out.println("Ingrese el RUN del usuario a eliminar:");
                    int runEliminar = sc.nextInt();
                    cont.eliminarUsuario(runEliminar);
                    break;
                case 6:
                    cont.listarUsuarios();
                    break;
                case 7:
                    System.out.println("Ingrese el tipo de usuario a listar (cliente, profesional o administrativo):");
                    String tipoUsuario = sc.nextLine();
                    /*    IAsesoria usuarioTipo;
                    if (tipoUsuario.equals("cliente")) {
                        usuarioTipo = new Cliente();
                    } else if (tipoUsuario.equals("profesional")) {
                        usuarioTipo = new Profesional();
                    } else if (tipoUsuario.equals("administrativo")) {
                        usuarioTipo = new Administrativo();
                    } else {
                        System.out.println("Tipo de usuario inválido.");
                        return;
                    }

                    cont.listarUsuariosPorTipo(usuarioTipo); */
                    break;
                case 8:
                    cont.listarCapacitaciones();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
            System.out.println();
        }
    }

    private static void mostrarMenu() {


        System.out.println("----- MENÚ -----");
        System.out.println("1. Agregar cliente");
        System.out.println("2. Agregar profesional");
        System.out.println("3. Agregar administrativo");
        System.out.println("4. Agregar capacitación");
        System.out.println("5. Eliminar usuario");
        System.out.println("6. Listar usuarios");
        System.out.println("7. Listar usuarios por tipo");
        System.out.println("8. Listar capacitaciones");
        System.out.println("9. Salir");
        System.out.println("Ingrese una opción: ");
    }

}



