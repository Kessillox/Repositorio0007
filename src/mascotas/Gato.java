package mascotas;

public class Gato extends Animal{
    private String nombre;

    public Gato(String especie, String nombre) {
        super(especie);
        this.nombre = nombre;
    }

    public Gato() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void imprmir() {
        super.imprmir();
        System.out.println("Soy un gato de nombre "+this.getNombre());
    }

    public void saludo(){
        System.out.println("digo miau");
    }
}
