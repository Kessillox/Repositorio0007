package TI31;

public class TrabajadorContratado extends Trabajador {
    private String fechaIngreso;
    private int salarioMensual;

    public TrabajadorContratado() {
    }

    public TrabajadorContratado(String nombre, String apellido1, String apellido2, String run, String telefono, int edad) {
        super(nombre, apellido1, apellido2, run, telefono, edad);
    }

    public TrabajadorContratado(String fechaIngreso, int salarioMensual) {
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    public TrabajadorContratado(String nombre, String apellido1, String apellido2, String run, String telefono, int edad, String fechaIngreso, int salarioMensual) {
        super(nombre, apellido1, apellido2, run, telefono, edad);
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

    @Override
    public String toString() {
        return "TrabajadorContratado{" +
                "fechaIngreso='" + fechaIngreso + '\'' +
                ", salarioMensual=" + salarioMensual +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("fechaIngreso='" + fechaIngreso + '\'' +
                ", salarioMensual=" + salarioMensual);
    }
}
