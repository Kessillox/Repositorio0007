package cl.bootcamp.empresa.controllers;

import cl.bootcamp.empresa.interfaces.IAsesoria;
import cl.bootcamp.empresa.models.Cliente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AlmacenarClienteController {

    Scanner sc = new Scanner(System.in);
    Cliente cliente = new Cliente();

    public Cliente almacenarClienteController() {

        // ======================= Validaciones Usuario =======================
        System.out.println("(obligatorio) Ingresar nombre: ");
        while (true) {
            cliente.setNombre(sc.nextLine().trim());
            if (cliente.getNombre().length() < 10 || cliente.getNombre().length() > 50) {
                System.out.println("Error, ingresar nombre de 10 a 50 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar primer apellido: ");
        while (true) {
            cliente.setApellido1(sc.nextLine().trim());
            if (cliente.getApellido1().length() < 5 || cliente.getApellido1().length() > 30) {
                System.out.println("Error, ingresar apellido de 5 a 30 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar segundo apellido: ");
        while (true) {
            cliente.setApellido2(sc.nextLine().trim());
            if (cliente.getApellido2().length() < 5 || cliente.getApellido2().length() > 30) {
                System.out.println("Error, ingresar apellido de 5 a 30 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar fecha de nacimiento con formato dd/MM/yyyy: ");

        while (true) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            try {
                cliente.setFechaNacimiento(df.format(df.parse(sc.next())));
                break;
            } catch (ParseException e) {
                System.err.println("La fecha tiene un formato incorrecto");
                System.err.println("El formato debe ser dd/MM/yyyy");
            }
        }

        System.out.println("(obligatorio) Ingresar run con el formato 00000000-k: ");
        while (true) {
            String runIngresado = sc.next();

            if (runIngresado.matches("\\d{8}-[\\d|kK]")) {
                cliente.setRun(runIngresado);
                break;
            } else {
                System.err.println("El RUT ingresado no cumple con el formato requerido.");
            }
        }

        // ======================= Validaciones Cliente =======================
        System.out.println("(obligatorio) Ingresar nombre de la Empresa: ");
        while (true) {
            cliente.setNombre(sc.nextLine().trim());
            if (cliente.getNombre().length() < 5 || cliente.getNombre().length() > 30) {
                System.out.println("Error, ingresar nombre Empresa entre 5 y 30 caracteres");
            } else {
                break;
            }
        }



        System.out.println(cliente);

        return cliente;

    }

}
