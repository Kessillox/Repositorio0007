package empresa.services;

import empresa.entity.Capacitacion;
import empresa.entity.Usuario;
import empresa.iservices.IAsesoria;


import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un contenedor de usuarios y capacitaciones.
 * @author Cintia Muñoz, Oscar Fenández, Joaquín Baeza, Hans Schiess
 * @version 1.0
 */
public class Contenedor {
    private List<IAsesoria> listaDeUsuarios = new ArrayList<>(); //Lista de interfaz
    private List<Capacitacion> listaCapacitaciones = new ArrayList<>(); //Lista de la clase capacitación

    public Contenedor() {
    }

    /**
     * Constructor de Contenedor que recibe listas de usuarios y capacitaciones.
     *
     * @param listaDeUsuarios     Lista de instancias de IAsesoria.
     * @param listaCapacitaciones Lista de instancias de Capacitacion.
     */
    public Contenedor(List<IAsesoria> listaDeUsuarios, List<Capacitacion> listaCapacitaciones) {
        this.listaDeUsuarios = listaDeUsuarios;
        this.listaCapacitaciones = listaCapacitaciones;
    }

    /**
     * Agrega un cliente a la lista de usuarios.
     *
     * @param cliente Cliente a almacenar.
     */
    public void almacenarCliente (IAsesoria cliente){
        listaDeUsuarios.add(cliente);
    }

    /**
     * Agrega un profesional a la lista de usuarios.
     *
     * @param profesional Profesional a almacenar.
     */
    public void almacenarProfesional (IAsesoria profesional){
        listaDeUsuarios.add(profesional);
    }

    /**
     * Agrega un administrativo a la lista de usuarios.
     *
     * @param administrativo Administrativo a almacenar.
     */
    public void almacenarAdministrativo (IAsesoria administrativo){
        listaDeUsuarios.add(administrativo);
    }


    /**
     * Agrega una nueva capacitación a la lista de capacitaciones.
     *
     * @param capacitaciones Capacitación a almacenar.
     */
    public void almacenarCapacitacion (Capacitacion capacitaciones){
        listaCapacitaciones.add(capacitaciones);
    }

    /**
     * Lista los usuarios almacenados en el contenedor.
     */
    public void listarUsuarios() {
        System.out.println("***LISTA DE USUARIOS***");
        for (IAsesoria usuario : listaDeUsuarios) {
            System.out.println(usuario.toString());
        }
    }

    /**
     * Elimina un usuario de la lista de usuarios basado en su RUN.
     *
     * @param runUsuario RUN del usuario a eliminar.
     */
    public void eliminarUsuario(String runUsuario){
        boolean encontrado = false;
        for (int i = 0; i < listaDeUsuarios.size(); i++) {
            Usuario u = (Usuario) listaDeUsuarios.get(i);
            if(u.getRun().equals(runUsuario) ){ //Revisar si funciona, cambié el == por equals
                encontrado = true;
                System.out.println(encontrado);
                listaDeUsuarios.remove(u);
                System.out.println("Usuario eliminado");
                break;
            }
        }
    }
    /**
     * Lista las capacitaciones almacenadas en el contenedor.
     */
    public void listarCapacitaciones() {
        System.out.println("***LISTA DE CAPACITACIONES***");
        for (Capacitacion capacitacion : listaCapacitaciones) {
            System.out.println(capacitacion.toString());
        }
    }

    /**
     * Lista los usuarios por cliente, administrativo o profesional
     *
     * @param tipo Tipo de usuario a listar.
     */
    public void listarUsuariosPorTipo(IAsesoria tipo) {
        System.out.println("***LISTA DE USUARIOS POR TIPO***");
        for (IAsesoria usuario : listaDeUsuarios) {
            if(usuario.getClass().equals(tipo.getClass())){
                System.out.println(usuario.toString());
            }
        }

    }

}
