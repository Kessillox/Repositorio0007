package empresaclase14;
/**
 * Esta interfaz aplica el principio de Segregación de interfaces, ya que todos los clientes
 * que implementen esta interfaz utilizarán el método 'analizarUsuario()', y no
 * dependen de métodos que no utilicen.
 */
public interface IAsesoria {
    /**
     * Muestra nombre y datos específicos de cada tipo de usuario.
     * Este método está siendo implementado por todas las clases que implementen esta interfaz.
     */
    public void analizarUsuario();
}

