import empresaclase14.*;

import java.util.Scanner;

import static empresaclase14.validaciones.validacionusuario.ValidacionUsuario.*;
import static empresaclase14.validaciones.validacioncliente.ValidacionCliente.*;
import static empresaclase14.validaciones.validacionaccidente.ValidacionAccidente.*;
import static empresaclase14.validaciones.validacionidentificador.ValidacionIdentificador.*;
import static empresaclase14.validaciones.validacionprofesional.ValidacionProfesional.*;


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

    public static Usuario almacenarUsuario(Scanner entrada) {
        String nombreUsuario;
        String apellido1Usuario;
        String apellido2Usuario;
        String fechaDeNacimientoUsuario;
        int runUsuario;


        do {
            System.out.println("Ingresa el nombre: (mínimo 3 caracteres y máximo 50)");
            nombreUsuario = entrada.next();
        } while (!validarNombre(nombreUsuario) || !esStringObligatorio(nombreUsuario) || !esSoloLetras(nombreUsuario));

        do {
            System.out.println("Ingresa el primer apellido:");
            apellido1Usuario = entrada.next();
        } while (!validarApellido(apellido1Usuario) ||!esStringObligatorio(apellido1Usuario) || !esSoloLetras(apellido1Usuario));

        do {
            System.out.println("Ingresa el segundo apellido:");
            apellido2Usuario = entrada.next();
        } while (!validarApellido(apellido2Usuario) || !esStringObligatorio(apellido2Usuario) || !esSoloLetras(apellido2Usuario));

        do {
            System.out.println("Ingresa la fecha de nacimiento:");
            fechaDeNacimientoUsuario = entrada.next();
        } while (!validarFecha(fechaDeNacimientoUsuario));

        do {
            System.out.println("Ingresa el RUN sin punto ni guion");
            runUsuario = entrada.nextInt();
        } while (!validarRut(runUsuario));

        return new Usuario(nombreUsuario, apellido1Usuario, apellido2Usuario, fechaDeNacimientoUsuario, runUsuario);
    }

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

        //Variables de Profesional
        String titulo;
        String fechaDeIngreso;
        // Variables de Accidente
        int idAccidente = 0;
        String dia, hora, lugar, origen, consecuencias;

        //Cliente clienteEjemplo = new Cliente();

        do {

            System.out.println("\n Bienvenido a Sprint Modulo 4 Programación en Java!");
            System.out.println("--------------------------------------");
            System.out.println("Que operación deseas realizar? (Debes pulsar un número)");
            System.out.println("(1) Almacenar cliente");
            System.out.println("(2) Almacenar profesional");
            System.out.println("(3) Almacenar administrativo");
            System.out.println("(4) Almacenar capacitacion");
            System.out.println("(5) Eliminar usuario");
            System.out.println("(6) Listar usuarios");
            System.out.println("(7) Listar usuarios por tipo");
            System.out.println("(8) Listar capacitaciones");
            System.out.println("(9) Salir");
            System.out.println("Selecciona una opción:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al registro de Clientes");
                    Usuario usuarioCliente = almacenarUsuario(entrada);

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

                    Cliente clienteEjemplo = new Cliente(usuarioCliente.getNombre(), usuarioCliente.getApellido1(), usuarioCliente.getApellido2(), usuarioCliente.getFechaDeNacimiento(), usuarioCliente.getRun(), nombreEmpresa, giroEmpresa, rut, telefonoRepresentante, direccionEmpresa, comunaEmpresa);

                    //System.out.println(clienteEjemplo.toString());
                    clienteEjemplo.analizarUsuario();

                    break;
                case 2:  // Profesional


                    System.out.println("Bienvenido al registro de Profesionales");
                    Usuario usuarioProfesional = almacenarUsuario(entrada);

                    do { System.out.println("Ingrese título del profesional");
                        titulo = entrada.next();
                    } while (!validarNombreEmpresa(titulo));
                    do {
                        System.out.println("Ingresa la fecha de ingreso:");
                        fechaDeIngreso = entrada.next();
                    } while (!validarFecha(fechaDeIngreso));

                    Profesional profesionalEjemplo = new Profesional(usuarioProfesional.getNombre(), usuarioProfesional.getApellido1(), usuarioProfesional.getApellido2(), usuarioProfesional.getFechaDeNacimiento(), usuarioProfesional.getRun(), titulo, fechaDeIngreso);


                    //System.out.println(profesionalEjemplo.toString());
                    profesionalEjemplo.analizarUsuario();

                    break;



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


                case 9: break;
            }



        } while (nombreUsuario.isEmpty());
/**
        // Creo Instancia Contenedor
        Contenedor prueba = new Contenedor();
        // Agrego Cliente a ListaDeUsuarios
        prueba.almacenarCliente(clienteEjemplo);

        //Muestro Lista

        prueba.listarUsuarios();

        //prueba.listarUsuariosPorTipo(clienteEjemplo);
        System.out.println(clienteEjemplo.getClass());
*/
    }
}
