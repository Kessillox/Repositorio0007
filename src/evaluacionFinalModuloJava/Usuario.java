package evaluacionFinalModuloJava;

import TG16.Asesoria;

public class Usuario implements Iasesoria {
    private String nombre;

    private String apellido1;
    private String apellido2;
    private String fechaNacimiento;
    private int run;
    private String afp;
    private String sistemaSalud;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, String fechaNacimiento, int run, String afp, String sistemaSalud, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.edad = edad;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(String sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarEdad(){
        System.out.println("El usuario tiene "+this.getEdad()+" anos");
    }

    public void obtenerNombre(){
        System.out.println("El nombre del usuarios es "+this.getNombre()+" "+this.getApellido1()+" "+ this.getApellido2());
    }
    public void obtenerSistemaSalud(){
        System.out.println("Sistema de salud del usuario es: "+ this.getSistemaSalud());
        analizarUsuario();
    }


    @Override
    public void analizarUsuario() {
        mostrarEdad();
        obtenerNombre();
        obtenerSistemaSalud();
    }
}
