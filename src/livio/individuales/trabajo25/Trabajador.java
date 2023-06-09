package livio.individuales.trabajo25;

public class Trabajador {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String run;
    private int telefono;
    private int edad;

    //Contructores
    public Trabajador() {

    }

    public Trabajador(String nombre, String apellido1, String apellido2, String run, int telefono, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getRun() {
        return run;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    ;

    public void setRun(String run) {
        this.run = run;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String nombreCompleto() {

        return nombre + "" + apellido1 + "" + apellido2;
    }


    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", run='" + run + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                '}';
    }

    public int descomponerRun(){

        /**replace reemplaza l que no necesito y se coloca en los corchetes (lo que no necesito), luego con el replacement
         * que se coloca entre "" se coloca lo que quiero que aparezca.
         */
        String soloRun = run.replaceAll("[.-]", "");
        String runAnterior = soloRun.substring(0, soloRun.length() - 1);
        return Integer.parseInt(runAnterior);
    }
}
