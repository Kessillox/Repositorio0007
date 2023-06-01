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

        Empresa empresa = new Empresa("60.000.123", "Potreros S.A.", "Cristian",
                "+569 99887766", "Santiago 6161", "Las Condes");
        Usuario usuario = new Usuario("19.987.654-3", "Juan", "1990-03-06");
        Capacitacion capacitacion = new Capacitacion(115, empresa.getRut(), 60, 5 ,
                "Ciudad Empresarial", "4 días", 15);

        System.out.println("empresa = " + empresa);
        System.out.println("capacitación = " + capacitacion);
        System.out.println("usuario = " + usuario);
    }
}
