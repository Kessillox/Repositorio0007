package Individual31;

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

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
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

    public void mostrarDatos(){
        System.out.println("El telefono del trabajador es: "+this.getTelefono()+" Y su edad es: "+
                this.getEdad());
    }


}
