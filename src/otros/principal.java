package otros;

import java.util.Scanner;
public class principal {
    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);


        System.out.println("ingrese un numero");
        int num = leer.nextInt();

        System.out.println("ingrese las notas a promediar");
        int array[] = new int[num] ;
        int sum = 0;
        for (int i: array) {

            sum += array[i];




        }

        System.out.println("la suma de todos los numeros es: "+sum);




    }
}
