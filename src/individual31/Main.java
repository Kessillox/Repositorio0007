package individual31;

import individual31.trabajadoresentity.Trabajador;
import individual31.trabajadoresentity.TrabajadorContratado;

public class Main {
    public static void main(String[] args){


        Trabajador trabajador1 = new Trabajador("Evaristo", "Paramos", "12.666.799-3", "983235654", 57);
        System.out.println(trabajador1.nombreCompleto());
        System.out.println(trabajador1.toString());
        System.out.println("RUN del trabajador "+trabajador1.getNombre()+": " + trabajador1.descomponerRun());

        CargaFamiliar cargaTrabajador1 = new CargaFamiliar("17.565.898-4","Alejandro","Paramos","12.666.799-3","Hijo",33);
        System.out.println(cargaTrabajador1.toString());

        // 31
        System.out.println("\n<<<< Probando individual 31 tipos de trabajadores >>>>");
        TrabajadorContratado contratado1 = new TrabajadorContratado("Juan","Riquelme","15.365.231-4","23442352",45,"06-06-2006",550000);
        contratado1.mostrarDatos();
        System.out.println(contratado1.toString());

    }

}