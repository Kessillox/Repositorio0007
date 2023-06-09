package empresaclase14.validaciones.validacionidentificador;

public class ValidacionIdentificador {
    public static boolean validarId(int id){
        if(id <1 && id >999) {
            System.out.println("Ingrese un número válido(1-999)");
            return true;
        }else{
            System.out.println("Id ingresado correctamente.");
            return false;
        }
    }
}
