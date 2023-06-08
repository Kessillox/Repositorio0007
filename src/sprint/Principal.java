package sprint;

import sprint.entity.Profesional;

import sprint.entity.Usuario;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario usuario1 = new Usuario ("Livio","Guitierrez","Zambrano", "09/03/1995",269876362);

        int op =0;
        //VARIABLES Usuarios
        String nombre="";
        String apellido1="";
        String apellido2="";
        String fechaNacimiento="";
        int run;
        //VARIABLES PROFESIONAL
        String titulo ="";
        String fechaIngreso="";


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
                    System.out.println("Ingrese su nombre");
                    nombre=scP.nextLine();

                    System.out.println("Ingrese su Apellido 1");
                    apellido1=scP.nextLine();

                    System.out.println("Ingrese su Apellido 2");
                    apellido2=scP.nextLine();

                    System.out.println("Ingrese su Fecha de nasimiento");
                    fechaNacimiento=scP.nextLine();

                    System.out.println("Ingrese su Run");
                    run=scP.nextInt();

                    System.out.println("Ingrese su Titulo");
                    titulo=scP.next();

                    System.out.println("Ingrese su Fecha de Ingreso");
                    fechaIngreso=scP.nextLine();

                    Profesional profesional = new Profesional(nombre,apellido1,apellido2,fechaNacimiento,run,titulo,fechaIngreso);
                    System.out.println(profesional.toString());

                    Contenedor contenedor = new Contenedor();
                    contenedor.almacenarProfecional(profesional);

                    contenedor.mostrarProfesional();


                    break;
                case 3:
                    System.out.println("------Perfil Administrativo------");
                    break;
            }
        }while (op>3);
    }
}