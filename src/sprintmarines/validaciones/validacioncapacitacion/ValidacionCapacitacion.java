package sprintmarines.validaciones.validacioncapacitacion;

public class ValidacionCapacitacion {


    // validacion ID está en validaciones.validacionidentificador

    // validacion RUT está en validaciones.validacioncliente...

    // validacion dia lunes,martes,miercoles,jueves,viernes,sabado,domigno, HACER

    // validacion hora está en validaciones.validacioncliente

    // validacion lugar está en validaciones.visitaenterreno

    public static boolean validarLugar(String str) {
        if (str != null && str.length() >= 2 && str.length() <= 50) {
            System.out.println("Lugar ingresado correctamente");
            return true;
        } else {
            System.out.println("Lugar no válido, ingrese entre 10 y 50 caracteres");
            return false;
        }
    }

    public static boolean validarDuracion(int duracion) {
        if(duracion > 0){
            System.out.println("Duración ingresada correctamente!");
            return true;
        }else{
            System.out.println("Duración no válida");
            return false;
        }
    }




        public static boolean validarCantidadAsistentes(int id){
            if(id <1 && id >999) {
                System.out.println("Ingrese un número válido(1-999)");
                return false;
            }else{
                System.out.println("Cantidad de asistentes ingresada incorrectamente.");
                return true;
            }
        }
    }
