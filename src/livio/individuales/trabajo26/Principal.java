package livio.individuales.trabajo26;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String runCarga="";
        String nombre="";
        String apellido1="";
        String apellido2="";
        String runFaminiar="";
        int parentesco=0;
        int edad=0;

        int op=0;





        System.out.println("Ingrese el run de carga");
        runCarga =sc.nextLine();

        System.out.println("Ingrese su nombre");
        nombre=sc.nextLine();

        System.out.println("Ingrese su primer apellido");
        apellido1=sc.nextLine();

        System.out.println("Ingrese su segundo apellido");
        apellido2=sc.nextLine();

        System.out.println("Ingrese el run del Familiar");
        runFaminiar=sc.nextLine();


        System.out.println("Que parentesco tiene con esa persona");
        System.out.println("1 > Conyuge");
        System.out.println("2 > Hijo/a");
        System.out.println("3 > Otro");
        op=sc.nextInt();


        switch (op){
            case 1, 2, 3:
                System.out.println("Ingrese su edad");
                edad=sc.nextInt();
                break;
        }
        CargaFamiliar cargaFamiliar = new CargaFamiliar(runCarga,nombre,apellido1,apellido2,runFaminiar,parentesco,edad);
        System.out.println(cargaFamiliar.toString());
    }
}
