package empleados.entity;

public class Directivo extends Empleado{
    private String categoria;

    public Directivo(int sueldoBruto, String categoria) {
        super(sueldoBruto);
        this.categoria = categoria;
    }

    public Directivo(int edad, String nombre, int sueldoBruto, String categoria) {
        super(edad, nombre, sueldoBruto);
        this.categoria = categoria;
    }

    public Directivo(String categoria) {
        this.categoria = categoria;
    }

    public Directivo() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria='" + categoria + '\'' +
                '}';
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Además soy directivo de categoría " +this.getCategoria());
    }
}
