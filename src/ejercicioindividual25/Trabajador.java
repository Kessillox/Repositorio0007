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

//Pruebas en caso de tener un Main

/*
* Trabajador luis = new Trabajador(
                "Luis Alejandro\u0020",
                "Zambrano Salazar",
                "18.685.014-9",
                "+56998428164",
                28
        );

        System.out.println(luis.nombreCompleto());
        System.out.println(luis.descomponerRun());
* */