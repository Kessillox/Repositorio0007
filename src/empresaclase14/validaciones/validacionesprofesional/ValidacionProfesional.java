package empresaclase14.validaciones.validacionesprofesional;

public class ValidacionProfesional {
    public static boolean validarTitulo(String str) {
        if(str != null && str.length() >= 10 && str.length() <= 50){
            System.out.println("Título ingresado correctamente");
            return true;
        }else{
            System.out.println("El título no es valido, ingrese entre 5 y 50 carácteres");
            return false;
        }
    }

    public static boolean validarFechaDeIngreso(String str) {
        if (!str.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Fecha ingresada correctamente");
            return true;
        } else {
            System.out.println("Fecha no valida ingrese: DD/MM/AAAA");
            return false;
        }
    }

}
