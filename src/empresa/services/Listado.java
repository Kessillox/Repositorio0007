package empresa.services;

import empresa.iservices.IAsesoria;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    //Se instancia la lista representada a traves de la interfaz Asesoria
    private List<IAsesoria> listaDeUsuarios = new ArrayList<IAsesoria>();

   //Constructor con atributos de la clase Listado
    public Listado(List<IAsesoria> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    //Constructor vacío
    public Listado() {
    }

    //Se agregan elementos a la lista
    public void agregarArchivo (IAsesoria elemento){
        listaDeUsuarios.add(elemento);
    }

    //Método analizarUsuario
    public void analizarUsuario() {
        for (IAsesoria elemento : listaDeUsuarios
        ) {
            elemento.analizarUsuario();
        }
    }
}
