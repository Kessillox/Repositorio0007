import empresaclase14.*;

import java.util.Scanner;

import static empresaclase14.validaciones.ValidacionStrings.validarLargoString;
import static empresaclase14.validaciones.validacionaccidente.ValidacionAccidente.validarHora;
import static empresaclase14.validaciones.validacionaccidente.ValidacionAccidente.validarOrigenConsecuencias;
import static empresaclase14.validaciones.validacioncliente.ValidacionCliente.*;
import static empresaclase14.validaciones.validacioncliente.ValidacionCliente.validarComunaEmpresa;
import static empresaclase14.validaciones.validacionidentificador.ValidacionIdentificador.validarId;
import static empresaclase14.validaciones.validacionprofesional.ValidacionProfesional.validarFecha;
import static empresaclase14.validaciones.validacionusuario.ValidacionUsuario.esSoloLetras;

public class exMain {

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
            System.out.println("3.- Salir");
            System.out.println("Selecciona una opción:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al registro de usuarios.");
                    boolean repetir = false;
                    do {
                        do {
                            System.out.println("Ingresa el nombre: (mínimo 2 caracteres y máximo 30)");
                            nombreUsuario = entrada.next();
                        } while (esSoloLetras(nombreUsuario) || validarLargoString(nombreUsuario, 2, 30, "Nombre de usuario"));
                        do {
                            System.out.println("Ingresa el primer apellido:");
                            apellido1Usuario = entrada.next();
                        } while (esSoloLetras(apellido1Usuario) || validarLargoString(apellido1Usuario, 2, 30, "Primer apellido"));
                        do {
                            System.out.println("Ingresa el segundo apellido:");
                            apellido2Usuario = entrada.next();
                        } while (esSoloLetras(apellido2Usuario) || validarLargoString(apellido2Usuario, 2, 30, "Segundo apellido"));
                        do {
                            System.out.println("Ingresa la fecha de nacimiento:");
                            fechaDeNacimientoUsuario = entrada.next();
                        } while (!validarFecha(fechaDeNacimientoUsuario));
                        do {
                            System.out.println("Ingresa el RUN sin punto ni guion");
                            runUsuario = entrada.nextInt();
                        } while (!validarRut(runUsuario));

                        System.out.println("¿Deseas volver a registrar otro usuario? (S/N)");
                        char respuesta = entrada.next().charAt(0);
                        if (respuesta == 'N' || respuesta == 'n') {
                            repetir = false;
                        }
                        repetir = true;
                    } while (repetir);
                    break;
                case 2:

                    System.out.println("Bienvenido al registro de Clientes");
                    do {
                        System.out.println("Ingrese el nombre de la empresa");
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
                    break;


                // Acá el resto del Switch ladies

                case 3: // Profesional


                    break;
                case 4: // Administrativo


                    break;
                case 5: // Capacitacion


                    break;
                case 6: // Accidente
                    System.out.println("Se encuentra en el Registro de Accidentes");
                    do {
                        System.out.println("Ingrese el ID Accidente");
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

                    break;


                case 7: // Visita en terreno


                    break;
                case 8: // Revision


                    break;
            }

        } while (nombreUsuario.isEmpty());

        // Se instancia la clase Listado
        Listado listadoDeUsuarios = new Listado();

        // Se instancian 6 tipos de usuarios
        Usuario usuario1 = new Usuario("Brocacochi", "Chespi", "Rito", "10-10-1990", 33333333);
        Usuario usuario2 = new Usuario("Benito", "Mussolini", "Repetto", "01/01/1941", 11111112);

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
