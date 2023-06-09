package livio.individuales.trabajo25;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        String nombre="";
        String apellido1="";
        String apellido2="";
        String run="";
        int telefono=0;
        int edad=0;

        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su primer apellido");
        apellido1 = sc.nextLine();
        System.out.println("Ingrese su segundo apellido");
        apellido2 = sc.nextLine();
        System.out.println("Ingrese su run");
        run = sc.nextLine();
        System.out.println("Ingrese su telefono");
        telefono = sc.nextInt();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        Trabajador trabajador = new Trabajador(nombre,apellido1,apellido2,run,telefono,edad);

        System.out.println(trabajador.nombreCompletos());
        System.out.println(trabajador.descomponerRun());
    }
}
