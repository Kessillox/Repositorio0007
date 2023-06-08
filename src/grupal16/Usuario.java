package grupal16;

public class Usuario implements IAsesoria {
    protected String nombreUsuario;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " + nombreUsuario);
    }
}
