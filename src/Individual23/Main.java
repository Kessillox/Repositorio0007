package Individual23;
import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String cadena, resultado="";
        char caracter;
        System.out.println("Por favor ingrese la cadena");
        cadena = sc.nextLine();
        for (int i=0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if(Character.isLowerCase(caracter)){
                resultado += String.valueOf(caracter).toUpperCase();
            } else if (Character.isUpperCase(caracter)) {
                resultado += String.valueOf(caracter).toLowerCase();
            }
            else{
                resultado += String.valueOf(caracter);
            }
        }
        System.out.println("El resultado con espacioes es: "+resultado);
        System.out.println("El resultado sin espacio es: "+resultado.replace(" ",""));


    }
}
