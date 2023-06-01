    package grupal.grupal12.dia10;

    import java.util.Scanner;
    import java.util.Arrays;

    /**
    * Clase que contiene un programa de registro de empresas y capacitaciones.
    * Permite registrar datos de la empresa, así como también realizar registros
    * de capacitaciones.
    * @author Oscar Fernandez,Cintia Muñoz, Joaquin Baeza, Hans Schiess
    * @version 1.0
    * @see grupal.grupal12.dia10
    */
    class Grupal10 {
    /**
     * Método principal que ejecuta el programa.
     * Muestra un menú de opciones y solicita al usuario ingresar una opción.
     * Dependiendo de la opción seleccionada, llama a los métodos correspondientes.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Registrar empresa");
            System.out.println("2. Registrar capacitación");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    datosEmpresa();
                    break;
                case 2:
                    capacitaciones();
                    break;
                case 0:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);
    }


    /**
     * Método para registrar los datos de una empresa.
     * Solicita al usuario ingresar los datos de la empresa, como el ID, el RUT, el nombre, la dirección, etc.
     * Valida que los datos ingresados sean correctos y muestra los datos registrados.
     */
    public static void datosEmpresa() {
        Scanner leer = new Scanner(System.in);
        // Datos de la empresa y su respectiva validación

        //ID empresa: recibe un dato de tipo entero, se valida que no se ingrese vacío
        //y que sólo se ingresen datos de tipo numérico
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

        //Rut empresa: es un dato de tipo string con la validación para que no se ingrese el campo vacio
        String rut;
        do {
            System.out.println("Ingrese RUT de la empresa (EJEMPLO: 77555444-3)");
            rut = leer.nextLine();
            if (rut.isEmpty()) {
                System.out.println("El RUT no puede estar vacío");
            }
        } while (rut.isEmpty());

        // Nombre empresa: es string y se valida que no se ingrese el campo vacío
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

        // Dirección: se recibe un dato tipo string y se valida que no ingrese vacío
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

        // Teléfono: dato tipo long, se valida que sólo se ingrese un número
        // y que el campo no quede vacío
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

        // RUN: variable tipo string, con la validación que no se ingrese vacío
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

        // Mostrar datos por consola
        System.out.println("============================================");
        System.out.println("Los datos de la empresa son los siguientes: ");
        System.out.println("ID empresa " + id + "; Nombre de la empresa: " + nombreEmpresa + "; Dirección: " + direccion
                + "; Teléfono: " + telefono);
        System.out.println("........................");
        System.out.println("Los datos de usuario de la empresa son: ");
        System.out.println("Nombre usuario: " + nombreUsuario + "; Run usuario: " + run);


    }

    /**
     * Método para registrar una capacitación.
     * Solicita al usuario ingresar los datos de la capacitación, como el día, la hora, el lugar, etc.
     * Registra los datos de los asistentes y muestra estadísticas sobre la capacitación, como el promedio de calificaciones.
     */

    public static void capacitaciones() {

        Scanner leer = new Scanner(System.in);
        // Día de la capacitación: variable tipo string, con su respectiva validación
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

        //Hora de la capacitación: variable tipo string, con su respectiva validación para que
        //no se ingrese un campo vacío
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

        //Lugar de la capacitación: variable tipo string, con su respectiva validación
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

        //Tiempo que durará la capacitación: variable tipo string, con su respectiva validación
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

        //Cantidad de asistentes: variable tipo entero. Se valida que no se ingrese el campo vacío,
        //que el valor ingresado sea mayor a cero y que sólo se ingresen números
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

        // Arreglos
        float promedio[] = new float[asistentes]; //Arreglo de decimales
        int[] minMax = new int[asistentes]; // Arreglo para obtener calificación mayor y menor
        int[] edadAsistentes = new int[asistentes]; // Arreglo para guardar las edades de los asistentes
        String[][] calificaciones = new String[asistentes][2];

        // Datos de los asistentes
        if (asistentes > 0) {
            for (int i = 0; i < asistentes; i++) {

                // Nombre de asistente
                System.out.println("Ingrese nombre de asistente");
                String nombreAsistente = leer.nextLine();
                while (nombreAsistente.isEmpty()) {
                    System.out.println("Debe ingresar un nombre, no puede quedar vacío");
                    nombreAsistente = leer.nextLine();
                }

    /**
    * Los asistentes califican la capacitación, se obtiene
    * la nota mínima y la nota máxima
    */
                // Calificación de la capacitación
                System.out.println("Ingrese calificacion de la capacitacion");
                String notaAsistente = leer.nextLine();
                while (notaAsistente.isEmpty() || !notaAsistente.matches("[1-7]")) {
                    System.out.println("debe ingresar una nota entre 1 y 7");
                    notaAsistente = leer.nextLine();
                }
                calificaciones[i][0] = nombreAsistente;
                calificaciones[i][1] = notaAsistente;

                float decimal = Float.parseFloat(notaAsistente); // Transformar calificación a decimal
                promedio[i] = decimal;

                minMax[i] = Integer.parseInt(notaAsistente); // Transformar capacitación a entero

                // Edad del asistente
                System.out.println("Ingrese edad del asistente " + nombreAsistente);
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

        // Cantidad de asistentes por rango etareo
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


        System.out.println("........................");
        System.out.println("Los datos de la capacitacion son: ");
        System.out.println("Día de capacitación: " + dia + "; Hora: " + hora + "; Lugar: " + lugar + "; Duración: "
                + duracion + "; Cantidad de asistentes: " + asistentes);
        System.out.println("........................");
        System.out.println("Cantidad de asistentes por rango etario");
        System.out.println("La cantidad de asistentes menores de 25: " + menores25);
        System.out.println("La cantidad de asistentes entre 26 y 35: " + entre26y35);
        System.out.println("La cantidad de asistentes mayores de 35: " + mayores35);

        // Mostrar matríz de nombre y calificación
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(" el nombre: " + calificaciones[i][0] + " y la nota es: " + calificaciones[i][1]);
        }
        float prom = 0;
        float acum = 0;
        for (int i = 0; i < promedio.length; i++) {
            acum += promedio[i];
        }

        /**
         * Se calcula el promedio de la capacitación de acuerdo a las notas ingresadas por los asistentes
         */

        // Calcular promedio
        prom = acum / promedio.length;
        float promDecimal = Math.round(prom * 10.0f) / 10.0f; //Que permita un sólo decimal

        // Obtener la calificación mayor y menor
        int maximo = Arrays.stream(minMax).max().getAsInt();
        int minimo = Arrays.stream(minMax).min().getAsInt();
        System.out.println(".............................");
        System.out.println("El promedio del curso es :" + promDecimal);
        System.out.println(".............................");
        System.out.println("La mayor calificación es: " + maximo);
        System.out.println("La menor calificación es: " + minimo);
    }

}
