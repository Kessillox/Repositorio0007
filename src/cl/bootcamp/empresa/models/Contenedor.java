package cl.bootcamp.empresa.models;

import cl.bootcamp.empresa.interfaces.IAsesoria;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

    private List<IAsesoria> asesorias = new ArrayList<>();

    private List<Capacitacion> capacitaciones= new ArrayList<>();

    private List<Cliente> cliente = new ArrayList<>();

    private List<Profesional> profesional = new ArrayList<>();

    private List<Administrativo> administrativo = new ArrayList<>();

    /* Este método permite almacenar los datos de cliente, profesional o
    administrativo en una sola lista*/
    public void almacenarUsuario(IAsesoria a) {
        asesorias.add(a);
    }

    public void almacenarCapacitacion(Capacitacion c) {
        capacitaciones.add(c);
    }

    /*como su nombre lo indica, permite eliminar a un usuario utilizando
    el atributo run */
    public void eliminarUsuario(String run) {
        for (int i = 0; i < asesorias.size(); i++) {
            Usuario u = (Usuario) asesorias.get(i);
            if (u.getRun() == run) {
                asesorias.remove(u);
                System.out.println("Usuario eliminado");
                break;
            }
        }
    }

    public void listarUsuarios(){
        for (IAsesoria asesoria : asesorias) {
            asesoria.listaUsuario();
        }
    }

    public void listarUsuariosPorTipo(String tipo){
        for (IAsesoria asesorias: asesorias) {
            if(asesorias.getClass().getSimpleName().equals(tipo)){
                asesorias.listaUsuario();
            }

        }
    }

    /*permite iterar sobre la lista de objetos que se implementan en la
    interfaz IAsesoria y llama al método listaUsuario() de cada objeto*/
    public void listaUsuario() {
        for (IAsesoria a : asesorias) {
            a.listaUsuario();
        }
    }

    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println(capacitacion);
        }
    }





}
