package individual33gustavov;

public class MainSueldo {
    public static void main(String[] args) {
        // Empleado
        //Empleado empleado1 = new Empleado("Pepito", "Perón", 45, 100000);
        //System.out.println(empleado1.sueldoMasBono());  // Bono: mas de 40 = 100000

        // Vendedor
        Vendedor vendedor = new Vendedor("Juana", "Martinez", 45, 100000, "27/02/2010");
        System.out.println(vendedor.sueldoMasBono());  // Bono: siempre = 50000

        // Repartidor
        Repartidor repartidor = new Repartidor("Santi", "Bueno", 25, 100000, "Tarde");
        System.out.println(repartidor.sueldoMasBono());  // Bono: menos de 35 = 15000
    }
}