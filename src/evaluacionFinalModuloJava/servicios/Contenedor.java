package evaluacionFinalModuloJava.servicios;

import evaluacionFinalModuloJava.entity.*;
import evaluacionFinalModuloJava.interfac.IAsesoria;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Contenedor {
    private ArrayList<IAsesoria> IAsesorias;//almacena distintos tipos de usuarios
    private ArrayList<Capacitacion> capacitaciones;//

    public Contenedor() {
    }

    public Contenedor(ArrayList<IAsesoria> IAsesorias, ArrayList<Capacitacion> capacitaciones) {
        this.IAsesorias = IAsesorias;
        this.capacitaciones = capacitaciones;
    }

    public ArrayList<IAsesoria> getIAsesorias() {
        return IAsesorias;
    }

    public void setIAsesorias(ArrayList<IAsesoria> IAsesorias) {
        this.IAsesorias = IAsesorias;
    }

    public ArrayList<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitacion(ArrayList<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "IAsesorias=" + IAsesorias +
                ", capacitacion=" + capacitaciones +
                '}';
    }

    public void almacenarCliente(Cliente cliente) {
        IAsesorias.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        IAsesorias.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        IAsesorias.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        getCapacitaciones().add(capacitacion);
    }

    public void eliminarUsuario(IAsesoria run) {
        getIAsesorias().removeIf((Predicate<? super IAsesoria>) run);
    }

    public void listarUsuarios() {
        for (IAsesoria i : IAsesorias) {
            System.out.println(i);
        }
    }
    public void listarClientes() {
        for (IAsesoria cliente : IAsesorias) {
            System.out.println(cliente);
        }
    }

    public void listarAdministrador(){
        for (IAsesoria administrador: IAsesorias) {
            System.out.println(administrador);
        }
    }

    public void listarProfessional(){
        for (IAsesoria profesional: IAsesorias) {
            System.out.println(profesional);
        }
    }

    public void listarCapacitaciones(){
        for (Capacitacion capacitacion: capacitaciones) {
            System.out.println( capacitaciones);
        }
    }

}
