package mascotas;

public class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public Animal() {
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                '}';
    }

    public void imprmir(){
        System.out.println("Soy un animal de la especie: "+this.getEspecie());
    }

    public void saludo(){

    }
}
