package empresaclase14;
/*
   Segregación de interfaces:

   Esta interfaz aplica el principio de Segregación de interfaces, ya que todos los clientes
   que implementen esta interfaz utilizarán el método 'analizarUsuario()', y no
   dependen de métodos que no utilicen.
 */
public interface IAsesoria {
    /**
     * Muestra nombre y datos específicos de cada tipo de usuario.
     * Este método está siendo implementado por todas las clases que implementen esta interfaz.
     */
    public void analizarUsuario();

}

/*
   Principio de Inversión de Dependencias:

   Según el Principio de Inversión de Dependencias, los módulos de alto nivel deben depender de abstracciones en lugar de depender
   directamente de los módulos de bajo nivel. Las abstracciones pueden ser interfaces, clases abstractas o algún otro mecanismo que
   permita definir un contrato común para la comunicación entre los módulos.
 */

