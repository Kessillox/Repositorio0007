package sprintmarines.services;

import sprintmarines.entity.Capacitacion;
import sprintmarines.entity.Usuario;
import sprintmarines.iservices.IAsesoria;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un contenedor que almacena usuarios y capacitaciones.
 * Sus 2 atributos son privados, los usuarios y capacitaciones se almacenan en 1 lista cada una.
 * Permite agregar, eliminar y listar usuarios, así como almacenar y listar capacitaciones.
 *
 */
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

    /**
     * Obtiene la lista de usuarios en el contenedor.
     * @return Lista de usuarios almacenadas en el contenedor.
     */
    public List<IAsesoria> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(List<IAsesoria> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public List<Capacitacion> getListaCapacitaciones() {
        return listaCapacitaciones;
    }

    public void setListaCapacitaciones(List<Capacitacion> listaCapacitaciones) {
        this.listaCapacitaciones = listaCapacitaciones;
    }

    //Agregar cliente, administrativo y profesional a la lista de instancias de IAsesoria
    /**
     * Almacena un cliente en la lista de usuarios del contenedor.
     * @param cliente Cliente a almacenar en el contenedor.
     */
    public void almacenarCliente(IAsesoria cliente) {
        listaDeUsuarios.add(cliente);
    }

    /**
     * Almacena un profesional en la lista de usuarios del contenedor.
     * @param profesional Profesional a almacenar en el contenedor.
     */
    public void almacenarProfesional(IAsesoria profesional) {
        listaDeUsuarios.add(profesional);
    }

    /**
     * Almacena un administrativo en la lista de usuarios del contenedor.
     * @param administrativo Administrativo a almacenar en el contenedor.
     */
    public void almacenarAdministrativo(IAsesoria administrativo) {
        listaDeUsuarios.add(administrativo);
    }


    //Agregar nueva capacitacion a la lista de instancias de Capacitacion
    /**
     * Almacena una capacitación en la lista de capacitaciones del contenedor.
     * @param capacitaciones Capacitación a almacenar en el contenedor.
     */
    public void almacenarCapacitacion(Capacitacion capacitaciones) {
        listaCapacitaciones.add(capacitaciones);
    }

    /**
     * Elimina un usuario de la lista de usuarios del contenedor.
     * @param run RUN del usuario a eliminar.
     */
    public void eliminarUsuario(int run) {
        for (int i = listaDeUsuarios.size() - 1; i >= 0; i--) {
            IAsesoria usuario = listaDeUsuarios.get(i);
            if (usuario instanceof Usuario && ((Usuario) usuario).getRun() == run) {
                listaDeUsuarios.remove(i);
                System.out.println("Usuario eliminado");
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }

    /**
     * Lista todos los usuarios almacenados en el contenedor.
     */
    public void listarUsuarios() {
        for (IAsesoria usuario : listaDeUsuarios) {
            if (usuario instanceof Usuario) {
                Usuario usuarioActual = (Usuario) usuario;
                System.out.println("Nombre: " + usuarioActual.getNombre() + ", RUN: " + usuarioActual.getRun());
            }
        }
    }

    /**
     * Lista todos los usuarios del tipo especificado almacenados en el contenedor.
     * @param tipo Tipo de usuario a listar. Debe ser una subclase de IAsesoria.
     */
    public void listarUsuariosPorTipo(Class<? extends IAsesoria> tipo) {
        for (IAsesoria usuario : listaDeUsuarios) {
            if (tipo.isInstance(usuario)) {
                System.out.println(usuario.toString());
            }
        }
    }

    /**
     * Lista todas las capacitaciones almacenadas en el contenedor.
     */
    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : listaCapacitaciones) {
            System.out.println("Capacitación: " + capacitacion.toString());
            //System.out.println("Cliente: " + capacitacion.getCliente().toString());
        }
    }
}
