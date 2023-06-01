package grupal.grupal14;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario user = new Usuario(); // se intancia de la clase usuario el objeto user
        user.setNombre("Joaquin"); // del objeto user se utiliza el metodo modificador setNombre y se le pasa el parametro
        user.setFechaDeNacimiento(LocalDate.of(2000,06,23));// del objeto user se utiliza el metodo modificador setFechaDeNacimiento y se le pasa el parametro

        user.setRun("204332432-9");  // del objeto user se utiliza el metodo modificador setRun y se le pasa el parametro
        System.out.println(user.toString()); // del objeto user se utiliza el metodo toString
        System.out.println(user.mostrarEdad());
        System.out.println("------------------------------------------------------------------------");



        Cliente cliente = new Cliente(1123534854445623423L, "Re-Coders", "9032492342", "amunategui 093", "123");
        // se intancia de la clase cliente el objeto cliente atraves de su constructor
        cliente.setRut(999999999); // del objeto cliente se utiliza el metodo modificador setRut y se le pasa el parametro
        System.out.println(cliente.toString()); // del objeto cliente se utiliza el metodo toString
        System.out.println(cliente.obtenerNombre());
        System.out.println("------------------------------------------------------------------------");



        Capacitacion capa = new Capacitacion();
        capa.setIdentificador(1);
        capa.setRut(999999999);
        capa.setDia("Lunes");
        capa.setHora("12:45 PM");
        capa.setLugar("Universidad del Bio Bio");
        capa.setDuracion("2 horas");
        capa.setCantidadDeAsistentes(13);
        System.out.println(capa.toString());
        System.out.println(capa.mostrarDetalle());
    }
}
