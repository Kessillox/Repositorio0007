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

            opcionMenu = sc.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("=== Almacenar Cliente ===");
                    break;
                case 2:
                    System.out.println("=== Almacenar Profesional ===");
                    break;
                case 3:
                    System.out.println("=== Almacenar Administrativo ===");
                    break;
                case 4:
                    System.out.println("=== Almacenar Capacitación ===");
                    break;
                case 5:
                    System.out.println("=== Eliminar Usuario ===");
                    break;
                case 6:
                    System.out.println("=== Listar Usuarios ===");
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
