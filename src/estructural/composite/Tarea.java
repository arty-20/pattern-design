package estructural.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @author arturo
 */
public class Tarea implements Component{
    private String titulo;
    private List<Component> tareas;

    public Tarea(String titulo) {
        this.titulo = titulo;
        this.tareas = new LinkedList<>();
    }

    public void add(Component c){
        tareas.add(c);
    }

    @Override
    public int getTiempo() {
        int tiempo = 0;
        for (Component tarea : tareas) {
            tiempo += tarea.getTiempo();
        }
        System.out.println("Para la tarea: " + titulo + ", su tiempo designado es: " + tiempo + "h");
        return tiempo;
    }
}
