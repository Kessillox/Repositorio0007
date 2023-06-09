package trabajosindividuales.trabajador;

public class Main {
    public static void main(String[] args) {
        Trabajador livio = new Trabajador(
                "Livio Nicolas",
                "Zambrano",
                "2500",
                "999999",
                22);
        System.out.println(livio.toString());
        System.out.println(livio.nombreCompleto());
    }

}
