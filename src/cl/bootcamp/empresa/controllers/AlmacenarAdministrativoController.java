package cl.bootcamp.empresa.controllers;

import cl.bootcamp.empresa.models.Administrativo;
import cl.bootcamp.empresa.models.Profesional;

import java.util.Scanner;

public class AlmacenarAdministrativoController {

    Scanner sc = new Scanner(System.in);

    Administrativo administrativo = new Administrativo();

    public Administrativo almacenarAdministrativoController(){

        // ======================= Validaciones Profesional =======================
        System.out.println("(obligatorio) Ingresar área: ");
        while (true) {
            administrativo.setNombre(sc.nextLine().trim());
            if (administrativo.getNombre().length() < 5 || administrativo.getNombre().length() > 20) {
                System.out.println("Error, ingresar experencia previa entre 5 y 20 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar experiencia previa: ");
        while (true) {
            administrativo.setNombre(sc.nextLine().trim());
            if (administrativo.getNombre().length() > 100) {
                System.out.println("Error, ingresar título profesional máximo 100 caracteres");
            } else {
                break;
            }
        }

        System.out.println(administrativo);

        return administrativo;
    }
}