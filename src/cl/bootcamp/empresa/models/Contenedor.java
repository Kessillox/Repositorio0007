package cl.bootcamp.empresa.models;

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * La clase Cliente contiene 5 atributos de tipo lista
 * @version 1.0.0
 * @see Contenedor
 */

import cl.bootcamp.empresa.interfaces.IAsesoria;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

    private List<IAsesoria> asesorias = new ArrayList<>();

    private List<Capacitacion> capacitaciones = new ArrayList<>();

    private List<Cliente> cliente = new ArrayList<>();

    private List<Profesional> profesional = new ArrayList<>();

    private List<Administrativo> administrativo = new ArrayList<>();

    /* Este método permite almacenar los datos de cliente, profesional o
    administrativo en una sola lista*/
    public void almacenarUsuario(IAsesoria a) {
        asesorias.add(a);
    }

    public void almacenarCliente(Cliente c) {cliente.add(c);}

    public void almacenarProfesiona(Profesional p) {profesional.add(p);}

    public void almacenarAdministrativo(Administrativo a){administrativo.add(a);}

    //almacena los datos de capacitacion
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

    public void listarUsuarios() {
        for (IAsesoria asesoria : asesorias) {
            asesoria.listaUsuario();
        }
    }

    public void listarUsuariosPorTipo() {
        System.out.println("Lista de clientes");
        for(Cliente c : cliente) {
            System.out.println(c);
        }
        System.out.println("Lista de profesionales");
        for(Profesional p : profesional){
            System.out.println(p);
        }
        System.out.println("Lista de administrativo");
        for(Administrativo a : administrativo){
            System.out.println(a);
        }
    }

    /*permite iterar sobre la lista de objetos que se implementan en la
    interfaz IAsesoria y llama al método listaUsuario() de cada objeto*/
    public void listaUsuario() {
        for (IAsesoria a : asesorias) {
            System.out.println(a);
        }
    }

    public void listarCapacitaciones() {
        for (Capacitacion c : capacitaciones) {
            System.out.println(c);
        }
    }

}
