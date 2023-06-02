package Trabajos.individuales;

import java.util.Arrays;

/**
 * @author Manuel Pinot
 */
public class Trabajador {

        private String nombres;
        private String apellidos;
        private String run;
        private int telefono;
        private int edad;

        //Constructor vacio
        public Trabajador() {
        }

    /**
     * Constructor con atributos
     * @param nombres
     * @param apellidos
     * @param run
     * @param telefono
     * @param edad
     */
    public Trabajador(String nombres, String apellidos, int run, int telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = String.valueOf(run);
        this.telefono = telefono;
        this.edad = edad;
    }


    // Método para obtener el nombre completo del trabajador
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    // Método para descomponer el RUN y obtener el número antes del guion y dígito verificador
    public int descomponerRun() {
        int guionIndex = run.indexOf("-");
        String[] numeroRun = run.split("-");
        return Integer.parseInt(Arrays.toString(numeroRun));
    }



    // Método toString() para representar el objeto en forma de cadena @Override
    @Override
    public String toString() {
        return "Individual25{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }
}

