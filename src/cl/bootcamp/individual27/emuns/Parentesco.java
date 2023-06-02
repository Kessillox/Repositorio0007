package cl.bootcamp.individual27.emuns;

/**
 * Enum con las constantes de parentesco.
 *
 * @author Iván Becerra
 * @version 1.0.0
 */
public enum Parentesco {

    CONYUGE("Cónyuge"),
    HIJO("Hijo/a"),
    OTRO("Otro");

    private final String parentesco;

    Parentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    @Override
    public String toString() {
        return this.parentesco;
    }
}
