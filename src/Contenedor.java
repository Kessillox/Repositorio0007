import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private List<IAsesoria> listaUsuarios;
    private List<Capacitacion> listaCapacitaciones;

    public Contenedor(List<IAsesoria> listaUsuarios, List<Capacitacion> listaCapacitaciones) {
        this.listaUsuarios = listaUsuarios;
        this.listaCapacitaciones = listaCapacitaciones;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "listaUsuarios=" + listaUsuarios +
                ", listaCapacitaciones=" + listaCapacitaciones +
                '}';
    }

    public List<IAsesoria> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<IAsesoria> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Capacitacion> getListaCapacitaciones() {
        return listaCapacitaciones;
    }

    public void setListaCapacitaciones(List<Capacitacion> listaCapacitaciones) {
        this.listaCapacitaciones = listaCapacitaciones;
    }

    public void almacenarCliente() {
        //comentario de prueba
    }

    public void almacenarProfesional() {

    }

    public void almacenarAdministrativo() {

    }

    public void almacenarCapacitacion() {

    }

    public void eliminarUsuario() {

    }

    public void listarUsuarios() {

    }

    public void listarUsuariosPorTipo() {

    }

    public void listarCapacitaciones() {

    }
}
