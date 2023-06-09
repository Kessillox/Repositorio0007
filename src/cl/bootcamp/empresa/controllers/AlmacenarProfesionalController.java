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

        // ======================= Validaciones Profesional =======================
        System.out.println("(obligatorio) Ingresar título profesional: ");
        while (true) {
            profesional.setTitulo(sc.nextLine().trim());
            if (profesional.getTitulo().length() > 70) {
                System.out.println("Error, ingresar título profesional de máximo 70 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar fecha de ingreso con formato dd/MM/yyyy: ");
        while (true) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            try {
                profesional.setFechaIngreso(df.format(df.parse(sc.next())));
                break;
            } catch (ParseException e) {
                System.err.println("La fecha tiene un formato incorrecto");
                System.err.println("El formato debe ser dd/MM/yyyy");
            }
        }

        return profesional;
    }
}
