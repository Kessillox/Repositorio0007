package tg13;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("19283182-2", "Empresa1", "Representate1", "+56912812371", "Calle 1 #1021", "Comuna1");
        Usuario usuario1 = new Usuario("10203192-3", "Usuario1", "10/10/1995");
        Capacitacion capacitacion1 = new Capacitacion(1, cliente1.getRut(), "10/06/2023", "22:30", "NOSE", 2.5, 20);

        System.out.println(cliente1.toString());
        System.out.println(usuario1.toString());
        System.out.println(capacitacion1.toString());
    }
}
