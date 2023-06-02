package cl.bootcamp.individual27.test;

import cl.bootcamp.individual27.emuns.Parentesco;
import cl.bootcamp.individual27.models.Trabajador;
import cl.bootcamp.individual27.models.CargaFamiliar;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase contiene el método main para realizar pruebas las clases Trabajador y CargaFamiliar.
 *
 * @author Iván Becerra
 * @version 1.1.0
 */
public class TrabajadorTest {
    public static void main(String[] args) {

        Trabajador trabajador = new Trabajador("Juan",
                "Peréz", "Zalazar", "19876543-2", 33);
        System.out.println(trabajador);
        System.out.println("trabajador.nombreCompleto() = " + trabajador.nombreCompleto());
        System.out.println("trabajador.descomponerRun() = " + trabajador.descomponerRun());

        List<CargaFamiliar> cargaFamiliarList = new ArrayList<>();
        cargaFamiliarList.add(new CargaFamiliar("niña1", "Peréz", "Gonzalez", "20.000.000-0", Parentesco.HIJO, 15));
        cargaFamiliarList.add(new CargaFamiliar("niño1", "Peréz", "Gonzalez", "25.555.555-5", Parentesco.HIJO, 8));
        cargaFamiliarList.add(new CargaFamiliar("mujer", "Gonzalez", "Carrera", "14.444.444-4", Parentesco.CONYUGE, 40));

        trabajador.addCargaFamiliar(cargaFamiliarList);

        System.out.println();
        System.out.println("===================== Trabajador y sus cargas =====================");
        System.out.println(trabajador);

    }
}
