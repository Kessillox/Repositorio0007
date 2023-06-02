package validacion;

public class Documento implements Validacion{
    private String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public Documento() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                '}';
    }


    @Override
    public void validar() {

    }
}
