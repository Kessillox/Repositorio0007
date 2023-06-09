package cl.bootcamp.empresa.controllers;

import cl.bootcamp.empresa.models.Cliente;
import cl.bootcamp.empresa.models.Profesional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AlmacenarProfesionalController {

    Scanner sc = new Scanner(System.in);
    Profesional profesional = new Profesional();

    public Profesional almacenarProfesionalController() {

        // ======================= Validaciones Usuario =======================
        System.out.println("(obligatorio) Ingresar nombre: ");
        while (true) {
            profesional.setNombre(sc.nextLine().trim());
            if (profesional.getNombre().length() < 10 || profesional.getNombre().length() > 50) {
                System.err.println("Error, ingresar nombre de 10 a 50 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar primer apellido: ");
        while (true) {
            profesional.setApellido1(sc.nextLine().trim());
            if (profesional.getApellido1().length() < 5 || profesional.getApellido1().length() > 30) {
                System.err.println("Error, ingresar apellido de 5 a 30 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar segundo apellido: ");
        while (true) {
            profesional.setApellido2(sc.nextLine().trim());
            if (profesional.getApellido2().length() < 5 || profesional.getApellido2().length() > 30) {
                System.err.println("Error, ingresar apellido de 5 a 30 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar fecha de nacimiento con formato dd/MM/yyyy: ");
        while (true) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            try {
                profesional.setFechaNacimiento(df.format(df.parse(sc.next())));
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
                profesional.setRun(runIngresado);
                break;
            } else {
                System.err.println("El RUN ingresado no cumple con el formato requerido.");
            }
        }
        sc.nextLine(); // Consumir el salto de línea

        // ======================= Validaciones Profesional =======================
        System.out.println("(obligatorio) Ingresar título profesional: ");
        while (true) {
            profesional.setTitulo(sc.nextLine().trim());
            if (profesional.getTitulo().length() > 70) {
                System.err.println("Error, ingresar título profesional de máximo 70 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(opcional) Ingresar fecha de ingreso con formato dd/MM/yyyy: ");
        while (true) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String input = sc.next();

            if (input.isBlank()) {
                break;
            }

            try {
                df.parse(input);
                profesional.setFechaIngreso(input);
                break;
            } catch (ParseException e) {
                System.err.println("La fecha tiene un formato incorrecto");
                System.err.println("El formato debe ser dd/MM/yyyy");
            }
        }
        return profesional;
    }
}
