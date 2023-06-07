package individualesvalentin.TG27;

public class Main {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Juan","Carlos","Aguirre","Aguirre",
                "18450654-1",89563456,33);
        trabajador.nombreCompleto();

        CargaFamiliar cargaFamiliar = new CargaFamiliar("20123456-7","Camila","Andrea","Aguirre","Fernandez",trabajador.getRun(),
                "2",18);

        System.out.println(cargaFamiliar.toString());
    }
}
