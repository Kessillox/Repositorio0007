package Individual_Oscar.Ejercicio33.services;

import Individual_Oscar.Ejercicio33.entity.Repartidor;
import Individual_Oscar.Ejercicio33.entity.Vendedor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Repartidor rep1 = new Repartidor("Juan","Perez",33,150000,"08:00 a 12:00");
        //Vendedor ven1 = new Vendedor("Jose", "Gonzales", 33, 150000, "08:00 a 12:00");
        //System.out.println(ven1.bonoVendedores());
        System.out.println(rep1.bonoRepartidores());
        //Vendedor ven2 = new Vendedor("Jose","Gonzales",33,150000,"08:00 a 12:00");

        System.out.println("Ingrese el Sueldo");
        System.out.println();
    }
}
