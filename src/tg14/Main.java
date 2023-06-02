package tg14;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("19283182-2", "Empresa1", "Juanito", "Rodriguez", "Gutierrez", "+56912812371", "Calle 1 #1021", "Comuna1");
        Usuario usuario1 = new Usuario("10203192-3", "Usuario1", "01/11/1955");
        Capacitacion capacitacion1 = new Capacitacion(1, cliente1.getRut(), "10/06/2023", "22:30", "NOSE", 2.5, 20);

        System.out.println(cliente1.toString());
        System.out.println(usuario1.toString());
        System.out.println(capacitacion1.toString());

        System.out.println("Cliente 1 =" + " Rut: " + cliente1.getRut() + ", Nombre de la empresa: " + cliente1.getNombreEmpresa() + ", Nombre del representante: " +
                cliente1.getNombreRepresentate() + ", Primer apellido: " + cliente1.getApellidoRepresentante1() + ", Segundo apellido: " + cliente1.getApellidoRepresentante2() +
                ", Teléfono del representante: " + cliente1.getTelefonoReperesentante() + ", Dirección: " + cliente1.getDireccion() + ", Comuna: " + cliente1.getComuna());
        System.out.println("Usuario 1: " + "Rut: " + usuario1.getRut() + ", Nombre: " + usuario1.getNombre() + ", Fecha de nacimiento: " + usuario1.getFechaNac());
        System.out.println("Capacitación 1 =" + " ID: " + capacitacion1.getIdentificador() + ", Fecha de realización: " + capacitacion1.getDia() + ", Hora de realización: " +
                capacitacion1.getHora() + ", Lugar de realización: " + capacitacion1.getLugar() + ", Duración (En horas): " + capacitacion1.getDuracion() +
                ", Cantidad de asistentes: " + capacitacion1.getCantidadAsistentes());

        System.out.println(cliente1.obtenerNombre());
        usuario1.mostrarEdad();
        capacitacion1.mostrarDetalle();
    }
}
