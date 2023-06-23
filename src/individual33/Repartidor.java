package individual33;

public class Repartidor extends Empleado{
    private String disponibilidadHoraria;

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
    public String toString() {
        return "Repartidor: "+ super.toString()+", " +
                "disponibilidad horaria: "+disponibilidadHoraria;
    }

    @Override
    public int tieneBono(){
        int salario = super.tieneBono();
        if(getEdad()<30){
            salario +=15000;
        }
        return salario;
    }
}
