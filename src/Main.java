import mascotas.Animal;
import mascotas.Gato;
import mascotas.Perro;

public class Main {
    public static void main(String[] args) {
        Animal animal1;
        Animal animal2;
        animal1= new Perro("Canino", "Fido");
        animal2= new Gato("Felino", "Snarf");

        animal1.imprmir();
        animal1.saludo();
        animal2.imprmir();
        animal2.saludo();
    }
}