package util;

/**
 * @author arturo
 */
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre ;
    }

    public String getNombre() {
        return nombre;
    }
}
