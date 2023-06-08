/*
UTILIZACIÓN PRINCIPIOS SOLID
LSP: La clase cumple el principio de Liskov, ya que una instancia de Profesional puede ser usada cuando una instancia de la clase Usuario es la esperada.
*/

package grupal17;

public class Profesional extends Usuario {
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
