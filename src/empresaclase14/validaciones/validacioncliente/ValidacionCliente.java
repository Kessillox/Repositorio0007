package empresaclase14.validaciones.validacioncliente;

public class ValidacionCliente {
    public static boolean validarNombreEmpresa(String str) {
        if(str != null && str.length() >= 5 && str.length() <= 30){
            System.out.println("Nombre ingresado correctamente!");
            return true;
        }else{
            System.out.println("El nombre no es válido");
            return false;
        }
    }
    public static boolean validarRut(int rut){
        if(rut < 99999999) {
            System.out.println("RUT Cliente registrado correctamente.");
            return true;
        }else{
            System.out.println("RUT Cliente ingresado incorrectamente.");
            return false;
        }
    }
    public static boolean validarDireccionEmpresa(String str) {
        if(str != null && str.length() >= 5 && str.length() <= 70){
            System.out.println("Dirección ingresada correctamente!");
            return true;
        }else{
            System.out.println("La dirección no es válida");
            return false;
        }
    }
    public static boolean validarComunaEmpresa(String str) {
        if(str != null && str.length() >= 5 && str.length() <= 50){
            System.out.println("Comuna ingresada correctamente!");
            return true;
        }else{
            System.out.println("Comuna no válida");
            return false;
        }
    }
}
