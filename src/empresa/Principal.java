package empresa;

import empresa.entity.Administrativo;
import empresa.entity.Usuario;
import empresa.services.Contenedor;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Contenedor cont = new Contenedor();
        Administrativo user1 = new Administrativo("Cintiaaaaaaa", "Muñoz", "Valdés", LocalDate.of(2000, 05, 19), 22000000, "sidu", "5 años");

        cont.almacenarAdministrativo(new Administrativo("Cintiaaaaaaa", "Muñoz", "Valdés", LocalDate.of(2000, 05, 19), 22000000, "sidu", "5 años") );



        System.out.println(user1.toString());

        cont.almacenarAdministrativo(user1);//Agregar a la lista

        cont.listarUsuarios();

        Scanner sc = new Scanner(System.in);

        int run;
        System.out.println("Ingrese run");
        run = sc.nextInt();

        cont.eliminarUsuario(run);
        System.out.println();

        cont.listarUsuarios();



    }
}
