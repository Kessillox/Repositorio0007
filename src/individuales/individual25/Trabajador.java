package individuales.individual25;

public class Trabajador {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String run;
    private String telefono;
    private int edad;


    //Constructor vacío
    public Trabajador() {

    }

    //Constructor con atributos
    public Trabajador(String nombre, String apellido1, String apellido2, String run, String telefono,
                      int edad) {
        super();
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    //Getters y setters
    public String getNombre1() {
        return nombre;
    }

    public void setNombre1(String nombre1) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Método nombreCompleto concatena los nombres y apellidos
    public String nombreCompleto() {
        return "Usuario [nombre=" + nombre +  apellido1 + apellido2;
    }



    //Método decomponerRun transforma el run a entero, elimina el guión y el digito verificador
    public int descomponerRun() {
        // Obtener la parte del RUN antes del guion
        String[] partes = run.split("-");
        String runSinGuion = partes[0];

        // Convertir el número de RUN a entero
        int runEntero = Integer.parseInt(runSinGuion);

        return runEntero;
    }

    @Override
    public String toString() {
        return "Trabajador [run=" + run + ", telefono=" + telefono + ", edad=" + edad + ", nombreCompleto()="
                + nombreCompleto() + ", descomponerRun()=" + descomponerRun() + "]";
    }
}
