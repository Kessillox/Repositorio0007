package Individual_Oscar.Ejercicio33.entity;

/**
 * class Repartidor que hereda los atributos de la clase Empleado
 * @author oscar
 * @version 1.0
 */
public class Repartidor extends Empleado{
    private String disponibilidadHoraria;


    /** @param disponibilidadHoraria
     *
     * @param nombre
     * @param apellido
     * @param edad
     * @param salario
     * @param disponibilidadHoraria
     */
    public Repartidor(String nombre, String apellido, int edad, double salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public Repartidor(String disponibilidadHoraria) {
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
        return "Repartidor{" +
                "disponibilidadHoraria='" + disponibilidadHoraria + '\'' +
                '}';
    }

    /**
     *
     * metodo bonoEdad que evalua al repartidor
     */
    @Override
    public double bonoEdad() {
        return super.bonoEdad();
    }
    public double bonoRepartidores(){
        double bono =0;
        if (getEdad() < 30) {
            bono += 15000;

        }
        return bono;
    }

}
