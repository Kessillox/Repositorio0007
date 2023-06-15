package individual31;

public class Contratado extends Trabajador{

    private String fechaIngreso;
    private int salarioMensual;

    @Override
    public String toString() {
        return "Contratado{" +
                "fechaIngreso='" + fechaIngreso + '\'' +
                ", salarioMensual=" + salarioMensual +
                '}';
    }

    @Override
    public String mostrarDatos() {
        return "Fecha de Ingreso: " + this.fechaIngreso + "\n" +
                "Salario Mensual: " + this.salarioMensual + "\n";
    }

    public Contratado() {
    }

    public Contratado(String nombres, String apellidos, String run, String telefono, int edad) {
        super(nombres, apellidos, run, telefono, edad);
    }

    public Contratado(String fechaIngreso, int salarioMensual) {
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    public Contratado(String nombres, String apellidos, String run, String telefono, int edad, String fechaIngreso, int salarioMensual) {
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

    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
}
