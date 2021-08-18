package estructural.decorator;

import creacional.builder.Empleado;

/**
 * @author arturo
 */
public abstract class Decorator implements Notificador{

    protected final Notificador notificador;

    public Decorator(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void enviarMensaje(String mensaje, Empleado empleado){
        notificador.enviarMensaje(mensaje, empleado);
    }
}
