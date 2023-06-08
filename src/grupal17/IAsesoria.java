/*
UTILIZACIÓN PRINCIPIOS SOLID
ISP: Este principio es usado para crear pequeñas interfaces que definen un comportamiento específico.
Esta interfaz es un ejemplo de la aplicación del principio, ya que es pequeña y específica. Además,
define un metodo que es relevante para las clases que la implementan.

DIP: Las clases Administrativo, Cliente y Profesional pueden usarse polimórficamente a través de esta interfaz.
Esto significa, que se puede utilizar el método analizarUsuario en cualquiera de las clases sin necesitar saber
el tipo de clase que es. Este es un ejemplo de la aplicación del principio,ya que la dependencia de las clases de alto-nivel
(por ejemplo Listado) y las clases de bajo-nivel (por ejemplo las clases específicas de tipos de usuarios) están invertidas a través de IAsesoria.
 */

package grupal17;

public interface IAsesoria {
    void analizarUsuario();
}
