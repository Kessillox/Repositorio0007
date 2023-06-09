import java.util.ArrayList;
import java.util.List;
public class Contenedor {
    private List<IAsesoria> asesorias;
    private List<Capacitacion> capacitaciones;
    public Contenedor() {
        this.asesorias = new ArrayList<>();
        this.capacitaciones = new ArrayList<>();
    }

    public void almacenarCliente(Cliente cliente) {
        this.asesorias.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        this.asesorias.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        this.asesorias.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        this.capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(String run) {
        this.asesorias.removeIf(usuario -> ((Usuario) usuario).getRunUsuario().equals(run));
    }

    public void listarUsuarios() {
        System.out.println("Lista de usuarios:");
        for (IAsesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                System.out.println(usuario.toString());
            }
        }
    }

    public void listarUsuariosPorTipo(String tipo) {
        System.out.println("Lista de usuarios por tipo: " + tipo);
        for (IAsesoria asesoria : asesorias) {
            if (asesoria.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                System.out.println(asesoria.toString());
            }
        }
    }

    public void listarCapacitaciones() {
        System.out.println("Lista de capacitaciones:");
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println(capacitacion.toString());
        }
    }
}
