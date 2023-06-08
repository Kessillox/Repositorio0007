import empresaclase14.*;

import java.util.Scanner;

import static empresaclase14.validaciones.validacionusuario.ValidacionUsuario.*;
import static empresaclase14.validaciones.validacioncliente.ValidacionCliente.*;
import static empresaclase14.validaciones.validacionaccidente.ValidacionAccidente.*;
import static empresaclase14.validaciones.validacionadministrativo.ValidacionAdministrativo.*;
import static empresaclase14.validaciones.validacioncapacitacion.ValidacionCapacitacion.*;
import static empresaclase14.validaciones.validacionidentificador.ValidacionIdentificador.*;
import static empresaclase14.validaciones.validacionprofesional.ValidacionProfesional.*;
import static empresaclase14.validaciones.validacionrevision.ValidacionRevision.*;
import static empresaclase14.validaciones.validacionvisitaterreno.ValidacionVisitaTerreno.*;






/**
 * Esta es la clase Main donde se crea la instancia de los objetos Usuario, Capacitación y Cliente
 *
 * @author Leadro Villalba
 * @author Luis Zambrano
 * @author Gustavo Vargas
 * @author Cristian Trureo
 * @version 1.1
 */

public class Main {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String tituloMenu = "";
        int opcion = 0;

        // Variables de Usuario

        String nombreUsuario = "";
        String apellido1Usuario = "";
        String apellido2Usuario = "";
        String fechaDeNacimientoUsuario = "";
        Integer runUsuario = 0;

        // Variables de Cliente

        String nombreEmpresa;
        String giroEmpresa;
        int rut;
        String telefonoRepresentante;
        String direccionEmpresa;
        String comunaEmpresa;

        // Variables de Accidente
        int idAccidente = 0;
        String dia, hora, lugar, origen, consecuencias;

