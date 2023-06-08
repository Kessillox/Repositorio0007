package empresa;

import empresa.entity.Administrativo;
import empresa.services.Contenedor;

public class Principal {
    public static void main(String[] args) throws Exception {
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



    }
}
