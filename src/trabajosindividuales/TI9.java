package trabajosindividuales;
import java.util.Scanner;
public class TI9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra por favor");
        palabra = leer.nextLine().toLowerCase().trim();

        while(palabra.isEmpty()){
            System.out.println("Favor ingrese una palabra");
            palabra = leer.nextLine().toLowerCase().trim();
        }
        // char para caracteres y adentro de los corchetes me crea el array segun la palabra que ingresen
        char[] array = new char[palabra.length()];

    // recorre el array de 0 hasta la dimension del array
        for (int i=0; i < array.length; i++){
            System.out.println("letra: " + palabra.charAt(i));
            array[i] = palabra.charAt(i);
        }
        /*for es para recorrer de a-z
        * */
        int contador = 0;
        System.out.println("Contador de caracteres del texto");
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == c) {
                    contador ++;
                }
            }
            System.out.println(c + ":" + " " + contador);
            contador = 0;
            System.out.println(palabra);
        }
    }
// hoa
}
