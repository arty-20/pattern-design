package estructural.decorator;

import creacional.builder.Empleado;

/**
 * @author arturo
 */
public class SlackDecorator extends Decorator{

    public SlackDecorator(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviarMensaje(String mensaje, Empleado empleado) {
        super.enviarMensaje(mensaje, empleado);
        System.out.println("Slack");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Destinatario: " + empleado.getNombre());
    }
}
