package grupal16.models;

import grupal16.interfaces.IAsesoria;

import java.util.ArrayList;
import java.util.List;

public class Listado {

    List<IAsesoria> usuarios = new ArrayList<>();

    public Listado addUsuarios(Usuario usuario) {
        usuarios.add(usuario);
        return this;
    }

    public void analizarUsuarios() {
        for (IAsesoria usuario : usuarios) {
            usuario.analizarUsuario();
        }
    }

}
