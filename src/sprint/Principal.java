package sprint;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //VARIABLES
        int op =0;

        System.out.println("Bienvenido, ¿en que perfil desea trabajar?");
        System.out.println("------Perfiles------");
        System.out.println("1 > Cliente");
        System.out.println("2 > Profecional");
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
