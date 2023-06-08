package empresaclase14.functions;

public class Funciones {

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
            System.out.println("Nombre ingresado correctamente");
            return true;
        }else{
            System.out.println("El nombre no es valido");
            return false;
        }

    }

}
