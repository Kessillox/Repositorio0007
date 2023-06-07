package cl.bootcamp.individual33.test;

import cl.bootcamp.individual33.models.Repartidor;
import cl.bootcamp.individual33.models.Vendedor;

import java.util.Date;

public class TestEmpleado {
    public static void main(String[] args) {

        Repartidor juan = new Repartidor("Juan", "Peréz", 41, 500000, "24/7");
        Repartidor juan2 = new Repartidor("Juan2", "2", 29, 500000, "24/7");
        Vendedor alberto = new Vendedor("Alberto", "Gonzalez", 41, 400000, new Date("2000/01/01"));
        Vendedor alberto2 = new Vendedor("Alberto2", "Gonzalez2", 29, 400000, new Date());

        System.out.println("Salario de " + juan.getNombre() + ": " + juan.getSalario());
        juan.bonoAdicional();
        System.out.println("Salario después de aplicar el bono " + juan.getNombre() + ": " + juan.getSalario());

        System.out.println();
        System.out.println("Salario de " + juan2.getNombre() + ": " + juan2.getSalario());
        juan2.bonoAdicional();
        System.out.println("Salario después de aplicar el bono " + juan2.getNombre() + ": " + juan2.getSalario());

        System.out.println();
        System.out.println("Salario de " + alberto.getNombre() + ": " + alberto.getSalario());
        alberto.bonoAdicional();
        System.out.println("Salario después de aplicar el bono " + alberto.getNombre() + ": " + alberto.getSalario());

        System.out.println();
        System.out.println("Salario de " + alberto2.getNombre() + ": " + alberto2.getSalario());
        alberto2.bonoAdicional();
        System.out.println("Salario después de aplicar el bono " + alberto2.getNombre() + ": " + alberto2.getSalario());

        System.out.println();
        juan.disponibilidad();

        System.out.println();
        alberto.saberFechaInicio();

    }
}
