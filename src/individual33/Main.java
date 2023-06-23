package individual33;

import individual33.Vendedor;


public class Main {
    public static void main(String[] args){

        System.out.println("\n<<< Vendedor >>>");
        Vendedor vendedor1 = new Vendedor("Evaristo", "Paramos", 57, 500000, "12-05-2020");
        System.out.println(vendedor1.toString());
        System.out.println("Sueldo total de "+vendedor1.getNombre()+": $"+vendedor1.tieneBono());
        System.out.println("\n<<< Repartidor >>>");
        Repartidor repartidor1 = new Repartidor("Fat","Mike",29,450000,"Vespertino");
        System.out.println(repartidor1.toString());
        System.out.println("Sueldo total de "+repartidor1.getNombre()+": $"+repartidor1.tieneBono());





    }

}