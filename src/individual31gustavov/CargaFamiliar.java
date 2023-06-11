package individual31gustavov;

import java.util.Scanner;

/**
 * Individual 27: Crear una clase CargaFamiliar creando algunos metodos.
 *
 * @author Gustavo Vargas
 * @version 1.0
 */
public class CargaFamiliar {
    private String runCarga;
    private String nombres;
    private String apellidos;
    private String runFamiliar;
    private int parentesco;
    private int edad;

    // Constructor vacío
    public CargaFamiliar() {
    }

    /**
     * Constructor con parámetros
     *
     * @param nombres
     * @param apellidos
     * @param "Run       del" trabajador
     * @param parentesco
     * @param edad
     */
    public CargaFamiliar(String runCarga, String nombres, String apellidos, Trabajador trabajador, int parentesco, int edad) {
        this.runCarga = runCarga;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.runFamiliar = trabajador.getRun();
        this.parentesco = parentesco;
        this.edad = edad;
    }

    // Métodos Get y Set de los parámetros
    public String getRunCarga() {
        return runCarga;
    }

    public void setRunCarga(String runCarga) {
        this.runCarga = runCarga;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRunFamiliar() {
        return runFamiliar;
    }

    public void setRunFamiliar(String runFamiliar) {
        this.runFamiliar = runFamiliar;
    }

    public int getParentesco() {
        return parentesco;
    }

    public void setParentesco(int parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "CargaFamiliar{" +
                "\n runCarga= '" + runCarga + "'," +
                "\n nombres= '" + nombres + "'," +
                "\n apellidos= '" + apellidos + "'," +
                "\n runFamiliar= '" + runFamiliar + "'," +
                "\n parentesco= " + parentesco + "," +
                "\n edad= " + edad + "," +
                "\n}";
    }

    public int ingresarParentesco() {

        Scanner scanner = new Scanner(System.in);

        int parentesco = 0;

        System.out.println("Ingrese el parentesco de la carga familiar:");
        System.out.println("1. Cónyuge");
        System.out.println("2. Hijo/a");
        System.out.println("3. Otro");

        do {
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Realizar salto de línea después de la opción

            switch (opcion) {
                case 1:
                    parentesco = 1; //"Cónyuge"
                    break;
                case 2:
                    parentesco = 2; //"Hijo/a"
                    break;
                case 3:
                    parentesco = 3; //"Otro"
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (parentesco == 0);

        // Asignar el valor del parentesco a la variable de instancia
        this.parentesco = parentesco;
        return parentesco;
    }
}
