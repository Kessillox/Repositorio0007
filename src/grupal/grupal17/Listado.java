package grupal.grupal17;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa una lista de usuarios y capacitaciones.
 * @author Cintia Muñoz, Oscar Fenández, Joaquín Baeza, Hans Schiess
 * @version 1.0
 */
/*
* 1. Principio de Responsabilidad Única (Single Responsibility Principle):
*   La clase Listado tiene la responsabilidad única de administrar una lista
*   de objetos de tipo Asesoria y proporcionar métodos para agregar elementos
*   a la lista y realizar el análisis de los usuarios. Cumple con este principio
*   al tener una única razón de cambio: cambios en la forma en que se maneja
*   y analiza la lista de usuarios.
* 2.Principio de Abierto/Cerrado (Open/Closed Principle): La clase Listado
*   está abierta para su extensión al permitir agregar nuevos elementos a la
*   lista mediante el método agregarArchivo(). Al utilizar la interfaz Asesoria,
*   se puede agregar cualquier objeto que implemente dicha interfaz sin modificar
*   la clase Listado en sí misma. La clase se mantiene cerrada para modificaciones,
*   pero abierta para extensiones.
* 3.Principio de Sustitución de Liskov (Liskov Substitution Principle): La clase
*   Listado trabaja con objetos de tipo Asesoria, que incluyen tanto la clase Usuario
*   como otras clases que implementen la interfaz Asesoria, como Administrativo,
*   VisitaTerreno, Revision, Capacitacion y Accidente. Al utilizar la interfaz como
*   tipo de datos, se garantiza que los objetos se pueden sustituir sin afectar el
*   comportamiento esperado del Listado.
*/
public class Listado {
    //Se instancia la lista representada a traves de la interfaz Asesoria
    private List<Asesoria> listaDeUsuarios = new ArrayList<Asesoria>();

   //Constructor con atributos de la clase Listado
    public Listado(List<Asesoria> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    //Constructor vacío
    public Listado() {
    }

    /**
     * Agrega un usuario a la lista de usuarios.
     * @param elemento (usuario) a almacenar.
     */
    public void agregarArchivo (Asesoria elemento){
        listaDeUsuarios.add(elemento);
    }

    //Método analizarUsuario
    public void analizarUsuario() {
        for (Asesoria elemento : listaDeUsuarios
        ) {
            elemento.analizarUsuario();
        }
    }
}
