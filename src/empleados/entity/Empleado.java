package empleados.entity;

public class Empleado extends Persona{

    private int sueldoBruto;

    public Empleado(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado(int edad, String nombre, int sueldoBruto) {
        super(edad, nombre);
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado() {
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldoBruto=" + sueldoBruto +
                '}';
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("mi sueldo bruto es: " + this.getSueldoBruto());
    }

    public void calculoSueldo(){
        System.out.println("Mi sueldo es " +this.getSueldoBruto()*0.8);
    }

}
