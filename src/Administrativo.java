public class Administrativo extends Usuario{
    private String area;
    private String experienciaPrevia;

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }

    public Administrativo() {
    }

    public Administrativo(String area, String experienciaPrevia) {
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public Administrativo(String nombreUsuario, String fechaDeNacimientoUsuario, String runUsuario,
                          String area, String experienciaPrevia) {
        super(nombreUsuario, fechaDeNacimientoUsuario, runUsuario);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getArea(){ return area; }
    public void setArea(String area) {
        this.area = area;
    }
    public String getExperienciaPrevia(){ return experienciaPrevia; }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(this.getArea()+" "+this.getExperienciaPrevia());
    }
}
