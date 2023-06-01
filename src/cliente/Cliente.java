package cliente;

/**
 * @author nehemiasmunoz
 * 
 */
public class Cliente {
    private String rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private String direccion;
    private String comuna;
    private int edad;

    private String sistemaSalud;

    /**
     * Constructor vacio
     */
    public Cliente() {
    }

    /**
     * Constructor con parametros
     * 
     * @param rut
     * @param nombres
     * @param apellidos
     * @param telefono
     * @param afp
     * @param direccion
     * @param comuna
     * @param edad
     * @param sistemaSalud
     */
    public Cliente(String rut, String nombres, String apellidos, String telefono, String afp, String direccion,
            String comuna, int edad, String sistemaSalud) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
        this.sistemaSalud = sistemaSalud;
    }

    /**
     * Metodo que devuelve los parametros y sus valores
     */
    @Override
    public String toString() {
        return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
                + ", afp=" + afp + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad
                + "sistema salud = " + sistemaSalud + "]";
    }

    // Getters and Setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(String sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

}