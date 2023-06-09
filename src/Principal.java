import empresaclase14.*;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Contenedor contenedor = new Contenedor();

        int opcion = 0;

        while (opcion != 9) {
            System.out.println("\nBienvenido a Sprint Modulo 4 Programación en Java!");
            System.out.println("--------------------------------------");
            System.out.println("¿Qué operación deseas realizar? (Debes pulsar un número)");
            System.out.println("1.- Almacenar cliente");
            System.out.println("2.- Almacenar profesional");
            System.out.println("3.- Almacenar administrativo");
            System.out.println("4.- Almacenar capacitación");
            System.out.println("5.- Eliminar usuario");
            System.out.println("6.- Listar usuarios");
            System.out.println("7.- Listar usuarios por tipo");
            System.out.println("8.- Listar capacitaciones");
            System.out.println("9.- Salir");
            System.out.println("Selecciona una opción:");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();

                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        // Lógica para almacenar cliente
                        System.out.println("Eliga un Cliente ya registrado:");
                        Cliente cliente = new Cliente();
                        // Mostrar lista de clientes....
                        //cliente = listCliente

                        contenedor.almacenarCliente(cliente);
                        System.out.println("El cliente ha sido almacenado correctamente.");
                        break;
                    case 2:
                        // Lógica para almacenar profesional
                        Profesional profesional = new Profesional();
                        contenedor.almacenarProfesional(profesional);
                        break;
                    case 3:
                        // Lógica para almacenar administrativo
                        Administrativo administrativo = new Administrativo();
                        contenedor.almacenarAdministrativo(administrativo);
                        break;
                    case 4:
                        // Lógica para almacenar capacitación
                        Capacitacion capacitacion = new Capacitacion();
                        contenedor.almacenarCapacitacion(capacitacion);
                        break;
                    case 5:
                        // Lógica para eliminar usuario
                        System.out.println("Ingrese el RUN del usuario que desea eliminar:");
                        int run = scanner.nextInt();
                        contenedor.eliminarUsuario(run);
                        break;
                    case 6:
                        // Lógica para listar usuarios
                        contenedor.listarUsuarios();
                        break;
                    case 7:
                        // Lógica para listar usuarios por tipo
                        System.out.println("Ingrese el tipo de usuario que desea listar (Cliente, Administrativo o Profesional):");
                        String tipoUsuario = scanner.nextLine();

                        // Convertir el tipo de usuario ingresado a un objeto Class
                        Class<? extends IAsesoria> tipo = null;
                        switch (tipoUsuario.toLowerCase()) {
                            case "cliente":
                                tipo = Cliente.class;
                                break;
                            case "administrativo":
                                tipo = Administrativo.class;
                                break;
                            case "profesional":
                                tipo = Profesional.class;
                                break;
                            default:
                                System.out.println("Tipo de usuario no válido");
                                break;
                        }
                        contenedor.listarUsuariosPorTipo(tipo);
                        break;
                    case 8:
                        // Lógica para listar capacitaciones
                        contenedor.listarCapacitaciones();
                        break;
                    case 9:
                        // Salir del programa
                        System.out.println("¡Gracias por usar nuestra aplicación, queremos un 7!");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                        break;
                }
            } else {
                System.out.println("Selecciona una opción válida.");
                scanner.nextLine();
            }
        }
    }
}
