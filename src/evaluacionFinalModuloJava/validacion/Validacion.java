package evaluacionFinalModuloJava.validacion;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

final public class Validacion {

    static Scanner scan = new Scanner(System.in);
    public static String validarLargoRut(String param){
        if(param.contains("-")){
            param.replace("-","");
        } else if (param.contains(".")) {
            param.replace(".","");
        } else if (param.toLowerCase().contains("k")) {
            param.replace("k", "0");
        }
        while (Integer.parseInt(param) > 99999999 || param.isBlank()){
            System.out.println("El rut debe ser menor a 99.999.999, ingreselo nuevamente");
            param = scan.nextLine();
            validarLargoRut(param);
        }

        return param;
    }
    public static String validarDiaSemana(String param){
        String[] dias = {"lunes", "martes","miercoles","jueves","viernes","sabado","domingo"};
        List listaDias = Arrays.stream(dias).toList();
        while (!listaDias.contains(param.toLowerCase())){
            System.out.println("El dia ingresado no existe, ingreselo nuevamente");
            param = scan.nextLine();
            validarDiaSemana(param);
        }
        return param;
    }

}
