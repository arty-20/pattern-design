package estructural.composite;

/**
 * @author arturo
 */
public class Subtarea implements Component{
    private final String titulo;
    private final String descripcion;
    private final int tiempo;

    public Subtarea(String titulo, String descripcion, int tiempo) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }


    @Override
    public int getTiempo() {
        System.out.println("Para la tarea: " + titulo + ", su tiempo designado es: " + tiempo + "h");
        return tiempo;
    }
}
