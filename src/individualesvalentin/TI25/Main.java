package individualesvalentin.TI25;

public class Main {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Juan","Carlos","Aguirre","Aguirre","18450654-1",89563456,33);
        trabajador.nombreCompleto();
        trabajador.descomponerRut();
    }
}
