package empresaclase14;

/**
 * Clase que representa un Cliente, contiene 8 atributos privados.
 * @author Luis Zambrano
 */
public class Cliente extends Usuario {

    private String nombreEmpresa;
    private String giroEmpresa;
    private int rut;
    private  String telefonoRepresentante;
    private String direccionEmpresa;
    private String comunaEmpresa;

    public Cliente() {
    }

    public Cliente(String nombreEmpresa, String giroEmpresa, int rut, String telefonoRepresentante, String direccionEmpresa, String comunaEmpresa) {
        // Validación de campo nombreEmpresa
        if (nombreEmpresa.length() >=5 && nombreEmpresa.length() <= 30) {
            this.nombreEmpresa = nombreEmpresa;
        } else {
            // Si ingresamos un argumento que no coincide con lo pedido en el argumento, lanza una excepción
            throw new IllegalArgumentException("Ingrese un nombre correcto (5 a 30 caracteres)");
        }
        this.giroEmpresa = giroEmpresa;
        // Validación de campo rut
        if (rut < 99999999) {
            this.rut = rut;
        } else {
            // Si ingresamos un argumento que no coincide con lo pedido en el argumento, lanza una excepción
            throw new IllegalArgumentException("Ingrese un número menor a 99.999.999");
        }
        this.telefonoRepresentante = telefonoRepresentante;
        if(direccionEmpresa.length() >5 && direccionEmpresa.length() <= 70) {
            this.direccionEmpresa = direccionEmpresa;
        } else {
            throw new IllegalArgumentException("Ingrese una dirección válida (5 a 70 caracteres)");
        }
        if(comunaEmpresa.length() >5 && comunaEmpresa.length() <= 50) {
            this.comunaEmpresa = comunaEmpresa;
        } else {
            throw new IllegalArgumentException("Ingrese una dirección válida (5 a 50 caracteres)");
        }
    }

    public Cliente(String nombre, String apellido1, String apellido2, String fechaDeNacimiento, Integer run, String nombreEmpresa, String giroEmpresa, int rut, String telefonoRepresentante, String direccionEmpresa, String comunaEmpresa) {
        super(nombre, apellido1, apellido2, fechaDeNacimiento, run);
        // Validación de campo nombreEmpresa
        if (nombreEmpresa.length() >=5 && nombreEmpresa.length() <= 30) {
            this.nombreEmpresa = nombreEmpresa;
        } else {
            // Si ingresamos un argumento que no coincide con lo pedido en el argumento, lanza una excepción
            throw new IllegalArgumentException("Ingrese un nombre correcto (5 a 30 caracteres)");
        }
        this.giroEmpresa = giroEmpresa;
        // Validación de campo rut
        if (rut < 99999999) {
            this.rut = rut;
        } else {
            // Si ingresamos un argumento que no coincide con lo pedido en el argumento, lanza una excepción
            throw new IllegalArgumentException("Ingrese un número menor a 99.999.999");
        }
        this.telefonoRepresentante = telefonoRepresentante;
        if(direccionEmpresa.length() >5 && direccionEmpresa.length() <= 70) {
            this.direccionEmpresa = direccionEmpresa;
        } else {
            throw new IllegalArgumentException("Ingrese una dirección válida (5 a 70 caracteres)");
        }
        if(comunaEmpresa.length() >5 && comunaEmpresa.length() <= 50) {
            this.comunaEmpresa = comunaEmpresa;
        } else {
            throw new IllegalArgumentException("Ingrese una dirección válida (5 a 50 caracteres)");
        }
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getGiroEmpresa() {
        return giroEmpresa;
    }

    public void setGiroEmpresa(String giroEmpresa) {
        this.giroEmpresa = giroEmpresa;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(String telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getComunaEmpresa() {
        return comunaEmpresa;
    }

    public void setComunaEmpresa(String comunaEmpresa) {
        this.comunaEmpresa = comunaEmpresa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", giroEmpresa='" + giroEmpresa + '\'' +
                ", rut='" + rut + '\'' +
                ", telefonoRepresentante='" + telefonoRepresentante + '\'' +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                ", comunaEmpresa='" + comunaEmpresa + '\'' +
                '}';
    }

    public String obtenerNombre(){
        return "El nombre de la empresa es: " + getNombreEmpresa();
    }

    @Override
    public void analizarUsuario() {
        System.out.println("El nombre del usuario es: " + super.getNombre());
        System.out.println("La información del Cliente es: " + this.toString());
    }
}
