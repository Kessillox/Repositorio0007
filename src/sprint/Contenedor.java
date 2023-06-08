package sprint;

import sprint.entity.Profesional;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    List<Profesional> almacenarProfesional = new ArrayList<>();

    public void almacenarProfesional(Profesional p){
        almacenarProfesional.add(p);
    }

    public void mostrarProfesional(){
        for (Profesional p : almacenarProfesional) {
            System.out.println(p);
        }
    }
}
