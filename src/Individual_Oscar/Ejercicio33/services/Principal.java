package Individual_Oscar.Ejercicio33.services;

import Individual_Oscar.Ejercicio33.entity.Repartidor;
import Individual_Oscar.Ejercicio33.entity.Vendedor;

public class Principal {
    public static void main(String[] args) {

        Repartidor rep1 = new Repartidor("Juan","Perez",33,150000,"08:00 a 12:00");
        Vendedor ven1 = new Vendedor("oscar","Fernandez",25,400000,"30/08/1990");
        System.out.println(ven1.bonoVendedores());
        System.out.println(rep1.bonoRepartidores());
        Vendedor ven2 = new Vendedor();

        System.out.println("Ingrese el Sueldo");

    }
}
