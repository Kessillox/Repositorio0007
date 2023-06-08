package grupal16;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<IAsesoria> usuarios;

    public Listado() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(IAsesoria usuario) {
        usuarios.add(usuario);
    }

    public void analizarUsuarios() {
        for (IAsesoria usuario : usuarios) {
            usuario.analizarUsuario();
            System.out.println("------------------------");
        }
    }
}
