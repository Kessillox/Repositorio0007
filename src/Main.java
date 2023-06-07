import cl.bootcamp.empresa.models.Administrativo;
import cl.bootcamp.empresa.models.Cliente;
import cl.bootcamp.empresa.models.Listado;
import cl.bootcamp.empresa.models.Profesional;

public class Main {
    public static void main(String[] args) {

        Listado listadoUsuarios = new Listado();

        Administrativo administrativo1 = new Administrativo("Juan", "Peréz", "Gonzales", "2000/05/05", "18.888.888-8", "Salud", "1 años");
        Administrativo administrativo2 = new Administrativo("Jose", "Peréz", "Gonzales", "1990/02/02", "12.222.222-2", "Oficina", "2 años");
        Profesional profesional1 = new Profesional("Cristian", "Peréz", "Gonzales", "1995/03/03", "13.333.333-3", "Informática", "3 año");
        Profesional profesional2 = new Profesional("Ignacio", "Peréz", "Gonzales", "1994/04/04", "14.444.444-4", "Informática", "4 año");
        Cliente cliente1 = new Cliente("Iván", "Peréz", "Gonzales", "1995/05/05", "15.555.555-5", "Empresa5", "giro", "555555555", "# 555", "Comuna555", "55.000.000-5");

        listadoUsuarios.addUsuarios(administrativo1)
                .addUsuarios(administrativo2)
                .addUsuarios(profesional1)
                .addUsuarios(profesional2)
                .addUsuarios(cliente1);

        listadoUsuarios.analizarUsuarios();

    }
}