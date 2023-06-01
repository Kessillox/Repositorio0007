package grupal.grupal12.dia11;

/**
 * Clase Grupal11 en la que tuvimos que detectar todos los errores de convención y estándares.
 * Luego creamos una clase nueva a partir del código antes compartido, que no tenga errores de convenciones.
 * @author Cintia Muñoz, Joaquín Baeza, Hans Schiess, Oscar Fernández
 * @version 1.0
 * @see grupal.grupal12.dia11
 *
 */
public class Grupal11 {

    /**
     * Método principal que ejecuta el programa.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {

        //Constante de tipo booleano
        final boolean VALOR_CONSTANTE = false;

        //Variable tipo string de un párrafo
        String parrafoEjemplo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec facilisis est ac ante viverra,\n";
        parrafoEjemplo +=" vel efficitur leo consequat. Maecenas quis lorem sit amet diam consequat lacinia non nec lacus. \n";
        parrafoEjemplo +="Phasellus egestas quam non dui dictum, sed fermentum dolor efficitur. Aliquam volutpat ex sodales \n";
        parrafoEjemplo +="pulvinar scelerisque. Donec sodales cursus tortor eu aliquam. Curabitur id purus arcu. Vestibulum \n";
        parrafoEjemplo +="ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse pretium, \n";
        parrafoEjemplo +="quam non consectetur scelerisque, diam tortor iaculis arcu, nec tincidunt diam eros sed urna. \n";
        parrafoEjemplo +="Ut at consequat enim. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus \n";
        parrafoEjemplo+="mus. Donec sit amet ultricies dui. Donec aliquet rhoncus velit et sollicitudin.";

        //Variable tipo entero con un valor para recorrer un bucle
        int conteoBucle = 10;

        System.out.println("===============================");
        System.out.println("Los valores son: ");


        for (int i = 0; i < conteoBucle; i++) {
            System.out.println("Valor: " + (i * i));
        }
        /* Esto es un comentario
            demasiado grande
             para que esté en una
             sola línea*/

        //Se imprimen por consola las variables
        System.out.println("===============================");
        System.out.println("El parrafo de ejemplo es: ");
        System.out.println("");
        System.out.println(parrafoEjemplo);
        System.out.println(" El valor de la constante es: " + VALOR_CONSTANTE);
    }
}
