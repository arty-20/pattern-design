package estructural.facade;

import creacional.builder.Director;
import creacional.builder.Empleado;
import creacional.builder.EmpleadoBuilder;
import util.Persona;

/**
 * @author arturo
 */
public class CreateUserServices {

    public Empleado createEmpleado(Persona persona){
        Director director = new Director();
        EmpleadoBuilder b1 = new EmpleadoBuilder(persona);
        director.construct1(b1);
        return b1.getResult();
    }
}
