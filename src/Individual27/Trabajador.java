package Individual27;

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

    public String nombreCompleto(){
        String nombreCompleto ;
        nombreCompleto = this.nombre+" "+this.apellido;
        return nombreCompleto;
    }

    public Integer descomponerRun(){
        int x =0, numTotal;
        String numConcatenado="";
        while (this.run.charAt(x)!='-'){

            if(Character.isDigit(this.run.charAt(x))){
                //numConcatenado = ""+this.run.charAt(x) o numConcatenado +=this.run.charAt(x)
                numConcatenado += String.valueOf(this.run.charAt(x));

            }
            x++;
        }
        numTotal= Integer.parseInt(numConcatenado);
        return numTotal;
    }
}
