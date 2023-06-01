package trabajador;

/**
 * @author nehemiasmunoz
 */
public class Trabajador {
    // atributos
    String nombres;
    String apellidos;
    String run;
    int edad;

    /**
     * Constructor vacio
     */
    public Trabajador() {
    }

    /**
     * Constructor de la clase con parametros
     * 
     * @param nombres
     * @param apellidos
     * @param run
     * @param edad
     */
    public Trabajador(String nombres, String apellidos, String run, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.edad = edad;
    }

    /**
     * Metodo que devuelve los parametros y sus valores
     */
    @Override
    public String toString() {
        return "Trabajador [nombres=" + nombres + ", apellidos=" + apellidos + ", run=" + run + ", edad=" + edad + "]";
    }

    /**
     * Metodo que retorna el nombre completo
     * 
     * @return nombres y apellidos concatenados
     */
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    /**
     * Metodo que devuelve rut sin digito verificador
     * 
     * @return metodo que entrega la primera parte del rut
     */
    public int descomponerRun() {
        String[] runStrings = run.split("-");
        int[] runInt = new int[2];
        runInt[0] = Integer.parseInt(runStrings[0]);
        runInt[1] = Integer.parseInt(runStrings[1]);
        return runInt[0];
    }

}