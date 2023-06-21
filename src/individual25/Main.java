package individual25;

public class Main {
    public static void main(String[] args){


        Trabajador trabajador1 = new Trabajador("Evaristo", "Paramos", "12.666.799-3", "983235654", 57);
        System.out.println(trabajador1.nombreCompleto());
        System.out.println(trabajador1.toString());
        System.out.println("RUN del trabajador "+trabajador1.nombre+": " + trabajador1.descomponerRun());

    }

}