package individual31.trabajadoresentity;

import individual31.ITipoTrabajador;

public class TrabajadorHonorarios extends Trabajador implements ITipoTrabajador {
    private String giro;
    private String anoIniciacion;

    // CONSTRUCTORES
    public TrabajadorHonorarios() {
    }

    public TrabajadorHonorarios(String giro, String anoIniciacion) {
        this.giro = giro;
        this.anoIniciacion = anoIniciacion;
    }

    public TrabajadorHonorarios(String nombre, String apellido, String run, String telefono, int edad, String giro, String anoIniciacion) {
        super(nombre, apellido, run, telefono, edad);
        this.giro = giro;
        this.anoIniciacion = anoIniciacion;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getAnoIniciacion() {
        return anoIniciacion;
    }

    public void setAnoIniciacion(String anoIniciacion) {
        this.anoIniciacion = anoIniciacion;
    }

    @Override
    public String toString() {
        return "TrabajadorHonorarios{" +
                "giro='" + giro + '\'' +
                ", anoIniciacion='" + anoIniciacion + '\'' +
                "} " + super.toString();
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Giro: "+ this.getGiro() + " año iniciación:" + this.getAnoIniciacion());

    }
}
