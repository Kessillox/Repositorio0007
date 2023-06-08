package grupal16;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Ignacio Retamal
 * @version 1.0
 * @grupo Los Sin Código
 */

/**
 * Se crea la interfaz de Asesoria que define el metodo analizarUsuario que
 * se utilizará en las clases Usuario, Profesional, Administrativo y Listado
 */
interface Asesoria {
    void analizarUsuario();
}

/**
 * Se crea la clase Usuario y se implementa a la interfaz Asesoria.
 * Se establece un String protegido que representa el nombre del usuario
 * y que se utilizará solo en la clase Usuario y sus clases hijas que son
 */
class Usuario implements Asesoria {
    protected String nombreUsuario;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " + nombreUsuario);
    }
}
/**
 * Se crea la clase Profesional que se extiende de la clase Usuario.
 * Se definen los String titulo y fecha de ingreso
 * Se utiliza un constructor para llamar las variables
 */
class Profesional extends Usuario {
    private String titulo;
    private String fechaIngreso;

    public Profesional(String nombreUsuario, String titulo, String fechaIngreso) {
        super(nombreUsuario);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }
}

class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    public Administrativo(String nombreUsuario, String area, String experienciaPrevia) {
        super(nombreUsuario);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }
}
class Cliente extends Usuario {
    public Cliente(String nombreUsuario) {
        super(nombreUsuario);
    }
}
class Listado {
    private List<Asesoria> usuarios;

    public Listado() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Asesoria usuario) {
        usuarios.add(usuario);
    }

    public void analizarUsuarios() {
        for (Asesoria usuario : usuarios) {
            usuario.analizarUsuario();
            System.out.println("------------------------");
        }
    }
}

