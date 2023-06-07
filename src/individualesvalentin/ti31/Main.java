package individualesvalentin.ti31;

public class Main {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Juan","Carlos","Aguirre","Aguirre",
                "18450654-1",89563456,33);

        Honorario honorario = new Honorario("Marcela","Gabriela","Marquez","Leal",
                "14345678-9",87956722,40,"anual", 2002);

        Contratado contratado = new Contratado("Miguel","Daniel","Lillo","Lopez",
                "18679864-2",89674523,28,"06/06/2023",700000);

        Eventual eventual = new Eventual("Camila","Ramona","Aguilera","Cruz",
                "19460987-k",8597743,25,"inmediata","camila@gmail.com");

        // trabajador.mostrarDatos();
        System.out.println();
        System.out.println(honorario.getClass().getSimpleName());
        honorario.mostrarDatos();
        System.out.println();
        System.out.println(contratado.getClass().getSimpleName());
        contratado.mostrarDatos();
        System.out.println();
        System.out.println(eventual.getClass().getSimpleName());
        eventual.mostrarDatos();
    }
}
