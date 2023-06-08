package Individual27;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Trabajador trabajador1= new Trabajador("Pancho",
                "Burga","12.000.478-5","555555",32);



        System.out.println("El rut es: "+trabajador1.descomponerRun());
        System.out.println("El nombre completo es: "+trabajador1.nombreCompleto());
    }

}
