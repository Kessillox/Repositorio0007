/*
UTILIZACIÓN PRINCIPIOS SOLID
OCP: La clase Cliente cumple el principio Abierto/Cerrado al extender de usuario y poder agregar nuevas funcionalidades.
 */

package grupal17;

public class Cliente extends Usuario {
    public Cliente(String nombreUsuario) {
        super(nombreUsuario);
    }
}
