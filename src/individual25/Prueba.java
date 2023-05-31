package individual25;

public class Prueba {
    public static void main(String[] args){
        Trabajador leandro = new Trabajador("Leandro Alan", "Villalba", "", "26.951.457-4","+569111222",33);
        System.out.println(leandro.toString());
        System.out.println(leandro.nombreCompleto());
    }
}
