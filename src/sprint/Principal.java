package sprint;

import sprint.entity.Profesional;

import sprint.entity.Usuario;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuario1 = new Usuario ("Livio","Guitierrez","Zambrano", "09/03/1995",269876362);

        if (usuario1.getNombre() != null && usuario1.getNombre().length() > 3 && usuario1.getNombre().length() < 20) {
            System.out.println(usuario1.getNombre());
        }else {
            System.out.println("Error: El nombre debe tener entre 3 y 20 caracteres.");
        }

        if(usuario1.getFechaNacimiento() != null)
            System.out.println("No puede estar nulo.");





        //VARIABLES
        int op =0;
        String titulo ="";

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
                    System.out.println("------Perfil Cliente------");
                    break;
                case 2:
                    Scanner scP = new Scanner(System.in);
                    System.out.println("------Perfil Profesional------");
                    System.out.println("Ingrese su titulo");

                   // Profesional profesional = new Profesional("Livio", "Gutierrez", "Franchesco", "05/12/1999", 92666666, scP.nextLine(),"15/12/09");
                    /*if (profesional.getTitulo() != null && profesional.getTitulo().length() > 10 && profesional.getTitulo().length() < 50) {
                        System.out.println(profesional.getTitulo());
                    }else {
                        System.out.println("Error: El titulo debe tener entre 10 y 50 caracteres.");
                    }*/


                    System.out.println("------Perfil Profesional------");
                    System.out.println("Ingrese su titulo");

                    break;
                case 3:
                    System.out.println("------Perfil Administrativo------");
                    break;
            }
        }while (op>3);
    }
}
