package cl.bootcamp.empresa.controllers;

import cl.bootcamp.empresa.models.Administrativo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author Cristian Durán - Iván Becerra - Ignacio Aránguiz
 * @version 1.0.0
 * @see AlmacenarAdministrativoController
 * Creación de la clase AlmacenarAdministrativoController, contiene las
 * validaciones para Usuario y Administrativo
 */
public class AlmacenarAdministrativoController {

    Scanner sc = new Scanner(System.in);

    Administrativo administrativo = new Administrativo();

    /**
     * Sobrescritura del método Administrativo
     *
     * @return Administrativo
     */
    public Administrativo almacenarAdministrativoController() {

        // ======================= Validaciones Usuario =======================
        System.out.println("(obligatorio) Ingresar nombre: ");
        while (true) {
            administrativo.setNombre(sc.nextLine().trim());
            if (administrativo.getNombre().length() < 10 ||
                    administrativo.getNombre().length() > 50) {
                System.err.println("Error, ingresar nombre de 10 a 50 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar primer apellido: ");
        while (true) {
            administrativo.setApellido1(sc.nextLine().trim());
            if (administrativo.getApellido1().length() < 5 ||
                    administrativo.getApellido1().length() > 30) {
                System.err.println("Error, ingresar apellido de 5 a 30 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar segundo apellido: ");
        while (true) {
            administrativo.setApellido2(sc.nextLine().trim());
            if (administrativo.getApellido2().length() < 5 ||
                    administrativo.getApellido2().length() > 30) {
                System.err.println("Error, ingresar apellido de 5 a 30 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar fecha de nacimiento " +
                "con formato dd/MM/yyyy: ");
        while (true) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            try {
                administrativo.setFechaNacimiento(df.format(df.parse(sc.next())));
                break;
            } catch (ParseException e) {
                System.err.println("La fecha tiene un formato incorrecto");
                System.err.println("El formato debe ser dd/MM/yyyy");
            }
        }

        System.out.println("(obligatorio) Ingresar RUN con el formato 00000000-k: ");
        while (true) {
            String runIngresado = sc.next();

            if (runIngresado.matches("\\d{8}-[\\d|kK]")) {
                administrativo.setRun(runIngresado);
                break;
            } else {
                System.err.println("El RUN ingresado no cumple con el formato " +
                        "requerido.");
            }
        }
        sc.nextLine(); // Consumir el salto de línea

        // ======================= Validaciones Profesional =======================
        System.out.println("(obligatorio) Ingresar área: ");
        while (true) {
            administrativo.setArea(sc.nextLine().trim());
            if (administrativo.getArea().length() < 5 ||
                    administrativo.getArea().length() > 20) {
                System.err.println("Error, ingresar experencia previa " +
                        "entre 5 y 20 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(opcional) Ingresar experiencia previa: ");
        while (true) {
            administrativo.setExperenciaArea(sc.nextLine().trim());
            if (administrativo.getExperenciaArea().isBlank()) break;
            if (administrativo.getExperenciaArea().length() > 100) {
                System.err.println("Error, ingresar título administrativo " +
                        "máximo 100 caracteres");
            } else {
                break;
            }
        }

        return administrativo;
    }
}