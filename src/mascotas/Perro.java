package mascotas;

public class Perro extends Animal{
    private String nombre;

    public Perro(String especie, String nombre) {
        super(especie);
        this.nombre = nombre;
    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public Perro() {
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void imprmir() {
        super.imprmir();
        System.out.println("Soy un perro de nombre "+this.getNombre());
    }
}
