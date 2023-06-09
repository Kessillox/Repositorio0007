import cl.bootcamp.empresa.controllers.AlmacenarAdministrativoController;
import cl.bootcamp.empresa.controllers.AlmacenarCapacitacionController;
import cl.bootcamp.empresa.controllers.AlmacenarClienteController;
import cl.bootcamp.empresa.controllers.AlmacenarProfesionalController;
import cl.bootcamp.empresa.models.Contenedor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws InterruptedException {

        Contenedor contenedor = new Contenedor();

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcionMenu;

        while (!salir) {
            System.out.println("====================== Menu Principal ======================");
            System.out.println("opción 1: Almacenar Cliente");
            System.out.println("opción 2: Almacenar Profesional");
            System.out.println("opción 3: Almacenar Administrativo");
            System.out.println("opción 4: Almacenar Capacitación");
            System.out.println("opción 5: Eliminar Usuario");
            System.out.println("opción 6: Listar Usuarios");
            System.out.println("opción 7: Listar por tipo de usuario");
            System.out.println("opción 8: Listar Capacitaciones");
            System.out.println("opción 9: Salir");
            System.out.println("============================================================");
            System.out.println("opción: ");

            opcionMenu = sc.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("=== Almacenar Cliente ===");
                    AlmacenarClienteController almacenarClienteController = new AlmacenarClienteController();
                    contenedor.almacenarUsuario(almacenarClienteController.almacenarClienteController());
                    break;
                case 2:
                    System.out.println("=== Almacenar Profesional ===");
                    AlmacenarProfesionalController almacenarProfesionalController = new AlmacenarProfesionalController();
                    contenedor.almacenarUsuario(almacenarProfesionalController.almacenarProfesionalController());
                    break;
                case 3:
                    System.out.println("=== Almacenar Administrativo ===");
                    AlmacenarAdministrativoController almacenarAdministrativoController = new AlmacenarAdministrativoController();
                    contenedor.almacenarUsuario(almacenarAdministrativoController.almacenarAdministrativoController());
                    break;
                case 4:
                    System.out.println("=== Almacenar Capacitación ===");
                    AlmacenarCapacitacionController almacenarCapacitacionController = new AlmacenarCapacitacionController();
                    almacenarCapacitacionController.almacenarCapacitacionController();
                    break;
                case 5:
                    System.out.println("=== Eliminar Usuario ===");
                    String run = sc.nextLine(); // consumir el salto de línea
                    run = sc.nextLine();
                    contenedor.eliminarUsuario(run);
                    break;
                case 6:
                    System.out.println("=== Listar Usuarios ===");
                    contenedor.listaUsuario();
                    break;
                case 7:
                    System.out.println("=== Listar por tipo de usuario ===");
                    break;
                case 8:
                    System.out.println("=== Listar Capacitaciones ===");
                    break;
                case 9:
                    System.out.print("Saliendo del programa");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    salir = true;
                    break;
                default:
                    System.out.println("Por favor, ingrese un número del 1 al 9 " +
                            "según la opción que desee");

            }
        }

    }
}
