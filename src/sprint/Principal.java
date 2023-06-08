package sprint;

import sprint.entity.Cliente;
import sprint.entity.Profesional;

import sprint.entity.Usuario;
import java.util.Date;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //VARIABLES Usuarios
        String nombreUser="";
        String apellido1User="";
        String apellido2User="";
        String fechaNacimientoUser = "";
        int runUser = 0 ;
        Usuario usuario1 = new Usuario (nombreUser,apellido1User,apellido2User,fechaNacimientoUser,runUser);

        //VARIABLES cliente


        String nombreEmpresa = "";
        String giroEmpresa = "";
        int rut = 0 ;
        String tlfRepresentante = "";
        String direccionEmpresa = "";
        String comunaEmpresa = "";
        Cliente cliente1 = new Cliente(nombreUser,apellido1User,apellido2User,fechaNacimientoUser,runUser,nombreEmpresa, giroEmpresa, rut, tlfRepresentante, direccionEmpresa,comunaEmpresa);


        //Accidentes


        //VARIABLES

        int op =0;

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
                    nombreUser=scP.nextLine();


                    System.out.println("Ingrese su Apellido 1");
                    apellido1User=scP.nextLine();

                    System.out.println("Ingrese su Apellido 2");
                    apellido2User=scP.nextLine();

                    System.out.println("Ingrese su Fecha de nasimiento");
                    fechaNacimientoUser=scP.nextLine();

                    System.out.println("Ingrese su Run");
                    runUser=scP.nextInt();

                    System.out.println("Ingrese su Titulo");
                    titulo=scP.next();

                    System.out.println("Ingrese su Fecha de Ingreso");
                    fechaIngreso=scP.nextLine();

                    Profesional profesional = new Profesional(nombreUser,apellido1User,apellido2User,fechaNacimientoUser,runUser,titulo,fechaIngreso);
                    System.out.println(profesional.toString());

                    Contenedor contenedor = new Contenedor();
                    contenedor.almacenarProfesional(profesional);

                    contenedor.mostrarProfesional();


                    break;
                case 3:
                    System.out.println("------Perfil Administrativo------");
                    break;
            }
        }while (op>3);




        System.out.println("favor ingrese un nombre entre 3 y 20 caracteres.");
        nombreUser = sc.nextLine();

        while (nombreUser.length() < 3 || nombreUser.length() > 20){
            System.out.println("debe ser mayor a 3 y menor a 20");
            nombreUser = sc.nextLine();
        }
        System.out.println("Favor ingrese su fecha de nacimiento en el sig formato DD/MM/AAAA");
        fechaNacimientoUser = sc.nextLine();

        while (fechaNacimientoUser != null){
            System.out.println("Favor ingrese una fecha valida con el siguiente formato DD/MM/AAAA");
            fechaNacimientoUser = sc.nextLine();
            break;
        }
        System.out.println("Favor ingrese su RUN, el cual debe ir sin punto, ni guion, ni digito verificador");
        runUser = sc.nextInt();
        while (runUser < 99999999){
            System.out.println("Favor ingrese un run valido, sin puntos ni guion ni digito verificador");
            runUser = sc.nextInt();
        }


    }


    //Validaciones sergio
    //Objeto VisitaTerreno


}