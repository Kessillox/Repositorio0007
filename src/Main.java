import ejercicioindividual25.Trabajador;

public class Main {
    public static void main(String[] args) {
        Trabajador luis = new Trabajador(
                "Luis Alejandro\u0020",
                "Zambrano Salazar",
                "18.685.014-9",
                "+56998428164",
                28
        );

        System.out.println(luis.nombreCompleto());
        System.out.println(luis.descomponerRun());
    }
}