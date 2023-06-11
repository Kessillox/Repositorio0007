package TI25;

import java.sql.SQLOutput;

public class Trabajador {
    String nombre;
    String apellido1;
    String apellido2;
    String run;
    String telefono;
    int edad;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido1, String apellido2, String run, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.run = run;
        this.telefono = telefono;
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

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String nombreCompleto(){
       String nombreConcatenado = ("El nombre completo del trabajador es: "+this.nombre+" "+this.apellido1+ " "+this.apellido2);
        return nombreConcatenado;
    }
    public String descomponerRun(){
        int pos = this.run.indexOf('-');
        String newRun = this.run.substring(0,pos);
        return newRun;
    }

}
