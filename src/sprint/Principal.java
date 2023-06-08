package sprint;

import sprint.entity.Profesional;

import sprint.entity.Usuario;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Usuario usuario1 = new Usuario ("Livio","Guitierrez","Zambrano", "09/03/1995",269876362);

        String nombre;
        String apellido1;
        String apellido2;
        String fechaNacimiento;
        int run;
        System.out.println("favor ingrese un nombre entre 3 y 20 caracteres.");
        nombre = sc.nextLine();

        while (nombre.length() < 3 || nombre.length() > 20){
            System.out.println("debe ser mayor a 3 y menor a 20");
            nombre = sc.nextLine();
        }

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

                   Profesional profesional = new Profesional("Livio", "Gutierrez", "Franchesco", "05/12/1999", 92666666, scP.nextLine(),"15/12/09");
                    if (profesional.getTitulo() != null && profesional.getTitulo().length() > 10 && profesional.getTitulo().length() < 50) {
                        System.out.println(profesional.getTitulo());
                    }else {
                        System.out.println("Error: El titulo debe tener entre 10 y 50 caracteres.");
                    }


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
