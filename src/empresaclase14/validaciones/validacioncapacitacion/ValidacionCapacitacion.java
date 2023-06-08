package empresaclase14.validaciones.validacioncapacitacion;

public class ValidacionCapacitacion {


    // validacion ID está en validaciones.validacionidentificador

    // validacion RUT está en validaciones.validacioncliente...

    // validacion dia lunes,martes,miercoles,jueves,viernes,sabado,domigno, HACER

    // validacion hora está en validaciones.validacioncliente

    // validacion lugar está en validaciones.visitaenterreno

    public static boolean validarDuracion(String str) {
        if(str != null && str.length() >= 5 && str.length() <= 70){
            System.out.println("Duración ingresada correctamente!");
            return true;
        }else{
            System.out.println("Duración no válida inserte entre 5 y 70 carácteres");
            return false;
        }
    }


    public class ValidacionCantidadAsistentes {
        public static boolean validarId(int id){
            if(id <1 && id >999) {
                System.out.println("Ingrese un número válido(1-999)");
                return false;
            }else{
                System.out.println("Cantidad de asistentes ingresada incorrectamente.");
                return true;
            }
        }
    }

}
