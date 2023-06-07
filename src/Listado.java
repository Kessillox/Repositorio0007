import java.util.ArrayList;
import java.util.List;
// REEMPLAZAR POR CLASE "CONTENEDOR"
public class Listado {
    private List<Usuario> lista = new ArrayList<>();

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

    public void agregar(Usuario usuario) {
        lista.add(usuario);
    }

    public void mostrarDatos() {
        for (Usuario usuario: this.getLista()) {
            usuario.analizarUsuario();
        }
    }
}
