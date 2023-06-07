package sprint.entity;

public class Cliente extends Usuario{


    public String ObtenerNombre(){
        return "El nombre es" + this.getNombre();
    }
}
