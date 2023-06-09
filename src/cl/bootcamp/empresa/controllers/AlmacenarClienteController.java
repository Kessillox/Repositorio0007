package cl.bootcamp.empresa.controllers;

import cl.bootcamp.empresa.models.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

        System.out.println("(obligatorio) Ingresar RUN con el formato 00000000-k: ");
        while (true) {
            String runIngresado = sc.next();

            if (runIngresado.matches("\\d{8}-[\\d|kK]")) {
                cliente.setRun(runIngresado);
                break;
            } else {
                System.err.println("El RUN ingresado no cumple con el formato requerido.");
            }
        }
        sc.nextLine(); // Consumir el salto de línea

        // ======================= Validaciones Cliente =======================
        System.out.println("(obligatorio) Ingresar nombre de la Empresa: ");
        while (true) {
            cliente.setNombreEmpresa(sc.nextLine().trim());
            if (cliente.getNombreEmpresa().length() < 5 || cliente.getNombreEmpresa().length() > 30) {
                System.out.println("Error, ingresar nombre Empresa entre 5 y 30 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar giro de la Empresa: ");
        while (true) {
            cliente.setGiroEmpresa(sc.nextLine().trim());
            if (cliente.getGiroEmpresa().length() < 5 || cliente.getGiroEmpresa().length() > 30) {
                System.out.println("Error, ingresar giro de la empresa entre 5 y 30 caracteres");
            } else {
                break;
            }
        }

        System.out.println("(obligatorio) Ingresar RUT empresa con el formato 00000000-k: ");
        while (true) {
            String rutIngresado = sc.next();

            if (rutIngresado.matches("\\d{8}-[\\d|kK]")) {
                cliente.setRut(rutIngresado);
                break;
            } else {
                System.err.println("El RUT empresa ingresado no cumple con el formato requerido.");
            }
        }
        sc.nextLine(); // Consumir el salto de línea

        System.out.println("(obligatorio) Ingresar número de teléfono: ");
        while (true) {
            cliente.setTelefonoRepresentante(sc.nextLine().trim());
            if (cliente.getTelefonoRepresentante().isBlank()) {
                System.out.println("Error, el teléfono es obligatorio");
            } else {
                break;
            }
        }

        System.out.println("(opcional) Ingresar dirección de la empresa menor a 70 caracteres: ");
        while (true) {
            cliente.setDireccionEmpresa(sc.nextLine());
            if (cliente.getDireccionEmpresa().length() > 70) {
                System.out.println("Error, la dirección debe ser menor a 70 caracteres");
                continue;
            } else {
                break;
            }
        }

        System.out.println("Ingresar comuna de la empresa: ");
        while (true) {
            cliente.setComunaEmpresa(sc.nextLine());
            if (cliente.getComunaEmpresa().length() > 70) {
                System.out.println("Error, la comuna debe ser menor a 70 caracteres");
                continue;
            } else {
                break;
            }
        }

        return cliente;

    }

}
