package individual31gustavov;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Trabajador
        Trabajador trabajador = new Trabajador("Marcelo", "Vargas Pérez", "13456789-6",
                "123456789", 40);
        System.out.println();

        // Probar los métodos de la clase Trabajador
        System.out.println("Nombre completo: " + trabajador.nombreCompleto());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("RUN descompuesto: " + trabajador.descomponerRun());
        System.out.println();

        // Modificar algunos atributos utilizando los métodos set
        trabajador.setNombres("Gustavo");
        trabajador.setEdad(45);

        // Mostrar la representación en cadena del objeto utilizando el método toString
        System.out.println(trabajador.toString());
        System.out.println();

        // Ingreso del parentesco de la carga familiar
        CargaFamiliar carga = new CargaFamiliar();
        int parentesco = carga.ingresarParentesco();

        // Crear una instancia de CargaFamiliar utilizando los datos ingresados
        CargaFamiliar carga1 = new CargaFamiliar("25123456-7", "Catalina", "Vargas Barde",
                trabajador, parentesco, 4);
        System.out.println();

        // Mostrar los datos de la carga familiar
        System.out.println("Datos de la " + carga1.toString());
    }
}
