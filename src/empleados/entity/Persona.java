package empleados.entity;

import empleados.iservices.IMetodos;

public class Persona implements IMetodos {
    private int edad;
    private String nombre;


    public Persona() {
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void mostrar() {
        System.out.println( "yo soy "+ this.getNombre()+" y tengo "+ this.getEdad());
    }
}
