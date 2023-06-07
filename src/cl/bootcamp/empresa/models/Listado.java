package cl.bootcamp.empresa.models;

import cl.bootcamp.empresa.interfaces.IAsesoria;

import java.util.ArrayList;
import java.util.List;

/*Principio de inversión de dependencia (DIP - Dependency Inversion Principle):
 La clase Listado depende de la interfaz IAsesoria, en lugar de depender de clases concretas como Usuario, Administrativo, Profesional o Cliente.
 Esto permite que Listado trabaje con cualquier objeto que implemente la interfaz IAsesoria,
 lo que cumple con el principio de depender de abstracciones en lugar de detalles concretos.*/

public class Listado {

    List<IAsesoria> usuarios = new ArrayList<>();

    public Listado addUsuarios(IAsesoria usuario) {
        usuarios.add(usuario);
        return this;
    }

    public void analizarUsuarios() {
        for (IAsesoria usuario : usuarios) {
            usuario.analizarUsuario();
        }
    }

}
