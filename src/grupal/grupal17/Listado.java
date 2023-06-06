package grupal.grupal17;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    //Se instancia la lista representada a traves de la interfaz Asesoria
    private List<Asesoria> listaDeUsuarios = new ArrayList<Asesoria>();

   //Constructor con atributos de la clase Listado
    public Listado(List<Asesoria> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    //Constructor vacío
    public Listado() {
    }

    //Se agregan elementos a la lista
    public void agregarArchivo (Asesoria elemento){
        listaDeUsuarios.add(elemento);
    }

    //Método analizarUsuario
    public void analizarUsuario() {
        for (Asesoria elemento : listaDeUsuarios
        ) {
            elemento.analizarUsuario();
        }
    }
}
