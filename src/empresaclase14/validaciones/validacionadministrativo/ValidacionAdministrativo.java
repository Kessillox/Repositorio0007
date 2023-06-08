package empresaclase14.validaciones.validacionadministrativo;

public class ValidacionAdministrativo {
    public static boolean validarArea(String str){
        if(str != null && str.length() >= 5 && str.length() <= 20){
            System.out.println("Área ingresada correctamente");
            return true;
        }else{
            System.out.println("Área no valida, ingrese entre 5 y 20 carácteres");
            return false;
        }
    }

    public static boolean validarExperienciaPrevia(String str){
        if(str != null && str.length() >= 0 && str.length() <= 100){
            System.out.println("Experiencia previa ingresada correctamente");
            return true;
        }else{
            System.out.println("Experienciaprevia no válida, ingrese entre 0 y 100 carácteres");
            return false;
        }
    }


}
