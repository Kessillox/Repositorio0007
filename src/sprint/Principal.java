package sprint;

import sprint.entity.Usuario;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuario1 = new Usuario ("Livio","Guitierrez","Zambrano", "09/03/1995","26.987.636-2");

        if (usuario1.getNombre() != null && usuario1.getNombre().length() > 3 && usuario1.getNombre().length() < 20) {
            System.out.println(usuario1.getNombre());
        }else {
            System.out.println("Error: El nombre debe tener entre 3 y 20 caracteres.");
        }

        if(usuario1.getFechaNacimiento() != null)
            System.out.println("No puede estar nulo.");

        //if (usuario1.getRun().length())

        //VARIABLES
        int op =0;

        System.out.println("Bienvenido, ¿en que perfil desea trabajar?");
        System.out.println("------Perfiles------");
        System.out.println("1 > Cliente");
        System.out.println("2 > Profesional");
        System.out.println("3 > Administrativo");
        System.out.println();
        op=sc.nextInt();

        do {
            if (op>3){
                System.out.println();
                System.out.println("Opcion ingresada incorrecta, por favor ingrese una opcion valida");
                op=sc.nextInt();
            }
            switch (op){
                case 1:
                    System.out.println("Perfil Cliente");
                    break;
                case 2:
                    System.out.println("Perfil Profesional");
                    break;
                case 3:
                    System.out.println("Perfil Administrativo");
                    break;
            }
        }while (op>3);
    }
}
