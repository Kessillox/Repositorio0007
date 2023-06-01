package cl.bootcamp.empresa13.test;


import cl.bootcamp.empresa13.models.*;

/**
 * Esta clase contiene el método main para testear las clases Empresa, Usuario y Capacitacion
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * @version 1.0.1
 * @see TestEmpresaClases
 */
public class TestEmpresaClases {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("60.000.123", "Potreros S.A.", "Cristian",
                "Durán", "Ferreira",
                "+569 99887766", "Santiago 6161", "Las Condes");
        Usuario usuario = new Usuario("19.987.654-3", "Juan", "1990-03-06");
        Capacitacion capacitacion = new Capacitacion(115, cliente.getRut(), 60, 5 ,
                "Ciudad Empresarial", "4 días", 15);

        System.out.println("empresa = " + cliente);
        System.out.println("capacitación = " + capacitacion);
        System.out.println("usuario = " + usuario);
    }
}
