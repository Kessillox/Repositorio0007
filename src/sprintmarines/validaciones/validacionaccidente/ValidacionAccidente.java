package sprintmarines.validaciones.validacionaccidente;

public class ValidacionAccidente {
    /*
    La clase Accidente usa validaciones ya creadas:
    Validación ID: Se usa validarId
    Rut Cliente: Se usa validarRut
    Validar fecha: Se usa validarFecha
    Validar lugar: Se usa validarLugar de validaciones.validacionVisitaTerreno
    */

    public static boolean validarHora(String str){
        /* Se usa expresión regular para establecer la hora en formato
        HH:MM (hora desde 0 a 23, minutos entre 0 y 59)*/

        String regex = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";
        if (str.matches(regex)) {
            System.out.println("Hora ingresada correctamente.");
            return true;

        } else {
            System.out.println("Hora inválida. Ingrese una hora en formato HH:MM.");
            return false;
        }
    }

    public static boolean validarOrigenConsecuencias(String str){
        if(str.length() <= 100){
            System.out.println("Ingresado correctamente");
            return true;
        }else{
            System.out.println("Ingreso inválido. Ingrese texto entre 0 y 100 carácteres");
            return false;
        }
    }

}
