package cl.bootcamp.empresa.models;

import cl.bootcamp.empresa.interfaces.IAsesoria;

import java.util.List;

public class Contenedor {

    private List<IAsesoria> asesorias;

    private List<Capacitacion> capacitaciones;

    public Contenedor() {
    }

    public Contenedor(List<IAsesoria> asesorias, List<Capacitacion> capacitaciones) {
        this.asesorias = asesorias;
        this.capacitaciones = capacitaciones;
    }

    public void almacenarCliente (IAsesoria cliente){
        asesorias.add(cliente);
    }

    public void almacenarProfesional (IAsesoria capacitacion){
        asesorias.add(capacitacion);
    }

    public void almacenarAdministrativo (IAsesoria administrativo){
        asesorias.add(administrativo);
    }

    public void almacenarCapacitacion (Capacitacion capacitacion){
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario (IAsesoria run){

    }








}
