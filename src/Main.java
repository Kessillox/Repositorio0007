import capacitacion.Capacitacion;
import cliente.Cliente;
import usuario.Usuario;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        String rut;
        do {
            rut = JOptionPane.showInputDialog("Ingrese rut del cliente \nSin puntos ni guion");
        } while (Integer.parseInt(rut) > 99999999);
        cliente.setRut(rut);
        cliente.setNombres(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
        cliente.setApellidos(JOptionPane.showInputDialog("Ingrese el o los apellidos del cliente"));
        cliente.setTelefono(JOptionPane.showInputDialog("Ingrese telefono del cliente"));
        cliente.setAfp(JOptionPane.showInputDialog("Ingrese la afp del cliente"));
        cliente.setSistemaSalud(
                JOptionPane.showInputDialog("Ingrese el sistema de salud del cliente \n Fonasa \n Isapre"));
        cliente.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del cliente"));
        cliente.setComuna(JOptionPane.showInputDialog("Ingrese la comuna del cliente"));
        cliente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente")));

        // mostrar datos
        cliente.toString();

        Usuario usuario = new Usuario();
        usuario.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
        usuario.setFechaNacimiento(JOptionPane.showInputDialog("Ingrese la fecha nacimiento del cliente"));
        usuario.setRun(JOptionPane.showInputDialog("Ingrese Run del usuario: "));

        usuario.toString();

        /**
         * @author Gonzalo Alonzo
         *
         */

        //crea instancia de capacitacion
        Capacitacion capacitacion = new Capacitacion();
        //solicita datos conforme a atributos de la clase
        capacitacion.setIdentificador(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo idenfificador del curso: ")));
       String rutCapacitacion;
        do {
            rutCapacitacion = JOptionPane.showInputDialog("Ingrese rut del cliente \nSin digito verificador: ");
        } while (Integer.parseInt(rutCapacitacion) > 99999999);
        int rutcap = Integer.parseInt(rutCapacitacion);
        capacitacion.setRutcliente(rutcap);
        capacitacion.setDv(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el digito Verificador: ")));
        capacitacion.setDia(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de capacitacion(1 al 30): ")));
        capacitacion.setHora(JOptionPane.showInputDialog("Ingrese hgora de la capacitacion: "));
        capacitacion.setLugar(JOptionPane.showInputDialog("Ingrese lugar de capacitacion: "));
        capacitacion.setDuracion(Double.parseDouble(JOptionPane.showInputDialog("Ingrese duracion capacitacion en minutos: ")));

        capacitacion.setCantidadasistentes(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de sistentes:")));


        // mostrar datos de la clase
        capacitacion.toString();

    }
}