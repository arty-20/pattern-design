package comportamiento.strategy;

import creacional.builder.Empleado;

/**
 * @author arturo
 */
public interface Mensajeria {

    void enviarMensaje(String mensaje, Empleado empleado);
}
