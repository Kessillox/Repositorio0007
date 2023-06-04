package grupal13;

/**
 * Clase principal que instancia las demás clases Cliente, Usuario y Capacitacion
 * para luego imprimirlas en pantalla con el metodo toString()
 * @author Juan Merino
 * @version 1.0
 */
public class Main {

    /**
     * Metodo main() a través del cual se crea una instancia de cada clase y se despliegan sus datos
     * @param args arreglo de los argumentos de la linea de comando
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Empresa1", "Representante E1", "+56911122233",
                "Calle Generica 111", "Rancagua", 75888666);
        Usuario usuario1 = new Usuario("Usuario1", "21/05/1960", "19999999");
        Capacitacion capacitacion1 = new Capacitacion(1, 75888666, "Martes 23", "14:30", "Edificio B",
                "40min", 5);

        System.out.println(cliente1);
        System.out.println(usuario1);
        System.out.println(capacitacion1);

    }
}
