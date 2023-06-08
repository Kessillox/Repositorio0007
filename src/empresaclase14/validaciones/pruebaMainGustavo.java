package empresaclase14.validaciones;

import empresaclase14.Usuario;

import java.util.Scanner;

import static empresaclase14.validaciones.validacionusuario.ValidacionUsuario.*;
import static empresaclase14.validaciones.ValidacionStrings.validarLargoString;

public class pruebaMainGustavo {

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

        do {

            System.out.println("\n Bienvenido a Sprint Modulo 4 Programación en Java!");
            System.out.println("--------------------------------------");
            System.out.println("Que operación deseas realizar? (Debes pulsar un número)");
            System.out.println("1.- Registrar Usuario");
            //System.out.println("2.- Registrar Cliente");
            //System.out.println("3.- Salir");
            System.out.println("Selecciona una opción:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al registro de usuarios.");

                    do {
                        System.out.println("Ingresa el nombre: (mínimo 10 caracteres y máximo 50)");
                        nombreUsuario = entrada.next();
                    } while (esSoloLetras(nombreUsuario) || validarLargoString(nombreUsuario,2,30, "Nombre de usuario"));
                    do {
                        System.out.println("Ingresa el primer apellido:");
                        apellido1Usuario = entrada.next();
                    } while (esSoloLetras(apellido1Usuario) || validarLargoString(apellido1Usuario,2,30,"Primer apellido"));
                    do {
                        System.out.println("Ingresa el segundo apellido:");
                        apellido2Usuario = entrada.next();
                    } while (esSoloLetras(apellido2Usuario) || validarLargoString(apellido2Usuario,2,30,"Segundo apellido"));
                    Usuario usuarioEjemplo = new Usuario(nombreUsuario, apellido1Usuario, apellido2Usuario, fechaDeNacimientoUsuario, runUsuario);

                    System.out.println(usuarioEjemplo.toString());


                    break;
            }

        } while (opcion != 3);
    }


}
