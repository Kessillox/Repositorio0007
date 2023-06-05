package procesovalidarelementos;

import java.util.ArrayList;
import java.util.List;

public class ServicioValidar {
    private List<Validacion> listaDeValidacion = new ArrayList<Validacion>();;

    public ServicioValidar(List<Validacion> listaDeDocumentos) {
        this.listaDeValidacion = listaDeDocumentos;
    }

    public ServicioValidar() {
    }

    public void agregarArchivo (Validacion elemento){
        listaDeValidacion.add(elemento);
    }

    public void validarLista(){
        for (Validacion elemento: listaDeValidacion
             ) {
            elemento.validar();
        }
    }
}
