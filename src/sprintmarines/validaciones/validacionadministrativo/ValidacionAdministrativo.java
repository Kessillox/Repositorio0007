package sprintmarines.validaciones.validacionadministrativo;

public class ValidacionAdministrativo {
    public static boolean validarArea(String str){
        if(str != null && str.length() >= 5 && str.length() <= 20){
            System.out.println("Area ingresada correctamente");
            return true;
        }else{
            System.out.println("Area no valida, ingrese entre 5 y 20 carácteres");
            return false;
        }
    }

    public static boolean validarExperienciaPrevia(String str){
        if(str.length() <= 100){
            System.out.println("Experiencia previa ingresada correctamente");
            return true;
        }else{
            System.out.println("Experiencia previa no válida, ingrese entre 0 y 100 carácteres");
            return false;
        }
    }


}
