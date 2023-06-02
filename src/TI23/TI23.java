package TI23;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author Gonzalo Alonzo
 *
 */
public class TI23 {

    public static void main(String [] args){
        //crea una lista para cada letra  de la frase
        ArrayList<String> letras = new ArrayList<>();
         String texto = "";

         //Solicita ingreso de usuario
         texto = JOptionPane.showInputDialog("Ingrese una frase o palabra: ");

         //Recorre el ingreso cabiando mayuscula por minusculas y viceversa e ingresa a la lista
         for( int i = 0 ; i < texto.length(); i++){
             char letra = texto.charAt(i);
             if(Character.isLowerCase(letra)){
                 String minuscula = String.valueOf(letra);
                 minuscula.toUpperCase();
                 letras.add(minuscula);
             }else if (Character.isUpperCase(letra)){
                 String mayuscula = String.valueOf(letra);
                 mayuscula.toLowerCase();
                 letras.add(mayuscula);
             }else{
                 String espacio = String.valueOf(letra);
                 letras.add(espacio);
             }
         }
        //recorre la lista y muestra lo ingresado
        for (String letter:letras) {
            System.out.println(letter);
        }



    }

}
