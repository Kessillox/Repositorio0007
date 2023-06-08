package TI33;

public class Vendedor extends empleado{

    private String fechaInicio;

    public Vendedor(String nombre, String apellido, int edad, double salario, String fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }
    public double bono() {
        double bono = super.bono() + 50000;
        return bono;
    }
}
