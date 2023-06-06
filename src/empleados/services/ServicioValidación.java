package empleados.services;

import empleados.iservices.IMetodos;

import java.util.ArrayList;
import java.util.List;

public class ServicioValidación {
    private List<IMetodos> listaMetodos = new ArrayList<IMetodos>();

    public ServicioValidación() {
    }

    public ServicioValidación(List<IMetodos> listaMetodos) {
        this.listaMetodos = listaMetodos;
    }
    
    public void addPersona(IMetodos metodo){
        listaMetodos.add(metodo);
    }

    public void desplegar(){
        for (IMetodos metodo: listaMetodos) {
            metodo.mostrar();
        }
    }
}
