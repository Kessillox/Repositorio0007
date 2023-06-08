import cl.bootcamp.empresa.interfaces.IAsesoria;
import cl.bootcamp.empresa.models.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Violación del Principio de inversión de dependencia (DIP):
Se corrige el tipo de los objetos antes de las clases Administrativo, Profesional y Cliente,
 ahora del tipo de la interface IAsesoria para aplicar el principio DIP y depender de abstracciones.
  Esto permite una mayor flexibilidad y extensibilidad del código.*/

public class Main {
    public static void main(String[] args) {

        Listado listadoUsuarios = new Listado();

        IAsesoria administrativo1 = new Administrativo("Juan", "Peréz", "Gonzales", "2000/05/05", "18.888.888-8", 31, "Salud", "1 años");
        IAsesoria administrativo2 = new Administrativo("Jose", "Peréz", "Gonzales", "1990/02/02", "12.222.222-2", 32, "Oficina", "2 años");
        IAsesoria profesional1 = new Profesional("Cristian", "Peréz", "Gonzales", "1995/03/03", "13.333.333-3", 33, "Informática", "3 año");
        IAsesoria profesional2 = new Profesional("Ignacio", "Peréz", "Gonzales", "1994/04/04", "14.444.444-4", 34, "Informática", "4 año");
        IAsesoria cliente1 = new Cliente("Iván", "Peréz", "Gonzales", "1995/05/05", "15.555.555-5", 35, "Empresa5", "giro", "555555555", "# 555", "Comuna555", "55.000.000-5");

        listadoUsuarios.addUsuarios(administrativo1)
                .addUsuarios(administrativo2)
                .addUsuarios(profesional1)
                .addUsuarios(profesional2)
                .addUsuarios(cliente1);

        listadoUsuarios.analizarUsuarios();


        Date date = new Date(); // Obtener la fecha actual
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        String dateString = format.format(date);
        System.out.println("Fecha formateada: " + dateString);




    }
}