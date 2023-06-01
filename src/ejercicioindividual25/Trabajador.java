package ejercicioindividual25;

public class Trabajador {

    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;

    public Trabajador() {
    }

    public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String nombreCompleto() {

        return nombres + apellidos;
    }

    public int descomponerRun(){

        String runSinFormato = run.replaceAll("[.-]", "");
        String numeroStr = runSinFormato.substring(0, runSinFormato.length() - 1);
        return Integer.parseInt(numeroStr);
    }
}
