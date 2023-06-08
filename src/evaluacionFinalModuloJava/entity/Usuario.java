package evaluacionFinalModuloJava.entity;

import evaluacionFinalModuloJava.interfac.IAsesoria;

import java.time.LocalDate;

public class Usuario implements IAsesoria {
    private String nombre;

    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;//dd/mm/yy
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int run, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void mostrarEdad(){
        //System.out.println("El usuario tiene "+ (LocalDate.now().getDayOfYear()- this.getFechaNacimiento())+" anos");
    }


    @Override
    public void analizarUsuario() {
        mostrarEdad();


    }
}
