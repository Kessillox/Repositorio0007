package individual25;

public class Trabajador {
    String nombre;
    String apellido;
    String run;
    String telefono;
    int edad;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String run, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.telefono = telefono;
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
}
