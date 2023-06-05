package grupal.grupal16;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) throws Exception {

        //Se crea una instacia de la clase Listado
        Listado listar = new Listado();

        //Cinco instancias de diferentes tipos de usuarios
        Cliente cliente1 = new Cliente("Juan", "Martínez", "García",LocalDate.of(2000,06,23), "16542458-1","Sidu", "Transporte","953314567", "Balmaceda 212", "Villa Alegre" );
        Administrativo admin1 = new Administrativo("María", "López", "Rodríguez", LocalDate.of(1996,04,04), "19678954-8", "Ventas", "5 años");
        Administrativo admin2 = new Administrativo("Carlos", "Fernández", "Pérez", LocalDate.of(1992,01,03), "18376908-7", "logística", "2 años" );
        Profesional prof1 = new Profesional("Laura", "Sánchez", "González", LocalDate.of(1999,07,11), "17445679-2", "Ingeniera", "28/01/2023");
        Profesional prof2 = new Profesional("Roberto", "Ramírez", "Hernández",LocalDate.of(1999,05,11), "16987432-1", "Contador", "15/11/2022" );

        //Agregar elementos al listado
        listar.agregarArchivo(cliente1);
        listar.agregarArchivo(admin1);
        listar.agregarArchivo(admin2);
        listar.agregarArchivo(prof1);
        listar.agregarArchivo(prof2);

        //Método de despliega los datos
       listar.analizarUsuario();

    }
}
