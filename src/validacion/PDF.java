package validacion;

public class PDF extends Documento{

    private boolean protegido;

    public PDF(String titulo, boolean protegido) {
        super(titulo);
        this.protegido = protegido;
    }

    public PDF(boolean protegido) {
        this.protegido = protegido;
    }

    public PDF() {
    }

    public boolean isProtegido() {
        return protegido;
    }

    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
    }

    @Override
    public String toString() {
        return "PDF{" +
                "protegido=" + protegido +
                '}';
    }

    @Override
    public void validar() {
        System.out.println("El doc con título "+ getTitulo()+ " ha sido validado");
    }
}
