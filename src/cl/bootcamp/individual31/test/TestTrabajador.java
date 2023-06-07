package cl.bootcamp.individual31.test;

import cl.bootcamp.individual31.models.Contratado;
import cl.bootcamp.individual31.models.Eventual;
import cl.bootcamp.individual31.models.Honorario;

import java.util.Date;

public class TestTrabajador {
    public static void main(String[] args) {

        Honorario trabajadorHonorario = new Honorario("Juan", "Peréz", "Gonzalez", "20555444-7", "+56998989898", 40, "giro giro", new Date("2000/01/01"));
        Eventual trabajadorEventual = new Eventual("Juan2", "Peréz2", "Gonzalez2", "20111444-7", "+56911111111", 20, "24/7", "juan2.perez2@correo.com");
        Contratado trabajadorContratado = new Contratado("Juan333", "Peréz3333", "Gonzalez3333", "20333333-3", "+56933333333", 33, new Date("2003/03/03"), 3333333);

        System.out.println("========== toString() ==========");
        System.out.println(trabajadorHonorario);
        System.out.println(trabajadorEventual);
        System.out.println(trabajadorContratado);

        System.out.println();
        System.out.println("========== mostrarDatos() ==========");
        trabajadorHonorario.mostrarDatos();
        trabajadorEventual.mostrarDatos();
        trabajadorContratado.mostrarDatos();

    }
}
