package procesovalidarelementos;

public class Word extends Documento{

    private int version;

    public Word(String titulo, int version) {
        super(titulo);
        this.version = version;
    }

    public Word(int version) {
        this.version = version;
    }

    public Word() {
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Word{" +
                "version=" + version +
                '}';
    }

    @Override
    public void validar() {
        System.out.println("El documento Word " + getTitulo() + " ha sido validado");
    }
}
