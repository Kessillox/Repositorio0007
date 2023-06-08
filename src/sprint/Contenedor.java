package sprint;

import sprint.entity.Profesional;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    List<Profesional> almacenarProfecional = new ArrayList<>();

    public void almacenarProfecional(Profesional p){
        almacenarProfecional.add(p);
    }

    public void mostrarProfesional(){
        for (Profesional p : almacenarProfecional) {
            System.out.println(p);
        }
    }
}
