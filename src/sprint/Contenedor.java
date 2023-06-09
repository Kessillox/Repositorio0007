package sprint;

import sprint.entity.Administrativo;
import sprint.entity.Profesional;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
   //Lista PROFESIONAL
    List<Profesional> almacenarProfesional = new ArrayList<>();
    public void almacenarProfesional(Profesional p){
        almacenarProfesional.add(p);
    }
    public void mostrarProfesional(){
        for (Profesional p : almacenarProfesional) {
            System.out.println(p);
        }
    }

    //Lista Administrativa
    List<Administrativo> almacenarAdministrativo = new ArrayList<>();
    public void  almacenarAdministrativo (Administrativo a){
        almacenarAdministrativo.add(a);
    }
    public void mostrarAdministrativo(){
        for (Administrativo a:almacenarAdministrativo) {
            System.out.println(a);
        }
    }

}
