package individual25gustavov;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Trabajador
        Trabajador trabajador = new Trabajador("Marcelo", "Vargas Pérez", "12345678-9",
                "123456789", 40);

        // Probar los métodos de la clase Trabajador
        System.out.println("Nombre completo: " + trabajador.nombreCompleto());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("RUN descompuesto: " + trabajador.descomponerRun());

        // Modificar algunos atributos utilizando los métodos set
        trabajador.setNombres("Gustavo");
        trabajador.setEdad(45);

        // Mostrar la representación en cadena del objeto utilizando el método toString
        System.out.println(trabajador.toString());
    }
}
