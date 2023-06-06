package Individual_Oscar.Ejercicio32;

public class Contratado extends Trabajador {
    private String fechaIngreso;
    private double salario;

    public Contratado() {

    }

    public Contratado(String nombres, String apellidos, String run, String telefono, int edad, String fechaIngreso, int salario) {
        super(nombres, apellidos, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Contratado{" +
                "fechaIngreso='" + fechaIngreso + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Salario: " + salario);

    }
}

