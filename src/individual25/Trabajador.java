package individual25;
/*
* Una empresa corredora de propiedades necesita contar con un sistema de registro de sus
trabajadores. Por cada uno de ellos se necesita saber:
- Nombres
- Apellidos
- RUN (se debe almacenar con guion)
- Teléfono
- Edad
*
Se solicita crear una clase que represente a un trabajador de la empresa, usando atributos con tipos
de datos adecuados a la situación. Además, debe considerar lo siguiente:

* - Debe agregar un método toString().
- Debe tener dos métodos constructores: uno que cree un objeto vacío, y otro que solicite
todos los atributos pertenecientes a la clase.
- Debe agregar el método nombreCompleto(), el cual debe retornar la concatenación de los
nombres y apellidos del usuario.
- Desarrolle el método descomponerRun(), el cual debe retornar un número entero
correspondiente a todo lo que está en el RUN antes del guion y del dígito verificador.
Nota 1: Considere que Eclipse permite crear rápidamente muchos métodos de manera fácil y rápida.
Nota 2: Recuerde que esta clase, a diferencia de las anteriores desarrolladas, no debe llevar un
método main(), ya que desde ella no se ejecutarán acciones.*/
public class Trabajador {
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String run;
    private String telefono;
    private int edad;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}

