package creacional.factorymethod;

import comportamiento.observer.Subject;
import creacional.builder.Empleado;

import java.util.LinkedList;
import java.util.List;

/**
 * @author arturo
 */
public abstract class AreaPersonal extends Subject {
    private List<Empleado> personal;
    public AreaPersonal(){
        personal = new LinkedList<>();
    }

    public abstract void getDescripcionDeArea();

    public void añadirPersonaAUnaArea(Empleado empleado){
        super.notifyObserver(empleado);
        super.addObserver(empleado);
        personal.add(empleado);
    }

    public void imprimirDatosEmpleado(){
        getDescripcionDeArea();
        for (Empleado e: personal){
            System.out.println(e.toString());
        }
    }


}