        do {

            System.out.println("\n Bienvenido a Sprint Modulo 4 Programación en Java!");
            System.out.println("--------------------------------------");
            System.out.println("Que operación deseas realizar? (Debes pulsar un número)");
            System.out.println("1.- Registrar Usuario");
            System.out.println("2.- Registrar Cliente");
            System.out.println("3.- Registrar Cliente");
            System.out.println("4.- Registrar Cliente");
            System.out.println("5.- Registrar Cliente");
            System.out.println("6.- Registrar Accidente");
            System.out.println("7.- Registrar Cliente");
            System.out.println("8.- Registrar Cliente");
            System.out.println("9.- Salir");
            System.out.println("Selecciona una opción:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al registro de usuarios.");
                    do {
                        System.out.println("Ingresa el nombre: (mínimo 10 caracteres y máximo 50)");
                        nombreUsuario = entrada.next();
                    } while (!validarNombre(nombreUsuario) || !esStringObligatorio(nombreUsuario) || !esSoloLetras(nombreUsuario));
                    do {
                        System.out.println("Ingresa el primer apellido:");
                        apellido1Usuario = entrada.next();
                    } while (!esStringObligatorio(apellido1Usuario) || !esSoloLetras(apellido1Usuario));
                    do {
                        System.out.println("Ingresa el segundo apellido:");
                        apellido2Usuario = entrada.next();
                    } while (!validarNombre(apellido2Usuario) || !esStringObligatorio(apellido2Usuario) || !esSoloLetras(apellido2Usuario));
                    do {
                        System.out.println("Ingresa la fecha de nacimiento:");
                        fechaDeNacimientoUsuario = entrada.next();
                    } while (!validarFecha(fechaDeNacimientoUsuario));
                    do {
                        System.out.println("Ingresa el RUN sin punto ni guion");
                        runUsuario = entrada.nextInt();
                    } while (!validarRut(runUsuario));
                    Usuario usuarioEjemplo = new Usuario(nombreUsuario, apellido1Usuario, apellido2Usuario, fechaDeNacimientoUsuario, runUsuario);

                    System.out.println(usuarioEjemplo.toString());
                case 2:

                    System.out.println("Bienvenido al registro de Clientes");
                    do { System.out.println("Ingrese el nombre de la empresa");
                    nombreEmpresa = entrada.next();
                    } while (!validarNombreEmpresa(nombreEmpresa));
                    System.out.println("Ingrese el giro de la empresa");
                    giroEmpresa = entrada.next();
                    do {
                        System.out.println("Ingrese el rut de la empresa");
                        rut = entrada.nextInt();
                    } while (!validarRut(rut));
                    System.out.println("Ingrese el telefono de la empresa");
                    telefonoRepresentante = entrada.next();
                    do {
                        System.out.println("Ingrese la dirección de la empresa");
                        direccionEmpresa = entrada.next();
                    } while (!validarDireccionEmpresa(direccionEmpresa));
                    do {
                        System.out.println("Ingrese la comuna de la empresa");
                    comunaEmpresa = entrada.next();
                    } while (!validarComunaEmpresa(comunaEmpresa));

                    Cliente clienteEjemplo = new Cliente(nombreEmpresa, giroEmpresa, rut, telefonoRepresentante, direccionEmpresa, comunaEmpresa);

                    System.out.println(clienteEjemplo.toString());

                    // Acá el resto del Switch ladies

                case 3: // Profesional



                case 4: // Administrativo



                case 5: // Capacitacion



                case 6: // Accidente
                    System.out.println("Se encuentra en el Registro de Accidentes");
                    do { System.out.println("Ingrese el ID Accidente");
                        idAccidente = entrada.nextInt();
                    } while (!validarId(idAccidente));
                    System.out.println("Ingrese el día  del accidente");
                    dia = entrada.next();
                    do {
                        System.out.println("Ingrese la hora del accidente");
                        hora = entrada.next();
                    } while (!validarHora(hora));
                    System.out.println("Ingrese el lugar del accidente");
                    lugar = entrada.next();
                    do {
                        System.out.println("Ingrese el origen del accidente");
                        origen = entrada.next();
                    } while (!validarOrigenConsecuencias(origen));
                    do {
                        System.out.println("Ingrese las concecuencias del accidente");
                        consecuencias = entrada.next();
                    } while (!validarOrigenConsecuencias(consecuencias));

                    Accidente accidente1 = new Accidente(idAccidente, dia, hora, lugar, origen, consecuencias);

                    System.out.println(accidente1.toString());



                case 7: // Visita en terreno



                case 8: // Revision



            }

        } while (nombreUsuario.isEmpty());

        // Se instancia la clase Listado
        Listado listadoDeUsuarios = new Listado();

        // Se instancian 6 tipos de usuarios
        Usuario usuario1 = new Usuario("Brocacochi", "Chespi", "Rito", "10-10-1990", 33333333);
        Usuario usuario2 = new Usuario("Benito", "Mussolini", "Repetto", "01/01/1941", 11111112);

        //  Se instancian los tipo cliente
        Cliente cliente1 = new Cliente("Pelayo", "Fernandez", "Torrealba", "12/12/1990", 111111111, "Fundimax", "Fundidora", 99999999, "9845615498", "Lejos 124", "Los Alpes");
        Cliente cliente2 = new Cliente("Cristian", "Trureo", "Trureo", "11/11/1991", 222222221, "Awakelab", "Capacitaciones IT", 55555555, "123123123123", "Lejos 777", "Los Alpes");

        Profesional profesional1 = new Profesional("Luis", "Zambrano", "Zambrano", "06-06-2023", 186850149, "Analista Programador", "06-06-2023");
        Profesional profesional2 = new Profesional("Livio", "Gut", "Guti", "10-10-2023", 333333333, "Ingeniero Físico Termonuclear", "10-12-2023");

        // Se agregan las instancias de usuarios al Listado
        listadoDeUsuarios.addElemento(usuario1);
        listadoDeUsuarios.addElemento(usuario2);
        listadoDeUsuarios.addElemento(cliente1);
        listadoDeUsuarios.addElemento(cliente2);
        listadoDeUsuarios.addElemento(profesional1);
        listadoDeUsuarios.addElemento(profesional2);

        // Se llama al método para desplegar los datos
        listadoDeUsuarios.instanciasRegistradas();

    }
}
