package cl.bootcamp.empresa.controllers;

import cl.bootcamp.empresa.models.Capacitacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AlmacenarCapacitacionController {

    Scanner sc = new Scanner(System.in);
    Capacitacion capacitacion = new Capacitacion();

    public Capacitacion almacenarCapacitacionController() {

        System.out.println("(obligatorio) Ingresar id de la capacitación: ");
        while (true) {
            try {
                capacitacion.setId(sc.nextInt());
                if (capacitacion.getId() < 1) {
                    System.err.println("Ingresar un id mayor a 0");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Error, debe ingresar un valor numérico");
                sc.nextLine(); // Consumir el token inválido (String)
            }
        }

        System.out.println("(obligatorio) Ingresar RUT empresa con el formato 00000000-k: ");
        while (true) {
            String rutIngresado = sc.next();

            if (rutIngresado.matches("\\d{8}-[\\d|kK]")) {
                capacitacion.setRutEmpresa(rutIngresado);
                break;
            } else {
                System.err.println("El RUT empresa ingresado no cumple con el formato requerido.");
            }
        }
        sc.nextLine(); // Consumir el salto de línea

        System.out.println("(opcional) Ingresar día en este formato: lunes, martes, miércoles, jueves, viernes, sábado o domingo");
        while (true) {
            capacitacion.setDia(sc.nextLine());
            if (capacitacion.getDia().isBlank()) break;
            if (!capacitacion.getDia().matches("lunes|martes|miércoles|jueves|viernes|sábado|domingo") ) {
                System.err.println("Error, debe cumplir con el formato");
                continue;
            } else {
                break;
            }
        }

        System.out.println("(opcional) Ingresar hora con este formato HH:MM = 00:00");
        while (true) {
            SimpleDateFormat df = new SimpleDateFormat("HH:mm");
            df.setLenient(false);
            try {
                String hora = sc.nextLine().trim();
                if (hora.isBlank()) break;
                capacitacion.setHora(df.format(df.parse(hora)));
                break;
            } catch (ParseException e) {
                System.err.println("La hora tiene un formato incorrecto");
                System.err.println("El formato debe ser HH:MM = 00:00");
            }
        }

        System.out.println("(obligatorio) Ingresar lugar: ");
        while (true) {
            capacitacion.setLugar(sc.nextLine().trim());
            if (capacitacion.getLugar().length() < 10 || capacitacion.getLugar().length() > 50) {
                System.err.println("Error, ingresar lugar debe contener entre 10 a 50 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(opcional) Ingresar duración: ");
        while (true) {
            capacitacion.setDuracion(sc.nextLine());
            if (capacitacion.getDuracion().length() > 70) {
                System.err.println("Error, la duración debe ser menor a 70 caracteres");
                continue;
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar cantidad de asistentes: ");
        while (true) {
            try {
                capacitacion.setCantidadAsistentes(sc.nextInt());
                if (capacitacion.getCantidadAsistentes() > 1000) {
                    System.err.println("Error, la cantidad de asistentes no pueden pasar los 1000 asistentes");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Error, debe ingresar un valor numérico");
                sc.nextLine(); // Consumir el token inválido (String)
            }
        }

        return capacitacion;
    }
}
