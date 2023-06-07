package empresaclase14;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<IAsesoria> listaDeUsuarios =  new ArrayList<IAsesoria>();;

    public Listado() {
    }

    public Listado(List<IAsesoria> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public void addElemento(IAsesoria analizarUsuario) {
        listaDeUsuarios.add(analizarUsuario);
    }


    public void instanciasRegistradas() {
        for (IAsesoria analizarUsuario: listaDeUsuarios) {
            analizarUsuario.analizarUsuario();
            System.out.println();
            
        }
    }
}
