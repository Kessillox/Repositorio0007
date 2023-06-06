package empresaclase14;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<Asesoria> listaDeUsuarios =  new ArrayList<Asesoria>();;

    public Listado() {
    }

    public Listado(List<Asesoria> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public void addElemento(Asesoria metodo){
        listaDeUsuarios.add(metodo);
    }


    public void instanciasRegistradas() {
        for (Asesoria metodo: listaDeUsuarios) {
            metodo.analizarUsuario();
            
        }
    }
}
