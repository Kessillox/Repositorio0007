package sprintmarines.validaciones;

import java.text.Normalizer;

public class Validaciones {
    // LARGO DE TEXTOS
    public static boolean validarLargoString(String str, int minCaracter, int maxCaracter, String nombre) {
        if (str == null) {
            return true;
        } else if (str.length() >= minCaracter && str.length() <= maxCaracter) {
            System.out.println(nombre + " ingresado correctamente!");
            return false;
        } else {
            System.out.println(nombre + " debe tener entre " + minCaracter + " y " + maxCaracter + " caracteres");
            return true;
        }
    }

    // USO SOLO LETRAS
    public static boolean esSoloLetras(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                System.out.println("Solo puedes ingresar letras.");
                return true;
            }
        }
        return false;
    }

    // DATO OBLIGATORIO
    public static boolean esStringObligatorio(String str) {
        if(str != null && !str.isEmpty()){
            return true;
        }else {
            System.out.println("El ingreso debe ser obligatorio!");
            return false;
        }
    }

    // FORMATO FECHA
    public static boolean validarFecha(String str) {
        if (str != null && str.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Fecha ingresada correctamente");
            return true;
        } else {
            System.out.println("Fecha no valida ingrese: DD/MM/AAAA");
            return false;
        }
    }

    // FORMATO HORA
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

    // ID
    public static boolean validarId(int id) {
        if (id >= 1 && id < 1000) {
            System.out.println("ID ingresado correctamente.");
            return false;
        } else {
            System.out.println("ID no válido. Ingrese un número entre 1 y 999.");
            return true;
        }
    }


    // RUT
    public static boolean validarRut(int rut){
        if(rut < 99999999) {
            System.out.println("RUT Cliente registrado correctamente.");
            return true;
        }else{
            System.out.println("RUT Cliente ingresado incorrectamente.");
            return false;
        }
    }

    // RUN USUARIO
    public static boolean validarRunUser(int rut){
        if(rut < 99999999) {
            System.out.println("RUN Usuario registrado correctamente.");
            return true;
        }else{
            System.out.println("RUT Usuario ingresado incorrectamente.");
            return false;
        }
    }

    // DIAS DE LA SEMANA
    public static boolean validarDia(String dia) {
        String diaNormalizado = Normalizer.normalize(dia, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase();
        switch (diaNormalizado) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
            case "sabado":
            case "domingo":
                System.out.println("Día registrado correctamente.");
                return true;
            default:
                System.out.println("Ingrese un día entre Lunes a Domingo");
                return false;
        }
    }

    // DURACION
    public static boolean validarDuracion(int duracion) {
        if(duracion > 0){
            System.out.println("Duración ingresada correctamente!");
            return true;
        }else{
            System.out.println("Duración debe ser mayor a 0 minutos");
            return false;
        }
    }

    // CANTIDAD ASISTENTES
    public static boolean validarCantidadAsistentes(int id){
        if(id <1 && id >999) {
            System.out.println("Ingrese un número válido(1-999)");
            return false;
        }else{
            System.out.println("Cantidad de asistentes ingresada incorrectamente.");
            return true;
        }
    }

}
