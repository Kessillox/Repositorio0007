package empresaclase14.validaciones.validacionusuario;

public class ValidacionUsuario {

    public static boolean esSoloLetras(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean validarNombre(String str) {
        if(str != null && str.length() >= 10 && str.length() <= 50){
            System.out.println("Nombre ingresado correctamente!");
            return true;
        }else{
            System.out.println("El nombre no es valido");
            return false;
        }
    }

    public static boolean esStringObligatorio(String str) {
        return (str != null && !str.isEmpty());
    }

    public static boolean validarRun(int run){
        if(run < 99999999) {
            System.out.println("RUN registrado correctamente.");
            return true;
        }else{
            System.out.println("RUN ingresado incorrectamente.");
            return false;
        }
    }



}
