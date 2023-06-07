package individualesvalentin.TG27;

public class Trabajador {
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String run;
    private int telefono;
    private int edad;

    public Trabajador() {
    }

    public Trabajador(String nombre1, String nombre2, String apellido1, String apellido2, String run, int telefono, int edad) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre1='" + nombre1 + '\'' +
                ", nombre2='" + nombre2 + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", run='" + run + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                '}';
    }

    public void nombreCompleto(){
        System.out.printf("Nombre completo: %s %s %s %s.%n", nombre1, nombre2, apellido1,apellido2);
    }

    public void descomponerRut(){
        String cadena= "";
        if (run.contains("-")){
            for (int i = 0; i < run.indexOf("-"); i++) {
                cadena += run.charAt(i);
            }
        }
        if (!cadena.isBlank()){
            int rut = Integer.parseInt(cadena);
            System.out.println("Rut int: " + rut);
        }


    }
}
