package grupal.grupal17;

/**
 * Interfaz que se implementa en la clase usuario.
 * @author Cintia Muñoz, Oscar Fenández, Joaquín Baeza, Hans Schiess
 * @version 1.0
 */

/*
* Principios SOLID que se cumplen:

*1. La interfaz Asesoria cumple con el principio SOLID de Segregación de
*   Interfaz (ISP), ya que define un único método relacionado con la
*   funcionalidad de asesoría. Al separar la funcionalidad en una
*   interfaz específica, se evita que las clases tengan que implementar
*   métodos que no necesitan.
*2. Al implementar la interfaz también se cumple el Principio de Inversión
*   de Dependencias (DIP), ya que en este principio se recomienda que los
*   módulos de alto nivel no deben depender de los de bajo nivel. Para realizar
*   la dependencia se utilizan abstracciones, que en este caso sería a través
*   de una interfaz.
*/
public interface Asesoria {

    /**
     * Método para analizar un usuario.
     */
    public void analizarUsuario();
}
