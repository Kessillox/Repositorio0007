package sprint.entity;

public class Capacitacion {
    int id;
    String rutEmpresa;
    String dia;
    String hora;
    String lugar;
    String duracion;
    int cantidadAsistente;

    //String mostrarDetalle; || Duda si va esta variable aca
    //llamar a la clase empresa, para traer rut y nombre empresa


    public Capacitacion() {
    }

    public Capacitacion(int id, String dia, String hora, String lugar, String duracion, int cantidadAsistente, String rutEmpresa) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistente = cantidadAsistente;
        this.rutEmpresa = rutEmpresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistente() {
        return cantidadAsistente;
    }

    public void setCantidadAsistente(int cantidadAsistente) {
        this.cantidadAsistente = cantidadAsistente;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", dia='" + dia + '\'' +
                ", rutEmpresa='" + rutEmpresa + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantidadAsistente=" + cantidadAsistente +
                '}';
    }
}
