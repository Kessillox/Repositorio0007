package empresaclase14.validaciones.validacionrevision;

public class ValidacionRevision {

    // validacion identificador en validaciones.validacionidentificador
    // validacion id de la visita en terro a la cual estaría asociada esta revisión
    public static boolean validarNombreRevision(String str){
        if(str != null && str.length() >= 10 && str.length() <= 50){
            System.out.println("Nombre ingresado correctamente");
            return true;
        }else{
            System.out.println("Area no valida, ingrese entre 5 y 20 caracteres");
            return false;
        }
    }

    public static boolean validarDetalleParaRevisar(String str){
        if(str.length() <= 100){
            System.out.println("Detalle para revisar ingresado correctamente");
            return true;
        }else{
            System.out.println("Detalle no válido, ingrese entre 0 y 100 carácteres");
            return false;
        }
    }

    // acá iria un switch case 1(sin problemas) 2(con observaciones) 3(no aprueba)
}
