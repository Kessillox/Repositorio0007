package grupal14;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente("24.674.457-4","EmpresaInventada",
                "calle inexistente sin numero","Pepito Perez",
                "999999999","Direccion de pepito #447",
                "Comunadepepito");
        Usuario usu = new Usuario("Jhonatan Peña","7/05/1989",
                "14.458.645-2");
        Capacitacion cap = new Capacitacion("1","Introduccion a la programacion",
                "03/06/2023","15:00","Almirante sin numero",
                4,20);
        System.out.println(cli.obtenerNombre());

        System.out.println(cli.toString());
        System.out.println(usu.toString());
        System.out.println(cap.toString());
        System.out.println(LocalDate.now());
    }


}