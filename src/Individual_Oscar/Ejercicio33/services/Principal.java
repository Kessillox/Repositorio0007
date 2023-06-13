package Individual_Oscar.Ejercicio33.services;

import Individual_Oscar.Ejercicio33.entity.Repartidor;
import Individual_Oscar.Ejercicio33.entity.Vendedor;

import java.util.Scanner;

/**Clase principal de la aplicación
 * @author oscar
 * version 1.0
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * creacion de objetos con las clases repartidor y vendedor
         */
        Repartidor rep1 = new Repartidor("Juan","Perez",45,150000,"08:00 a 12:00");
        Repartidor rep2 = new Repartidor("Mauricio","Hernandez",23,130000,"08:00 a 12:00");
        Repartidor rep3 = new Repartidor("Pamela","Neira",31,200000,"08:00 a 12:00");

        Vendedor ven1 = new Vendedor("Jose", "Gonzales", 45, 150000, "08:00 a 12:00");
        Vendedor ven2 = new Vendedor("Pedro", "ramirez", 25, 350000, "08:00 a 12:00");
        Vendedor ven3 = new Vendedor("Jose", "Gonzales", 31, 300000, "08:00 a 12:00");

        /**
         * se utiliza el metodo Bonoedad que evalua si el empleado es mayor a 40 y otorga el bono en caso de cumplirse
         *
         */
        System.out.println("########### VENDEDORES ###########");
        System.out.println("Nombre: "+ven1.getNombre()+" "+ven1.getApellido()+"\nSueldo: "+ ven1.getSalario()+"\nEdad: "+ven1.getEdad()+"\nBono Edad: "+ ven1.bonoEdad()+" Bono Vendedor: "+ven1.bonoVendedores());
        System.out.println("----------------------------------------------------------------");
        System.out.println("Nombre: "+ven2.getNombre()+" "+ven2.getApellido()+"\nSueldo: "+ ven2.getSalario()+"\nEdad: "+ven2.getEdad()+"\nBono Edad: "+ ven2.bonoEdad()+" Bono Vendedor: "+ven2.bonoVendedores());
        System.out.println("----------------------------------------------------------------");
        System.out.println("Nombre: "+ven3.getNombre()+" "+ven3.getApellido()+"\nSueldo: "+ ven3.getSalario()+"\nEdad: "+ven3.getEdad()+"\nBono Edad: "+ ven3.bonoEdad()+" Bono Vendedor: "+ven3.bonoVendedores());
        System.out.println("----------------------------------------------------------------");

        System.out.println("########### REPARTIDORES ###########");
        System.out.println("Nombre: "+rep1.getNombre()+" "+rep1.getApellido()+"\nSueldo: "+ rep1.getSalario()+"\nEdad: "+rep1.getEdad()+"\nBono Edad: "+rep1.bonoEdad()+" Bono Repartidor: "+rep1.bonoRepartidores());
        System.out.println("----------------------------------------------------------------");
        System.out.println("Nombre: "+rep2.getNombre()+" "+rep2.getApellido()+"\nSueldo: "+ rep2.getSalario()+"\nEdad: "+rep2.getEdad()+"\nBono Edad: "+rep2.bonoEdad()+" Bono Repartidor: "+rep2.bonoRepartidores());
        System.out.println("----------------------------------------------------------------");
        System.out.println("Nombre: "+rep3.getNombre()+" "+rep3.getApellido()+"\nSueldo: "+ rep3.getSalario()+"\nEdad: "+rep3.getEdad()+"\nBono Edad: "+rep3.bonoEdad()+" Bono Repartidor: "+rep3.bonoRepartidores());


    }
}
