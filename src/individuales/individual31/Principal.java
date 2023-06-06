package individuales.individual31;

//Cintia Muñoz Valdés

public class Principal {
    public static void main(String[] args) {

        //Crear instancia de cada tipo de trabajador
    Contratado contra1 = new Contratado("Juan", "perez", "perez", "16542456-1","953456789" ,33, new CargaFamiliar("165432345", "carga", "carga1", "carga2", "16542456-1", 1, 18), "16/07/2023", "1000000" );
    Honorario honor1 = new Honorario("transporte", "08/05/2006");
    Eventual even1 = new Eventual("inmediata", "eventual@gmail.com");


        //Imprimir info de Contratado sobreescribiendo el método mostrarDatos de la clase Trabajador
        contra1.mostrarDatos();

        //Imprimir info de Honorario sobreescribiendo el método mostrarDatos de la clase Trabajador
        System.out.println("..........");
        honor1.mostrarDatos();

        ////Imprimir info de Eventual sobreescribiendo el método mostrarDatos de la clase Trabajador
        System.out.println("..........");
        even1.mostrarDatos();






    }

}
