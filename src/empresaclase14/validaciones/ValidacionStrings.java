package empresaclase14.validaciones;

public class ValidacionStrings {
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

    public static boolean validarDia(String dia){
        switch (dia.toLowerCase()) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println("Día válido");
                return true;
            default:
                System.out.println("Ingrese un día válidao (lunes - Domingo)");
                return false;

        }
    }

}
