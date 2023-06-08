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
}
