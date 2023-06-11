package TI25;

public class Main {
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador("Claudio", "Soto", "valdez", "1234567-8", "877459", 23);
        System.out.println("***********************************************");
        System.out.println(t1.nombreCompleto());
        System.out.println("***********************************************");
        System.out.println(t1.descomponerRun());
        System.out.println("***********************************************");
    }
}
