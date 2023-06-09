package empresaclase14;

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
    public void almacenarCliente(IAsesoria cliente) {
        listaDeUsuarios.add(cliente);
    }

    public void almacenarProfesional(IAsesoria profesional) {
        listaDeUsuarios.add(profesional);
    }

    public void almacenarAdministrativo(IAsesoria administrativo) {
        listaDeUsuarios.add(administrativo);
    }


    //Agregar nueva capacitacion a la lista de instancias de Capacitacion
    public void almacenarCapacitacion(Capacitacion capacitaciones) {
        listaCapacitaciones.add(capacitaciones);
    }

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

    public void listarUsuarios() {
        for (IAsesoria usuario : listaDeUsuarios) {
            if (usuario instanceof Usuario) {
                System.out.println(usuario.toString() + "\n");
            }
        }
    }

    public void listarUsuariosPorTipo(Class<? extends IAsesoria> tipo) {
        for (IAsesoria usuario : listaDeUsuarios) {
            if (tipo.isInstance(usuario)) {
                System.out.println(usuario.toString());
            }
        }
    }

    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : listaCapacitaciones) {
            System.out.println("Capacitación: " + capacitacion.toString());
            System.out.println("Cliente: " + capacitacion.getCliente().toString());
        }
    }
}
