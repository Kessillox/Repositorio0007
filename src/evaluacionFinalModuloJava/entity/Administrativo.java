package evaluacionFinalModuloJava.entity;

import java.time.LocalDate;

import evaluacionFinalModuloJava.interfac.IAsesoria;
import evaluacionFinalModuloJava.entity.Usuario;

/**
 *
 * @author nehemiasmunoz
 *
 */
public class Administrativo extends Usuario implements IAsesoria {
    private String area;
    private String experiencia;

    /**
     * Constructor vacio
     */
    public Administrativo() {
    }

//	/**
//	 * Constructor de la clase
//	 *
//	 * @param area
//	 * @param experiencia
//	 */
//	public Administrativo(String area, String experiencia) {
//		this.area = area;
//		this.experiencia = experiencia;
//	}

    /**
     * Constructor con parametros y herencia
     *
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param fechaNacimiento
     * @param run
     * @param area
     * @param experiencia
     */
    public Administrativo(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, String run,
                          String area, String experiencia) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run);
        this.area = area;
        this.experiencia = experiencia;
    }

    /**
     * Metodo que retorna los parametros y valores de la clase
     *
     * @return String que contiene los parametros y valores de la clase
     */
    @Override
    public String toString() {
        return "Administrativo{" + "area='" + area + '\'' + ", experiencia='" + experiencia + '\'' + '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * Metodo que complementado con la interfaz muestra por consola datos del
     * usuario Administrativo
     */
    @Override
    public void analizarUsuario() {
        System.out.println("Area: " + area + "\nExperiencia: " + experiencia);
    }

    @Override
    public void listarDatos() {
        super.listarDatos();
        System.out.println("Tipo administrativo \n area='" + area + ", experiencia='" + experiencia );
    }
}
