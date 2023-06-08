package cl.bootcamp.empresa.interfaces;

/* Principio de responsabilidad única (SRP - Single Responsibility Principle):
La interfaz IAsesoria tiene una única responsabilidad que es definir el método analizarUsuario() */

/* Principio de segregación de la interfaz (ISP - Interface Segregation Principle):
 La interfaz IAsesoria define un único método analizarUsuario(), que es utilizado por las clases
 Usuario, Administrativo, Profesional y Cliente.
 La interfaz está diseñada de manera que los clientes que implementan esta interfaz no dependen de métodos que no utilizan.*/
public interface IAsesoria {
    void analizarUsuario();

    void listaUsuario();
}
