package individual33gustavov;

public class Repartidor extends Empleado {
    String disponibilidadHoraria;

    public Repartidor() {
    }

    public Repartidor(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public Repartidor(String nombre, String apellido, int edad, int salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    @Override
    public int sueldoMasBono() {
        int salario = super.sueldoMasBono();
        if(edad<30){
            salario += 15000;
        }
        return salario;
    }
}
