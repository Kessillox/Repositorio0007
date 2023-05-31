package individualesvalentin;
import java.util.Scanner;
import java.util.ArrayList;

public class Individual23 {

    public static void main(String[] args) {

        ArrayList<Character> arregloCaracteres = new ArrayList<Character>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese texto:");
        StringBuilder cadena = new StringBuilder(scanner.nextLine());

        //Comprueba que cadena de texto no este vacia
        do {
            if (cadena.length() == 0){
                System.out.println("Error. Ingrese un texto nuevamente:");
                cadena = new StringBuilder(scanner.nextLine());
            }
        }while (cadena.length() == 0);

        // Recorre cadena y lo guarda en el ArrayList arregloCaracteres
        for (int i = 0; i < cadena.length(); i++) {
            arregloCaracteres.add(cadena.charAt(i));
        }
        // reseteo de la cadena
        cadena = new StringBuilder();

        // Recoore el arrayList, comprueba los elementos(lestras) mayus, minis y reealiza el cambio
        for (Character caracter : arregloCaracteres) {
            if (Character.isLetter(caracter)) {
                if (caracter.equals(Character.toLowerCase(caracter))){
                    cadena.append(Character.toUpperCase(caracter));
                }else {
                    cadena.append(Character.toLowerCase(caracter));
                }
            }else {
                cadena.append(caracter);
            }
        }
        // Imprime arreglo Character y cadena String
        System.out.println("Arreglo de caracteres");
        for (Character caracter : arregloCaracteres) {
            System.out.print("[" + caracter+ "]");
        }
        System.out.print("\n\nCadena String\n");
        System.out.println(cadena);

    }

}
