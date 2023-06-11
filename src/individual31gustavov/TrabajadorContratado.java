package individual31gustavov;

public class TrabajadorContratado extends Trabajador {
    private String fechaIngreso;
    private double salarioMensual;

    public TrabajadorContratado(String nombres, String apellidos, String run, String telefono, int edad, String fechaIngreso, double salarioMensual) {
        super(nombres, apellidos, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "TrabajadorContratado{" +
                "fechaIngreso='" + fechaIngreso + '\'' +
                ", salarioMensual=" + salarioMensual +
                '}';
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Salario mensual: " + salarioMensual);
    }
}