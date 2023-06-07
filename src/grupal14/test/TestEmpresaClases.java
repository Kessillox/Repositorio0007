package grupal14.test;


import grupal14.models.Capacitacion;
import grupal14.models.Cliente;
import grupal14.models.Usuario;

/**
 * Esta clase contiene el método main para testear las clases Empresa, Usuario y Capacitacion
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * @version 1.1.0
 * @see TestEmpresaClases
 */
public class TestEmpresaClases {
    public static void main(String[] args) {

        // instancia de objetos
        Cliente cliente = new Cliente("60.000.123", "Potreros S.A.", "Cristian",
                "Durán", "Ferreira",
                "+569 99887766", "Santiago 6161", "Las Condes");
        Usuario usuario = new Usuario("19.987.654-3", "Juan", 24,"1998-03-06");
        Capacitacion capacitacion = new Capacitacion(115, cliente.getRut(), 60, 5 ,
                "Ciudad Empresarial", "4 días", 15);

        Cliente cliente2 = new Cliente("60.000.123", "Potreros S.A.", "Cristian",
                "Durán", "Ferreira",
                "+569 99887766", "Santiago 6161", "Las Condes");
        Usuario usuario2 = new Usuario("23.987.654-3", "Pedro", 30,"1992-03-06");
        Capacitacion capacitacion2 = new Capacitacion(115, cliente.getRut(), 60, 5 ,
                "Ciudad Empresarial", "4 días", 15);

        // modificación de atributos de cada clase
        cliente.setDireccion("Las Condes");
        usuario.setNombre("Fabricio");
        capacitacion.setLugar("Chillán");
        cliente2.setDireccion("Talca #1325");
        usuario2.setEdad(50);
        capacitacion2.setLugar("Concepción");

        // despliegue de los datos
        System.out.println(cliente.getNombre() + " con rut: " + cliente.getRut());
        System.out.println("El usuario " + usuario.getNombre() + " tiene la edad de: "
                + usuario.getEdad() + " años");
        System.out.println("La capacitación con id: " + capacitacion.getId() + " tiene lugar en " + capacitacion.getLugar());

        // métodos de clases
        System.out.println(cliente2.obtenerNombre());
        usuario2.obtenerNombre();
        capacitacion2.mostrarDetalle();

        // métodos toString()
        System.out.println("empresa = " + cliente);
        System.out.println("capacitación = " + capacitacion);
        System.out.println("usuario = " + usuario);
        System.out.println("empresa2 = " + cliente2);
        System.out.println("capacitación2 = " + capacitacion2);
        System.out.println("usuario2 = " + usuario2);
    }
}
