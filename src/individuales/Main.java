package individuales;

import individuales.T25.Trabajador;
import individuales.T27.cargaTrabajador;
public class Main {

    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador(
                "Manuel Fernando",
                "Pinot Friz",
                "19555544-3",
                944468294,
                49);

        System.out.println(trabajador);


        cargaTrabajador carga = new cargaTrabajador(
                "10503570-5",
                "Gisela Andrea",
                "Friz Melo",
                "19555544-3",
                "Madre",
                49);

        System.out.println(carga);
    }
}


