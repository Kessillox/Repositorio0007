package individuales.individual31;

public class Contratado extends Trabajador{
    private String fechaIngreso;
    private String salarioMensual;

    //Constructor vacío
    public Contratado() {
    }

    //Constructor con atributos de Contratado y atributos de Trabajador

    public Contratado(String nombre, String apellido1, String apellido2, String run, String telefono, int edad, CargaFamiliar carga, String fechaIngreso, String salarioMensual) {
        super(nombre, apellido1, apellido2, run, telefono, edad, carga);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    //Constructor con atributos de clase Contratado
    public Contratado(String fechaIngreso, String salarioMensual) {
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    //Getter y setter
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(String salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Contratado{" +
                "fechaIngreso='" + fechaIngreso + '\'' +
                ", salarioMensual='" + salarioMensual + '\'' +
                '}';
    }

    //Método mostrarDatos

    @Override
    public void mostrarDatos() {
        System.out.println(" La fecha de ingreso del trabajador es: " +getFechaIngreso() + " y su salario mensual es: " +getSalarioMensual());
    }
}
