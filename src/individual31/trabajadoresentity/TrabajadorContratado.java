package individual31.trabajadoresentity;

import individual31.ITipoTrabajador;

public class TrabajadorContratado extends Trabajador implements ITipoTrabajador {
    private String fechaIngreso;
    private int salarioMensual;

    public TrabajadorContratado(String car) {
    }

    public TrabajadorContratado(String fechaIngreso, int salarioMensual) {
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    public TrabajadorContratado(String nombre, String apellido, String run, String telefono, int edad, String fechaIngreso, int salarioMensual) {
        super(nombre, apellido, run, telefono, edad);
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
                "} " + super.toString();
    }

    @Override
    public void mostrarDatos(){
        //super.mostrarDatos();
        System.out.println("Fecha de ingreso: "+ this.getFechaIngreso() + " salario mensual:" + this.getSalarioMensual());
    }
}
