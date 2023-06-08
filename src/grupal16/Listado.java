package grupal16;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<IAsesoria> usuarios = new ArrayList<>();;



    public void agregarUsuario(IAsesoria usuario) {
        this.usuarios.add(usuario);
    }

    public void analizarUsuarios() {
        for (IAsesoria usuario : this.usuarios) {
            usuario.analizarUsuario();
            System.out.println("------------------------");
        }
    }
}
