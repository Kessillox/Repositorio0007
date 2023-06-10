package sprintmarines.validaciones.validacionidentificador;

public class ValidacionIdentificador {
    public static boolean validarId(int id) {
        if (id >= 1 && id < 1000) {
            System.out.println("ID ingresado correctamente.");
            return false;
        } else {
            System.out.println("ID no válido. Ingrese un número entre 1 y 999.");
            return true;
        }
    }
}
