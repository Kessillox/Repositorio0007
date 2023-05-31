package grupal.grupal12.dia9;
import java.util.Scanner;

/**
 * Clase Grupal9 que recopila información sobre una empresa, capacitaciones asistentes dichas capacitaciones
 * y muestra los datos ingresados a traves de la consola.
 * @author Cintia Muñoz, Joaquín Baeza, Hans Schiess, Oscar Fernández
 * @version 1.0
 * @see grupal.grupal12.dia9
 *
 */
public class Grupal9 {

    /**
     * Método principal que ejecuta el programa.
     *
     */
    public static void main(String[] args) {
/**
 * Crea una nueva instancia de Scanner para leer información entragada por del usuario.
 */
        Scanner leer = new Scanner(System.in);

        /**
         * Se capturan y validan distintos datos de la empresa solicitados al usuario.
         * Los datos a capturar son: ID de la empresa, RUT de empresa, nombre de la empresa, dirección,
         * teléfono, nombre y run del representante de la empresa.
         * Información sobre la capacitación tales cómo día, hora, lugar, duración y cantidad de asistentes.
         * Nombre y edad de los asistentes a las capacitaciones.
         *
         */

        //Datos de la empresa y su respectiva validación
        //ID empresa
        int id;
        while (true) {
            System.out.println("Ingrese ID de la empresa");
            String input = leer.nextLine();
            if (!input.isEmpty()) {
                if (input.matches("\\d+")) {
                    id = Integer.parseInt(input);
                    break;
                } else {
                    System.out.println("Debe ingresar un valor numérico entero para el ID");
                }
            } else {
                System.out.println("El ID no puede estar en blanco");
            }
        }


        //Rut empresa
        String rut;
        do {
            System.out.println("Ingrese RUT de la empresa (EJEMPLO: 77555444-3)");
            rut = leer.nextLine();
            if (rut.isEmpty()) {
                System.out.println("El RUT no puede estar vacío");
            }
        } while (rut.isEmpty());


        // Nombre empresa
        String nombreEmpresa;
        System.out.println("Ingrese nombre de la empresa");
        nombreEmpresa = leer.nextLine();

        while (true) {
            if (!nombreEmpresa.isEmpty()) {
                break;
            } else {
                System.out.println("El nombre de la empresa no puede estar vacío");
                System.out.println("Ingrese nombre de la empresa nuevamente");
                nombreEmpresa = leer.nextLine();
            }
        }

        // Dirección
        String direccion;
        while (true) {
            System.out.println("Ingrese dirección de la empresa");
            direccion = leer.nextLine();
            if (!direccion.isEmpty()) {
                break;
            } else {
                System.out.println("La dirección no puede estar vacía");
            }
        }


        // Teléfono
        Long telefono;
        while (true) {
            System.out.println("Ingrese teléfono de contacto (EJEMPLO: 56954313978)");
            String input = leer.nextLine();
            //telefono = leer.nextLong();

            if (input.isEmpty()) {
                System.out.println("El teléfono no puede estar en blanco");
                // Vuelve al inicio del bucle sin avanzar
            }

            if (input.matches("\\d+")) {
                telefono = Long.parseLong(input);
                break; // Sale del bucle si se ingresa un número válido
            } else {
                System.out.println("Debe ingresar un valor numérico entero para el teléfono");
            }
        }


        // Nombre de usuario
        String nombreUsuario;

        while (true) {
            System.out.println("Ingrese nombre del usuario");
            nombreUsuario = leer.nextLine();

            if (!nombreUsuario.isEmpty()) {
                break;
            } else {
                System.out.println("El nombre no puede estar vacío");
            }
        }


        // RUN
        String run;
        System.out.println("Ingrese Run del usuario (Ejemplo: 15333444-1)");
        while (true) {
            run = leer.nextLine();
            if (!run.isEmpty()) {
                break;
            } else {
                System.out.println("El Run no puede estar vacío");
            }
        }


        // Día de la capacitación
        String dia;
        while (true) {
            System.out.println("Ingrese día que se realizará la capacitación(EJEMPLO: Lunes 22)");
            dia = leer.nextLine();
            if (!dia.isEmpty()) {
                break;
            } else {
                System.out.println("El día no puede estar vacío");
            }
        }


        //Hora de la capacitación
        String hora;
        while (true) {
            System.out.println("Ingrese hora de la capacitación (EJEMPLO: 09:00)");
            hora = leer.nextLine();
            if (!hora.isEmpty()) {
                break;
            } else {
                System.out.println("La hora no puede estar vacía");
            }
        }

        //Lugar de la capacitación
        String lugar;
        while (true) {
            System.out.println("Ingrese lugar dónde se realizará la capacitación");
            lugar = leer.nextLine();
            if (!lugar.isEmpty()) {
                break;
            } else {
                System.out.println("El lugar no puede estar vacío");
            }
        }

        //Tiempo que durará la capacitación
        String duracion;
        while (true) {
            System.out.println("Ingrese duración de la capacitación (EJEMPLO: 1 hora)");
            duracion = leer.nextLine();
            if (!duracion.isEmpty()) {
                break;
            } else {
                System.out.println("La duración no puede estar vacía");
            }
        }

        //Cantidad de asistentes
        int asistentes;
        System.out.println("Ingrese número de asistentes a la capacitación");
        while (true) {
            String input = leer.nextLine();
            if (!input.isEmpty()) {
                if (input.matches("\\d+")) {
                    asistentes = Integer.parseInt(input);
                    if (asistentes > 0) {
                        break;
                    } else {
                        System.out.println("Debe ingresar un número de asistentes válido (mayor a 0)");
                    }
                } else {
                    System.out.println("Debe ingresar un número de asistentes válido");
                }
            } else {
                System.out.println("El campo no puede estar vacío");
            }
        }

        //Datos de los asistentes
        int[] edadAsistentes = new int[asistentes]; //Arreglo para guardar las edades de los asistentes
        if (asistentes > 0) {
            for (int i = 0; i < asistentes; i++) {
                System.out.println("Ingrese nombre de asistente");
                String nombreAsistente = leer.nextLine();
                while (nombreAsistente.isEmpty()) {
                    System.out.println("Debe ingresar un nombre, no puede quedar vacío");
                    nombreAsistente = leer.nextLine();
                }

                System.out.println("Ingrese edad del asistente " +nombreAsistente);
                String edadInput = leer.nextLine();
                while (edadInput.isEmpty() || !edadInput.matches("\\d+")) {
                    System.out.println("Debe ingresar una edad válida, es decir número y no puede estar vacío");
                    edadInput = leer.nextLine();
                }
                edadAsistentes[i] = Integer.parseInt(edadInput);
            }
        } else {
            System.out.println("Debe ingresar un número de asistentes válido");
            System.exit(0);
        }

        /**
         * Se clasifican los asistentes según el rango etareo al cual corresponden y se contabiliza
         * cuantos asistentes hay según rango etareo
         */


        //Cantidad de asistentes por rango etareo
        int menores25 = 0;
        int entre26y35 = 0;
        int mayores35 = 0;
        for (int i = 0; i < edadAsistentes.length; i++) {
            if (edadAsistentes[i] < 25) {
                menores25++;
            } else if (edadAsistentes[i] > 25 && edadAsistentes[i] < 35) {
                entre26y35++;
            } else {
                mayores35++;
            }
        }

        /**
         * Se imprime por consola la información obtenida
         */

        //Mostrar datos
        System.out.println("============================================");
        System.out.println("Los datos de la empresa son los siguientes: ");
        System.out.println("ID empresa "+ id + "; Nombre de la empresa: " + nombreEmpresa + "; Dirección: " + direccion + "; Teléfono: " + telefono);
        System.out.println("........................");
        System.out.println("Los datos de usuario de la empresa son: ");
        System.out.println("Nombre usuario: " + nombreUsuario + "; Run usuario: " + run);
        System.out.println("........................");
        System.out.println("Los datos de la capacitacion son: ");
        System.out.println("Día de capacitación: " + dia + "; Hora: " + hora + "; Lugar: " + lugar + "; Duración: " + duracion + "; Cantidad de asistentes: " + asistentes);
        System.out.println("........................");
        System.out.println("Cantidad de asistentes por rango etario");
        System.out.println("La cantidad de asistentes menores de 25: "+menores25);
        System.out.println("La cantidad de asistentes entre 26 y 35: "+entre26y35);
        System.out.println("La cantidad de asistentes mayores de 35: "+mayores35);
        leer.close();
    }
}
