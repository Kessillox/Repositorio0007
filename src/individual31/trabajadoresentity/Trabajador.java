package individual31.trabajadoresentity;

public class Trabajador {
    private String nombre;
    private String apellido;
    private String run;
    private String telefono;
    private int edad;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String run, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String nombreCompleto(){
        String nombreCompleto = this.nombre + " " + this.apellido;
        return nombreCompleto;
    }
    @Override
    public String toString() {
        return "trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }
    public String descomponerRun() {
        String numerosRun = "";

        for (int i = 0; i < run.length(); i++) {
            char caracter = run.charAt(i);

            if(caracter == '-'){
                break; //el bucle se detiene al encontrar el guión
            }
            if (Character.isDigit(caracter)) {  //isDigit para ignorar puntos
                numerosRun += caracter;
            }
        }

        return numerosRun;
    }
    public void mostrarDatos(){
        System.out.println("telefono: "+ this.getTelefono() + " edad:" + this.getEdad());
    }
}
