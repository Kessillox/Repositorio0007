package TI33;

public class Main {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Manuel", "Pinot", 45, 750000, "15/08/2020");
        Repartidor repartidor = new Repartidor("Hans", "Pinot", 20, 550000, "08:00 - 17:00");

        System.out.println("Vendedor: " + vendedor.getNombre() + " " + vendedor.getApellido() + " " + vendedor.getEdad());
        System.out.println("Salario: " + vendedor.getSalario() + " " + vendedor.getFechaInicio());
        System.out.println("Bono: " + vendedor.bono());

        System.out.println();

        System.out.println("Repartidor: " + repartidor.getNombre() + " " + repartidor.getApellido() + " " + repartidor.getEdad());
        System.out.println("Salario: " + repartidor.getSalario() + " " + repartidor.getDisponibilidadHoraria());
        System.out.println("Bono: " + repartidor.bono());
    }
}
