package empresa.services;

import empresa.entity.Capacitacion;
import empresa.entity.Usuario;
import empresa.iservices.IAsesoria;


import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private List<IAsesoria> listaDeUsuarios = new ArrayList<>(); //Lista de interfaz
    private List<Capacitacion> listaCapacitaciones = new ArrayList<>(); //Lista de la clase capacitación

    public Contenedor() {
    }

    //Constructor
    public Contenedor(List<IAsesoria> listaDeUsuarios, List<Capacitacion> listaCapacitaciones) {
        this.listaDeUsuarios = listaDeUsuarios;
        this.listaCapacitaciones = listaCapacitaciones;
    }

    //Agregar cliente, administrativo y profesional a la lista de instancias de IAsesoria
    public void almacenarCliente (IAsesoria cliente){
        listaDeUsuarios.add(cliente);
    }
    public void almacenarProfesional (IAsesoria profesional){
        listaDeUsuarios.add(profesional);
    }
    public void almacenarAdministrativo (IAsesoria administrativo){
        listaDeUsuarios.add(administrativo);
    }


    //Agregar nueva capacitacion a la lista de instancias de Capacitacion
    public void almacenarCapacitacion (Capacitacion capacitaciones){
        listaCapacitaciones.add(capacitaciones);
    }

    public void listarUsuarios() {
        for (IAsesoria usuario : listaDeUsuarios) {
            System.out.println(usuario.toString());
        }
    }
    public void eliminarUsuario(String runUsuario){
        boolean encontrado = false;
        for (int i = 0; i < listaDeUsuarios.size(); i++) {
            Usuario u = (Usuario) listaDeUsuarios.get(i);
            if(u.getRun().equals(runUsuario) ){ //Revisar si funciona, cambié el == por equals
                encontrado = true;
                System.out.println(encontrado);
                listaDeUsuarios.remove(u);
                System.out.println("Rut eliminado");
                break;
            }
        }
    }
    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : listaCapacitaciones) {
            System.out.println(capacitacion.toString());
        }
    }

    public void listarUsuariosPorTipo(IAsesoria tipo) {
        for (IAsesoria usuario : listaDeUsuarios) {
            if(usuario.getClass().equals(tipo.getClass())){
                System.out.println(usuario.toString());
            }
        }

    }

}
