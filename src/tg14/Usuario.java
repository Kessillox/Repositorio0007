package tg14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Usuario {
    private String rut;
    private String nombre;
    private LocalDate fechaNac;

    public Usuario(){}

    public Usuario(String rut, String nombre, String fechaNac){
        this.rut = rut;
        this.nombre = nombre;
        this.fechaNac = LocalDate.parse(fechaNac, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                '}';
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void mostrarEdad() {
        int edad = this.fechaNac.until(LocalDate.now()).getYears();
        System.out.println("El usuario tiene " + edad + " años");
    }
}



