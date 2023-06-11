package Individual_Oscar.Ejercicio33.entity;

public class Vendedor extends Empleado{
    private String  fechaInicio;

    public Vendedor(String nombre, String apellido, int edad, double salario, String fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }

    public Vendedor(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "fechaInicio='" + fechaInicio + '\'' +
                '}';
    }

    @Override
    public double bonoEdad() {
        return super.bonoEdad();
    }


    public double bonoVendedores(){

        return 50000;
    }


}
