package grupal16;

public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    public Administrativo(String nombreUsuario, String area, String experienciaPrevia) {
        super(nombreUsuario);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }
}
