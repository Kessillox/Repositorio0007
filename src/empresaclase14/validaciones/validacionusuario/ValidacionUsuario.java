package empresaclase14.validaciones.validacionusuario;

public class ValidacionUsuario {

    public static boolean esSoloLetras(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                System.out.println("Solo puedes ingresar letras.");
                return false;
            }
        }

        return true;
    }

    public static boolean validarNombre(String str) {
        if(str != null && str.length() >= 3 && str.length() <= 50){
            return true;
        }else{
            System.out.println("Inserte entre 3 y 50 carácteres");
            return false;
        }
    }

    public static boolean validarApellido(String str) {
        if(str != null && str.length() >= 3 && str.length() <= 30){
            return true;
        }else{
            System.out.println("Inserte entre 3 y 30 carácteres");
            return false;
        }
    }

    public static boolean esStringObligatorio(String str) {
        if(str != null && !str.isEmpty()){
            return true;
        }else {
            System.out.println("El ingreso debe ser obligatorio!");
            return false;
        }
    }

    public static boolean validarRun(long run){
        if(run < 99999999) {
            System.out.println("RUN registrado correctamente.");
            return true;
        }else{
            System.out.println("RUN ingresado incorrectamente.");
            return false;
        }
    }



}
