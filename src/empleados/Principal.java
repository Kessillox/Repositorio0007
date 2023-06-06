package empleados;

import empleados.entity.Cliente;
import empleados.entity.Directivo;
import empleados.services.ServicioValidación;

public class Principal {
    public static void main(String[] args) {
        Directivo dir1 = new Directivo(32, "Juan", 1000000, "Presidente");
        Cliente cliente1 = new Cliente(25, "Daniel", "Adalid", "953456758");
        ServicioValidación sv =  new ServicioValidación();

        sv.addPersona(dir1);
        sv.addPersona(cliente1);

        sv.desplegar();
        dir1.calculoSueldo();
    }
}

