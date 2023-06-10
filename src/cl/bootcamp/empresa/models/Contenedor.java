package cl.bootcamp.empresa.models;

import cl.bootcamp.empresa.interfaces.IAsesoria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * @version 1.1.0
 * @see Contenedor
 * Creación de la clase Contenedor, contiene 5 atributos
 */

public class Contenedor {

    private List<IAsesoria> asesorias = new ArrayList<>();

    private List<Capacitacion> capacitaciones = new ArrayList<>();

    /* Este método permite almacenar los datos de cliente, profesional y
    administrativo en una sola lista*/
    public void almacenarUsuario(IAsesoria a) {
        asesorias.add(a);
    }

    //almacena los datos de capacitacion
    public void almacenarCapacitacion(Capacitacion c) {
        capacitaciones.add(c);
    }

    /*permite eliminar a un usuario utilizando el atributo run */
    public void eliminarUsuario(String run) {
        for (int i = 0; i < asesorias.size(); i++) {
            Usuario u = (Usuario) asesorias.get(i);
            if (u.getRun().equals(run)) {
                asesorias.remove(u);
                System.out.println("Usuario eliminado");
                break;
            }
        }
    }

    public void listarUsuariosPorTipo(Usuario usuario) {

        String usuarioClassName = usuario.getClass().getSimpleName();

        for (IAsesoria a : asesorias) {
            if (a.getClass().getSimpleName().equals(usuarioClassName)) {
                System.out.println(a);
            }
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
