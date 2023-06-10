package sprintmarines.validaciones.validacionvisitaterreno;

public class ValidacionVisitaTerreno {

    // Validacion de Id

    // Validacion de Rut

    // Validacion de Fecha

    // Validacion de Hora

    // Validacion de Lugar
    public static boolean validarLugar(String str) {
        if (str != null && str.length() >= 10 && str.length() <= 50) {
            System.out.println("Lugar ingresado correctamente");
            return true;
        } else {
            System.out.println("Lugar no válido, ingrese entre 10 y 50 caracteres");
            return false;
        }
    }

    // Validacion de Comentarios
    public static boolean validarComentario(String str) {
        if (str == null || str.length() == 0) {
            return false;
        } else if (str.length() >= 1 && str.length() <= 100) {
            System.out.println("Comentario ingresado correctamente");
            return true;
        } else {
            System.out.println("Comentario debe tener menos de 100 carácteres");
            return false;
        }
    }

    //Validar cantidad de Asistentes



}