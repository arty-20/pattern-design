package estructural.decorator;

import creacional.builder.Empleado;

/**
 * @author arturo
 */
public interface Notificador {

    void enviarMensaje(String mensaje, Empleado empleado);
}
