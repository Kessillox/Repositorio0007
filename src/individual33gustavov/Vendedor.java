package individual33gustavov;

public class Vendedor extends Empleado {
    String fechaInicio;

    public Vendedor() {
    }

    public Vendedor(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Vendedor(String nombre, String apellido, int edad, int salario, String fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    @Override
    public int sueldoMasBono() {
        int salario = super.sueldoMasBono();
        salario += 50000;
        return salario;
    }
}
