package Individual_Oscar;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        String resultado = "";

        do {
            System.out.println("ingrese una cadena");
            cadena = sc.nextLine();
        } while (cadena.isEmpty());


        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == ' ') {
                continue;

            } else if (Character.isLowerCase(letra)) {
                letra = Character.toUpperCase(letra);

            } else if (Character.isUpperCase(letra)) {
                letra = Character.toLowerCase(letra);
            }


            resultado += letra;

        }


        System.out.println("El resultado es: " + resultado);


    }
}