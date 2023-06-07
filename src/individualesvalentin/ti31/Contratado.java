package individualesvalentin.ti31;

public class Contratado extends Trabajador{
    private String fechaIngreso;
    private int salario;

    public Contratado(String nombre1, String nombre2, String apellido1, String apellido2, String run, int telefono,
                      int edad, String fechaIngreso, int salario) {
        super(nombre1, nombre2, apellido1, apellido2, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
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
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("%s: %s%n%s: %s%n","Fecha ingreso",getFechaIngreso(),"Sueldo mensual",getSalario());
    }
}
