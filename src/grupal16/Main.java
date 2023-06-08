package grupal16;

public class Main {
    public static void main(String[] args) {
        Listado listado = new Listado();

        Usuario cliente = new Usuario("Cliente1");
        Profesional profesional = new Profesional("Profesional1", "Licenciado en Prevención de Riesgos", "2022-01-01");
        Administrativo administrativo = new Administrativo("Administrativo1", "Recursos Humanos", "3 años en otra empresa");

        listado.agregarUsuario(cliente);
        listado.agregarUsuario(profesional);
        listado.agregarUsuario(administrativo);

        listado.analizarUsuarios();
        profesional.analizarUsuario();
    }
}
