package individual33;

public class Repartidor extends Empleado {

    private String disponibilidadHoraria;

    @Override
    public String toString() {
        return "Repartidor{" +
                "disponibilidadHoraria='" + disponibilidadHoraria + '\'' +
                '}';
    }

    public Repartidor() {
    }

    public Repartidor(String nombre, String apellido, int edad, int salario) {
        super(nombre, apellido, edad, salario);
        // Implementa bono repartidor menores a 30años
        if (this.getEdad() < 30) {
            this.setSalario(salario + 15000);
        }
    }

    public Repartidor(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public Repartidor(String nombre, String apellido, int edad, int salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;
        // Implementa bono repartidor menores a 30años
        if (this.getEdad() < 30) {
            this.setSalario(salario + 15000);
        }
    }

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }
}
