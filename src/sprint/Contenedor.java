package sprint;

import sprint.entity.Administrativo;
import sprint.entity.Cliente;
import sprint.entity.Profesional;
import sprint.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

    List<IAsesoria> almacenarUsuarios =new ArrayList<>();

    List<Profesional> almacenarProfesional = new ArrayList<>();
    List<Administrativo> almacenarAdministrativo = new ArrayList<>();
    List<Cliente> almacenarClientes = new ArrayList<>();


    public void almacenarProfesional(Profesional p){
        almacenarProfesional.add(p);
    }
    public void mostrarProfesional(){
        for (Profesional p : almacenarProfesional) {
            System.out.println(p);
        }
    }

    public void  almacenarAdministrativo (Administrativo a){
        almacenarAdministrativo.add(a);
    }
    public void mostrarAdministrativo(){
        for (Administrativo a:almacenarAdministrativo) {
            System.out.println(a);
        }
    }

    public void almacenarUsuarios (IAsesoria U){
        almacenarUsuarios.add(U);
    }


    public void alamacenaCliente(Cliente c){
        almacenarClientes.add(c);
    }
    public void mostrarCliente(){
        for ( Cliente c : almacenarClientes) {
            System.out.println(c);
        }
    }
    public void mostrarUsuarios(){
        for (IAsesoria U : almacenarUsuarios) {
            System.out.println(U);
        }
    }
}
