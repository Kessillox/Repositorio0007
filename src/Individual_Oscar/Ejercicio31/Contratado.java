package Individual_Oscar.Ejercicio31;

public class Contratado extends Trabajador{
    private String fechaIngreso;
    private int salario;

    public Contratado() {

    }

    public Contratado(String nombres, String apellidos, String run, String telefono, int edad, String fechaIngreso, int salario) {
        super(nombres, apellidos, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }



}

