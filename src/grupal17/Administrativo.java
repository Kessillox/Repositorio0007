/*
UTILIZACIÓN PRINCIPIOS SOLID
SRP: La clase Administrativo cumple este principio al tener una sola responsabilidad: Representar y almacenar atributos de un administrativo.
 */

package grupal17;

public class Administrativo extends Usuario {
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
