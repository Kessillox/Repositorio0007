package TI31;

public class Main31 {
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador("Claudio", "Soto", "valdez", "1234567-8", "877459", 23);
        TrabajadorHonorario t2 = new TrabajadorHonorario("andres", "mancilla", "candia", "879565-2", "6565498", 50, "comerciante", "1990");
        System.out.println("***********************************************");
        System.out.println(t1.nombreCompleto());
        System.out.println("***********************************************");
        System.out.println(t1.descomponerRun());
        System.out.println("***********************************************");
        t2.mostrarDatos();
        System.out.println("***********************************************");
    }
}
