package evaluacionFinalModuloJava;

import evaluacionFinalModuloJava.entity.Administrativo;
import evaluacionFinalModuloJava.entity.Capacitacion;
import evaluacionFinalModuloJava.entity.Cliente;
import evaluacionFinalModuloJava.entity.Profesional;
import evaluacionFinalModuloJava.servicios.Contenedor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        mostrarMenu(contenedor);
    }

    public static void mostrarMenu(Contenedor contenedor){
        Scanner scan = new Scanner(System.in);
        final String MENU = """
                1 - Almacenar cliente\s
                2 - Almacenar profesional\s
                3 - Almacenar administrativo\s
                4 - Almacenar capacitación\s
                5 - Eliminar usuario\s
                6 - Listar usuarios\s
                7 - Listar usuarios por tipo\s
                8 - Listar capacitaciones\s
                0 - Salir
                """;
        int opcion = 0;
        do {
            System.out.println(MENU);
            System.out.println("Ingrese el numero de la accion que desea realizar:");
            try{
                opcion = Integer.parseInt(scan.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Ingrese un caracter valido");
                mostrarMenu(contenedor);
            }

        }while (opcion != 0 && !(opcion <= 8 && opcion >= 1));
        ejecutarAccion(opcion,contenedor);
    }

    public static void ejecutarAccion(int opcion, Contenedor contenedor){
        Scanner scan = new Scanner(System.in);
        switch (opcion) {
            case 1 -> {
                Cliente nuevoCliente = new Cliente();
                System.out.println("Ingrese el nombre del cliente");
                nuevoCliente.setNombre(scan.nextLine());
                System.out.println("Ingrese el primer apellido");
                nuevoCliente.setApellido1(scan.nextLine());
                System.out.println("Ingrese el segundo apellido");
                nuevoCliente.setApellido2(scan.nextLine());
                System.out.println("Ingrese la fecha de nacimiento del cliente \n Formato: año-mes-dia");
                nuevoCliente.setFechaNacimiento(LocalDate.parse(scan.nextLine()));
                System.out.println("Ingrese el run del cliente");
                nuevoCliente.setRun(scan.nextLine());
                System.out.println("Ingrese el nombre de la empresa");
                nuevoCliente.setNombreEmpresa(scan.nextLine());
                System.out.println("Ingrese el giro de la empresa");
                nuevoCliente.setGiroEmpresa(scan.nextLine());
                System.out.println("Ingrese el rut de la empresa");
                nuevoCliente.setRutEmpresa(scan.nextLine());
                System.out.println("Ingrese el telefono del representante de la empresa");
                nuevoCliente.setTelefonoRepresentante(scan.nextLine());
                System.out.println("Ingrese la direccion de la empresa");
                nuevoCliente.setDireccionEmpresa(scan.nextLine());
                System.out.println("Ingrese la comuna de la empresa");
                nuevoCliente.setComunaEmpresa(scan.nextLine());
                contenedor.almacenarCliente(nuevoCliente);
                System.out.println("Cliente añadido");
            }
            case 2 -> {
//                Profesional nuevoProfesional = new Profesional("lala","mimi","momo",LocalDate.parse("2000-09-09"),"28374982","prog",LocalDate.parse("1990-09-12"));
                Profesional nuevoProfesional = new Profesional();
                System.out.println("Ingrese el nombre del profesional");
                nuevoProfesional.setNombre(scan.nextLine());
                System.out.println("Ingrese el primer apellido");
                nuevoProfesional.setApellido1(scan.nextLine());
                System.out.println("Ingrese el segundo apellido");
                nuevoProfesional.setApellido2(scan.nextLine());
                System.out.println("Ingrese la fecha de nacimiento del profesional \n Formato: año-mes-dia");
                nuevoProfesional.setFechaNacimiento(LocalDate.parse(scan.nextLine()));
                System.out.println("Ingrese el run del profesional");
                nuevoProfesional.setRun(scan.nextLine());
                System.out.println("Ingrese el titulo del profesional");
                nuevoProfesional.setTitulo(scan.nextLine());
                System.out.println("Ingrese la fecha de ingreso del profesional \n Formato: año-mes-dia");
                nuevoProfesional.setFechaIngreso(LocalDate.parse(scan.nextLine()));
                contenedor.almacenarProfesional(nuevoProfesional);
                System.out.println("Profesional añadido");
            }
            case 3 -> {
//                Administrativo nuevoAdministrativo = new Administrativo("nehemias","mimi","momo",LocalDate.parse("2000-09-09"),"1234","prog","ahdkjhakjsd");
                Administrativo nuevoAdministrativo = new Administrativo();
                System.out.println("Ingrese el nombre del administrativo");
                nuevoAdministrativo.setNombre(scan.nextLine());
                System.out.println("Ingrese el primer apellido");
                nuevoAdministrativo.setApellido1(scan.nextLine());
                System.out.println("Ingrese el segundo apellido");
                nuevoAdministrativo.setApellido2(scan.nextLine());
                System.out.println("Ingrese la fecha de nacimiento del administrativo \n Formato: año-mes-dia");
                nuevoAdministrativo.setFechaNacimiento(LocalDate.parse(scan.nextLine()));
                System.out.println("Ingrese el run del administrativo");
                nuevoAdministrativo.setRun(scan.nextLine());
                System.out.println("Ingrese el area del administrativo");
                nuevoAdministrativo.setArea(scan.nextLine());
                System.out.println("Ingrese la experiencia del administrativo");
                nuevoAdministrativo.setExperiencia(scan.nextLine());
                contenedor.almacenarAdministrativo(nuevoAdministrativo);
                System.out.println("Administrativo añadido");
            }
            case 4 -> {
                Capacitacion nuevaCapacitacion = new Capacitacion();
                nuevaCapacitacion.setIdentificador(1);
                System.out.println("Ingrese rut de la empresa");
                nuevaCapacitacion.setRut(Integer.parseInt(scan.nextLine())); //todo: reemplazo tipo de dato en capacitacion
                System.out.println("Ingrese dia de la capacitacion \n Formato: (Lunes - Domingo) escrito en palabras");
                nuevaCapacitacion.setDia(scan.nextLine());
                System.out.println("Ingrese hora de la capacitacion \n Formato: (00:00) hora:minuto");
                nuevaCapacitacion.setHora(LocalTime.parse(scan.nextLine()));
                System.out.println("Ingrese lugar de la capacitacion");
                nuevaCapacitacion.setLugar(scan.nextLine());
                System.out.println("Ingrese la duracion de la capacitacion \n Formato:(00:00) hora:minuto");
                nuevaCapacitacion.setDuracion(LocalTime.parse(scan.nextLine()));
                System.out.println("Ingrese la cantidad de asistentes");
                nuevaCapacitacion.setCantidadAsistentes(Integer.parseInt(scan.nextLine()));
                contenedor.almacenarCapacitacion(nuevaCapacitacion);
                System.out.println("Capacitacion añadido");
            }
            case 5 -> {
                System.out.println("Ingrese run de usuario a eliminar:");
                contenedor.eliminarUsuario(scan.nextLine());
            }
            case 6 -> contenedor.listarUsuario();
            case 7 -> {
                System.out.println("Ingrese el tipo de usuario a listar \n Administrador \n Cliente \n Profesional ");
                String tipoUsuario = scan.nextLine();
                String ch1 = tipoUsuario.substring(0, 1).toUpperCase();
                tipoUsuario = ch1 + tipoUsuario.substring(1);
                contenedor.listarUsuarioPorTipo(tipoUsuario);
            }
            case 8 -> contenedor.listarCapacitaciones();
            case 0 -> System.out.println("El programa ha finalizado");
            default -> System.out.println("No existe esa opcion");
        }
        mostrarMenu(contenedor);
    }
}
