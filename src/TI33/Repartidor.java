package TI33;

public class Repartidor extends empleado {

    private String disponibilidadHoraria;

    public Repartidor(String nombre, String apellido, int edad, double salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }
    public double bono() {
        double bono = super.bono();
        if (getEdad()  < 30) {
            bono += 15000;
        }
        return bono;
    }
}
