package cl.bootcamp.individual25.test;

import cl.bootcamp.individual25.models.Trabajador;

public class TrabajadorTest {
    public static void main(String[] args) {

        Trabajador trabajador = new Trabajador("Juan", "Peréz", "Zalazar", "19876543-2", 33);
        System.out.println(trabajador);
        System.out.println("trabajador.nombreCompleto() = " + trabajador.nombreCompleto());
        System.out.println("trabajador.descomponerRun() = " + trabajador.descomponerRun());
        
    }
}
