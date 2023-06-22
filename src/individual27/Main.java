package individual27;

public class Main {
    public static void main(String[] args){


        Trabajador trabajador1 = new Trabajador("Evaristo", "Paramos", "12.666.799-3", "983235654", 57);
        System.out.println(trabajador1.nombreCompleto());
        System.out.println(trabajador1.toString());
        System.out.println("RUN del trabajador "+trabajador1.getNombre()+": " + trabajador1.descomponerRun());

        CargaFamiliar cargaTrabajador1 = new CargaFamiliar("17.565.898-4","Alejandro","Paramos","12.666.799-3","Hijo",33);
        System.out.println(cargaTrabajador1.toString());

    }

}