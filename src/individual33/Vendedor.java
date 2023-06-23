package individual33;

public class Vendedor extends Empleado{
    private String fechaInicio;

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

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Vendedor: "+ super.toString()+", " +
               "fecha de inicio: "+fechaInicio;  //lo edité porque el Generate > toString.. se desconfiguró
    }

    public int tieneBono(){
        int salario = super.tieneBono();
        salario += 50000;
        return salario;

    }
}
