import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contenedor {
    private List<IAsesoria> listaUsuarios;
    private List<Capacitacion> listaCapacitaciones;

    public Contenedor(List<IAsesoria> listaUsuarios, List<Capacitacion> listaCapacitaciones) {
        this.listaUsuarios = listaUsuarios;
        this.listaCapacitaciones = listaCapacitaciones;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "listaUsuarios=" + listaUsuarios +
                ", listaCapacitaciones=" + listaCapacitaciones +
                '}';
    }

    public List<IAsesoria> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<IAsesoria> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Capacitacion> getListaCapacitaciones() {
        return listaCapacitaciones;
    }

    public void setListaCapacitaciones(List<Capacitacion> listaCapacitaciones) {
        this.listaCapacitaciones = listaCapacitaciones;
    }

    public void almacenarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("= = = REGISTRAR CLIENTE = = =");

        String nombre = "";
        while (nombre.length() < 5 || nombre.length() > 50) {
            System.out.println("Ingresar nombre (5 - 50 carácteres)");
            nombre = sc.nextLine();
        }

        String apellido1 = "";
        while (apellido1.length() < 5 || apellido1.length() > 50) {
            System.out.println("Ingresar primer apellido (5 - 50 carácteres)");
            apellido1 = sc.nextLine();
        }

        String apellido2 = "";
        while (apellido2.length() < 5 || apellido2.length() > 50) {
            System.out.println("Ingresar segundo apellido (5 - 50 carácteres)");
            apellido2 = sc.nextLine();
        }

        String fechaNac = "";
        Pattern patron = Pattern.compile("(0[1-9]|1[0-2])/([0-2][1-9]|3[0-1])/(19\\d\\d|20[0-2][0-9])");
        Matcher matcher = patron.matcher(fechaNac);
        while (!matcher.matches()) {
            System.out.println("Ingresar fecha de nacimiento (dd/MM/YYYY)");
            fechaNac = sc.nextLine();
            matcher = patron.matcher(fechaNac);
        }

        int run = 100000000;
        while (run >= 99999999) {
            try {
                System.out.println("Ingresar rut de la empresa sin digito verificador (XXXXXXXX)");
                run = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                sc.nextLine();
            }
        }

        String nombreEmpresa = "";
        while (nombreEmpresa.length() < 5 || nombreEmpresa.length() > 100) {
            System.out.println("Ingresar nombre de la empresa (5 - 100 carácteres)");
            nombreEmpresa = sc.nextLine();
        }

        String giroEmpresa = "";
        while (giroEmpresa.length() < 5 || giroEmpresa.length() > 100) {
            System.out.println("Ingresar giro de la empresa (5 - 100 carácteres)");
            giroEmpresa = sc.nextLine();
        }

        int telefonoRepresentante = 0;
        String strTelefonoRepresentante = "";
        while (strTelefonoRepresentante.length() != 9) {
            System.out.println("Ingresar número telefónico celular del representante sin prefijo (9XXXXXXXX)");
            strTelefonoRepresentante = sc.nextLine();
            if (strTelefonoRepresentante.charAt(0) != '9') {
                strTelefonoRepresentante = "";
                continue;
            }
            try {
                telefonoRepresentante = Integer.parseInt(strTelefonoRepresentante);
            } catch (Exception e) {
                strTelefonoRepresentante = "";
            }
        }

        String direccionEmpresa = "";
        while (direccionEmpresa.length() < 5 || direccionEmpresa.length() > 70) {
            System.out.println("Ingresar dirección de la empresa (5 - 70 carácteres)");
            direccionEmpresa = sc.nextLine();
        }

        String comunaEmpresa = "";
        while (comunaEmpresa.length() < 5 || comunaEmpresa.length() > 50) {
            System.out.println("Ingresar comuna de la empresa (5 - 50 carácteres)");
            comunaEmpresa = sc.nextLine();
        }

        int edad = 151;
        while (edad < 0 || edad >= 150) {
            System.out.println("Ingresar edad del representante");
            try {
                edad = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                sc.nextLine();
            }

        }

        Usuario cliente = new Cliente(nombre, apellido1, apellido2, fechaNac, run, nombreEmpresa, giroEmpresa, strTelefonoRepresentante, direccionEmpresa, comunaEmpresa, edad);
        this.getListaUsuarios().add(cliente);
    }

    public void almacenarProfesional() {




































    }

    public void almacenarAdministrativo() {

    }

    public void almacenarCapacitacion() {

    }

    public void eliminarUsuario() {

    }

    public void listarUsuarios() {

    }

    public void listarUsuariosPorTipo() {

    }

    public void listarCapacitaciones() {

    }
}
