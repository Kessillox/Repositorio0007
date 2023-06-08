package modelos.contenedor;

import evaluacionFinalModuloJava.interfac.IAsesoria;
import evaluacionFinalModuloJava.entity.Administrativo;
import evaluacionFinalModuloJava.entity.Capacitacion;
import evaluacionFinalModuloJava.entity.Cliente;
import evaluacionFinalModuloJava.entity.Profesional;
import evaluacionFinalModuloJava.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private List<IAsesoria> listaUsuariosIAsesoria = new ArrayList<>();
    private List<Capacitacion> capacitaciones = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();
    /**
     * Constructor Vacio
     */
    public Contenedor() {
    }

    /**
     * Constructor de la clase con parametros
     * @param listaUsuariosIAsesoria
     * @param capacitaciones
     */
    public Contenedor(List<IAsesoria> listaUsuariosIAsesoria, List<Capacitacion> capacitaciones) {
        this.listaUsuariosIAsesoria = listaUsuariosIAsesoria;
        this.capacitaciones = capacitaciones;
    }

    /**
     * Metodo que devuelve los parametros y valores de la clase
     * @return String con los datos de la clase
     */
    @Override
    public String toString() {
        return "Contenedor{" +
                "tiposUsuarios=" + listaUsuariosIAsesoria +
                ", capacitaciones=" + capacitaciones +
                '}';
    }


    //Metodos solicitados

    /**
     * Metodo que permite agregar un nuevo cliente a la lista de instancias
     * de la interface IAsesoria.
     * @param cliente
     */
    public void almacenarCliente(Cliente cliente){
        listaUsuariosIAsesoria.add(cliente);
    }

//    public void agregarUsuario(IAsesoria  a){
//        tiposUsuarios.add(a);
//    }

    /**
     * Metodo que permite agregar un nuevo profesional a la lista de
     * instancias de la interface IAsesoria.
     * @param profesional
     */
    public void almacenarProfesional(Profesional profesional){
        listaUsuariosIAsesoria.add(profesional);
        listaUsuarios.add(profesional);
    }

    /**
     * Metodo que permite agregar un nuevo administrativo a la lista de
     * instancias de la interface IAsesoria.
     * @param administrativo
     */
    public void almacenarAdministrativo(Administrativo administrativo){
        listaUsuariosIAsesoria.add(administrativo);
        listaUsuarios.add(administrativo);
    }

    /**
     * Metodo que permite agregar una nueva capacitación a la lista de
     * instancias de la clase Capacitación.
     * @param capacitacion
     */
    public void almacenarCapacitacion(Capacitacion capacitacion){
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(String run){
        if (listaUsuariosIAsesoria.isEmpty()){
            System.out.println("No existen registros en la tabla");
        }else{
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if( listaUsuarios.get(i).getRun().equals(run)){
                    listaUsuariosIAsesoria.remove(i);
                    listaUsuarios.remove(i);
                }
            }
            System.out.println("Usuario rut: "+run+" eliminado");
        }
    }

    /**
     * Metodo que permite desplegar la lista completa de usuarios, independiente
     * del tipo. En este método solo se deben desplegar los datos de la clase usuario.
     */
    public void listarUsuario(){
        if (listaUsuariosIAsesoria.isEmpty()){
            System.out.println("Actualmente no existen registros en la lista usuarios");
        }else{
            for (IAsesoria tiposUsuario : listaUsuariosIAsesoria) {
                tiposUsuario.listarDatos();
            }
        }
    }

    /**
     * Recibe un tipo de usuario (cliente, administrador o
     * profesional), y retorna los datos respectivos según el tipo de usuario.
     * @param tipoUsuario
     */
    public void listarUsuarioPorTipo(String tipoUsuario){
        if (listaUsuariosIAsesoria.isEmpty()) {
            System.out.println("Actualmente no existen registros en la lista usuarios");
        }else{
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if(tipoUsuario.equals(listaUsuarios.get(i).getClass().getSimpleName())){
                    listaUsuarios.get(i).listarDatos();
                }
            }
        }
    }

    /**
     * Método despliega las capacitaciones registradas en la
     * lista respectiva, junto con los datos del cliente al que está asociada dicha
     * capacitación.
     */
    public void listarCapacitaciones(){
        if(capacitaciones.isEmpty()){
            System.out.println("Actualmente no existen capacitaciones almacenadas \n");
        }else{
            for (Capacitacion cap: capacitaciones) {
                System.out.println(cap);
                for (Usuario user: listaUsuarios) {
                    //todo: verificar funcionamiento
                    if (user.getRun().equals(cap.getRut())){
                        user.listarDatos();
                    }
                }
            }
        }
    }
}
