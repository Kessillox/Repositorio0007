package grupal.grupal15;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        //Instancia clase Usuario con constructor vacío
        Usuario user = new Usuario();
        user.setNombre("Joaquin");
        user.setFechaDeNacimiento(LocalDate.of(2000,06,23));
        user.setRun("204332432-9");

        System.out.println("****** DATOS DE USUARIO******");
        //Metodo toString
        System.out.println(user.toString());
        //Metodo mostrarEdad
        System.out.println(user.mostrarEdad());

        //Mostrar nombre de usuario usando get
        System.out.println("Nombre de usuario obtenido con get: " + user.getNombre());
        System.out.println();

        //Instancia de clase Usuario con constructor con parámetros
        Usuario user2 = new Usuario("Cecilia", LocalDate.of(2000,06,23), "21002374-1");

        //Metodo toString
        System.out.println(user2.toString());
        //Metodo mostrarEdad
        System.out.println(user2.mostrarEdad());
        //Modificar atributo de la clase Usuario
        user2.setRun("22002374-8");
        System.out.println("El run modificado es: " + user2.getRun());
        System.out.println("------------------------------------------------------------------------");

        //CLASE CLIENTE
        // Se intancia de la clase cliente el objeto cliente atraves de su constructor
        Cliente cliente = new Cliente(78501900, "Recoders", "Juan", "Perez", "Gonzalez", "953323568", "Balmaceda 212", "Talca");
        System.out.println("****** DATOS DE CLIENTE******");
        //Metodo metodo toString
        System.out.println(cliente.toString());
        //Metodo obtenerCliente
        System.out.println(cliente.obtenerNombre());

        //Modificar atributo de la clase Cliente
        cliente.setApeliido2("Pardo");
        System.out.println("El apellido modificado es: " + cliente.getApellido2());
        System.out.println();

        //Instancia de la clase cliente con constructor vacio
        Cliente cliente2 = new Cliente();
        cliente2.setRut(61876456);
        cliente2.setNombreEmpresa("Sidu");
        cliente2.setNombreRepresentante("Patricia");
        cliente2.setApellido1("Figueroa");
        cliente2.setApeliido2("Castro");
        cliente2.setTelefonoRepresentante("963214968");
        cliente2.setDireccion("1 Sur");
        cliente2.setComuna("Chillán");

        System.out.println(cliente2.toString()); // del objeto cliente se utiliza el metodo toString
        System.out.println(cliente2.obtenerNombre());

        //Mostrar nombre empresa con el método get
        System.out.println("Nombre empresa obtenido con get: "+ cliente2.getNombreEmpresa() );
        System.out.println("------------------------------------------------------------------------");

        //CLASE CAPACITACION
        //Instancia de la clase Capacitacion con constructor vacio
        Capacitacion capa = new Capacitacion();
        capa.setIdentificador(1);
        capa.setRut(999999999);
        capa.setDia("Lunes");
        capa.setHora("12:45 PM");
        capa.setLugar("Universidad del Bio Bio");
        capa.setDuracion("120");
        capa.setCantidadDeAsistentes(13);

        System.out.println("****** DATOS DE CAPACITACION******");
        //Metodo toString
        System.out.println(capa.toString());
        //Metodo mostrarDetalle
        System.out.println(capa.mostrarDetalle());

        //Mostrar id cliente con metodo get
        System.out.println("Id cliente obtenido con get: " + capa.getIdentificador() );
        System.out.println();

        //Instancia de clase Capacitacion con constructor con parámetros
        Capacitacion capa2 = new Capacitacion(2, 77506800,"Lunes 22", "09:00", "Universidad de Talca", " 60", 20 );

        //Metodo toString
        System.out.println(capa2.toString());
        //Metodo mostrarDetalle
        System.out.println(capa2.mostrarDetalle());

        //Modificar cantidad de asistentes
        capa2.setCantidadDeAsistentes(30);
        System.out.println("La cantidad de asistentes modificada es: " + capa2.getCantidadDeAsistentes());
        System.out.println();

    }
}
