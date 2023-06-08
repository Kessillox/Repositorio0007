package Individual31;

public class Contratado extends Trabajador{
    private String fechaIngreso;
    private Double  salarioMensual;

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(Double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "Contratado{" +
                "fechaIngreso='" + fechaIngreso + '\'' +
                ", salarioMensual=" + salarioMensual +
                '}';
    }

    @Override
    public void mostrarDatos() {
        System.out.println("La fecha de ingreso es: "+this.getFechaIngreso());
    }
}
