package individual33;

public class Vendedor extends Empleado {

    private String fechaInicio;

    @Override
    public String toString() {
        return "Vendedor{" +
                "fechaInicio='" + fechaInicio + '\'' +
                '}';
    }

    public Vendedor() {
    }

    public Vendedor(String nombre, String apellido, int edad, int salario) {
        super(nombre, apellido, edad, salario);
        // implementa bono a vendedor
        this.setSalario(salario + 50000);


    }

    public Vendedor(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Vendedor(String nombre, String apellido, int edad, int salario, String fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
        // implementa bono a vendedor
        this.setSalario(salario + 50000);
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
