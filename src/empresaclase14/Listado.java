package empresaclase14;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<Usuario> listaDeUsuarios =  new ArrayList<Usuario>();;

    public Listado() {
    }

    public Listado(List<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

}
